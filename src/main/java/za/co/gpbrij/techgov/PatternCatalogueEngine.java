package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class PatternCatalogueEngine {

    public PatternAssessment assess(
            ArchitecturePattern pattern,
            ReferenceArchitecture reference,
            List<ArchitectureBuildingBlock> suppliedBuildingBlocks,
            String environment,
            List<String> evidencedControls,
            LocalDate assessmentDate
    ) {
        List<String> findings = new ArrayList<>();
        List<String> actions = new ArrayList<>();

        boolean approved = isApproved(pattern.status()) && isApproved(reference.status());
        boolean environmentApplicable = reference.applicableEnvironments().stream()
                .anyMatch(value -> value.equalsIgnoreCase(environment));

        Set<String> suppliedIds = new HashSet<>();
        for (ArchitectureBuildingBlock block : suppliedBuildingBlocks) {
            suppliedIds.add(block.buildingBlockId());
        }
        boolean buildingBlocksComplete = suppliedIds.containsAll(pattern.requiredBuildingBlockIds())
                && suppliedIds.containsAll(reference.buildingBlockIds());

        Set<String> evidence = new HashSet<>(evidencedControls);
        boolean controlsSatisfied = evidence.containsAll(reference.mandatoryControls());
        boolean reviewCurrent = pattern.reviewDate() != null
                && !pattern.reviewDate().isBefore(assessmentDate)
                && reference.reviewDate() != null
                && !reference.reviewDate().isBefore(assessmentDate);

        if (!approved) {
            findings.add("Pattern or reference architecture is not approved for use.");
            actions.add("Submit the architecture content for accountable approval.");
        }
        if (!environmentApplicable) {
            findings.add("Reference architecture is not applicable to the selected environment.");
            actions.add("Use an applicable reference architecture or request a governed exception.");
        }
        if (!buildingBlocksComplete) {
            findings.add("Required architecture building blocks are incomplete.");
            actions.add("Supply all mandatory building blocks before solution approval.");
        }
        if (!controlsSatisfied) {
            findings.add("Mandatory control evidence is incomplete.");
            actions.add("Provide evidence for every mandatory control.");
        }
        if (!reviewCurrent) {
            findings.add("Pattern or reference-architecture review is overdue.");
            actions.add("Review and reapprove the architecture content.");
        }

        int passed = 0;
        if (approved) passed++;
        if (environmentApplicable) passed++;
        if (buildingBlocksComplete) passed++;
        if (controlsSatisfied) passed++;
        if (reviewCurrent) passed++;
        int score = passed * 20;

        String decision = score == 100 ? "ALIGNED"
                : score >= 60 ? "CONDITIONALLY_ALIGNED"
                : "NOT_ALIGNED";
        if (findings.isEmpty()) {
            findings.add("Pattern, reference architecture, building blocks and controls are aligned.");
        }

        return new PatternAssessment(
                pattern.patternId(), reference.referenceId(), approved,
                environmentApplicable, buildingBlocksComplete, controlsSatisfied,
                reviewCurrent, score, decision,
                List.copyOf(findings), List.copyOf(actions)
        );
    }

    private boolean isApproved(PatternStatus status) {
        return status == PatternStatus.APPROVED || status == PatternStatus.STRATEGIC;
    }
}
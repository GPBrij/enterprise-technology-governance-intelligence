package za.co.gpbrij.techgov;

import java.util.ArrayList;
import java.util.List;

public final class ArchitectureRepositoryEngine {

    public RepositoryAssessment assess(
            BusinessCapability capability,
            ApplicationPortfolioItem application,
            TechnologyAsset asset,
            TechnologyStandard standard,
            ArchitectureLandscape landscape,
            GovernanceDecision decision
    ) {
        List<String> findings = new ArrayList<>();
        List<String> actions = new ArrayList<>();

        boolean capabilityLinked = application.capabilityId()
                .equals(capability.capabilityId())
                && landscape.capabilityId().equals(capability.capabilityId());
        boolean applicationLinked = landscape.applicationId()
                .equals(application.applicationId());
        boolean assetLinked = landscape.assetId().equals(asset.assetId())
                && application.technologyAssetIds().contains(asset.assetId());
        boolean standardLinked = landscape.standardId()
                .equals(standard.standardId());
        boolean decisionRecorded = decision.subjectId().equals(landscape.landscapeId())
                || decision.subjectId().equals(asset.assetId())
                || decision.subjectId().equals(application.applicationId());
        boolean targetStateDefined = isPresent(landscape.targetState())
                && isPresent(application.targetState());

        if (!capabilityLinked) {
            findings.add("Application and landscape capability links are inconsistent.");
            actions.add("Correct the capability relationship.");
        }
        if (!applicationLinked) {
            findings.add("Landscape is not linked to the selected application.");
            actions.add("Link the landscape to the application portfolio item.");
        }
        if (!assetLinked) {
            findings.add("Technology asset traceability is incomplete.");
            actions.add("Link the asset to both the application and landscape.");
        }
        if (!standardLinked) {
            findings.add("Technology standard traceability is incomplete.");
            actions.add("Link the applicable standard to the landscape.");
        }
        if (!decisionRecorded) {
            findings.add("No governance decision is linked to the assessed subject.");
            actions.add("Record the accountable architecture decision and evidence.");
        }
        if (!targetStateDefined) {
            findings.add("Target-state architecture is incomplete.");
            actions.add("Define the application and landscape target state.");
        }

        int passed = 0;
        if (capabilityLinked) passed++;
        if (applicationLinked) passed++;
        if (assetLinked) passed++;
        if (standardLinked) passed++;
        if (decisionRecorded) passed++;
        if (targetStateDefined) passed++;
        int traceabilityScore = (int) Math.round(passed * 100.0 / 6.0);

        String status = traceabilityScore == 100 ? "COMPLETE"
                : traceabilityScore >= 67 ? "PARTIAL"
                : "INCOMPLETE";

        if (findings.isEmpty()) {
            findings.add("Capability, application, asset, standard, decision and target-state traceability are complete.");
        }

        return new RepositoryAssessment(
                landscape.landscapeId(), capabilityLinked, applicationLinked,
                assetLinked, standardLinked, decisionRecorded, targetStateDefined,
                traceabilityScore, status, List.copyOf(findings), List.copyOf(actions)
        );
    }

    private boolean isPresent(String value) {
        return value != null && !value.isBlank();
    }
}
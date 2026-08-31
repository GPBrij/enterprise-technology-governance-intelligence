package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class StandardsEngine {

    public StandardsAssessment assess(
            TechnologyAsset asset,
            String assetTechnologyName,
            TechnologyStandard standard
    ) {
        List<String> findings = new ArrayList<>();
        List<String> actions = new ArrayList<>();

        boolean technologyMatched = standard.technologyName()
                .equalsIgnoreCase(assetTechnologyName);
        boolean versionApproved = standard.approvedVersions().stream()
                .anyMatch(version -> version.equalsIgnoreCase(asset.version()));
        boolean environmentPermitted = standard.permittedEnvironments().stream()
                .anyMatch(environment -> environment.equalsIgnoreCase(asset.environment()));
        boolean layerAligned = standard.architectureLayer()
                .equalsIgnoreCase(asset.architectureLayer());

        if (!technologyMatched) {
            findings.add("Asset technology does not match the selected standard.");
            actions.add("Select the correct standard or classify the technology.");
        }
        if (!versionApproved) {
            findings.add("Asset version is not in the approved version list.");
            actions.add("Upgrade, replace or obtain an approved architecture waiver.");
        }
        if (!environmentPermitted) {
            findings.add("Asset environment is not permitted by the standard.");
            actions.add("Move the workload to a permitted environment or obtain a waiver.");
        }
        if (!layerAligned) {
            findings.add("Architecture layer does not align with the standard.");
            actions.add("Correct the classification or review the proposed use.");
        }

        boolean lifecycleRestricted = switch (standard.status()) {
            case CONTAIN, RETIRE, PROHIBITED -> true;
            default -> false;
        };
        if (lifecycleRestricted) {
            findings.add("Standard status restricts new or continued use: " + standard.status());
            actions.add("Use the approved target-state technology where feasible.");
        }

        if (standard.supportEndDate() != null
                && !standard.supportEndDate().isAfter(LocalDate.now().plusMonths(12))) {
            findings.add("Standard support ends within twelve months or has ended.");
            actions.add("Confirm the migration plan and support position.");
        }

        String complianceStatus;
        if (standard.status() == StandardStatus.PROHIBITED || standard.status() == StandardStatus.RETIRE) {
            complianceStatus = "NON_COMPLIANT";
        } else if (!technologyMatched || !versionApproved || !environmentPermitted || !layerAligned
                || standard.status() == StandardStatus.CONTAIN) {
            complianceStatus = standard.exceptionRequired()
                    ? "WAIVER_REQUIRED"
                    : "REVIEW_REQUIRED";
        } else {
            complianceStatus = "COMPLIANT";
        }

        if (findings.isEmpty()) {
            findings.add("Asset aligns with the selected technology standard.");
        }

        String target = standard.targetStateTechnology().isBlank()
                ? "TARGET_STATE_NOT_DEFINED"
                : standard.targetStateTechnology();

        return new StandardsAssessment(
                asset.assetId(), standard.standardId(), technologyMatched,
                versionApproved, environmentPermitted, layerAligned,
                complianceStatus, target, List.copyOf(findings), List.copyOf(actions)
        );
    }
}
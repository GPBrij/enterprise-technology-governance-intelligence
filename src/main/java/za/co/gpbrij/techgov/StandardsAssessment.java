package za.co.gpbrij.techgov;

import java.util.List;

public record StandardsAssessment(
        String assetId,
        String standardId,
        boolean technologyMatched,
        boolean versionApproved,
        boolean environmentPermitted,
        boolean architectureLayerAligned,
        String complianceStatus,
        String recommendedTargetState,
        List<String> findings,
        List<String> requiredActions
) {}
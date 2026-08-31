package za.co.gpbrij.techgov;

import java.util.List;

public record RiskAssessment(
        String riskId,
        String assetId,
        int inherentRisk,
        int residualRisk,
        String residualRating,
        boolean overdue,
        String treatmentDecision,
        List<String> findings,
        List<String> requiredActions
) {}
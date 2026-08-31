package za.co.gpbrij.techgov;

import java.util.List;

public record InvestmentRecommendation(
        String assetId,
        InvestmentAction action,
        String priority,
        String rationale,
        String targetState,
        List<String> requiredActions
) {}
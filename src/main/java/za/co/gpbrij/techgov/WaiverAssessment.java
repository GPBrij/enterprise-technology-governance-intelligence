package za.co.gpbrij.techgov;

import java.util.List;

public record WaiverAssessment(
        String waiverId,
        String assetId,
        String status,
        boolean complete,
        boolean expired,
        boolean reviewRequired,
        String decision,
        List<String> findings,
        List<String> requiredActions
) {}
package za.co.gpbrij.techgov;

import java.util.List;

public record RoadmapAssessment(
        String roadmapId,
        boolean complete,
        boolean targetDateValid,
        boolean milestonesPresent,
        boolean ownerAssigned,
        int completenessScore,
        String roadmapHealth,
        List<String> findings,
        List<String> requiredActions
) {}
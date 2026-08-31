package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public record TechnologyRoadmap(
        String roadmapId,
        String assetId,
        String applicationId,
        String capabilityId,
        String currentState,
        String transitionState,
        String targetState,
        String businessOutcome,
        String roadmapOwner,
        LocalDate startDate,
        LocalDate targetDate,
        RoadmapStatus status,
        List<String> milestones,
        List<String> dependencies,
        List<String> evidenceReferences
) {}
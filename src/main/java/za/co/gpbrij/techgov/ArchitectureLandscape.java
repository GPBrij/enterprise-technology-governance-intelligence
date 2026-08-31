package za.co.gpbrij.techgov;

import java.util.List;

public record ArchitectureLandscape(
        String landscapeId,
        String portfolioId,
        String programmeId,
        String projectId,
        String capabilityId,
        String applicationId,
        String assetId,
        String standardId,
        String waiverId,
        String riskId,
        List<String> upstreamDependencies,
        List<String> downstreamDependencies,
        String currentState,
        String transitionState,
        String targetState
) {}
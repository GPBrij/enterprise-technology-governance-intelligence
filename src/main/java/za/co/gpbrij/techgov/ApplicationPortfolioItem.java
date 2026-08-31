package za.co.gpbrij.techgov;

import java.util.List;

public record ApplicationPortfolioItem(
        String applicationId,
        String applicationName,
        String capabilityId,
        String description,
        String businessOwner,
        String technologyOwner,
        String lifecycleStatus,
        String businessCriticality,
        String hostingModel,
        String dataClassification,
        List<String> technologyAssetIds,
        String roadmapStatus,
        String targetState
) {}
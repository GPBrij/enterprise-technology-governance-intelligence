package za.co.gpbrij.techgov;

import java.util.List;

public record ArchitectureBuildingBlock(
        String buildingBlockId,
        String name,
        String architectureLayer,
        String description,
        String owner,
        List<String> approvedTechnologies,
        List<String> interfaces,
        List<String> controls,
        String lifecycleStatus
) {}
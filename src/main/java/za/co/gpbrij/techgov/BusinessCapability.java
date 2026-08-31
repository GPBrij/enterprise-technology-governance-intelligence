package za.co.gpbrij.techgov;

public record BusinessCapability(
        String capabilityId,
        String capabilityName,
        String description,
        String businessOwner,
        String strategicObjective,
        String currentMaturity,
        String targetMaturity,
        String targetState
) {}
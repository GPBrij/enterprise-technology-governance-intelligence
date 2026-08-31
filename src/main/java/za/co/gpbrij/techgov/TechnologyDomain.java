package za.co.gpbrij.techgov;

public record TechnologyDomain(
        String domainId,
        String domainName,
        String description,
        String architectureLayer,
        String owner
) {}
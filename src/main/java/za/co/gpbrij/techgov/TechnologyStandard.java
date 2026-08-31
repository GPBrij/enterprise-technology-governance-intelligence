package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public record TechnologyStandard(
        String standardId,
        String technologyName,
        String technologyCategory,
        String vendor,
        List<String> approvedVersions,
        StandardStatus status,
        String architectureLayer,
        List<String> permittedEnvironments,
        List<String> approvedUseCases,
        List<String> restrictedUseCases,
        LocalDate supportEndDate,
        String targetStateTechnology,
        String standardOwner,
        String approvalReference,
        boolean exceptionRequired
) {}
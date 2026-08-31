package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public record ReferenceArchitecture(
        String referenceId,
        String name,
        String domain,
        String businessCapability,
        String purpose,
        PatternStatus status,
        String owner,
        LocalDate effectiveDate,
        LocalDate reviewDate,
        List<String> buildingBlockIds,
        List<String> applicableEnvironments,
        List<String> mandatoryControls,
        List<String> evidenceReferences,
        String targetStatePrinciple
) {}
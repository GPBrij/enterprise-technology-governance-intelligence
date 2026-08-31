package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public record ArchitecturePattern(
        String patternId,
        String name,
        PatternType type,
        String problem,
        String context,
        String solution,
        List<String> consequences,
        List<String> qualityAttributes,
        List<String> requiredBuildingBlockIds,
        List<String> prohibitedUses,
        PatternStatus status,
        String owner,
        LocalDate reviewDate,
        List<String> evidenceReferences
) {}
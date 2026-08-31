package za.co.gpbrij.techgov;

import java.util.List;

public record PatternAssessment(
        String patternId,
        String referenceId,
        boolean approved,
        boolean environmentApplicable,
        boolean buildingBlocksComplete,
        boolean controlsSatisfied,
        boolean reviewCurrent,
        int alignmentScore,
        String decision,
        List<String> findings,
        List<String> requiredActions
) {}
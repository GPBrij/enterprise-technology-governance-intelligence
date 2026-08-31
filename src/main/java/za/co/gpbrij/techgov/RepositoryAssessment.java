package za.co.gpbrij.techgov;

import java.util.List;

public record RepositoryAssessment(
        String landscapeId,
        boolean capabilityLinked,
        boolean applicationLinked,
        boolean assetLinked,
        boolean standardLinked,
        boolean governanceDecisionRecorded,
        boolean targetStateDefined,
        int traceabilityScore,
        String repositoryStatus,
        List<String> findings,
        List<String> requiredActions
) {}
package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public record GovernanceDecision(
        String decisionId,
        DecisionType decisionType,
        LocalDate decisionDate,
        String subjectId,
        String decisionOwner,
        String forum,
        String outcome,
        String rationale,
        List<String> conditions,
        LocalDate reviewDate,
        List<String> evidenceReferences
) {}
package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public record TechnologyRisk(
        String riskId,
        String assetId,
        String projectId,
        String riskCategory,
        String cause,
        String event,
        String businessImpact,
        int inherentLikelihood,
        int inherentImpact,
        List<String> existingControls,
        int controlEffectivenessPercent,
        String riskOwner,
        String treatmentStrategy,
        List<String> treatmentActions,
        LocalDate targetDate,
        RiskStatus status,
        List<String> evidenceReferences
) {}
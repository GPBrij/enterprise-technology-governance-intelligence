package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class TechnologyRiskEngine {

    public RiskAssessment assess(TechnologyRisk risk, LocalDate assessmentDate) {
        validateScale(risk.inherentLikelihood(), "inherentLikelihood");
        validateScale(risk.inherentImpact(), "inherentImpact");
        if (risk.controlEffectivenessPercent() < 0 || risk.controlEffectivenessPercent() > 100) {
            throw new IllegalArgumentException("controlEffectivenessPercent must be between 0 and 100");
        }

        int inherentRisk = risk.inherentLikelihood() * risk.inherentImpact();
        int residualRisk = (int) Math.ceil(
                inherentRisk * (100 - risk.controlEffectivenessPercent()) / 100.0
        );
        String rating = residualRisk >= 20 ? "CRITICAL"
                : residualRisk >= 12 ? "HIGH"
                : residualRisk >= 6 ? "MEDIUM"
                : "LOW";

        boolean overdue = risk.targetDate() != null
                && risk.targetDate().isBefore(assessmentDate)
                && risk.status() != RiskStatus.CLOSED;

        List<String> findings = new ArrayList<>();
        List<String> actions = new ArrayList<>();

        if (risk.existingControls().isEmpty()) {
            findings.add("No existing controls are recorded.");
            actions.add("Define and evidence preventive or detective controls.");
        }
        if (risk.riskOwner() == null || risk.riskOwner().isBlank()) {
            findings.add("Risk ownership is not assigned.");
            actions.add("Assign an accountable risk owner.");
        }
        if (overdue) {
            findings.add("Risk treatment is overdue.");
            actions.add("Escalate the overdue treatment and revise the target date.");
        }
        if (residualRisk >= 12) {
            findings.add("Residual technology risk is HIGH or CRITICAL.");
            actions.add("Obtain accountable acceptance or accelerate treatment.");
        }

        String treatmentDecision = residualRisk >= 20 ? "ESCALATE"
                : residualRisk >= 12 ? "TREAT_AND_MONITOR"
                : residualRisk >= 6 ? "MONITOR"
                : "ACCEPT_WITHIN_TOLERANCE";

        if (findings.isEmpty()) {
            findings.add("Risk is within the showcase control tolerance.");
        }

        return new RiskAssessment(
                risk.riskId(), risk.assetId(), inherentRisk, residualRisk,
                rating, overdue, treatmentDecision,
                List.copyOf(findings), List.copyOf(actions)
        );
    }

    private void validateScale(int value, String field) {
        if (value < 1 || value > 5) {
            throw new IllegalArgumentException(field + " must be between 1 and 5");
        }
    }
}
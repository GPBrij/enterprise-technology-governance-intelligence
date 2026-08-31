package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class RoadmapEngine {
    public RoadmapAssessment assess(TechnologyRoadmap roadmap, LocalDate assessmentDate) {
        List<String> findings = new ArrayList<>();
        List<String> actions = new ArrayList<>();
        boolean owner = present(roadmap.roadmapOwner());
        boolean milestones = roadmap.milestones() != null && !roadmap.milestones().isEmpty();
        boolean targetDateValid = roadmap.targetDate() != null && !roadmap.targetDate().isBefore(assessmentDate);
        boolean complete = present(roadmap.roadmapId()) && present(roadmap.assetId())
                && present(roadmap.currentState()) && present(roadmap.transitionState())
                && present(roadmap.targetState()) && present(roadmap.businessOutcome())
                && owner && milestones && targetDateValid;

        if (!owner) { findings.add("Roadmap owner is missing."); actions.add("Assign an accountable roadmap owner."); }
        if (!milestones) { findings.add("Roadmap milestones are missing."); actions.add("Define measurable transition milestones."); }
        if (!targetDateValid) { findings.add("Roadmap target date is missing or overdue."); actions.add("Define a valid target date."); }
        if (!present(roadmap.targetState())) { findings.add("Target state is missing."); actions.add("Define the approved target state."); }

        int passed = 0;
        if (owner) passed++;
        if (milestones) passed++;
        if (targetDateValid) passed++;
        if (present(roadmap.currentState())) passed++;
        if (present(roadmap.transitionState())) passed++;
        if (present(roadmap.targetState())) passed++;
        int score = (int)Math.round(passed * 100.0 / 6.0);
        String health = complete ? "HEALTHY" : score >= 67 ? "AT_RISK" : "INCOMPLETE";
        if (findings.isEmpty()) findings.add("Roadmap satisfies the Version 1.4 showcase controls.");

        return new RoadmapAssessment(roadmap.roadmapId(), complete, targetDateValid,
                milestones, owner, score, health, List.copyOf(findings), List.copyOf(actions));
    }

    public InvestmentRecommendation recommend(
            TechnologyAsset asset,
            LifecycleForecast forecast,
            RiskAssessment risk,
            TechnologyRoadmap roadmap
    ) {
        InvestmentAction action;
        String priority;
        List<String> actions = new ArrayList<>();

        if (forecast.supportExpired() || forecast.retirementOverdue()) {
            action = InvestmentAction.RETIRE; priority = "CRITICAL";
            actions.add("Execute retirement or approved emergency migration.");
        } else if (forecast.monthsToSupportEnd() <= 12 || risk.residualRating().equals("CRITICAL")) {
            action = InvestmentAction.MIGRATE; priority = "HIGH";
            actions.add("Fund and execute migration within twelve months.");
        } else if (risk.residualRating().equals("HIGH")) {
            action = InvestmentAction.MODERNISE; priority = "HIGH";
            actions.add("Prioritise modernisation and monitor residual risk.");
        } else if (asset.lifecycleStatus().equals("NEAR_END_OF_LIFE")) {
            action = InvestmentAction.CONTAIN; priority = "MEDIUM";
            actions.add("Prevent new strategic workloads and maintain the roadmap.");
        } else {
            action = InvestmentAction.MONITOR; priority = "LOW";
            actions.add("Continue lifecycle and standards monitoring.");
        }

        String rationale = "Forecast=" + forecast.forecastStatus()
                + ", residualRisk=" + risk.residualRating()
                + ", lifecycle=" + asset.lifecycleStatus();

        return new InvestmentRecommendation(asset.assetId(), action, priority,
                rationale, roadmap.targetState(), List.copyOf(actions));
    }

    private boolean present(String value) { return value != null && !value.isBlank(); }
}
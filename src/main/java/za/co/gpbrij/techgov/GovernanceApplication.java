package za.co.gpbrij.techgov;

import java.nio.file.Path;
import java.time.LocalDate;

public final class GovernanceApplication {
    public static void main(String[] args) throws Exception {
        var asset = SampleData.legacyDatabase();
        var governance = new GovernanceEngine().assess(asset);
        new JsonReportWriter().write(governance, Path.of("output/governance-assessment.json"));
        var standard = StandardsSampleData.legacyDatabaseStandard();
        var standards = new StandardsEngine().assess(asset, "Legacy Customer Database", standard);
        var waiver = new WaiverEngine().assess(V120SampleData.containedTechnologyWaiver(), LocalDate.now());
        var risk = new TechnologyRiskEngine().assess(V120SampleData.lifecycleRisk(), LocalDate.now());
        var capability = V130SampleData.customerManagement();
        var application = V130SampleData.customerHub();
        var landscape = V130SampleData.customerLandscape();
        var decision = V130SampleData.targetStateApproval();
        var repository = new ArchitectureRepositoryEngine().assess(
                capability, application, asset, standard, landscape, decision);
        var roadmap = V140SampleData.customerDatabaseRoadmap();
        var roadmapEngine = new RoadmapEngine();
        var roadmapAssessment = roadmapEngine.assess(roadmap, LocalDate.now());
        var forecast = new LifecycleForecastEngine().forecast(
                "FORECAST-001", asset, LocalDate.now(), LocalDate.now().plusMonths(10));
        var investment = roadmapEngine.recommend(asset, forecast, risk, roadmap);

        System.out.println("Enterprise Technology Governance Intelligence Showcase");
        System.out.println("Version: 1.4.0");
        System.out.println();
        System.out.println("=== GOVERNANCE CHAIN ===");
        System.out.println("Capability: " + capability.capabilityName());
        System.out.println("Application: " + application.applicationName());
        System.out.println("Asset decision: " + governance.decision());
        System.out.println("Standard compliance: " + standards.complianceStatus());
        System.out.println("Waiver decision: " + waiver.decision());
        System.out.println("Residual risk: " + risk.residualRisk() + " / " + risk.residualRating());
        System.out.println("Repository traceability: " + repository.traceabilityScore() + "%");
        System.out.println();
        System.out.println("=== TECHNOLOGY ROADMAP ===");
        System.out.println("Roadmap: " + roadmap.roadmapId());
        System.out.println("Current: " + roadmap.currentState());
        System.out.println("Transition: " + roadmap.transitionState());
        System.out.println("Target: " + roadmap.targetState());
        System.out.println("Health: " + roadmapAssessment.roadmapHealth());
        System.out.println("Completeness: " + roadmapAssessment.completenessScore() + "%");
        System.out.println();
        System.out.println("=== LIFECYCLE FORECAST ===");
        System.out.println("Support end: " + forecast.supportEndDate());
        System.out.println("Months to support end: " + forecast.monthsToSupportEnd());
        System.out.println("Forecast: " + forecast.forecastStatus());
        System.out.println();
        System.out.println("=== INVESTMENT RECOMMENDATION ===");
        System.out.println("Action: " + investment.action());
        System.out.println("Priority: " + investment.priority());
        System.out.println("Rationale: " + investment.rationale());
        System.out.println("Target state: " + investment.targetState());
    }
}
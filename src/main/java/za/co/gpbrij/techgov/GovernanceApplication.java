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
        var forecast = new LifecycleForecastEngine().forecast(
                "FORECAST-001", asset, LocalDate.now(), LocalDate.now().plusMonths(10));
        var investment = new RoadmapEngine().recommend(asset, forecast, risk, roadmap);
        var reference = V150SampleData.customerDataPlatformReference();
        var pattern = V150SampleData.apiDataAccessPattern();
        var patternAssessment = new PatternCatalogueEngine().assess(
                pattern, reference, V150SampleData.customerPlatformBlocks(),
                "PRODUCTION", V150SampleData.controlEvidence(), LocalDate.now());

        System.out.println("Enterprise Technology Governance Intelligence Showcase");
        System.out.println("Version: 1.5.2");
        System.out.println();
        System.out.println("=== ENTERPRISE GOVERNANCE CHAIN ===");
        System.out.println("Capability: " + capability.capabilityName());
        System.out.println("Application: " + application.applicationName());
        System.out.println("Asset decision: " + governance.decision());
        System.out.println("Standard compliance: " + standards.complianceStatus());
        System.out.println("Waiver: " + waiver.decision());
        System.out.println("Residual risk: " + risk.residualRating());
        System.out.println("Repository traceability: " + repository.traceabilityScore() + "%");
        System.out.println("Investment action: " + investment.action());
        System.out.println();
        System.out.println("=== REFERENCE ARCHITECTURE ===");
        System.out.println("Reference: " + reference.referenceId() + " / " + reference.name());
        System.out.println("Status: " + reference.status());
        System.out.println("Target principle: " + reference.targetStatePrinciple());
        System.out.println();
        System.out.println("=== ARCHITECTURE PATTERN ===");
        System.out.println("Pattern: " + pattern.patternId() + " / " + pattern.name());
        System.out.println("Type: " + pattern.type());
        System.out.println("Owner: " + pattern.owner());
        System.out.println();
        System.out.println("=== PATTERN ALIGNMENT ===");
        System.out.println("Approved: " + patternAssessment.approved());
        System.out.println("Building blocks complete: " + patternAssessment.buildingBlocksComplete());
        System.out.println("Controls satisfied: " + patternAssessment.controlsSatisfied());
        System.out.println("Alignment score: " + patternAssessment.alignmentScore() + "%");
        System.out.println("Decision: " + patternAssessment.decision());
    }
}
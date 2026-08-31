package za.co.gpbrij.techgov;

import java.nio.file.Path;
import java.time.LocalDate;

public final class GovernanceApplication {
    public static void main(String[] args) throws Exception {
        var asset = SampleData.legacyDatabase();
        var governance = new GovernanceEngine().assess(asset);
        new JsonReportWriter().write(governance, Path.of("output/governance-assessment.json"));

        var domain = StandardsSampleData.dataDomain();
        var standard = StandardsSampleData.legacyDatabaseStandard();
        var standards = new StandardsEngine().assess(asset, "Legacy Customer Database", standard);
        var waiver = new WaiverEngine().assess(
                V120SampleData.containedTechnologyWaiver(), LocalDate.now()
        );
        var risk = new TechnologyRiskEngine().assess(
                V120SampleData.lifecycleRisk(), LocalDate.now()
        );

        var capability = V130SampleData.customerManagement();
        var application = V130SampleData.customerHub();
        var landscape = V130SampleData.customerLandscape();
        var decision = V130SampleData.targetStateApproval();
        var repository = new ArchitectureRepositoryEngine().assess(
                capability, application, asset, standard, landscape, decision
        );

        System.out.println("Enterprise Technology Governance Intelligence Showcase");
        System.out.println("Version: 1.3.0");
        System.out.println();
        System.out.println("=== BUSINESS CAPABILITY ===");
        System.out.println("Capability: " + capability.capabilityName());
        System.out.println("Owner: " + capability.businessOwner());
        System.out.println("Target maturity: " + capability.targetMaturity());
        System.out.println();
        System.out.println("=== APPLICATION PORTFOLIO ===");
        System.out.println("Application: " + application.applicationName());
        System.out.println("Criticality: " + application.businessCriticality());
        System.out.println("Roadmap: " + application.roadmapStatus());
        System.out.println();
        System.out.println("=== TECHNOLOGY GOVERNANCE ===");
        System.out.println("Asset decision: " + governance.decision());
        System.out.println("Standard compliance: " + standards.complianceStatus());
        System.out.println("Waiver decision: " + waiver.decision());
        System.out.println("Residual risk: " + risk.residualRisk() + " / " + risk.residualRating());
        System.out.println();
        System.out.println("=== ARCHITECTURE LANDSCAPE ===");
        System.out.println("Landscape: " + landscape.landscapeId());
        System.out.println("Current state: " + landscape.currentState());
        System.out.println("Target state: " + landscape.targetState());
        System.out.println();
        System.out.println("=== GOVERNANCE DECISION LOG ===");
        System.out.println("Decision: " + decision.decisionId() + " / " + decision.decisionType());
        System.out.println("Outcome: " + decision.outcome());
        System.out.println("Decision owner: " + decision.decisionOwner());
        System.out.println();
        System.out.println("=== REPOSITORY TRACEABILITY ===");
        System.out.println("Status: " + repository.repositoryStatus());
        System.out.println("Traceability score: " + repository.traceabilityScore() + "%");
        System.out.println("Target state defined: " + repository.targetStateDefined());
        System.out.println();
        System.out.println("Governance report: output/governance-assessment.json");
    }
}
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

        System.out.println("Enterprise Technology Governance Intelligence Showcase");
        System.out.println("Version: 1.2.0");
        System.out.println();
        System.out.println("=== ASSET GOVERNANCE ===");
        System.out.println("Asset: " + asset.name() + " [" + asset.assetId() + "]");
        System.out.println("Risk: " + governance.riskRating() + " (" + governance.riskScore() + ")");
        System.out.println("Decision: " + governance.decision());
        System.out.println();
        System.out.println("=== TECHNOLOGY STANDARD ===");
        System.out.println("Domain: " + domain.domainName());
        System.out.println("Standard: " + standard.standardId() + " / " + standard.status());
        System.out.println("Compliance: " + standards.complianceStatus());
        System.out.println("Target state: " + standards.recommendedTargetState());
        System.out.println();
        System.out.println("=== ARCHITECTURE WAIVER ===");
        System.out.println("Waiver: " + waiver.waiverId());
        System.out.println("Status: " + waiver.status());
        System.out.println("Decision: " + waiver.decision());
        System.out.println("Expired: " + waiver.expired());
        System.out.println();
        System.out.println("=== TECHNOLOGY RISK ===");
        System.out.println("Risk: " + risk.riskId());
        System.out.println("Inherent risk: " + risk.inherentRisk());
        System.out.println("Residual risk: " + risk.residualRisk() + " / " + risk.residualRating());
        System.out.println("Treatment: " + risk.treatmentDecision());
        System.out.println("Overdue: " + risk.overdue());
        System.out.println();
        System.out.println("Report: output/governance-assessment.json");
    }
}
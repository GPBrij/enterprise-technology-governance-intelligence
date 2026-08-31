package za.co.gpbrij.techgov;

import java.nio.file.Path;

public final class GovernanceApplication {

    public static void main(String[] args) throws Exception {

        var asset = SampleData.legacyDatabase();

        var governanceAssessment =
                new GovernanceEngine().assess(asset);

        new JsonReportWriter().write(
                governanceAssessment,
                Path.of("output/governance-assessment.json")
        );

        var technologyDomain =
                StandardsSampleData.dataDomain();

        var technologyStandard =
                StandardsSampleData.legacyDatabaseStandard();

        var standardsAssessment =
                new StandardsEngine().assess(
                        asset,
                        "Legacy Customer Database",
                        technologyStandard
                );

        System.out.println(
                "Enterprise Technology Governance Intelligence Showcase"
        );

        System.out.println("Version: 1.1.0");
        System.out.println();

        System.out.println("=== ASSET GOVERNANCE ASSESSMENT ===");
        System.out.println(
                "Asset: " +
                asset.name() +
                " [" +
                asset.assetId() +
                "]"
        );
        System.out.println(
                "Risk: " +
                governanceAssessment.riskRating() +
                " (" +
                governanceAssessment.riskScore() +
                ")"
        );
        System.out.println(
                "Decision: " +
                governanceAssessment.decision()
        );
        System.out.println(
                "Target state: " +
                governanceAssessment.recommendedTargetState()
        );
        System.out.println(
                "Metadata completeness: " +
                governanceAssessment.metadataCompletenessPercent() +
                "%"
        );
        System.out.println(
                "Landscape impact: " +
                governanceAssessment.landscapeImpactScore()
        );

        System.out.println();
        System.out.println(
                "=== TECHNOLOGY REFERENCE MODEL ==="
        );
        System.out.println(
                "Domain ID: " +
                technologyDomain.domainId()
        );
        System.out.println(
                "Domain: " +
                technologyDomain.domainName()
        );
        System.out.println(
                "Architecture layer: " +
                technologyDomain.architectureLayer()
        );
        System.out.println(
                "Domain owner: " +
                technologyDomain.owner()
        );

        System.out.println();
        System.out.println(
                "=== TECHNOLOGY STANDARDS ASSESSMENT ==="
        );
        System.out.println(
                "Standard ID: " +
                technologyStandard.standardId()
        );
        System.out.println(
                "Standard status: " +
                technologyStandard.status()
        );
        System.out.println(
                "Technology matched: " +
                standardsAssessment.technologyMatched()
        );
        System.out.println(
                "Version approved: " +
                standardsAssessment.versionApproved()
        );
        System.out.println(
                "Environment permitted: " +
                standardsAssessment.environmentPermitted()
        );
        System.out.println(
                "Architecture layer aligned: " +
                standardsAssessment.architectureLayerAligned()
        );
        System.out.println(
                "Compliance status: " +
                standardsAssessment.complianceStatus()
        );
        System.out.println(
                "Recommended target state: " +
                standardsAssessment.recommendedTargetState()
        );

        System.out.println();
        System.out.println("Required actions:");

        standardsAssessment.requiredActions()
                .forEach(action ->
                        System.out.println("- " + action)
                );

        System.out.println();
        System.out.println(
                "Governance report: " +
                "output/governance-assessment.json"
        );
    }
}
package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public final class V120SampleData {
    private V120SampleData() {}

    public static ArchitectureWaiver containedTechnologyWaiver() {
        return new ArchitectureWaiver(
                "WVR-001", "TECH-001", "PRJ-1042", "STD-DATA-001",
                "Legacy Customer Database",
                "A time-bound exception supports migration sequencing.",
                "Unsupported or contained technology may increase operational and security exposure.",
                List.of("Restricted change scope", "Enhanced monitoring", "Monthly owner review"),
                "Project Manager", "Database Platform Owner", "Customer Capability Owner",
                "Solution Architect", "Enterprise Architect", "Security Reviewer", "Privacy Reviewer",
                "Architecture Review Board", WaiverStatus.CONDITIONALLY_APPROVED,
                LocalDate.now().minusMonths(1), LocalDate.now().plusMonths(6),
                LocalDate.now().plusMonths(1),
                List.of("No new strategic workloads", "Migration milestones reported monthly"),
                "Migrate to the managed target-state database service.",
                "Managed PostgreSQL Cloud Service",
                List.of("ARB-DEMO-WVR-001", "RISK-001", "ROADMAP-DEMO-001")
        );
    }

    public static TechnologyRisk lifecycleRisk() {
        return new TechnologyRisk(
                "RISK-001", "TECH-001", "PRJ-1042", "LIFECYCLE",
                "The current database version is not approved by the selected standard.",
                "Vendor support or internal supportability may become insufficient.",
                "Customer capability disruption, security exposure and migration cost may increase.",
                5, 5,
                List.of("Architecture waiver", "Enhanced monitoring", "Migration roadmap"),
                40,
                "Technology Owner",
                "MITIGATE",
                List.of("Upgrade supported components", "Migrate to target state", "Retire legacy instance"),
                LocalDate.now().plusMonths(6),
                RiskStatus.MITIGATING,
                List.of("WVR-001", "STD-DATA-001", "ROADMAP-DEMO-001")
        );
    }
}
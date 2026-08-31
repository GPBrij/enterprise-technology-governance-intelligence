package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public final class V130SampleData {
    private V130SampleData() {}

    public static BusinessCapability customerManagement() {
        return new BusinessCapability(
                "CAP-001", "Customer Management",
                "Manage customer identity, profile and servicing information.",
                "Customer Capability Owner",
                "Provide trusted and reusable customer information.",
                "LEVEL_2_REPEATABLE", "LEVEL_4_MANAGED",
                "Governed customer master-data capability"
        );
    }

    public static ApplicationPortfolioItem customerHub() {
        return new ApplicationPortfolioItem(
                "APP-001", "Customer Hub", "CAP-001",
                "Synthetic customer information application.",
                "Customer Capability Owner", "Application Platform Owner",
                "CONTAIN", "CRITICAL", "ON_PREMISE", "CONFIDENTIAL",
                List.of("TECH-001"), "MIGRATION_PLANNED",
                "Cloud-native customer master-data platform"
        );
    }

    public static ArchitectureLandscape customerLandscape() {
        return new ArchitectureLandscape(
                "LAND-001", "PF-DIGITAL", "PRG-CUSTOMER", "PRJ-1042",
                "CAP-001", "APP-001", "TECH-001", "STD-DATA-001",
                "WVR-001", "RISK-001",
                List.of("Digital Channels", "Identity Service"),
                List.of("Reporting Platform", "Customer Analytics"),
                "Legacy on-premises customer database",
                "Time-bound waiver and controlled migration",
                "Cloud-native customer master-data platform"
        );
    }

    public static GovernanceDecision targetStateApproval() {
        return new GovernanceDecision(
                "DEC-001", DecisionType.TARGET_STATE_APPROVAL,
                LocalDate.now(), "LAND-001", "Enterprise Architect",
                "Architecture Review Board", "APPROVED_WITH_CONDITIONS",
                "The target state addresses lifecycle, supportability and standards risk.",
                List.of("Maintain compensating controls", "Report migration progress monthly"),
                LocalDate.now().plusMonths(3),
                List.of("ARB-DEMO-DEC-001", "WVR-001", "RISK-001")
        );
    }
}
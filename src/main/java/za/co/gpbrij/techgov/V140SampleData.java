package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public final class V140SampleData {
    private V140SampleData() {}

    public static TechnologyRoadmap customerDatabaseRoadmap() {
        return new TechnologyRoadmap(
                "ROADMAP-001", "TECH-001", "APP-001", "CAP-001",
                "Legacy on-premises customer database",
                "Controlled migration with time-bound waiver",
                "Managed PostgreSQL Cloud Service",
                "Improve supportability, resilience and standards alignment.",
                "Technology Portfolio Owner",
                LocalDate.now(), LocalDate.now().plusMonths(9),
                RoadmapStatus.APPROVED,
                List.of("Discovery complete", "Target build", "Data migration", "Cutover", "Legacy retirement"),
                List.of("Funding approval", "Application remediation", "Data migration tooling"),
                List.of("DEC-001", "WVR-001", "RISK-001")
        );
    }
}
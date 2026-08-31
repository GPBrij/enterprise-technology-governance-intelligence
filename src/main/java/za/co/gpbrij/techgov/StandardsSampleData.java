package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public final class StandardsSampleData {
    private StandardsSampleData() {}

    public static TechnologyDomain dataDomain() {
        return new TechnologyDomain(
                "TRM-DATA-001",
                "Data Platforms",
                "Operational, analytical and master-data technologies",
                "DATA",
                "Enterprise Data Architecture"
        );
    }

    public static TechnologyStandard legacyDatabaseStandard() {
        return new TechnologyStandard(
                "STD-DATA-001",
                "Legacy Customer Database",
                "Relational Database",
                "Example Vendor",
                List.of("19c", "21c"),
                StandardStatus.CONTAIN,
                "DATA",
                List.of("DEVELOPMENT", "TEST", "UAT", "PRODUCTION"),
                List.of("Existing workloads during approved migration"),
                List.of("New strategic workloads"),
                LocalDate.now().plusMonths(6),
                "Managed PostgreSQL Cloud Service",
                "Enterprise Data Architecture",
                "ARB-DEMO-001",
                true
        );
    }
}
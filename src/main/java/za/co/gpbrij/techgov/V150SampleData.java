package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public final class V150SampleData {
    private V150SampleData() {}

    public static List<ArchitectureBuildingBlock> customerPlatformBlocks() {
        return List.of(
                new ArchitectureBuildingBlock(
                        "ABB-DATA-001", "Managed Relational Data Store", "DATA",
                        "Managed relational persistence for governed customer data.",
                        "Enterprise Data Architecture",
                        List.of("Managed PostgreSQL Cloud Service"),
                        List.of("SQL", "Private Endpoint"),
                        List.of("Encryption at rest", "Backup verification", "Access logging"),
                        "STRATEGIC"
                ),
                new ArchitectureBuildingBlock(
                        "ABB-API-001", "Governed Customer API", "API",
                        "Authenticated service boundary for customer information.",
                        "Integration Architecture",
                        List.of("Java API Service"),
                        List.of("REST", "OpenAPI"),
                        List.of("OAuth2", "Schema validation", "Rate limiting"),
                        "STANDARD"
                ),
                new ArchitectureBuildingBlock(
                        "ABB-SEC-001", "Identity and Audit Control", "SECURITY",
                        "Identity enforcement and auditable access evidence.",
                        "Security Architecture",
                        List.of("Enterprise Identity Provider"),
                        List.of("OIDC", "Audit Events"),
                        List.of("Least privilege", "MFA", "Audit retention"),
                        "STANDARD"
                )
        );
    }

    public static ReferenceArchitecture customerDataPlatformReference() {
        return new ReferenceArchitecture(
                "REF-DATA-001", "Governed Customer Data Platform", "DATA",
                "Customer Management",
                "Provide a reusable target-state structure for governed customer-data solutions.",
                PatternStatus.APPROVED,
                "Enterprise Architecture",
                LocalDate.now().minusMonths(1),
                LocalDate.now().plusMonths(11),
                List.of("ABB-DATA-001", "ABB-API-001", "ABB-SEC-001"),
                List.of("DEVELOPMENT", "TEST", "UAT", "PRODUCTION"),
                List.of("DATA-CLASSIFICATION", "ENCRYPTION", "IDENTITY", "AUDIT", "RESILIENCE"),
                List.of("ARB-DEMO-REF-001", "STD-DATA-001"),
                "Cloud-managed, secure, observable and standards-aligned"
        );
    }

    public static ArchitecturePattern apiDataAccessPattern() {
        return new ArchitecturePattern(
                "PAT-API-001", "Governed API Data Access",
                PatternType.INTEGRATION_PATTERN,
                "Direct database access creates coupling and inconsistent controls.",
                "Customer applications require controlled access to governed data.",
                "Use an authenticated API boundary with validation, audit and rate controls.",
                List.of("Adds service-operability responsibilities", "Reduces direct database coupling"),
                List.of("Security", "Interoperability", "Auditability", "Resilience"),
                List.of("ABB-DATA-001", "ABB-API-001", "ABB-SEC-001"),
                List.of("Unauthenticated public access", "Direct production database access"),
                PatternStatus.APPROVED,
                "Integration Architecture",
                LocalDate.now().plusMonths(11),
                List.of("ARB-DEMO-PAT-001", "REF-DATA-001")
        );
    }

    public static List<String> controlEvidence() {
        return List.of("DATA-CLASSIFICATION", "ENCRYPTION", "IDENTITY", "AUDIT", "RESILIENCE");
    }
}
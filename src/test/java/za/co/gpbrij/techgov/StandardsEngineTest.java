package za.co.gpbrij.techgov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StandardsEngineTest {

    @Test
    void requiresWaiverForContainedUnapprovedVersion() {
        var asset = SampleData.legacyDatabase();
        var standard = StandardsSampleData.legacyDatabaseStandard();

        var result = new StandardsEngine()
                .assess(asset, "Legacy Customer Database", standard);

        assertTrue(result.technologyMatched());
        assertFalse(result.versionApproved());
        assertTrue(result.environmentPermitted());
        assertTrue(result.architectureLayerAligned());
        assertEquals("WAIVER_REQUIRED", result.complianceStatus());
        assertEquals(
                "Managed PostgreSQL Cloud Service",
                result.recommendedTargetState()
        );
        assertFalse(result.requiredActions().isEmpty());
    }
}
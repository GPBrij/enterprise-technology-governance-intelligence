package za.co.gpbrij.techgov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GovernanceEngineTest {

    @Test
    void flagsLegacyAsset() {

        var result = new GovernanceEngine()
                .assess(SampleData.legacyDatabase());

        assertEquals(85, result.riskScore());
        assertEquals("CRITICAL", result.riskRating());
        assertEquals("REJECT_AND_REPLACE", result.decision());
        assertEquals(
                "Managed PostgreSQL Cloud Service",
                result.recommendedTargetState()
        );
        assertTrue(result.landscapeImpactScore() > 0);
        assertFalse(result.findings().isEmpty());
        assertFalse(result.requiredActions().isEmpty());
    }
}
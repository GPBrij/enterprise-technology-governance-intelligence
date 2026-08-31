package za.co.gpbrij.techgov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArchitectureRepositoryEngineTest {

    @Test
    void validatesCompleteArchitectureTraceability() {
        var result = new ArchitectureRepositoryEngine().assess(
                V130SampleData.customerManagement(),
                V130SampleData.customerHub(),
                SampleData.legacyDatabase(),
                StandardsSampleData.legacyDatabaseStandard(),
                V130SampleData.customerLandscape(),
                V130SampleData.targetStateApproval()
        );

        assertTrue(result.capabilityLinked());
        assertTrue(result.applicationLinked());
        assertTrue(result.assetLinked());
        assertTrue(result.standardLinked());
        assertTrue(result.governanceDecisionRecorded());
        assertTrue(result.targetStateDefined());
        assertEquals(100, result.traceabilityScore());
        assertEquals("COMPLETE", result.repositoryStatus());
    }
}
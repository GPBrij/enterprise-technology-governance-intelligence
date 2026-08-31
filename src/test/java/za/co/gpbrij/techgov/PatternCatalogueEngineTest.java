package za.co.gpbrij.techgov;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PatternCatalogueEngineTest {
    @Test
    void validatesApprovedPatternAndReferenceArchitecture() {
        var result = new PatternCatalogueEngine().assess(
                V150SampleData.apiDataAccessPattern(),
                V150SampleData.customerDataPlatformReference(),
                V150SampleData.customerPlatformBlocks(),
                "PRODUCTION",
                V150SampleData.controlEvidence(),
                LocalDate.now()
        );

        assertTrue(result.approved());
        assertTrue(result.environmentApplicable());
        assertTrue(result.buildingBlocksComplete());
        assertTrue(result.controlsSatisfied());
        assertTrue(result.reviewCurrent());
        assertEquals(100, result.alignmentScore());
        assertEquals("ALIGNED", result.decision());
    }
}
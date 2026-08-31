package za.co.gpbrij.techgov;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WaiverEngineTest {
    @Test
    void acceptsValidTimeBoundConditionalWaiver() {
        var result = new WaiverEngine().assess(
                V120SampleData.containedTechnologyWaiver(), LocalDate.now()
        );
        assertTrue(result.complete());
        assertFalse(result.expired());
        assertFalse(result.reviewRequired());
        assertEquals("VALID_WAIVER", result.decision());
    }
}
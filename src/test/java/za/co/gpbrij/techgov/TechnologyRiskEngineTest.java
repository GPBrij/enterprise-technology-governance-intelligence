package za.co.gpbrij.techgov;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TechnologyRiskEngineTest {
    @Test
    void calculatesHighResidualLifecycleRisk() {
        var result = new TechnologyRiskEngine().assess(
                V120SampleData.lifecycleRisk(), LocalDate.now()
        );
        assertEquals(25, result.inherentRisk());
        assertEquals(15, result.residualRisk());
        assertEquals("HIGH", result.residualRating());
        assertEquals("TREAT_AND_MONITOR", result.treatmentDecision());
        assertFalse(result.overdue());
    }
}
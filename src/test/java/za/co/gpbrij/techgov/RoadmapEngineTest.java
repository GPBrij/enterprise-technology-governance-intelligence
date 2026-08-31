package za.co.gpbrij.techgov;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoadmapEngineTest {
    @Test
    void validatesRoadmapAndRecommendsMigration() {
        var asset = SampleData.legacyDatabase();
        var roadmap = V140SampleData.customerDatabaseRoadmap();
        var forecast = new LifecycleForecastEngine().forecast(
                "FORECAST-001", asset, LocalDate.now(), LocalDate.now().plusMonths(10)
        );
        var risk = new TechnologyRiskEngine().assess(V120SampleData.lifecycleRisk(), LocalDate.now());
        var engine = new RoadmapEngine();
        var assessment = engine.assess(roadmap, LocalDate.now());
        var recommendation = engine.recommend(asset, forecast, risk, roadmap);

        assertTrue(assessment.complete());
        assertEquals(100, assessment.completenessScore());
        assertEquals("HEALTHY", assessment.roadmapHealth());
        assertEquals("URGENT_REPLACEMENT", forecast.forecastStatus());
        assertEquals(InvestmentAction.MIGRATE, recommendation.action());
        assertEquals("HIGH", recommendation.priority());
    }
}
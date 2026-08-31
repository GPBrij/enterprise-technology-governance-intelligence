package za.co.gpbrij.techgov;

import java.time.LocalDate;

public record LifecycleForecast(
        String forecastId,
        String assetId,
        LocalDate assessmentDate,
        LocalDate supportEndDate,
        LocalDate retirementDate,
        long monthsToSupportEnd,
        long monthsToRetirement,
        String forecastStatus,
        boolean supportExpired,
        boolean retirementOverdue
) {}
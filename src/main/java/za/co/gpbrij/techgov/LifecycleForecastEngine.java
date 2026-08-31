package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class LifecycleForecastEngine {
    public LifecycleForecast forecast(
            String forecastId,
            TechnologyAsset asset,
            LocalDate assessmentDate,
            LocalDate retirementDate
    ) {
        LocalDate supportEnd = asset.supportEndDate();
        long supportMonths = supportEnd == null ? Long.MAX_VALUE
                : ChronoUnit.MONTHS.between(assessmentDate.withDayOfMonth(1), supportEnd.withDayOfMonth(1));
        long retirementMonths = retirementDate == null ? Long.MAX_VALUE
                : ChronoUnit.MONTHS.between(assessmentDate.withDayOfMonth(1), retirementDate.withDayOfMonth(1));
        boolean supportExpired = supportEnd != null && supportEnd.isBefore(assessmentDate);
        boolean retirementOverdue = retirementDate != null && retirementDate.isBefore(assessmentDate);

        String status;
        if (supportExpired || retirementOverdue) status = "OVERDUE_REPLACEMENT";
        else if (supportMonths <= 6) status = "URGENT_REPLACEMENT";
        else if (supportMonths <= 12) status = "MIGRATE_WITHIN_12_MONTHS";
        else if (supportMonths <= 24) status = "PLAN_MODERNISATION";
        else status = "MONITOR";

        return new LifecycleForecast(
                forecastId, asset.assetId(), assessmentDate, supportEnd, retirementDate,
                supportMonths, retirementMonths, status, supportExpired, retirementOverdue
        );
    }
}
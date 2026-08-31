# Lifecycle Forecast Meta-Fields

## Purpose

Calculate support and retirement urgency from governed dates without predicting vendor behaviour.

## Two-dimensional information line

```text
ASSESSMENT DATE + SUPPORT END + RETIREMENT DATE -> MONTHS REMAINING -> URGENCY -> ACTION
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| forecastId | String | Yes | Forecast identity | Forecast engine | Unique | Asset, roadmap | Forecast register | Retain per cycle |
| assessmentDate | Date | Yes | Calculation date | Forecast engine | Valid date | All outputs | Time-series report | Retain per run |
| supportEndDate | Date | Conditional | Support deadline | Technology owner | Evidence-backed | Asset, standard | Support report | Review on vendor notice |
| retirementDate | Date | Conditional | Planned retirement | Roadmap owner | Decision-linked | Roadmap | Retirement report | Review monthly |
| monthsToSupportEnd | Long | Derived | Support horizon | Forecast engine | Calculated | Investment | Urgency dashboard | Retain per run |
| forecastStatus | Enum | Derived | Urgency classification | Forecast engine | Rule-derived | Investment | Forecast dashboard | Retain per run |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
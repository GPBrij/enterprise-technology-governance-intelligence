# Investment Recommendation Meta-Fields

## Purpose

Translate lifecycle forecast, residual risk and roadmap evidence into transparent portfolio decision support.

## Two-dimensional information line

```text
FORECAST + RISK + ROADMAP -> ACTION -> PRIORITY -> RATIONALE -> APPROVAL
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| assetId | String | Yes | Recommendation subject | Portfolio governance | Existing asset | Asset | Investment portfolio | Retain with decision |
| action | Enum | Derived | Invest, modernise, migrate, consolidate, contain, retire or monitor | Roadmap engine | Rule-derived | Roadmap | Action report | Retain per assessment |
| priority | Enum | Derived | Decision urgency | Roadmap engine | Rule-derived | Finance | Priority heat map | Retain per assessment |
| rationale | String | Derived | Transparent basis | Roadmap engine | Must cite forecast, risk and lifecycle | Decision | Approval pack | Retain with decision |
| targetState | String | Yes | Destination | Enterprise architect | Roadmap-aligned | Reference | Target-state report | Review on change |
| requiredActions | List | Yes | Next steps | Portfolio owner | Non-empty | Project | Action tracking | Until closure |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
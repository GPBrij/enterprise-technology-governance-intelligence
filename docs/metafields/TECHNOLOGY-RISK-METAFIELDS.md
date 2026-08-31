# Technology Risk Meta-Fields

## Purpose

Record cause, event, impact, controls, residual exposure, ownership and treatment.

## Two-dimensional information line

```text
CAUSE -> EVENT -> IMPACT -> INHERENT RISK -> CONTROLS -> RESIDUAL RISK -> TREATMENT -> CLOSURE
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| riskId | String | Yes | Risk identity | Risk owner | Unique | Asset, waiver | Risk register | Retain after closure |
| cause | String | Yes | Source of uncertainty | Risk assessor | Non-blank | Waiver | Risk statement | Review on change |
| event | String | Yes | Potential occurrence | Risk assessor | Non-blank | Decision | Risk statement | Review on change |
| businessImpact | String | Yes | Consequence | Business owner | Material description | Capability | Executive risk | Review on change |
| inherentLikelihood | Integer 1-5 | Yes | Pre-control likelihood | Risk assessor | Range 1-5 | Assessment | Risk heat map | Review periodically |
| inherentImpact | Integer 1-5 | Yes | Pre-control impact | Risk assessor | Range 1-5 | Assessment | Risk heat map | Review periodically |
| controlEffectivenessPercent | Integer 0-100 | Yes | Control adjustment | Control owner | Range 0-100 and evidence | Assessment | Residual risk | Review with testing |
| riskOwner | String | Yes | Accountability | Risk governance | Named role | Decision | Ownership report | Review on role change |
| targetDate | Date | Yes | Treatment deadline | Risk owner | Valid date | Roadmap | Overdue report | Monitor continuously |
| status | Enum | Yes | Risk lifecycle | Risk owner | Approved value | Decision | Risk dashboard | Update per review |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
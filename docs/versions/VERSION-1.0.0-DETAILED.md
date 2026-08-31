# Version 1.0.0 Detailed View: Technology Asset Governance

## Purpose
Establish the foundational technology asset record and convert asset evidence
into a transparent governance decision.

## Two-dimensional line

```text
ASSET IDENTITY -> OWNERSHIP -> LIFECYCLE -> SUPPORT -> DATA QUALITY -> ARCHITECTURE -> PRIVACY -> OPERATIONS
       |             |             |           |              |               |             |            |
     name        business/tech   status      end date       level 1-5      layer/approval  data flags   incidents
       |_____________________________________________________________________________________________________|
                                                         |
                                                         v
                                      RISK + LANDSCAPE IMPACT + TARGET STATE
```

## Inputs, rules and outputs

| Element | Description |
|---|---|
| Inputs | Asset metadata, owners, lifecycle, support, architecture, privacy and operational indicators |
| Controls | Mandatory ownership, support horizon, maturity, approval and incident thresholds |
| Outputs | Risk score, rating, decision, completeness, impact, findings and actions |
| Evidence | JSON assessment report and automated unit test |

## Primary documents
- `docs/ARCHITECTURE.md`
- `docs/META-MODEL.md`
- `docs/DATA-QUALITY-MATURITY.md`
- `docs/CONTROL-CATALOGUE.md`
- `docs/DECISION-RULES.md`
- `docs/POPIA-NOTE.md`
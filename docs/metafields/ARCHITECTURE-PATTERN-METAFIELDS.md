# Architecture Pattern Meta-Fields

## Purpose

Describe a reusable response to a recurring architecture problem with explicit applicability and misuse boundaries.

## Two-dimensional information line

```text
PROBLEM -> CONTEXT -> SOLUTION -> CONSEQUENCES -> QUALITY ATTRIBUTES -> BLOCKS -> PROHIBITIONS -> ALIGNMENT
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| patternId | String | Yes | Pattern identity | Pattern owner | Unique | Reference, building block | Pattern catalogue | Versioned |
| type | Enum | Yes | Pattern classification | Domain architect | Approved value | Views | Pattern usage | Review on change |
| problem | String | Yes | Recurring concern | Pattern owner | Clear problem statement | Decision | Selection guidance | Versioned |
| context | String | Yes | Applicability conditions | Pattern owner | Clear scope | Environment | Selection guidance | Versioned |
| solution | String | Yes | Reusable response | Pattern owner | Actionable description | Building blocks | Solution guidance | Versioned |
| qualityAttributes | List | Yes | Non-functional outcomes | Solution architect | Approved vocabulary | Controls | Quality report | Review on NFR change |
| requiredBuildingBlockIds | List | Yes | Structural requirements | Pattern owner | All IDs exist | Building blocks | Completeness report | Versioned |
| prohibitedUses | List | Yes | Misuse boundaries | Architecture forum | Explicit list | Waiver | Exception report | Review annually |
| reviewDate | Date | Yes | Currency control | Pattern owner | Future at approval | Decision | Review calendar | Monitor continuously |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
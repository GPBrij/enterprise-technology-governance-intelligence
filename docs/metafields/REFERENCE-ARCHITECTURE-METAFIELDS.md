# Reference Architecture Meta-Fields

## Purpose

Provide approved reusable target-state structure for a capability or architecture domain.

## Two-dimensional information line

```text
CAPABILITY -> PURPOSE -> BUILDING BLOCKS -> ENVIRONMENTS -> CONTROLS -> PRINCIPLE -> REVIEW
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| referenceId | String | Yes | Reference identity | Enterprise architecture | Unique | Pattern, landscape | Reference library | Versioned |
| domain | String | Yes | Architecture scope | Domain architect | Approved taxonomy | Building blocks | Domain report | Review annually |
| businessCapability | String | Yes | Business alignment | Business architect | Existing capability | Capability | Reuse report | Review on change |
| status | Enum | Yes | Governance disposition | Architecture forum | Approved value | Pattern | Approval report | Review periodically |
| buildingBlockIds | List | Yes | Required composition | Reference owner | All IDs exist | Building blocks | Completeness report | Versioned |
| applicableEnvironments | List | Yes | Deployment applicability | Reference owner | Approved environments | Pattern | Applicability report | Review on change |
| mandatoryControls | List | Yes | Assurance baseline | Control owners | Evidence identifiers | Pattern | Control coverage | Review on control change |
| reviewDate | Date | Yes | Currency obligation | Reference owner | Valid date | Decision | Review calendar | Monitor continuously |
| targetStatePrinciple | String | Yes | Design direction | Enterprise architect | Approved wording | Roadmap | Target architecture | Versioned |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
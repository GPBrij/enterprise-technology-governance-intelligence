# Architecture Building Block Meta-Fields

## Purpose

Define reusable logical architecture components, their technologies, interfaces, controls, owners and lifecycle.

## Two-dimensional information line

```text
BLOCK ID -> LAYER -> OWNER -> TECHNOLOGIES -> INTERFACES -> CONTROLS -> LIFECYCLE -> REUSE
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| buildingBlockId | String | Yes | Building block identity | Domain owner | Unique | Reference, pattern | Building block library | Versioned |
| architectureLayer | Enum | Yes | Layer classification | Domain architect | Approved taxonomy | Reference | Layer report | Review on redesign |
| owner | String | Yes | Accountability | Architecture governance | Named role | Decision | Ownership report | Review on change |
| approvedTechnologies | List | Yes | Permitted implementation choices | Standards owner | All standards exist | Standard | Technology report | Review on standard change |
| interfaces | List | Yes | Interaction contracts | Solution architect | Documented protocols | Landscape | Interface report | Review on change |
| controls | List | Yes | Control obligations | Control owners | Evidence identifiers | Pattern | Assurance report | Review on control change |
| lifecycleStatus | Enum | Yes | Reuse disposition | Enterprise architect | Approved value | Roadmap | Lifecycle report | Review quarterly |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
# Business Capability Meta-Fields

## Purpose

Connect strategy and accountable business outcomes to applications, architecture investments and target-state maturity.

## Two-dimensional information line

```text
STRATEGY -> CAPABILITY -> OWNER -> CURRENT MATURITY -> TARGET MATURITY -> APPLICATIONS -> OUTCOME
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| capabilityId | String | Yes | Stable capability identity | Business architect | Unique | Application, reference | Capability map | Evergreen |
| capabilityName | String | Yes | Business-readable ability | Business architect | Approved taxonomy | All business views | Capability report | Review annually |
| businessOwner | String | Yes | Outcome accountability | Business executive | Named role | Application, decision | Ownership report | Review on change |
| strategicObjective | String | Yes | Strategy alignment | Strategy owner | Linked objective | Roadmap | Strategy traceability | Review per planning cycle |
| currentMaturity | Enum | Yes | Baseline maturity | Capability owner | Level 1-5 | Roadmap | Gap report | Review periodically |
| targetMaturity | Enum | Yes | Desired maturity | Capability owner | Level 1-5 and not below current without rationale | Roadmap | Investment report | Review per roadmap |
| targetState | String | Yes | Future capability outcome | Enterprise architect | Non-blank | Application, reference | Target-state report | Review on decision |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
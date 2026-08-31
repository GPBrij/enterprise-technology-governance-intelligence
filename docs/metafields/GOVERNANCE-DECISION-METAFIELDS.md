# Governance Decision Meta-Fields

## Purpose

Create an auditable record of accountable architecture and risk outcomes.

## Two-dimensional information line

```text
EVIDENCE -> FORUM -> DECISION TYPE -> OUTCOME -> RATIONALE -> CONDITIONS -> REVIEW -> SUPERSESSION
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| decisionId | String | Yes | Decision identity | Governance secretariat | Unique | Landscape, asset | Decision log | Permanent record |
| decisionType | Enum | Yes | Decision classification | Forum owner | Approved value | All governed entities | Decision report | Permanent record |
| subjectId | String | Yes | Governed entity | Decision owner | Existing entity ID | Landscape | Traceability | Permanent record |
| decisionOwner | String | Yes | Accountable authority | Governance forum | Named role | Risk, roadmap | Authority report | Permanent record |
| outcome | String | Yes | Formal result | Decision owner | Approved outcome | Roadmap | Governance dashboard | Permanent record |
| rationale | String | Yes | Reasoning | Decision owner | Evidence-backed | All relationships | Audit view | Permanent record |
| conditions | List | Conditional | Approval obligations | Decision owner | Required for conditional outcome | Waiver, roadmap | Conditions report | Until closure |
| reviewDate | Date | Conditional | Reconsideration date | Governance secretariat | Valid date | Lifecycle | Review calendar | Until superseded |
| evidenceReferences | List | Yes | Supporting records | Evidence owner | Resolvable references | All entities | Audit completeness | Per retention policy |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
# Architecture Waiver Meta-Fields

## Purpose

Govern time-bound exceptions without changing the underlying technology standard.

## Two-dimensional information line

```text
NON-COMPLIANCE -> JUSTIFICATION -> RISK -> CONTROLS -> APPROVAL -> EXPIRY -> REMEDIATION -> CLOSURE
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| waiverId | String | Yes | Exception identity | Governance secretariat | Unique | Standard, risk | Waiver register | Retain after closure |
| standardId | String | Yes | Standard relationship | Enterprise architect | Existing standard | Standard | Compliance lineage | Evergreen |
| businessJustification | String | Yes | Reason for exception | Requestor | Material rationale | Decision | Approval pack | Retain with decision |
| riskStatement | String | Yes | Exposure statement | Risk owner | Cause-event-impact format | Risk | Risk report | Review on change |
| compensatingControls | List | Yes | Interim protection | Control owner | Non-empty and evidenced | Risk | Control report | Review monthly |
| status | Enum | Yes | Waiver lifecycle | Approver | Approved value | Decision | Waiver dashboard | Update per workflow |
| expiryDate | Date | Yes | Time limit | Waiver owner | Future at approval | Roadmap | Expiry report | Monitor continuously |
| reviewDate | Date | Yes | Review obligation | Approver | On or before expiry | Decision | Governance calendar | Monitor continuously |
| remediationPlan | String | Yes | Exit path | Technology owner | Actionable and funded | Roadmap | Remediation report | Close with evidence |
| targetStateTechnology | String | Yes | Required replacement | Enterprise architect | Approved standard | Roadmap | Target-state report | Review on decision |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
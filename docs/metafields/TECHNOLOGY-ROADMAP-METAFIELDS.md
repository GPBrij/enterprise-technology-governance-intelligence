# Technology Roadmap Meta-Fields

## Purpose

Manage current, transition and target-state delivery with owners, milestones, dependencies and evidence.

## Two-dimensional information line

```text
CURRENT -> TRANSITION -> MILESTONES -> DEPENDENCIES -> TARGET -> BENEFIT -> ACCEPTANCE -> RETIREMENT
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| roadmapId | String | Yes | Roadmap identity | Portfolio owner | Unique | Asset, forecast | Roadmap register | Retain after completion |
| currentState | String | Yes | Baseline state | Enterprise architect | Evidence-backed | Landscape | Baseline report | Versioned |
| transitionState | String | Yes | Interim state | Solution architect | Actionable | Project | Delivery report | Versioned |
| targetState | String | Yes | Approved future state | Enterprise architect | Decision-linked | Reference | Target-state report | Versioned |
| roadmapOwner | String | Yes | Delivery accountability | Portfolio governance | Named role | Decision | Ownership report | Review on change |
| milestones | List | Yes | Measurable progress | Project manager | Non-empty and dated externally | Forecast | Progress report | Update monthly |
| dependencies | List | Yes | Delivery constraints | Project manager | Resolvable items | Landscape | Dependency report | Update monthly |
| targetDate | Date | Yes | Completion objective | Roadmap owner | Future when approved | Forecast | Overdue report | Monitor continuously |
| evidenceReferences | List | Yes | Decision and delivery proof | Governance secretariat | Resolvable | Decision | Audit view | Per retention policy |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
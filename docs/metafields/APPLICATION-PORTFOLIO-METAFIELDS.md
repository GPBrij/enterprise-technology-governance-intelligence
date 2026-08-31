# Application Portfolio Meta-Fields

## Purpose

Connect capabilities to applications, technology composition, criticality, hosting, ownership and roadmap disposition.

## Two-dimensional information line

```text
CAPABILITY -> APPLICATION -> OWNERS -> CRITICALITY -> HOSTING -> ASSETS -> ROADMAP -> TARGET STATE
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| applicationId | String | Yes | Stable application identity | Application owner | Unique | Landscape, asset | Application portfolio | Evergreen |
| capabilityId | String | Yes | Business relationship | Business architect | Existing capability | Capability | Capability coverage | Review on scope change |
| businessCriticality | Enum | Yes | Business impact class | Business owner | Approved classification | Risk, roadmap | Criticality heat map | Review annually |
| technologyAssetIds | List | Yes | Technology composition | Solution architect | All IDs exist | Asset | Composition report | Review on change |
| hostingModel | Enum | Yes | Deployment model | Platform owner | Approved value | Asset, roadmap | Cloud/on-prem view | Review on migration |
| dataClassification | Enum | Yes | Information sensitivity | Information owner | Approved classification | Privacy, security | Data exposure | Review on data change |
| roadmapStatus | Enum | Yes | Transition position | Portfolio owner | Approved value | Roadmap | Transformation report | Refresh monthly |
| targetState | String | Yes | Future application disposition | Enterprise architect | Non-blank | Roadmap | Target portfolio | Review on approval |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
# Technology Asset Meta-Fields

## Purpose

Govern software, platforms, databases, APIs, security components and infrastructure across ownership, lifecycle, supportability, privacy, operations and target state.

## Two-dimensional information line

```text
IDENTITY -> OWNER -> ENVIRONMENT -> LIFECYCLE -> SUPPORT -> ARCHITECTURE -> PRIVACY -> OPERATIONS -> TARGET STATE
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| assetId | String | Yes | Stable identity | Technology owner | Unique and immutable | Application, landscape, risk, roadmap | Asset register | Retain through retirement |
| name | String | Yes | Business-readable name | Technology owner | Non-blank | All views | Portfolio reporting | Current lifecycle + archive |
| vendor | String | Yes | Supplier accountability | Vendor manager | Approved vendor name | Standard, support | Vendor exposure | Review on contract change |
| version | String | Yes | Deployed version | Support owner | Version syntax and catalogue match | Standard | Version compliance | Update on release |
| lifecycleStatus | Enum | Yes | Governance disposition | Enterprise architect | Approved status value | Standard, roadmap | Lifecycle heat map | Review quarterly |
| supportEndDate | Date | Conditional | Support horizon | Technology owner | Valid date and source evidence | Forecast | EOL dashboard | Review on vendor notice |
| technologyOwner | String | Yes | Technical accountability | Technology governance | Named accountable role | Risk, roadmap | Ownership gaps | Review on role change |
| businessOwner | String | Yes | Business accountability | Capability owner | Named accountable role | Capability, application | Business exposure | Review on role change |
| architectureLayer | Enum | Yes | Architecture classification | Solution architect | Approved taxonomy | Standard, pattern | Layer view | Review on redesign |
| environment | Enum | Yes | Deployment context | Operations owner | Approved environment | Standard | Environment compliance | Review on deployment |
| hostingModel | Enum | Yes | On-premises, cloud or hybrid | Platform owner | Approved value | Application, roadmap | Hosting landscape | Review on migration |
| processesPersonalInformation | Boolean | Yes | Privacy triage | Information owner | True or false with evidence | Privacy assessment | Privacy view | Review on data change |
| incidentCount | Integer | Yes | Operational exposure | Service owner | Zero or positive | Risk | Health reporting | Refresh monthly |
| targetStateTechnology | String | Conditional | Replacement direction | Enterprise architect | Required when contain or EOL | Roadmap, investment | Target-state view | Close on retirement |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
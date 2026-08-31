# Technology Standard Meta-Fields

## Purpose

Define approved technologies, versions, environments, use cases, restrictions, ownership and replacement direction.

## Two-dimensional information line

```text
DOMAIN -> TECHNOLOGY -> VERSION -> STATUS -> ENVIRONMENT -> USE CASE -> SUPPORT -> TARGET -> EXCEPTION
```

## Comprehensive field catalogue

| Field | Type | Required | Definition and purpose | Accountable owner | Validation | Relationships | Reporting usage | Lifecycle / retention |
|---|---|---:|---|---|---|---|---|---|
| standardId | String | Yes | Stable standard identity | Standards owner | Unique | Asset, waiver | Standards catalogue | Evergreen |
| approvedVersions | List | Yes | Permitted versions | Platform owner | Non-empty and valid | Asset | Compliance report | Review on release |
| status | Enum | Yes | Strategic disposition | Architecture forum | Approved lifecycle value | Asset, waiver | Standards heat map | Review quarterly |
| permittedEnvironments | List | Yes | Deployment permission | Standards owner | Approved values | Asset | Environment compliance | Review on policy change |
| approvedUseCases | List | Yes | Supported use patterns | Domain architect | Non-empty | Pattern | Design assurance | Review annually |
| restrictedUseCases | List | Yes | Usage boundaries | Domain architect | Explicit list | Waiver | Exception report | Review annually |
| supportEndDate | Date | Conditional | Support horizon | Technology owner | Evidence required | Forecast | EOL report | Review on vendor notice |
| targetStateTechnology | String | Conditional | Replacement direction | Enterprise architect | Required for contain/retire | Roadmap | Target-state report | Review on decision |
| exceptionRequired | Boolean | Yes | Waiver route | Architecture governance | True or false | Waiver | Exception report | Review with status |

## Governance use

```text
CAPTURE -> VALIDATE -> LINK -> ASSESS -> REPORT -> REVIEW -> REMEDIATE -> RETAIN
```

This document describes the portfolio showcase information model. Production
implementations must align field ownership, validation, retention and privacy
requirements to authorised organisational policies.
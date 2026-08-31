# Enterprise Technology Governance Intelligence Showcase

A synthetic Java 21 decision-support showcase for governing enterprise technology assets across lifecycle, ownership, data quality, architecture alignment, privacy, supportability, project traceability and target-state replacement.

> This repository supports architecture review. It does not replace accountable human decisions, legal review, security assessment or formal enterprise approval.

## Executive two-dimensional line

```text
ASSET -> LIFECYCLE -> OWNERSHIP -> DATA QUALITY -> ARCHITECTURE -> PRIVACY -> DELIVERY -> EVIDENCE
  |         |             |              |               |            |           |          |
  ID     support/EOL   business/tech   maturity 1-5   layer/scope   POPIA flag   P/P/P links  minutes/URLs
  |___________________________________________________________________________________________________|
                                              |
                                              v
                           RISK + IMPACT + DECISION + TARGET STATE
```

## Capabilities

- Asset lifecycle and vendor support assessment
- Data-quality maturity Level 1 to Level 5
- Technology and business ownership
- On-premises, cloud and hybrid classification
- Functional and non-functional requirements
- Operating hours and support model
- Personal and special personal information indicators
- Architecture-layer and project-scope alignment
- Project, programme and portfolio linkage
- Incident, change and iteration indicators
- Delivery and rollback accountability
- Architecture approval and evidence links
- Landscape impact based on project references and dependencies
- Governance recommendation and required actions

## Run

```powershell
mvn clean test package
java -jar target\enterprise-technology-governance-intelligence-1.0.0.jar
Get-Content output\governance-assessment.json
```

## Example result

```text
Asset: Legacy Customer Database [TECH-001]
Risk: HIGH (65)
Decision: CONDITIONALLY_APPROVE
Target state: Managed PostgreSQL Cloud Service
Metadata completeness: 100%
Landscape impact: 99
```

## Repository map

- `TechnologyAsset.java`: complete asset meta-model
- `GovernanceEngine.java`: transparent scoring rules
- `GovernanceAssessment.java`: decision output
- `SampleData.java`: synthetic example
- `JsonReportWriter.java`: auditable JSON report
- `docs/`: architecture, fields, controls, maturity, roadmap and integration design

## Portfolio positioning

This project connects enterprise architecture, IT asset management, data governance, ITSM, project governance and responsible AI-ready decision support. A future AI layer should explain and summarise evidence, while deterministic controls remain visible and reviewable.
<!-- VERSION-1.1.0 -->
## Version 1.1.0: Reference Model and Standards Catalogue

Version 1.1.0 adds a Technology Reference Model, Technology Standards Catalogue and transparent standards-compliance assessment.

```text
ASSET -> REFERENCE MODEL -> STANDARD -> COMPLIANCE -> WAIVER / TARGET STATE
```

See:

- [`docs/TECHNOLOGY-REFERENCE-MODEL.md`](docs/TECHNOLOGY-REFERENCE-MODEL.md)
- [`docs/TECHNOLOGY-STANDARDS-CATALOGUE.md`](docs/TECHNOLOGY-STANDARDS-CATALOGUE.md)
- [`docs/VERSION-1.1.0.md`](docs/VERSION-1.1.0.md)
<!-- VERSION-1.2.0 -->
## Version 1.2.0: Architecture Waivers and Technology Risks

Version 1.2.0 links standards non-compliance to a time-bound Architecture Waiver Register and a transparent Technology Risk Register.

```text
ASSET -> STANDARD -> WAIVER -> RISK -> TREATMENT -> TARGET STATE
```

See:

- [`docs/ARCHITECTURE-WAIVER-REGISTER.md`](docs/ARCHITECTURE-WAIVER-REGISTER.md)
- [`docs/TECHNOLOGY-RISK-REGISTER.md`](docs/TECHNOLOGY-RISK-REGISTER.md)
- [`docs/VERSION-1.2.0.md`](docs/VERSION-1.2.0.md)

<!-- OWNERSHIP-AND-LICENSING -->
## Ownership and Licensing

Copyright (c) 2026 Patrick Brijraj. All rights reserved.

This repository is publicly visible for portfolio evaluation, personal
learning, recruitment review, academic discussion, and non-commercial
technical evaluation. It is **not licensed under the MIT License or another
open-source licence**.

Copying, modification, redistribution, production deployment, organisational
use, incorporation into another solution, and commercial use require prior
written permission from the copyright owner. Any use that generates revenue,
supports a paid service, enables consulting delivery, reduces commercial
costs, or creates another financial benefit requires a separate written
commercial licence.

Commercial arrangements may include licence fees, subscriptions, royalties,
revenue participation, implementation services, support services, maintenance
services, or another mutually agreed form of compensation.

See [`LICENSE`](LICENSE) for the full terms. For permission or commercial
licensing enquiries, contact `pbrijraj@goalpostbrij.co.za`.

```text
PUBLIC VIEWING
      |
      +-- portfolio review
      +-- personal learning
      +-- non-commercial evaluation
      |
      v
COPY / MODIFY / DEPLOY / COMMERCIALISE?
      |
      +-- NO  -> remain within evaluation permission
      |
      `-- YES -> prior written permission
                     |
                     v
              COMMERCIAL LICENCE
                     |
                     +-- licence fee
                     +-- royalty or revenue participation
                     +-- implementation services
                     `-- support and maintenance
```

> The public repository contains a synthetic showcase. Commercially sensitive
> algorithms, production configurations, credentials, customer information,
> and confidential organisational data must not be committed.
<!-- VERSION-1.3.0 -->
## Version 1.3.0: Architecture Repository and Application Portfolio

Version 1.3.0 adds business capability mapping, application portfolio management, architecture landscape traceability, a governance decision log and repository completeness assessment.

```text
CAPABILITY -> APPLICATION -> ASSET -> STANDARD -> WAIVER -> RISK -> DECISION -> TARGET STATE
```

See:

- [`docs/BUSINESS-CAPABILITY-MODEL.md`](docs/BUSINESS-CAPABILITY-MODEL.md)
- [`docs/APPLICATION-PORTFOLIO.md`](docs/APPLICATION-PORTFOLIO.md)
- [`docs/ARCHITECTURE-LANDSCAPE.md`](docs/ARCHITECTURE-LANDSCAPE.md)
- [`docs/GOVERNANCE-DECISION-LOG.md`](docs/GOVERNANCE-DECISION-LOG.md)
- [`docs/VERSION-1.3.0.md`](docs/VERSION-1.3.0.md)
<!-- VERSION-1.4.0 -->
## Version 1.4.0: Technology Roadmaps and Lifecycle Forecasting

```text
ASSET -> RISK -> ROADMAP -> LIFECYCLE FORECAST -> INVESTMENT RECOMMENDATION -> TARGET STATE
```

- [`docs/TECHNOLOGY-ROADMAP.md`](docs/TECHNOLOGY-ROADMAP.md)
- [`docs/LIFECYCLE-FORECASTING.md`](docs/LIFECYCLE-FORECASTING.md)
- [`docs/INVESTMENT-PLANNING.md`](docs/INVESTMENT-PLANNING.md)
- [`docs/VERSION-1.4.0.md`](docs/VERSION-1.4.0.md)
<!-- VERSION-1.5.0 -->
## Version 1.5.0: Reference Architectures and Pattern Catalogue

```text
CAPABILITY -> REFERENCE ARCHITECTURE -> PATTERN -> BUILDING BLOCKS -> CONTROLS -> ALIGNMENT
```

- [`docs/REFERENCE-ARCHITECTURE-LIBRARY.md`](docs/REFERENCE-ARCHITECTURE-LIBRARY.md)
- [`docs/ARCHITECTURE-PATTERN-CATALOGUE.md`](docs/ARCHITECTURE-PATTERN-CATALOGUE.md)
- [`docs/ARCHITECTURE-BUILDING-BLOCKS.md`](docs/ARCHITECTURE-BUILDING-BLOCKS.md)
- [`docs/VERSION-1.5.0.md`](docs/VERSION-1.5.0.md)
<!-- VERSION-1.5.1-DOCUMENTATION -->
## Version 1.5.1: Repository Documentation Consolidation

Version 1.5.1 consolidates all documentation iterations from v1.0.0 through
v1.5.0 into repository-wide executive, relationship, metadata, control,
traceability, lifecycle, reporting and target-state views.

```text
STRATEGY -> CAPABILITY -> APPLICATION -> ASSET -> STANDARD -> WAIVER -> RISK
                                                           |
                                                           v
DECISION -> ROADMAP -> FORECAST -> INVESTMENT -> REFERENCE -> PATTERN -> CONTROL EVIDENCE
```

### Master documents

- [`Executive Repository View`](docs/EXECUTIVE-REPOSITORY-VIEW.md)
- [`Repository Relationship Map`](docs/REPOSITORY-RELATIONSHIP-MAP.md)
- [`Master Meta-Field Catalogue`](docs/MASTER-META-FIELD-CATALOGUE.md)
- [`Consolidated Control Model`](docs/CONSOLIDATED-CONTROL-MODEL.md)
- [`Traceability and Evidence View`](docs/TRACEABILITY-AND-EVIDENCE-VIEW.md)
- [`Consolidated Lifecycle Model`](docs/CONSOLIDATED-LIFECYCLE-MODEL.md)
- [`Repository Reporting Model`](docs/REPOSITORY-REPORTING-MODEL.md)
- [`Target-State and Transition Model`](docs/TARGET-STATE-AND-TRANSITION-MODEL.md)
- [`Repository Glossary`](docs/REPOSITORY-GLOSSARY.md)
- [`Version and Documentation Overview`](docs/VERSION-AND-DOCUMENTATION-OVERVIEW.md)

### Detailed version views

- [`v1.0.0 detailed view`](docs/versions/VERSION-1.0.0-DETAILED.md)
- [`v1.1.0 detailed view`](docs/versions/VERSION-1.1.0-DETAILED.md)
- [`v1.2.0 detailed view`](docs/versions/VERSION-1.2.0-DETAILED.md)
- [`v1.3.0 detailed view`](docs/versions/VERSION-1.3.0-DETAILED.md)
- [`v1.4.0 detailed view`](docs/versions/VERSION-1.4.0-DETAILED.md)
- [`v1.5.0 detailed view`](docs/versions/VERSION-1.5.0-DETAILED.md)
<!-- VERSION-1.5.2-KNOWLEDGE-MODEL -->
## Version 1.5.2: Repository Knowledge Model

```text
NAVIGATE -> SELECT VIEW -> FIND ENTITY -> READ META-FIELDS -> TRACE RELATIONSHIPS -> VERIFY CONTROLS
```

- [`Repository Navigation Guide`](docs/repository/REPOSITORY-NAVIGATION-GUIDE.md)
- [`Repository Coverage Matrix`](docs/repository/REPOSITORY-COVERAGE-MATRIX.md)
- [`Entity Meta-Field Catalogues`](docs/metafields/)
- [`Architecture Views`](docs/views/)
- [`Traceability Matrices`](docs/traceability/)
- [`Version 1.5.2`](docs/VERSION-1.5.2.md)

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

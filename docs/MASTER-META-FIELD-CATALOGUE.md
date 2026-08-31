# Master Meta-Field Catalogue

## Field-governance model

```text
FIELD -> TYPE -> REQUIRED RULE -> OWNER -> SOURCE -> VALIDATION -> RELATIONSHIP -> REPORT -> RETENTION
```

## Identity and asset fields

| Entity.Field | Type | Required | Purpose | Owner | Used by |
|---|---|---:|---|---|---|
| TechnologyAsset.assetId | String | Yes | Stable asset identity | Technology owner | All repository relationships |
| TechnologyAsset.name | String | Yes | Human-readable asset name | Technology owner | Reports and decisions |
| TechnologyAsset.vendor | String | Yes | Supplier relationship | Vendor manager | Lifecycle and support |
| TechnologyAsset.version | String | Yes | Installed or consumed version | Support owner | Standards validation |
| TechnologyAsset.lifecycleStatus | String | Yes | Current governance disposition | Enterprise architecture | Risk and roadmap |
| TechnologyAsset.supportEndDate | Date | Conditional | Vendor or internal support horizon | Technology owner | Forecasting |
| TechnologyAsset.targetStateTechnology | String | Conditional | Replacement direction | Enterprise architect | Roadmap and investment |
| TechnologyAsset.architectureLayer | String | Yes | Layer classification | Solution architect | Standards and landscape |
| TechnologyAsset.environment | String | Yes | Deployment environment | Operations | Standards validation |
| TechnologyAsset.hostingModel | String | Yes | On-premises, cloud or hybrid | Platform owner | Portfolio reporting |
| TechnologyAsset.technologyOwner | String | Yes | Technical accountability | Technology governance | Ownership control |
| TechnologyAsset.businessOwner | String | Yes | Business accountability | Business governance | Ownership control |
| TechnologyAsset.completenessLevel | Integer 1-5 | Yes | Metadata maturity | Data steward | Quality reporting |
| TechnologyAsset.incidentCount | Integer | Yes | Operational exposure | Service owner | Risk assessment |
| TechnologyAsset.projectReferences | Integer | Yes | Landscape reuse indicator | PMO | Impact assessment |

## Capability and application fields

| Entity.Field | Type | Required | Purpose | Owner | Used by |
|---|---|---:|---|---|---|
| BusinessCapability.capabilityId | String | Yes | Stable capability identity | Business architecture | Application mapping |
| BusinessCapability.businessOwner | String | Yes | Capability accountability | Business executive | Governance reporting |
| BusinessCapability.currentMaturity | String | Yes | Current capability condition | Capability owner | Gap analysis |
| BusinessCapability.targetMaturity | String | Yes | Intended maturity | Capability owner | Roadmap |
| ApplicationPortfolioItem.applicationId | String | Yes | Stable application identity | Application owner | Landscape mapping |
| ApplicationPortfolioItem.capabilityId | String | Yes | Capability relationship | Business architect | Traceability |
| ApplicationPortfolioItem.businessCriticality | String | Yes | Business-impact class | Business owner | Portfolio prioritisation |
| ApplicationPortfolioItem.technologyAssetIds | List | Yes | Technology composition | Solution architect | Asset traceability |
| ApplicationPortfolioItem.roadmapStatus | String | Yes | Transition position | Portfolio owner | Planning view |

## Standards and waiver fields

| Entity.Field | Type | Required | Purpose | Owner | Used by |
|---|---|---:|---|---|---|
| TechnologyStandard.standardId | String | Yes | Standard identity | Standards owner | Compliance assessment |
| TechnologyStandard.approvedVersions | List | Yes | Permitted versions | Platform owner | Version control |
| TechnologyStandard.status | Enum | Yes | Strategic disposition | Architecture forum | Compliance decision |
| TechnologyStandard.permittedEnvironments | List | Yes | Deployment constraint | Standards owner | Environment control |
| TechnologyStandard.targetStateTechnology | String | Conditional | Replacement direction | Enterprise architect | Roadmap |
| ArchitectureWaiver.waiverId | String | Yes | Exception identity | Architecture governance | Governance log |
| ArchitectureWaiver.standardId | String | Yes | Standard exception relationship | Enterprise architect | Traceability |
| ArchitectureWaiver.compensatingControls | List | Yes | Interim controls | Risk owner | Assurance |
| ArchitectureWaiver.expiryDate | Date | Yes | Time-bound validity | Waiver owner | Expiry monitoring |
| ArchitectureWaiver.reviewDate | Date | Yes | Review obligation | Approver | Governance calendar |
| ArchitectureWaiver.remediationPlan | String | Yes | Exit path | Technology owner | Roadmap |

## Risk and decision fields

| Entity.Field | Type | Required | Purpose | Owner | Used by |
|---|---|---:|---|---|---|
| TechnologyRisk.riskId | String | Yes | Risk identity | Risk owner | Risk register |
| TechnologyRisk.cause | String | Yes | Source of uncertainty | Risk owner | Risk statement |
| TechnologyRisk.event | String | Yes | Potential event | Risk owner | Risk statement |
| TechnologyRisk.businessImpact | String | Yes | Consequence | Business owner | Prioritisation |
| TechnologyRisk.inherentLikelihood | Integer 1-5 | Yes | Pre-control likelihood | Risk assessor | Inherent risk |
| TechnologyRisk.inherentImpact | Integer 1-5 | Yes | Pre-control impact | Risk assessor | Inherent risk |
| TechnologyRisk.controlEffectivenessPercent | Integer 0-100 | Yes | Control adjustment | Control owner | Residual risk |
| TechnologyRisk.targetDate | Date | Yes | Treatment deadline | Risk owner | Overdue control |
| GovernanceDecision.decisionId | String | Yes | Decision identity | Governance secretariat | Audit trail |
| GovernanceDecision.subjectId | String | Yes | Governed entity | Decision owner | Traceability |
| GovernanceDecision.outcome | String | Yes | Formal result | Approval forum | Reporting |
| GovernanceDecision.rationale | String | Yes | Reason for decision | Decision owner | Audit evidence |
| GovernanceDecision.evidenceReferences | List | Yes | Supporting records | Governance secretariat | Assurance |

## Roadmap and forecasting fields

| Entity.Field | Type | Required | Purpose | Owner | Used by |
|---|---|---:|---|---|---|
| TechnologyRoadmap.roadmapId | String | Yes | Roadmap identity | Portfolio owner | Planning |
| TechnologyRoadmap.currentState | String | Yes | Baseline | Enterprise architect | Transition analysis |
| TechnologyRoadmap.transitionState | String | Yes | Interim architecture | Solution architect | Delivery planning |
| TechnologyRoadmap.targetState | String | Yes | Intended architecture | Enterprise architect | Investment decision |
| TechnologyRoadmap.milestones | List | Yes | Measurable delivery points | Project manager | Progress reporting |
| TechnologyRoadmap.targetDate | Date | Yes | Completion objective | Roadmap owner | Forecasting |
| LifecycleForecast.monthsToSupportEnd | Long | Derived | Remaining support horizon | Forecast engine | Urgency classification |
| LifecycleForecast.forecastStatus | String | Derived | Lifecycle urgency | Forecast engine | Investment action |
| InvestmentRecommendation.action | Enum | Derived | Invest, migrate, retire or monitor | Roadmap engine | Portfolio decision |
| InvestmentRecommendation.priority | String | Derived | Decision urgency | Roadmap engine | Funding prioritisation |

## Reference and pattern fields

| Entity.Field | Type | Required | Purpose | Owner | Used by |
|---|---|---:|---|---|---|
| ReferenceArchitecture.referenceId | String | Yes | Reusable architecture identity | Enterprise architecture | Pattern selection |
| ReferenceArchitecture.buildingBlockIds | List | Yes | Required composition | Reference owner | Completeness control |
| ReferenceArchitecture.mandatoryControls | List | Yes | Required assurance | Control owners | Pattern assessment |
| ReferenceArchitecture.reviewDate | Date | Yes | Currency control | Reference owner | Review status |
| ArchitecturePattern.patternId | String | Yes | Pattern identity | Pattern owner | Alignment review |
| ArchitecturePattern.problem | String | Yes | Problem addressed | Pattern owner | Pattern selection |
| ArchitecturePattern.solution | String | Yes | Reusable response | Pattern owner | Solution design |
| ArchitecturePattern.requiredBuildingBlockIds | List | Yes | Structural requirements | Pattern owner | Alignment control |
| ArchitecturePattern.prohibitedUses | List | Yes | Misuse boundaries | Architecture forum | Design assurance |
| ArchitectureBuildingBlock.buildingBlockId | String | Yes | Reusable component identity | Domain owner | Reference composition |
| ArchitectureBuildingBlock.controls | List | Yes | Control obligations | Control owners | Evidence validation |
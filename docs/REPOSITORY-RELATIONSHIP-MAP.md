# Repository Relationship Map

## Primary relationship line

```text
StrategicObjective 1---* BusinessCapability
BusinessCapability 1---* ApplicationPortfolioItem
ApplicationPortfolioItem *---* TechnologyAsset
TechnologyAsset *---1 TechnologyStandard
TechnologyStandard 1---* ArchitectureWaiver
TechnologyAsset 1---* TechnologyRisk
TechnologyAsset 1---* TechnologyRoadmap
TechnologyRoadmap 1---1 LifecycleForecast
LifecycleForecast 1---1 InvestmentRecommendation
BusinessCapability *---* ReferenceArchitecture
ReferenceArchitecture 1---* ArchitectureBuildingBlock
ArchitecturePattern *---* ArchitectureBuildingBlock
ArchitectureLandscape 1---* GovernanceDecision
```

## Cross-version lineage

```text
v1.0 ASSET
  |
  +-- v1.1 STANDARD
  |      |
  |      `-- v1.2 WAIVER
  |
  +-- v1.2 RISK
  |
  +-- v1.3 APPLICATION + CAPABILITY + LANDSCAPE + DECISION
  |
  +-- v1.4 ROADMAP + FORECAST + INVESTMENT
  |
  `-- v1.5 REFERENCE + PATTERN + BUILDING BLOCK
```

## Relationship controls

| Control | Source | Target | Validation |
|---|---|---|---|
| REL-001 | Application | Capability | Capability IDs agree |
| REL-002 | Application | Asset | Asset appears in application asset IDs |
| REL-003 | Landscape | Standard | Standard ID is populated and matched |
| REL-004 | Standard assessment | Waiver | Waiver references the assessed standard |
| REL-005 | Waiver | Risk | Evidence references preserve the relationship |
| REL-006 | Asset | Roadmap | Roadmap asset ID agrees |
| REL-007 | Roadmap | Target state | Target state and date are populated |
| REL-008 | Pattern | Building block | Required building block IDs are present |
| REL-009 | Decision | Landscape | Decision subject matches a governed entity |
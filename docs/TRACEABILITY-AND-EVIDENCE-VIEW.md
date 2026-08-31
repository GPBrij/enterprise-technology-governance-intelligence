# Traceability and Evidence View

## Bidirectional traceability

```text
UPSTREAM                                                       DOWNSTREAM
Strategy <- Capability <- Application <- Asset -> Standard -> Waiver -> Risk
                                      |                            |
                                      v                            v
                               Architecture Landscape         Decision Log
                                      |                            |
                                      +----------> Roadmap <-------+
                                                    |
                                                    v
                                           Forecast + Investment
                                                    |
                                                    v
                          Reference Architecture -> Pattern -> Building Blocks
```

## Traceability matrix

| From | To | Key | Evidence |
|---|---|---|---|
| Capability | Application | capabilityId | Application portfolio |
| Application | Asset | technologyAssetIds | Application composition |
| Landscape | Project | projectId | Project architecture scope |
| Asset | Standard | standardId | Standards assessment |
| Standard | Waiver | standardId | Waiver request |
| Asset | Risk | assetId | Risk register |
| Landscape | Decision | subjectId | Governance log |
| Asset | Roadmap | assetId | Technology roadmap |
| Roadmap | Forecast | assetId | Forecast result |
| Forecast | Investment | assetId | Recommendation |
| Reference | Pattern | evidence references | Architecture repository |
| Pattern | Building block | requiredBuildingBlockIds | Alignment assessment |

## Evidence states

```text
MISSING -> IDENTIFIED -> LINKED -> VERIFIED -> APPROVED -> SUPERSEDED -> RETAINED
```
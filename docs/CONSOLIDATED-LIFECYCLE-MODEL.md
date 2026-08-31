# Consolidated Lifecycle Model

## Entity lifecycles

```text
TECHNOLOGY ASSET
EMERGING -> STRATEGIC -> STANDARD -> CONTAIN -> NEAR_END_OF_LIFE -> RETIRED

TECHNOLOGY STANDARD
EMERGING -> TRIAL -> STRATEGIC -> STANDARD -> CONTAIN -> RETIRE -> PROHIBITED

ARCHITECTURE WAIVER
DRAFT -> SUBMITTED -> UNDER_REVIEW -> APPROVED/CONDITIONAL -> EXPIRED/REMEDIATED/REVOKED

TECHNOLOGY RISK
OPEN -> MITIGATING -> MONITORING -> ACCEPTED/CLOSED

ROADMAP
DRAFT -> PLANNED -> APPROVED -> IN_PROGRESS -> COMPLETED
                               `-> BLOCKED/CANCELLED

REFERENCE OR PATTERN
DRAFT -> CANDIDATE -> APPROVED/STRATEGIC -> CONTAIN -> RETIRED/PROHIBITED

GOVERNANCE DECISION
PROPOSED -> EVIDENCED -> REVIEWED -> APPROVED/REJECTED -> REVIEWED/SUPERSEDED
```

## Lifecycle governance questions

| Entity | Entry criterion | Review trigger | Exit evidence |
|---|---|---|---|
| Asset | Registered identity and owner | Support, incidents or standard change | Retirement evidence |
| Standard | Approved scope and versions | Review date or vendor change | Replacement standard |
| Waiver | Non-compliance and justification | Review or expiry date | Remediation or renewed approval |
| Risk | Defined cause, event and impact | Treatment date or control change | Closure approval |
| Roadmap | Current and target state | Milestone or date variance | Target-state acceptance |
| Pattern | Approved problem and solution | Review date or control change | Retired or superseding pattern |
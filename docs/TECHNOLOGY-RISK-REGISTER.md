# Technology Risk Register

## Version 1.2.0

```text
CONTROL FINDING
      |
      v
CAUSE -> RISK EVENT -> BUSINESS IMPACT
      |
      v
INHERENT RISK = LIKELIHOOD x IMPACT
      |
      v
EXISTING CONTROLS + CONTROL EFFECTIVENESS
      |
      v
RESIDUAL RISK
      |
      +-- LOW -------> ACCEPT WITHIN TOLERANCE
      +-- MEDIUM ----> MONITOR
      +-- HIGH ------> TREAT AND MONITOR
      `-- CRITICAL --> ESCALATE
```

## Risk meta-fields

| Domain | Meta-fields |
|---|---|
| Identity | Risk ID, asset ID, project ID, category |
| Statement | Cause, event and business impact |
| Inherent risk | Likelihood and impact on a 1-5 showcase scale |
| Controls | Existing controls and effectiveness percentage |
| Accountability | Risk owner |
| Treatment | Strategy, actions, target date and status |
| Evidence | Decision and treatment references |

The scoring approach is a transparent showcase design and is not represented as a universal enterprise risk standard.
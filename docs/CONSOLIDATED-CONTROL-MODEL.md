# Consolidated Governance Control Model

## Control lifecycle

```text
CONTROL OBJECTIVE -> CONTROL RULE -> EVIDENCE -> RESULT -> EXCEPTION -> REMEDIATION -> REVIEW
```

| Family | Control scope | Primary evidence | Failure route |
|---|---|---|---|
| TG-ASSET | Identity, ownership, lifecycle and support | Asset record | Complete or remediate metadata |
| TG-DQ | Completeness and maturity | Quality result | Stewardship action |
| TG-STD | Versions, environments and status | Standard record | Review or waiver |
| TG-WVR | Justification, controls, expiry and review | Waiver record | Reject, review or escalate |
| TG-RSK | Inherent and residual exposure | Risk assessment | Treat, accept or escalate |
| TG-REP | Capability-to-target traceability | Landscape relationships | Repair repository links |
| TG-RDM | Current, transition and target state | Roadmap | Correct milestones or ownership |
| TG-LCF | Support and retirement horizon | Forecast | Accelerate replacement |
| TG-INV | Investment direction | Recommendation | Portfolio decision |
| TG-REF | Reference architecture approval | Reference record | Approval or review |
| TG-PAT | Pattern currency and applicability | Pattern record | Conditional or no alignment |
| TG-ABB | Required building blocks | Block library | Complete architecture |
| TG-CTL | Mandatory assurance evidence | Evidence identifiers | Provide evidence |

## Control accountability meta-fields

```text
Control ID
Control objective
Control owner
Evidence owner
Trigger
Frequency
Input
Rule
Output
Exception path
Remediation owner
Review date
Evidence retention
Related entities
```
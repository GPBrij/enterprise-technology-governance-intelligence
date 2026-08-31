# Architecture Waiver Register

## Version 1.2.0

```text
STANDARDS ASSESSMENT
        |
        +-- COMPLIANT --------------------------> NO WAIVER
        |
        +-- WAIVER_REQUIRED
        |       |
        |       v
        |   WAIVER REQUEST
        |       |
        |       +-- business justification
        |       +-- risk statement
        |       +-- compensating controls
        |       +-- accountable owners
        |       +-- effective / expiry / review dates
        |       +-- conditions
        |       +-- remediation plan
        |       +-- target state
        |       `-- evidence references
        |       |
        |       v
        |   VALID / REVIEW / EXPIRED / NOT AUTHORISED
        |
        `-- NON_COMPLIANT ----------------------> REMEDIATE OR REJECT
```

A waiver is a time-bound, evidence-backed exception. It does not change the underlying technology standard.

## Waiver meta-fields

| Domain | Meta-fields |
|---|---|
| Identity | Waiver ID, asset ID, project ID, standard ID |
| Request | Requested technology, requestor, justification |
| Risk | Risk statement, compensating controls |
| Accountability | Business owner, technology owner, architects, reviewers, approver |
| Validity | Status, effective date, expiry date, review date |
| Remediation | Conditions, remediation plan, target state |
| Evidence | Approval, risk and roadmap references |
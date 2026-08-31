# Technology Standards Catalogue

## Version 1.1.0

The catalogue records the approved disposition, versions, environments, use cases, ownership and target state for a technology.

```text
TECHNOLOGY REFERENCE MODEL
            |
            v
TECHNOLOGY STANDARD
            |
            +-- approved versions
            +-- permitted environments
            +-- approved use cases
            +-- restricted use cases
            +-- support end date
            +-- target-state technology
            +-- standard owner
            +-- approval reference
            `-- exception requirement
            |
            v
ASSET COMPLIANCE ASSESSMENT
            |
            +-- COMPLIANT
            +-- REVIEW_REQUIRED
            +-- WAIVER_REQUIRED
            `-- NON_COMPLIANT
```

## Standard statuses

```text
EMERGING -> TRIAL -> STRATEGIC -> STANDARD -> CONTAIN -> RETIRE -> PROHIBITED
```

## Standard meta-fields

| Meta-field | Purpose |
|---|---|
| Standard ID | Unique governance identifier |
| Technology name | Technology governed by the standard |
| Technology category | Reference-model classification |
| Vendor | Supplier or provider |
| Approved versions | Versions allowed by the standard |
| Status | Lifecycle and governance disposition |
| Architecture layer | Approved architecture placement |
| Permitted environments | Environments where use is allowed |
| Approved use cases | Supported use patterns |
| Restricted use cases | Prohibited or constrained use patterns |
| Support end date | Support horizon |
| Target-state technology | Approved replacement direction |
| Standard owner | Accountable standard owner |
| Approval reference | Decision evidence |
| Exception required | Whether non-alignment requires a waiver |
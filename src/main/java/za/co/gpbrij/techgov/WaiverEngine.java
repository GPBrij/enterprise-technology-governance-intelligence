package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class WaiverEngine {

    public WaiverAssessment assess(ArchitectureWaiver waiver, LocalDate assessmentDate) {
        List<String> findings = new ArrayList<>();
        List<String> actions = new ArrayList<>();

        boolean complete = isPresent(waiver.waiverId())
                && isPresent(waiver.assetId())
                && isPresent(waiver.standardId())
                && isPresent(waiver.businessJustification())
                && isPresent(waiver.riskStatement())
                && isPresent(waiver.businessOwner())
                && isPresent(waiver.technologyOwner())
                && isPresent(waiver.enterpriseArchitect())
                && waiver.expiryDate() != null
                && isPresent(waiver.remediationPlan())
                && isPresent(waiver.targetStateTechnology())
                && !waiver.compensatingControls().isEmpty();

        if (!complete) {
            findings.add("Mandatory waiver metadata or compensating controls are incomplete.");
            actions.add("Complete the waiver evidence before approval.");
        }

        boolean expired = waiver.expiryDate() != null
                && waiver.expiryDate().isBefore(assessmentDate);
        if (expired) {
            findings.add("The architecture waiver has expired.");
            actions.add("Remediate the asset or submit a new waiver for approval.");
        }

        boolean reviewRequired = waiver.reviewDate() == null
                || !waiver.reviewDate().isAfter(assessmentDate);
        if (reviewRequired) {
            findings.add("The architecture waiver requires review.");
            actions.add("Record the review outcome and accountable decision.");
        }

        String decision;
        if (expired) {
            decision = "EXPIRED_ESCALATE";
        } else if (!complete) {
            decision = "RETURN_FOR_COMPLETION";
        } else if (waiver.status() == WaiverStatus.APPROVED
                || waiver.status() == WaiverStatus.CONDITIONALLY_APPROVED) {
            decision = reviewRequired ? "REVIEW_REQUIRED" : "VALID_WAIVER";
        } else if (waiver.status() == WaiverStatus.REJECTED
                || waiver.status() == WaiverStatus.REVOKED) {
            decision = "NOT_AUTHORISED";
        } else {
            decision = "PENDING_DECISION";
        }

        if (findings.isEmpty()) {
            findings.add("Waiver metadata, validity and review date satisfy the showcase controls.");
        }

        return new WaiverAssessment(
                waiver.waiverId(), waiver.assetId(), waiver.status().name(),
                complete, expired, reviewRequired, decision,
                List.copyOf(findings), List.copyOf(actions)
        );
    }

    private boolean isPresent(String value) {
        return value != null && !value.isBlank();
    }
}
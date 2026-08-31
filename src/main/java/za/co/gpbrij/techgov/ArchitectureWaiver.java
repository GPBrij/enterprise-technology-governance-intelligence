package za.co.gpbrij.techgov;

import java.time.LocalDate;
import java.util.List;

public record ArchitectureWaiver(
        String waiverId,
        String assetId,
        String projectId,
        String standardId,
        String requestedTechnology,
        String businessJustification,
        String riskStatement,
        List<String> compensatingControls,
        String requestor,
        String technologyOwner,
        String businessOwner,
        String solutionArchitect,
        String enterpriseArchitect,
        String securityReviewer,
        String privacyReviewer,
        String approver,
        WaiverStatus status,
        LocalDate effectiveDate,
        LocalDate expiryDate,
        LocalDate reviewDate,
        List<String> conditions,
        String remediationPlan,
        String targetStateTechnology,
        List<String> evidenceReferences
) {}
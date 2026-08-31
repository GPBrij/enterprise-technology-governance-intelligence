package za.co.gpbrij.techgov;
import java.util.List;
public record GovernanceAssessment(String assetId,int riskScore,String riskRating,String decision,
 String recommendedTargetState,int metadataCompletenessPercent,int dataQualityLevel,int landscapeImpactScore,
 List<String> findings,List<String> requiredActions) {}

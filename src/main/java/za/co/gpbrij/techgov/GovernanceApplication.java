package za.co.gpbrij.techgov;
import java.nio.file.Path;
public final class GovernanceApplication {
 public static void main(String[]args)throws Exception{var asset=SampleData.legacyDatabase();var result=new GovernanceEngine().assess(asset);new JsonReportWriter().write(result,Path.of("output/governance-assessment.json"));
  System.out.println("Enterprise Technology Governance Intelligence Showcase");System.out.println("Asset: "+asset.name()+" ["+asset.assetId()+"]");System.out.println("Risk: "+result.riskRating()+" ("+result.riskScore()+")");System.out.println("Decision: "+result.decision());System.out.println("Target state: "+result.recommendedTargetState());System.out.println("Metadata completeness: "+result.metadataCompletenessPercent()+"%");System.out.println("Landscape impact: "+result.landscapeImpactScore());System.out.println("Report: output/governance-assessment.json");}
}

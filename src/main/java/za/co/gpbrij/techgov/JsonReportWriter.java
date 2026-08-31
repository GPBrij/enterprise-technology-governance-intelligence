package za.co.gpbrij.techgov;
import java.nio.file.*; import java.util.*;
public final class JsonReportWriter {
 public void write(GovernanceAssessment a,Path p)throws Exception{Files.createDirectories(p.getParent());Files.writeString(p,toJson(a));}
 private String toJson(GovernanceAssessment a){return "{\n"+
  q("assetId")+":"+q(a.assetId())+",\n"+q("riskScore")+":"+a.riskScore()+",\n"+q("riskRating")+":"+q(a.riskRating())+",\n"+
  q("decision")+":"+q(a.decision())+",\n"+q("recommendedTargetState")+":"+q(a.recommendedTargetState())+",\n"+
  q("metadataCompletenessPercent")+":"+a.metadataCompletenessPercent()+",\n"+q("dataQualityLevel")+":"+a.dataQualityLevel()+",\n"+
  q("landscapeImpactScore")+":"+a.landscapeImpactScore()+",\n"+q("findings")+":"+arr(a.findings())+",\n"+q("requiredActions")+":"+arr(a.requiredActions())+"\n}\n";}
 private String arr(List<String>x){return "["+x.stream().map(this::q).reduce((a,b)->a+","+b).orElse("")+"]";} private String q(String s){return "\""+s.replace("\\","\\\\").replace("\"","\\\"")+"\"";}
}

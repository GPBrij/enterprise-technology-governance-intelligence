package za.co.gpbrij.techgov;
import java.time.LocalDate; import java.util.*;
public final class GovernanceEngine {
 public GovernanceAssessment assess(TechnologyAsset a){
  int risk=0; List<String> f=new ArrayList<>(), actions=new ArrayList<>();
  if(Set.of("END_OF_LIFE","NEAR_END_OF_LIFE","NO_SUPPORT").contains(a.lifecycleStatus())){risk+=25;f.add("Lifecycle or support risk: "+a.lifecycleStatus());actions.add("Create an approved migration or retirement roadmap.");}
  if(a.supportEndDate()!=null && !a.supportEndDate().isAfter(LocalDate.now().plusMonths(12))){risk+=15;f.add("Vendor support ends within 12 months or has ended.");actions.add("Confirm extended support or accelerate replacement.");}
  if(a.completenessLevel()<3){risk+=15;f.add("Asset metadata maturity is below Level 3 Defined.");actions.add("Complete ownership, support, architecture and evidence metadata.");}
  if(a.technologyOwner().isBlank()||a.businessOwner().isBlank()){risk+=15;f.add("Accountable ownership is incomplete.");actions.add("Assign technology and business owners.");}
  if(!a.architectureApproved()){risk+=20;f.add("Enterprise architecture approval is not confirmed.");actions.add("Submit the asset and solution scope for architecture approval.");}
  if(a.processesPersonalInformation() && a.dataClassification().isBlank()){risk+=10;f.add("Personal information is indicated without data classification.");actions.add("Perform privacy classification and impact assessment.");}
  if(a.incidentCount()>10){risk+=10;f.add("Incident volume is above the showcase threshold.");actions.add("Perform problem management and technology health review.");}
  int impact=Math.min(100,a.projectReferences()*8+a.dependencies().size()*5+a.incidentCount()*2);
  int complete=metadataCompleteness(a);
  String rating=risk>=70?"CRITICAL":risk>=45?"HIGH":risk>=25?"MEDIUM":"LOW";
  String decision=risk>=70?"REJECT_AND_REPLACE":risk>=45?"CONDITIONALLY_APPROVE":risk>=25?"REVIEW_REQUIRED":"APPROVE";
  String target=a.targetStateTechnology().isBlank()?"TARGET_STATE_NOT_DEFINED":a.targetStateTechnology();
  if(target.equals("TARGET_STATE_NOT_DEFINED") && risk>=25)actions.add("Define the approved target-state technology.");
  if(f.isEmpty())f.add("No material showcase-rule exceptions detected.");
  return new GovernanceAssessment(a.assetId(),Math.min(100,risk),rating,decision,target,complete,a.completenessLevel(),impact,List.copyOf(f),List.copyOf(actions));
 }
 private int metadataCompleteness(TechnologyAsset a){
  List<String> v=List.of(a.name(),a.classification(),a.environment(),a.hostingModel(),a.vendor(),a.lifecycleStatus(),a.technologyOwner(),a.businessOwner(),a.businessCapability(),a.architectureLayer(),a.projectId(),a.solutionArchitect());
  long n=v.stream().filter(x->x!=null&&!x.isBlank()).count(); return (int)Math.round(n*100.0/v.size());
 }
}

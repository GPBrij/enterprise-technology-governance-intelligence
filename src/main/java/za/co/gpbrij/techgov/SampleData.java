package za.co.gpbrij.techgov;
import java.time.LocalDate; import java.util.List;
public final class SampleData { private SampleData(){}
 public static TechnologyAsset legacyDatabase(){return new TechnologyAsset(
  "TECH-001","Legacy Customer Database","Synthetic customer platform database","CONTAIN","PRODUCTION","ON_PREMISE",
  "Example Vendor","11g","NEAR_END_OF_LIFE",LocalDate.now().plusMonths(6),"Managed PostgreSQL Cloud Service",
  "Database Platform Owner","Customer Capability Owner","Database Operations","Example Support Partner","Customer Management",
  "DATA","Customer account storage and retrieval","Availability, recoverability, security and performance","24x7",true,false,"CONFIDENTIAL",
  2,7,14,22,4,"PRJ-1042","PRG-CUSTOMER","PF-DIGITAL","Project Manager","Solution Architect","Enterprise Architect","Finance Partner",
  "Change Coordinator","Release Engineering","Service Operations",false,"","docs/business-case.md","JIRA-DEMO-1042","SharePoint demo reference","Confluence demo reference",List.of("API Gateway","Batch Integration","Reporting Platform"));}
}

package za.co.gpbrij.techgov;
import java.time.LocalDate;
import java.util.List;
public record TechnologyAsset(
 String assetId,String name,String description,String classification,String environment,String hostingModel,
 String vendor,String version,String lifecycleStatus,LocalDate supportEndDate,String targetStateTechnology,
 String technologyOwner,String businessOwner,String internalSupport,String externalSupport,String businessCapability,
 String architectureLayer,String functionalRequirements,String nonFunctionalRequirements,String operatingHours,
 boolean processesPersonalInformation,boolean processesSpecialPersonalInformation,String dataClassification,
 int completenessLevel,int projectReferences,int incidentCount,int changeCount,int iterationCount,
 String projectId,String programmeId,String portfolioId,String projectManager,String solutionArchitect,
 String enterpriseArchitect,String financeOwner,String changeCoordinator,String implementer,String rollbackOwner,
 boolean architectureApproved,String approvalMinutesUrl,String businessCaseUrl,String jiraUrl,String sharePointUrl,
 String confluenceUrl,List<String> dependencies) {}

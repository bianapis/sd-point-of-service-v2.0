package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceAnalysis
 */
public class CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceAnalysis   {
  private String pointofServiceOperatingSessionInstanceAnalysisReference = null;

  private String pointofServiceOperatingSessionInstanceAnalysisReportType = null;

  private String pointofServiceOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return pointofServiceOperatingSessionInstanceAnalysisReference
  **/

  public String getPointofServiceOperatingSessionInstanceAnalysisReference() {
    return pointofServiceOperatingSessionInstanceAnalysisReference;
  }

  public void setPointofServiceOperatingSessionInstanceAnalysisReference(String pointofServiceOperatingSessionInstanceAnalysisReference) {
    this.pointofServiceOperatingSessionInstanceAnalysisReference = pointofServiceOperatingSessionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return pointofServiceOperatingSessionInstanceAnalysisReportType
  **/

  public String getPointofServiceOperatingSessionInstanceAnalysisReportType() {
    return pointofServiceOperatingSessionInstanceAnalysisReportType;
  }

  public void setPointofServiceOperatingSessionInstanceAnalysisReportType(String pointofServiceOperatingSessionInstanceAnalysisReportType) {
    this.pointofServiceOperatingSessionInstanceAnalysisReportType = pointofServiceOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return pointofServiceOperatingSessionInstanceAnalysisParameters
  **/

  public String getPointofServiceOperatingSessionInstanceAnalysisParameters() {
    return pointofServiceOperatingSessionInstanceAnalysisParameters;
  }

  public void setPointofServiceOperatingSessionInstanceAnalysisParameters(String pointofServiceOperatingSessionInstanceAnalysisParameters) {
    this.pointofServiceOperatingSessionInstanceAnalysisParameters = pointofServiceOperatingSessionInstanceAnalysisParameters;
  }


}


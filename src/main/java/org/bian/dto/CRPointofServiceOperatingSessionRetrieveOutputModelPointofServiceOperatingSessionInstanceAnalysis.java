package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceAnalysis
 */
public class CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceAnalysis   {
  private String pointofServiceOperatingSessionInstanceAnalysisData = null;

  private String pointofServiceOperatingSessionInstanceAnalysisReportType = null;

  private Object pointofServiceOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return pointofServiceOperatingSessionInstanceAnalysisData
  **/

  public String getPointofServiceOperatingSessionInstanceAnalysisData() {
    return pointofServiceOperatingSessionInstanceAnalysisData;
  }

  public void setPointofServiceOperatingSessionInstanceAnalysisData(String pointofServiceOperatingSessionInstanceAnalysisData) {
    this.pointofServiceOperatingSessionInstanceAnalysisData = pointofServiceOperatingSessionInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return pointofServiceOperatingSessionInstanceAnalysisReport
  **/

  public Object getPointofServiceOperatingSessionInstanceAnalysisReport() {
    return pointofServiceOperatingSessionInstanceAnalysisReport;
  }

  public void setPointofServiceOperatingSessionInstanceAnalysisReport(Object pointofServiceOperatingSessionInstanceAnalysisReport) {
    this.pointofServiceOperatingSessionInstanceAnalysisReport = pointofServiceOperatingSessionInstanceAnalysisReport;
  }


}


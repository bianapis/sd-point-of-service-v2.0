package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInteractionRetrieveOutputModelInteractionInstanceAnalysis
 */
public class BQInteractionRetrieveOutputModelInteractionInstanceAnalysis   {
  private Object interactionInstanceAnalysisRecord = null;

  private String interactionInstanceAnalysisReportType = null;

  private String interactionInstanceAnalysisParameters = null;

  private Object interactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return interactionInstanceAnalysisRecord
  **/

  public Object getInteractionInstanceAnalysisRecord() {
    return interactionInstanceAnalysisRecord;
  }

  public void setInteractionInstanceAnalysisRecord(Object interactionInstanceAnalysisRecord) {
    this.interactionInstanceAnalysisRecord = interactionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return interactionInstanceAnalysisReportType
  **/

  public String getInteractionInstanceAnalysisReportType() {
    return interactionInstanceAnalysisReportType;
  }

  public void setInteractionInstanceAnalysisReportType(String interactionInstanceAnalysisReportType) {
    this.interactionInstanceAnalysisReportType = interactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return interactionInstanceAnalysisParameters
  **/

  public String getInteractionInstanceAnalysisParameters() {
    return interactionInstanceAnalysisParameters;
  }

  public void setInteractionInstanceAnalysisParameters(String interactionInstanceAnalysisParameters) {
    this.interactionInstanceAnalysisParameters = interactionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return interactionInstanceAnalysisReport
  **/

  public Object getInteractionInstanceAnalysisReport() {
    return interactionInstanceAnalysisReport;
  }

  public void setInteractionInstanceAnalysisReport(Object interactionInstanceAnalysisReport) {
    this.interactionInstanceAnalysisReport = interactionInstanceAnalysisReport;
  }


}


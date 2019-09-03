package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssistedRetrieveOutputModelAssistedInstanceAnalysis
 */
public class BQAssistedRetrieveOutputModelAssistedInstanceAnalysis   {
  private Object assistedInstanceAnalysisRecord = null;

  private String assistedInstanceAnalysisReportType = null;

  private String assistedInstanceAnalysisParameters = null;

  private Object assistedInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return assistedInstanceAnalysisRecord
  **/

  public Object getAssistedInstanceAnalysisRecord() {
    return assistedInstanceAnalysisRecord;
  }

  public void setAssistedInstanceAnalysisRecord(Object assistedInstanceAnalysisRecord) {
    this.assistedInstanceAnalysisRecord = assistedInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return assistedInstanceAnalysisReportType
  **/

  public String getAssistedInstanceAnalysisReportType() {
    return assistedInstanceAnalysisReportType;
  }

  public void setAssistedInstanceAnalysisReportType(String assistedInstanceAnalysisReportType) {
    this.assistedInstanceAnalysisReportType = assistedInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return assistedInstanceAnalysisParameters
  **/

  public String getAssistedInstanceAnalysisParameters() {
    return assistedInstanceAnalysisParameters;
  }

  public void setAssistedInstanceAnalysisParameters(String assistedInstanceAnalysisParameters) {
    this.assistedInstanceAnalysisParameters = assistedInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return assistedInstanceAnalysisReport
  **/

  public Object getAssistedInstanceAnalysisReport() {
    return assistedInstanceAnalysisReport;
  }

  public void setAssistedInstanceAnalysisReport(Object assistedInstanceAnalysisReport) {
    this.assistedInstanceAnalysisReport = assistedInstanceAnalysisReport;
  }


}


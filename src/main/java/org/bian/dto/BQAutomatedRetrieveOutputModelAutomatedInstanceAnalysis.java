package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAutomatedRetrieveOutputModelAutomatedInstanceAnalysis
 */
public class BQAutomatedRetrieveOutputModelAutomatedInstanceAnalysis   {
  private Object automatedInstanceAnalysisRecord = null;

  private String automatedInstanceAnalysisReportType = null;

  private String automatedInstanceAnalysisParameters = null;

  private Object automatedInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return automatedInstanceAnalysisRecord
  **/

  public Object getAutomatedInstanceAnalysisRecord() {
    return automatedInstanceAnalysisRecord;
  }

  public void setAutomatedInstanceAnalysisRecord(Object automatedInstanceAnalysisRecord) {
    this.automatedInstanceAnalysisRecord = automatedInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return automatedInstanceAnalysisReportType
  **/

  public String getAutomatedInstanceAnalysisReportType() {
    return automatedInstanceAnalysisReportType;
  }

  public void setAutomatedInstanceAnalysisReportType(String automatedInstanceAnalysisReportType) {
    this.automatedInstanceAnalysisReportType = automatedInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return automatedInstanceAnalysisParameters
  **/

  public String getAutomatedInstanceAnalysisParameters() {
    return automatedInstanceAnalysisParameters;
  }

  public void setAutomatedInstanceAnalysisParameters(String automatedInstanceAnalysisParameters) {
    this.automatedInstanceAnalysisParameters = automatedInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return automatedInstanceAnalysisReport
  **/

  public Object getAutomatedInstanceAnalysisReport() {
    return automatedInstanceAnalysisReport;
  }

  public void setAutomatedInstanceAnalysisReport(Object automatedInstanceAnalysisReport) {
    this.automatedInstanceAnalysisReport = automatedInstanceAnalysisReport;
  }


}


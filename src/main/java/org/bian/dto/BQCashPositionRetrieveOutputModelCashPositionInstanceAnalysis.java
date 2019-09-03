package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashPositionRetrieveOutputModelCashPositionInstanceAnalysis
 */
public class BQCashPositionRetrieveOutputModelCashPositionInstanceAnalysis   {
  private Object cashPositionInstanceAnalysisRecord = null;

  private String cashPositionInstanceAnalysisReportType = null;

  private String cashPositionInstanceAnalysisParameters = null;

  private Object cashPositionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cashPositionInstanceAnalysisRecord
  **/

  public Object getCashPositionInstanceAnalysisRecord() {
    return cashPositionInstanceAnalysisRecord;
  }

  public void setCashPositionInstanceAnalysisRecord(Object cashPositionInstanceAnalysisRecord) {
    this.cashPositionInstanceAnalysisRecord = cashPositionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cashPositionInstanceAnalysisReportType
  **/

  public String getCashPositionInstanceAnalysisReportType() {
    return cashPositionInstanceAnalysisReportType;
  }

  public void setCashPositionInstanceAnalysisReportType(String cashPositionInstanceAnalysisReportType) {
    this.cashPositionInstanceAnalysisReportType = cashPositionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cashPositionInstanceAnalysisParameters
  **/

  public String getCashPositionInstanceAnalysisParameters() {
    return cashPositionInstanceAnalysisParameters;
  }

  public void setCashPositionInstanceAnalysisParameters(String cashPositionInstanceAnalysisParameters) {
    this.cashPositionInstanceAnalysisParameters = cashPositionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return cashPositionInstanceAnalysisReport
  **/

  public Object getCashPositionInstanceAnalysisReport() {
    return cashPositionInstanceAnalysisReport;
  }

  public void setCashPositionInstanceAnalysisReport(Object cashPositionInstanceAnalysisReport) {
    this.cashPositionInstanceAnalysisReport = cashPositionInstanceAnalysisReport;
  }


}


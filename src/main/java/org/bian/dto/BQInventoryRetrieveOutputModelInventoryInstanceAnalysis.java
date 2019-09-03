package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryRetrieveOutputModelInventoryInstanceAnalysis
 */
public class BQInventoryRetrieveOutputModelInventoryInstanceAnalysis   {
  private Object inventoryInstanceAnalysisRecord = null;

  private String inventoryInstanceAnalysisReportType = null;

  private String inventoryInstanceAnalysisParameters = null;

  private Object inventoryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return inventoryInstanceAnalysisRecord
  **/

  public Object getInventoryInstanceAnalysisRecord() {
    return inventoryInstanceAnalysisRecord;
  }

  public void setInventoryInstanceAnalysisRecord(Object inventoryInstanceAnalysisRecord) {
    this.inventoryInstanceAnalysisRecord = inventoryInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return inventoryInstanceAnalysisReportType
  **/

  public String getInventoryInstanceAnalysisReportType() {
    return inventoryInstanceAnalysisReportType;
  }

  public void setInventoryInstanceAnalysisReportType(String inventoryInstanceAnalysisReportType) {
    this.inventoryInstanceAnalysisReportType = inventoryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return inventoryInstanceAnalysisParameters
  **/

  public String getInventoryInstanceAnalysisParameters() {
    return inventoryInstanceAnalysisParameters;
  }

  public void setInventoryInstanceAnalysisParameters(String inventoryInstanceAnalysisParameters) {
    this.inventoryInstanceAnalysisParameters = inventoryInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return inventoryInstanceAnalysisReport
  **/

  public Object getInventoryInstanceAnalysisReport() {
    return inventoryInstanceAnalysisReport;
  }

  public void setInventoryInstanceAnalysisReport(Object inventoryInstanceAnalysisReport) {
    this.inventoryInstanceAnalysisReport = inventoryInstanceAnalysisReport;
  }


}


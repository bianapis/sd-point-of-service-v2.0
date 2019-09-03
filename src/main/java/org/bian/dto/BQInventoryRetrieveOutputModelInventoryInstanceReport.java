package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryRetrieveOutputModelInventoryInstanceReport
 */
public class BQInventoryRetrieveOutputModelInventoryInstanceReport   {
  private Object inventoryInstanceReportRecord = null;

  private String inventoryInstanceReportType = null;

  private String inventoryInstanceReportParameters = null;

  private Object inventoryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return inventoryInstanceReportRecord
  **/

  public Object getInventoryInstanceReportRecord() {
    return inventoryInstanceReportRecord;
  }

  public void setInventoryInstanceReportRecord(Object inventoryInstanceReportRecord) {
    this.inventoryInstanceReportRecord = inventoryInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return inventoryInstanceReportType
  **/

  public String getInventoryInstanceReportType() {
    return inventoryInstanceReportType;
  }

  public void setInventoryInstanceReportType(String inventoryInstanceReportType) {
    this.inventoryInstanceReportType = inventoryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return inventoryInstanceReportParameters
  **/

  public String getInventoryInstanceReportParameters() {
    return inventoryInstanceReportParameters;
  }

  public void setInventoryInstanceReportParameters(String inventoryInstanceReportParameters) {
    this.inventoryInstanceReportParameters = inventoryInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return inventoryInstanceReport
  **/

  public Object getInventoryInstanceReport() {
    return inventoryInstanceReport;
  }

  public void setInventoryInstanceReport(Object inventoryInstanceReport) {
    this.inventoryInstanceReport = inventoryInstanceReport;
  }


}


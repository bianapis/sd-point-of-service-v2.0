package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashPositionRetrieveOutputModelCashPositionInstanceReport
 */
public class BQCashPositionRetrieveOutputModelCashPositionInstanceReport   {
  private Object cashPositionInstanceReportRecord = null;

  private String cashPositionInstanceReportType = null;

  private String cashPositionInstanceReportParameters = null;

  private Object cashPositionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cashPositionInstanceReportRecord
  **/

  public Object getCashPositionInstanceReportRecord() {
    return cashPositionInstanceReportRecord;
  }

  public void setCashPositionInstanceReportRecord(Object cashPositionInstanceReportRecord) {
    this.cashPositionInstanceReportRecord = cashPositionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cashPositionInstanceReportType
  **/

  public String getCashPositionInstanceReportType() {
    return cashPositionInstanceReportType;
  }

  public void setCashPositionInstanceReportType(String cashPositionInstanceReportType) {
    this.cashPositionInstanceReportType = cashPositionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cashPositionInstanceReportParameters
  **/

  public String getCashPositionInstanceReportParameters() {
    return cashPositionInstanceReportParameters;
  }

  public void setCashPositionInstanceReportParameters(String cashPositionInstanceReportParameters) {
    this.cashPositionInstanceReportParameters = cashPositionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cashPositionInstanceReport
  **/

  public Object getCashPositionInstanceReport() {
    return cashPositionInstanceReport;
  }

  public void setCashPositionInstanceReport(Object cashPositionInstanceReport) {
    this.cashPositionInstanceReport = cashPositionInstanceReport;
  }


}


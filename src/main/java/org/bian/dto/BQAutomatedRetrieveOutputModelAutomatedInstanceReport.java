package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAutomatedRetrieveOutputModelAutomatedInstanceReport
 */
public class BQAutomatedRetrieveOutputModelAutomatedInstanceReport   {
  private Object automatedInstanceReportRecord = null;

  private String automatedInstanceReportType = null;

  private String automatedInstanceReportParameters = null;

  private Object automatedInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return automatedInstanceReportRecord
  **/

  public Object getAutomatedInstanceReportRecord() {
    return automatedInstanceReportRecord;
  }

  public void setAutomatedInstanceReportRecord(Object automatedInstanceReportRecord) {
    this.automatedInstanceReportRecord = automatedInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return automatedInstanceReportType
  **/

  public String getAutomatedInstanceReportType() {
    return automatedInstanceReportType;
  }

  public void setAutomatedInstanceReportType(String automatedInstanceReportType) {
    this.automatedInstanceReportType = automatedInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return automatedInstanceReportParameters
  **/

  public String getAutomatedInstanceReportParameters() {
    return automatedInstanceReportParameters;
  }

  public void setAutomatedInstanceReportParameters(String automatedInstanceReportParameters) {
    this.automatedInstanceReportParameters = automatedInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return automatedInstanceReport
  **/

  public Object getAutomatedInstanceReport() {
    return automatedInstanceReport;
  }

  public void setAutomatedInstanceReport(Object automatedInstanceReport) {
    this.automatedInstanceReport = automatedInstanceReport;
  }


}


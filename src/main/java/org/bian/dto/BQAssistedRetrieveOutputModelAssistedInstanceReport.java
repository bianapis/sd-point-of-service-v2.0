package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssistedRetrieveOutputModelAssistedInstanceReport
 */
public class BQAssistedRetrieveOutputModelAssistedInstanceReport   {
  private Object assistedInstanceReportRecord = null;

  private String assistedInstanceReportType = null;

  private String assistedInstanceReportParameters = null;

  private Object assistedInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return assistedInstanceReportRecord
  **/

  public Object getAssistedInstanceReportRecord() {
    return assistedInstanceReportRecord;
  }

  public void setAssistedInstanceReportRecord(Object assistedInstanceReportRecord) {
    this.assistedInstanceReportRecord = assistedInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return assistedInstanceReportType
  **/

  public String getAssistedInstanceReportType() {
    return assistedInstanceReportType;
  }

  public void setAssistedInstanceReportType(String assistedInstanceReportType) {
    this.assistedInstanceReportType = assistedInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return assistedInstanceReportParameters
  **/

  public String getAssistedInstanceReportParameters() {
    return assistedInstanceReportParameters;
  }

  public void setAssistedInstanceReportParameters(String assistedInstanceReportParameters) {
    this.assistedInstanceReportParameters = assistedInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return assistedInstanceReport
  **/

  public Object getAssistedInstanceReport() {
    return assistedInstanceReport;
  }

  public void setAssistedInstanceReport(Object assistedInstanceReport) {
    this.assistedInstanceReport = assistedInstanceReport;
  }


}


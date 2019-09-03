package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInteractionRetrieveOutputModelInteractionInstanceReport
 */
public class BQInteractionRetrieveOutputModelInteractionInstanceReport   {
  private Object interactionInstanceReportRecord = null;

  private String interactionInstanceReportType = null;

  private String interactionInstanceReportParameters = null;

  private Object interactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return interactionInstanceReportRecord
  **/

  public Object getInteractionInstanceReportRecord() {
    return interactionInstanceReportRecord;
  }

  public void setInteractionInstanceReportRecord(Object interactionInstanceReportRecord) {
    this.interactionInstanceReportRecord = interactionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return interactionInstanceReportType
  **/

  public String getInteractionInstanceReportType() {
    return interactionInstanceReportType;
  }

  public void setInteractionInstanceReportType(String interactionInstanceReportType) {
    this.interactionInstanceReportType = interactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return interactionInstanceReportParameters
  **/

  public String getInteractionInstanceReportParameters() {
    return interactionInstanceReportParameters;
  }

  public void setInteractionInstanceReportParameters(String interactionInstanceReportParameters) {
    this.interactionInstanceReportParameters = interactionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return interactionInstanceReport
  **/

  public Object getInteractionInstanceReport() {
    return interactionInstanceReport;
  }

  public void setInteractionInstanceReport(Object interactionInstanceReport) {
    this.interactionInstanceReport = interactionInstanceReport;
  }


}


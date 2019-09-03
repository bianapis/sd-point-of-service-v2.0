package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceReportRecord
 */
public class CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceReportRecord   {
  private String pointofServiceOperatingSessionInstanceReportReference = null;

  private String pointofServiceOperatingSessionInstanceReportType = null;

  private String pointofServiceOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return pointofServiceOperatingSessionInstanceReportReference
  **/

  public String getPointofServiceOperatingSessionInstanceReportReference() {
    return pointofServiceOperatingSessionInstanceReportReference;
  }

  public void setPointofServiceOperatingSessionInstanceReportReference(String pointofServiceOperatingSessionInstanceReportReference) {
    this.pointofServiceOperatingSessionInstanceReportReference = pointofServiceOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return pointofServiceOperatingSessionInstanceReportType
  **/

  public String getPointofServiceOperatingSessionInstanceReportType() {
    return pointofServiceOperatingSessionInstanceReportType;
  }

  public void setPointofServiceOperatingSessionInstanceReportType(String pointofServiceOperatingSessionInstanceReportType) {
    this.pointofServiceOperatingSessionInstanceReportType = pointofServiceOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return pointofServiceOperatingSessionInstanceReportParameters
  **/

  public String getPointofServiceOperatingSessionInstanceReportParameters() {
    return pointofServiceOperatingSessionInstanceReportParameters;
  }

  public void setPointofServiceOperatingSessionInstanceReportParameters(String pointofServiceOperatingSessionInstanceReportParameters) {
    this.pointofServiceOperatingSessionInstanceReportParameters = pointofServiceOperatingSessionInstanceReportParameters;
  }


}


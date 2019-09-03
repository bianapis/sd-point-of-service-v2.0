package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceReportRecord
 */
public class CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceReportRecord   {
  private String pointofServiceOperatingSessionInstanceReportData = null;

  private String pointofServiceOperatingSessionInstanceReportType = null;

  private Object pointofServiceOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return pointofServiceOperatingSessionInstanceReportData
  **/

  public String getPointofServiceOperatingSessionInstanceReportData() {
    return pointofServiceOperatingSessionInstanceReportData;
  }

  public void setPointofServiceOperatingSessionInstanceReportData(String pointofServiceOperatingSessionInstanceReportData) {
    this.pointofServiceOperatingSessionInstanceReportData = pointofServiceOperatingSessionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return pointofServiceOperatingSessionInstanceReport
  **/

  public Object getPointofServiceOperatingSessionInstanceReport() {
    return pointofServiceOperatingSessionInstanceReport;
  }

  public void setPointofServiceOperatingSessionInstanceReport(Object pointofServiceOperatingSessionInstanceReport) {
    this.pointofServiceOperatingSessionInstanceReport = pointofServiceOperatingSessionInstanceReport;
  }


}


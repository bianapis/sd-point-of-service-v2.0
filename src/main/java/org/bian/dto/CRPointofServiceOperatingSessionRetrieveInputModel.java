package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceAnalysis;
import org.bian.dto.CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRetrieveInputModel
 */
public class CRPointofServiceOperatingSessionRetrieveInputModel   {
  private Object pointofServiceOperatingSessionRetrieveActionTaskRecord = null;

  private String pointofServiceOperatingSessionRetrieveActionRequest = null;

  private CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceReportRecord pointofServiceOperatingSessionInstanceReportRecord = null;

  private CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceAnalysis pointofServiceOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return pointofServiceOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getPointofServiceOperatingSessionRetrieveActionTaskRecord() {
    return pointofServiceOperatingSessionRetrieveActionTaskRecord;
  }

  public void setPointofServiceOperatingSessionRetrieveActionTaskRecord(Object pointofServiceOperatingSessionRetrieveActionTaskRecord) {
    this.pointofServiceOperatingSessionRetrieveActionTaskRecord = pointofServiceOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return pointofServiceOperatingSessionRetrieveActionRequest
  **/

  public String getPointofServiceOperatingSessionRetrieveActionRequest() {
    return pointofServiceOperatingSessionRetrieveActionRequest;
  }

  public void setPointofServiceOperatingSessionRetrieveActionRequest(String pointofServiceOperatingSessionRetrieveActionRequest) {
    this.pointofServiceOperatingSessionRetrieveActionRequest = pointofServiceOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get pointofServiceOperatingSessionInstanceReportRecord
   * @return pointofServiceOperatingSessionInstanceReportRecord
  **/

  public CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceReportRecord getPointofServiceOperatingSessionInstanceReportRecord() {
    return pointofServiceOperatingSessionInstanceReportRecord;
  }

  public void setPointofServiceOperatingSessionInstanceReportRecord(CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceReportRecord pointofServiceOperatingSessionInstanceReportRecord) {
    this.pointofServiceOperatingSessionInstanceReportRecord = pointofServiceOperatingSessionInstanceReportRecord;
  }


  /**
   * Get pointofServiceOperatingSessionInstanceAnalysis
   * @return pointofServiceOperatingSessionInstanceAnalysis
  **/

  public CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceAnalysis getPointofServiceOperatingSessionInstanceAnalysis() {
    return pointofServiceOperatingSessionInstanceAnalysis;
  }

  public void setPointofServiceOperatingSessionInstanceAnalysis(CRPointofServiceOperatingSessionRetrieveInputModelPointofServiceOperatingSessionInstanceAnalysis pointofServiceOperatingSessionInstanceAnalysis) {
    this.pointofServiceOperatingSessionInstanceAnalysis = pointofServiceOperatingSessionInstanceAnalysis;
  }


}


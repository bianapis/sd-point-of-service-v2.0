package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceAnalysis;
import org.bian.dto.CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord;
import org.bian.dto.CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRetrieveOutputModel
 */
public class CRPointofServiceOperatingSessionRetrieveOutputModel   {
  private CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;

  private String pointofServiceOperatingSessionRetrieveActionTaskReference = null;

  private Object pointofServiceOperatingSessionRetrieveActionTaskRecord = null;

  private String pointofServiceOperatingSessionRetrieveActionResponse = null;

  private CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceReportRecord pointofServiceOperatingSessionInstanceReportRecord = null;

  private CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceAnalysis pointofServiceOperatingSessionInstanceAnalysis = null;


  /**
   * Get pointofServiceOperatingSessionInstanceRecord
   * @return pointofServiceOperatingSessionInstanceRecord
  **/

  public CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Point of Service Operating Session instance retrieve service call 
   * @return pointofServiceOperatingSessionRetrieveActionTaskReference
  **/

  public String getPointofServiceOperatingSessionRetrieveActionTaskReference() {
    return pointofServiceOperatingSessionRetrieveActionTaskReference;
  }

  public void setPointofServiceOperatingSessionRetrieveActionTaskReference(String pointofServiceOperatingSessionRetrieveActionTaskReference) {
    this.pointofServiceOperatingSessionRetrieveActionTaskReference = pointofServiceOperatingSessionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return pointofServiceOperatingSessionRetrieveActionResponse
  **/

  public String getPointofServiceOperatingSessionRetrieveActionResponse() {
    return pointofServiceOperatingSessionRetrieveActionResponse;
  }

  public void setPointofServiceOperatingSessionRetrieveActionResponse(String pointofServiceOperatingSessionRetrieveActionResponse) {
    this.pointofServiceOperatingSessionRetrieveActionResponse = pointofServiceOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get pointofServiceOperatingSessionInstanceReportRecord
   * @return pointofServiceOperatingSessionInstanceReportRecord
  **/

  public CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceReportRecord getPointofServiceOperatingSessionInstanceReportRecord() {
    return pointofServiceOperatingSessionInstanceReportRecord;
  }

  public void setPointofServiceOperatingSessionInstanceReportRecord(CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceReportRecord pointofServiceOperatingSessionInstanceReportRecord) {
    this.pointofServiceOperatingSessionInstanceReportRecord = pointofServiceOperatingSessionInstanceReportRecord;
  }


  /**
   * Get pointofServiceOperatingSessionInstanceAnalysis
   * @return pointofServiceOperatingSessionInstanceAnalysis
  **/

  public CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceAnalysis getPointofServiceOperatingSessionInstanceAnalysis() {
    return pointofServiceOperatingSessionInstanceAnalysis;
  }

  public void setPointofServiceOperatingSessionInstanceAnalysis(CRPointofServiceOperatingSessionRetrieveOutputModelPointofServiceOperatingSessionInstanceAnalysis pointofServiceOperatingSessionInstanceAnalysis) {
    this.pointofServiceOperatingSessionInstanceAnalysis = pointofServiceOperatingSessionInstanceAnalysis;
  }


}


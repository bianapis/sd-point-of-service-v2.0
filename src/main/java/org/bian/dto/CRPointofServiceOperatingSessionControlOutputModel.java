package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionControlOutputModel
 */
public class CRPointofServiceOperatingSessionControlOutputModel   {
  private String pointofServiceOperatingSessionControlActionTaskReference = null;

  private Object pointofServiceOperatingSessionControlActionTaskRecord = null;

  private String pointofServiceOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Point of Service Operating Session instance control processing service call 
   * @return pointofServiceOperatingSessionControlActionTaskReference
  **/

  public String getPointofServiceOperatingSessionControlActionTaskReference() {
    return pointofServiceOperatingSessionControlActionTaskReference;
  }

  public void setPointofServiceOperatingSessionControlActionTaskReference(String pointofServiceOperatingSessionControlActionTaskReference) {
    this.pointofServiceOperatingSessionControlActionTaskReference = pointofServiceOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return pointofServiceOperatingSessionControlActionTaskRecord
  **/

  public Object getPointofServiceOperatingSessionControlActionTaskRecord() {
    return pointofServiceOperatingSessionControlActionTaskRecord;
  }

  public void setPointofServiceOperatingSessionControlActionTaskRecord(Object pointofServiceOperatingSessionControlActionTaskRecord) {
    this.pointofServiceOperatingSessionControlActionTaskRecord = pointofServiceOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return pointofServiceOperatingSessionControlActionResponse
  **/

  public String getPointofServiceOperatingSessionControlActionResponse() {
    return pointofServiceOperatingSessionControlActionResponse;
  }

  public void setPointofServiceOperatingSessionControlActionResponse(String pointofServiceOperatingSessionControlActionResponse) {
    this.pointofServiceOperatingSessionControlActionResponse = pointofServiceOperatingSessionControlActionResponse;
  }


}


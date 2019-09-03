package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionUpdateInputModel
 */
public class CRPointofServiceOperatingSessionUpdateInputModel   {
  private String pointofServiceServicingSessionReference = null;

  private String pointofServiceOperatingSessionInstanceReference = null;

  private Object pointofServiceOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return pointofServiceServicingSessionReference
  **/

  public String getPointofServiceServicingSessionReference() {
    return pointofServiceServicingSessionReference;
  }

  public void setPointofServiceServicingSessionReference(String pointofServiceServicingSessionReference) {
    this.pointofServiceServicingSessionReference = pointofServiceServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Point of Service Operating Session instance 
   * @return pointofServiceOperatingSessionInstanceReference
  **/

  public String getPointofServiceOperatingSessionInstanceReference() {
    return pointofServiceOperatingSessionInstanceReference;
  }

  public void setPointofServiceOperatingSessionInstanceReference(String pointofServiceOperatingSessionInstanceReference) {
    this.pointofServiceOperatingSessionInstanceReference = pointofServiceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return pointofServiceOperatingSessionUpdateActionTaskRecord
  **/

  public Object getPointofServiceOperatingSessionUpdateActionTaskRecord() {
    return pointofServiceOperatingSessionUpdateActionTaskRecord;
  }

  public void setPointofServiceOperatingSessionUpdateActionTaskRecord(Object pointofServiceOperatingSessionUpdateActionTaskRecord) {
    this.pointofServiceOperatingSessionUpdateActionTaskRecord = pointofServiceOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}


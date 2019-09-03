package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionControlInputModel
 */
public class CRPointofServiceOperatingSessionControlInputModel   {
  private String pointofServiceServicingSessionReference = null;

  private String pointofServiceOperatingSessionInstanceReference = null;

  private Object pointofServiceOperatingSessionControlActionTaskRecord = null;

  private CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest pointofServiceOperatingSessionControlActionRequest = null;


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
   * Get pointofServiceOperatingSessionControlActionRequest
   * @return pointofServiceOperatingSessionControlActionRequest
  **/

  public CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest getPointofServiceOperatingSessionControlActionRequest() {
    return pointofServiceOperatingSessionControlActionRequest;
  }

  public void setPointofServiceOperatingSessionControlActionRequest(CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest pointofServiceOperatingSessionControlActionRequest) {
    this.pointofServiceOperatingSessionControlActionRequest = pointofServiceOperatingSessionControlActionRequest;
  }


}


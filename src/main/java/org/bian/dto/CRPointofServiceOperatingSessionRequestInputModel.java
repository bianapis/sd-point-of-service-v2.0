package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRequestInputModel
 */
public class CRPointofServiceOperatingSessionRequestInputModel   {
  private String pointofServiceServicingSessionReference = null;

  private String pointofServiceOperatingSessionInstanceReference = null;

  private Object pointofServiceOperatingSessionRequestActionTaskRecord = null;

  private CRPointofServiceOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return pointofServiceOperatingSessionRequestActionTaskRecord
  **/

  public Object getPointofServiceOperatingSessionRequestActionTaskRecord() {
    return pointofServiceOperatingSessionRequestActionTaskRecord;
  }

  public void setPointofServiceOperatingSessionRequestActionTaskRecord(Object pointofServiceOperatingSessionRequestActionTaskRecord) {
    this.pointofServiceOperatingSessionRequestActionTaskRecord = pointofServiceOperatingSessionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRPointofServiceOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRPointofServiceOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}


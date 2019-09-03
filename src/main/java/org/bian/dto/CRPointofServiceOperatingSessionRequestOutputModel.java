package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionRequestOutputModel
 */
public class CRPointofServiceOperatingSessionRequestOutputModel   {
  private String pointofServiceOperatingSessionRequestActionTaskReference = null;

  private Object pointofServiceOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Point of Service Operating Session instance request service call 
   * @return pointofServiceOperatingSessionRequestActionTaskReference
  **/

  public String getPointofServiceOperatingSessionRequestActionTaskReference() {
    return pointofServiceOperatingSessionRequestActionTaskReference;
  }

  public void setPointofServiceOperatingSessionRequestActionTaskReference(String pointofServiceOperatingSessionRequestActionTaskReference) {
    this.pointofServiceOperatingSessionRequestActionTaskReference = pointofServiceOperatingSessionRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionUpdateOutputModel
 */
public class CRPointofServiceOperatingSessionUpdateOutputModel   {
  private String pointofServiceOperatingSessionUpdateActionTaskReference = null;

  private Object pointofServiceOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return pointofServiceOperatingSessionUpdateActionTaskReference
  **/

  public String getPointofServiceOperatingSessionUpdateActionTaskReference() {
    return pointofServiceOperatingSessionUpdateActionTaskReference;
  }

  public void setPointofServiceOperatingSessionUpdateActionTaskReference(String pointofServiceOperatingSessionUpdateActionTaskReference) {
    this.pointofServiceOperatingSessionUpdateActionTaskReference = pointofServiceOperatingSessionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


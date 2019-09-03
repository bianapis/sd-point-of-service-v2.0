package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQInteractionControlInputModel
 */
public class BQInteractionControlInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String interactionInstanceReference = null;

  private Object interactionControlActionTaskRecord = null;

  private CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest interactionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Point of Service Operating Session instance 
   * @return pointofServiceOperatingSessionInstanceReference
  **/

  public String getPointofServiceOperatingSessionInstanceReference() {
    return pointofServiceOperatingSessionInstanceReference;
  }

  public void setPointofServiceOperatingSessionInstanceReference(String pointofServiceOperatingSessionInstanceReference) {
    this.pointofServiceOperatingSessionInstanceReference = pointofServiceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Interaction instance 
   * @return interactionInstanceReference
  **/

  public String getInteractionInstanceReference() {
    return interactionInstanceReference;
  }

  public void setInteractionInstanceReference(String interactionInstanceReference) {
    this.interactionInstanceReference = interactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return interactionControlActionTaskRecord
  **/

  public Object getInteractionControlActionTaskRecord() {
    return interactionControlActionTaskRecord;
  }

  public void setInteractionControlActionTaskRecord(Object interactionControlActionTaskRecord) {
    this.interactionControlActionTaskRecord = interactionControlActionTaskRecord;
  }


  /**
   * Get interactionControlActionRequest
   * @return interactionControlActionRequest
  **/

  public CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest getInteractionControlActionRequest() {
    return interactionControlActionRequest;
  }

  public void setInteractionControlActionRequest(CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest interactionControlActionRequest) {
    this.interactionControlActionRequest = interactionControlActionRequest;
  }


}


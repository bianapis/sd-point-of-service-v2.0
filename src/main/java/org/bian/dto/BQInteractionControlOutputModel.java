package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInteractionControlOutputModel
 */
public class BQInteractionControlOutputModel   {
  private String interactionControlActionTaskReference = null;

  private Object interactionControlActionTaskRecord = null;

  private String interactionControlActionResponse = null;

  private String interactionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interaction instance control processing service call 
   * @return interactionControlActionTaskReference
  **/

  public String getInteractionControlActionTaskReference() {
    return interactionControlActionTaskReference;
  }

  public void setInteractionControlActionTaskReference(String interactionControlActionTaskReference) {
    this.interactionControlActionTaskReference = interactionControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return interactionControlActionResponse
  **/

  public String getInteractionControlActionResponse() {
    return interactionControlActionResponse;
  }

  public void setInteractionControlActionResponse(String interactionControlActionResponse) {
    this.interactionControlActionResponse = interactionControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Interaction instance (e.g. initialised, pending, active) 
   * @return interactionInstanceStatus
  **/

  public String getInteractionInstanceStatus() {
    return interactionInstanceStatus;
  }

  public void setInteractionInstanceStatus(String interactionInstanceStatus) {
    this.interactionInstanceStatus = interactionInstanceStatus;
  }


}


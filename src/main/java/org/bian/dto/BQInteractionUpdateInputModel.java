package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInteractionUpdateInputModelAssistedInstanceRecord;
import org.bian.dto.BQInteractionUpdateInputModelAutomatedInstanceRecord;
import org.bian.dto.BQInteractionUpdateInputModelInteractionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInteractionUpdateInputModel
 */
public class BQInteractionUpdateInputModel   {
  private BQInteractionUpdateInputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQInteractionUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private String pointofServiceOperatingSessionInstanceReference = null;

  private String interactionInstanceReference = null;

  private BQInteractionUpdateInputModelInteractionInstanceRecord interactionInstanceRecord = null;

  private Object interactionUpdateActionTaskRecord = null;

  private String interactionUpdateActionRequest = null;


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQInteractionUpdateInputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQInteractionUpdateInputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * Get automatedInstanceRecord
   * @return automatedInstanceRecord
  **/

  public BQInteractionUpdateInputModelAutomatedInstanceRecord getAutomatedInstanceRecord() {
    return automatedInstanceRecord;
  }

  public void setAutomatedInstanceRecord(BQInteractionUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord) {
    this.automatedInstanceRecord = automatedInstanceRecord;
  }


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
   * Get interactionInstanceRecord
   * @return interactionInstanceRecord
  **/

  public BQInteractionUpdateInputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQInteractionUpdateInputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return interactionUpdateActionTaskRecord
  **/

  public Object getInteractionUpdateActionTaskRecord() {
    return interactionUpdateActionTaskRecord;
  }

  public void setInteractionUpdateActionTaskRecord(Object interactionUpdateActionTaskRecord) {
    this.interactionUpdateActionTaskRecord = interactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return interactionUpdateActionRequest
  **/

  public String getInteractionUpdateActionRequest() {
    return interactionUpdateActionRequest;
  }

  public void setInteractionUpdateActionRequest(String interactionUpdateActionRequest) {
    this.interactionUpdateActionRequest = interactionUpdateActionRequest;
  }


}


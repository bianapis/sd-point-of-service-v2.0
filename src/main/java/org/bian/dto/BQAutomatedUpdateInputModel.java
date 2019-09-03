package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAutomatedUpdateInputModelAssistedInstanceRecord;
import org.bian.dto.BQAutomatedUpdateInputModelAutomatedInstanceRecord;
import org.bian.dto.BQAutomatedUpdateInputModelInteractionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAutomatedUpdateInputModel
 */
public class BQAutomatedUpdateInputModel   {
  private BQAutomatedUpdateInputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private String pointofServiceOperatingSessionInstanceReference = null;

  private String automatedInstanceReference = null;

  private BQAutomatedUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private Object automatedUpdateActionTaskRecord = null;

  private String automatedUpdateActionRequest = null;

  private BQAutomatedUpdateInputModelInteractionInstanceRecord interactionInstanceRecord = null;


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQAutomatedUpdateInputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQAutomatedUpdateInputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Automated instance 
   * @return automatedInstanceReference
  **/

  public String getAutomatedInstanceReference() {
    return automatedInstanceReference;
  }

  public void setAutomatedInstanceReference(String automatedInstanceReference) {
    this.automatedInstanceReference = automatedInstanceReference;
  }


  /**
   * Get automatedInstanceRecord
   * @return automatedInstanceRecord
  **/

  public BQAutomatedUpdateInputModelAutomatedInstanceRecord getAutomatedInstanceRecord() {
    return automatedInstanceRecord;
  }

  public void setAutomatedInstanceRecord(BQAutomatedUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord) {
    this.automatedInstanceRecord = automatedInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return automatedUpdateActionTaskRecord
  **/

  public Object getAutomatedUpdateActionTaskRecord() {
    return automatedUpdateActionTaskRecord;
  }

  public void setAutomatedUpdateActionTaskRecord(Object automatedUpdateActionTaskRecord) {
    this.automatedUpdateActionTaskRecord = automatedUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return automatedUpdateActionRequest
  **/

  public String getAutomatedUpdateActionRequest() {
    return automatedUpdateActionRequest;
  }

  public void setAutomatedUpdateActionRequest(String automatedUpdateActionRequest) {
    this.automatedUpdateActionRequest = automatedUpdateActionRequest;
  }


  /**
   * Get interactionInstanceRecord
   * @return interactionInstanceRecord
  **/

  public BQAutomatedUpdateInputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQAutomatedUpdateInputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


}


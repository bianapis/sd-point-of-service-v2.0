package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAutomatedInitiateInputModelAutomatedInstanceRecord;
import org.bian.dto.BQAutomatedInitiateOutputModelAssistedInstanceRecord;
import org.bian.dto.BQAutomatedInitiateOutputModelInteractionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAutomatedInitiateOutputModel
 */
public class BQAutomatedInitiateOutputModel   {
  private BQAutomatedInitiateOutputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private String automatedInstanceReference = null;

  private String automatedInitiateActionReference = null;

  private Object automatedInitiateActionRecord = null;

  private String automatedInstanceStatus = null;

  private BQAutomatedInitiateInputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private BQAutomatedInitiateOutputModelInteractionInstanceRecord interactionInstanceRecord = null;


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQAutomatedInitiateOutputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQAutomatedInitiateOutputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return automatedInitiateActionReference
  **/

  public String getAutomatedInitiateActionReference() {
    return automatedInitiateActionReference;
  }

  public void setAutomatedInitiateActionReference(String automatedInitiateActionReference) {
    this.automatedInitiateActionReference = automatedInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return automatedInitiateActionRecord
  **/

  public Object getAutomatedInitiateActionRecord() {
    return automatedInitiateActionRecord;
  }

  public void setAutomatedInitiateActionRecord(Object automatedInitiateActionRecord) {
    this.automatedInitiateActionRecord = automatedInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Automated instance (e.g. initialised, pending, active) 
   * @return automatedInstanceStatus
  **/

  public String getAutomatedInstanceStatus() {
    return automatedInstanceStatus;
  }

  public void setAutomatedInstanceStatus(String automatedInstanceStatus) {
    this.automatedInstanceStatus = automatedInstanceStatus;
  }


  /**
   * Get automatedInstanceRecord
   * @return automatedInstanceRecord
  **/

  public BQAutomatedInitiateInputModelAutomatedInstanceRecord getAutomatedInstanceRecord() {
    return automatedInstanceRecord;
  }

  public void setAutomatedInstanceRecord(BQAutomatedInitiateInputModelAutomatedInstanceRecord automatedInstanceRecord) {
    this.automatedInstanceRecord = automatedInstanceRecord;
  }


  /**
   * Get interactionInstanceRecord
   * @return interactionInstanceRecord
  **/

  public BQAutomatedInitiateOutputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQAutomatedInitiateOutputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


}


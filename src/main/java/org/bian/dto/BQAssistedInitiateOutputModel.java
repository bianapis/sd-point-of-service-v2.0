package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssistedInitiateOutputModelAssistedInstanceRecord;
import org.bian.dto.BQAssistedInitiateOutputModelInteractionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssistedInitiateOutputModel
 */
public class BQAssistedInitiateOutputModel   {
  private String assistedInstanceReference = null;

  private String assistedInitiateActionReference = null;

  private Object assistedInitiateActionRecord = null;

  private String assistedInstanceStatus = null;

  private BQAssistedInitiateOutputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQAssistedInitiateOutputModelInteractionInstanceRecord interactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assisted instance 
   * @return assistedInstanceReference
  **/

  public String getAssistedInstanceReference() {
    return assistedInstanceReference;
  }

  public void setAssistedInstanceReference(String assistedInstanceReference) {
    this.assistedInstanceReference = assistedInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return assistedInitiateActionReference
  **/

  public String getAssistedInitiateActionReference() {
    return assistedInitiateActionReference;
  }

  public void setAssistedInitiateActionReference(String assistedInitiateActionReference) {
    this.assistedInitiateActionReference = assistedInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return assistedInitiateActionRecord
  **/

  public Object getAssistedInitiateActionRecord() {
    return assistedInitiateActionRecord;
  }

  public void setAssistedInitiateActionRecord(Object assistedInitiateActionRecord) {
    this.assistedInitiateActionRecord = assistedInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Assisted instance (e.g. initialised, pending, active) 
   * @return assistedInstanceStatus
  **/

  public String getAssistedInstanceStatus() {
    return assistedInstanceStatus;
  }

  public void setAssistedInstanceStatus(String assistedInstanceStatus) {
    this.assistedInstanceStatus = assistedInstanceStatus;
  }


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQAssistedInitiateOutputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQAssistedInitiateOutputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * Get interactionInstanceRecord
   * @return interactionInstanceRecord
  **/

  public BQAssistedInitiateOutputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQAssistedInitiateOutputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


}


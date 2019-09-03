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
 * BQAutomatedUpdateOutputModel
 */
public class BQAutomatedUpdateOutputModel   {
  private BQAutomatedUpdateInputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQAutomatedUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private String automatedUpdateActionTaskReference = null;

  private Object automatedUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return automatedUpdateActionTaskReference
  **/

  public String getAutomatedUpdateActionTaskReference() {
    return automatedUpdateActionTaskReference;
  }

  public void setAutomatedUpdateActionTaskReference(String automatedUpdateActionTaskReference) {
    this.automatedUpdateActionTaskReference = automatedUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
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


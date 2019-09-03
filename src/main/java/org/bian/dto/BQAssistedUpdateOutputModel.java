package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssistedUpdateInputModelAssistedInstanceRecord;
import org.bian.dto.BQAssistedUpdateInputModelInteractionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssistedUpdateOutputModel
 */
public class BQAssistedUpdateOutputModel   {
  private BQAssistedUpdateInputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private String assistedUpdateActionTaskReference = null;

  private Object assistedUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;

  private BQAssistedUpdateInputModelInteractionInstanceRecord interactionInstanceRecord = null;


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQAssistedUpdateInputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQAssistedUpdateInputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return assistedUpdateActionTaskReference
  **/

  public String getAssistedUpdateActionTaskReference() {
    return assistedUpdateActionTaskReference;
  }

  public void setAssistedUpdateActionTaskReference(String assistedUpdateActionTaskReference) {
    this.assistedUpdateActionTaskReference = assistedUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return assistedUpdateActionTaskRecord
  **/

  public Object getAssistedUpdateActionTaskRecord() {
    return assistedUpdateActionTaskRecord;
  }

  public void setAssistedUpdateActionTaskRecord(Object assistedUpdateActionTaskRecord) {
    this.assistedUpdateActionTaskRecord = assistedUpdateActionTaskRecord;
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

  public BQAssistedUpdateInputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQAssistedUpdateInputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


}


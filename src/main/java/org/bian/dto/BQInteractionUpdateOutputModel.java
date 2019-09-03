package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInteractionUpdateInputModelInteractionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInteractionUpdateOutputModel
 */
public class BQInteractionUpdateOutputModel   {
  private BQInteractionUpdateInputModelInteractionInstanceRecord interactionInstanceRecord = null;

  private String interactionUpdateActionTaskReference = null;

  private Object interactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return interactionUpdateActionTaskReference
  **/

  public String getInteractionUpdateActionTaskReference() {
    return interactionUpdateActionTaskReference;
  }

  public void setInteractionUpdateActionTaskReference(String interactionUpdateActionTaskReference) {
    this.interactionUpdateActionTaskReference = interactionUpdateActionTaskReference;
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


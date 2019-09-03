package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssistedUpdateInputModelAssistedInstanceRecord;
import org.bian.dto.BQAssistedUpdateInputModelInteractionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssistedUpdateInputModel
 */
public class BQAssistedUpdateInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String assistedInstanceReference = null;

  private BQAssistedUpdateInputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private Object assistedUpdateActionTaskRecord = null;

  private String assistedUpdateActionRequest = null;

  private BQAssistedUpdateInputModelInteractionInstanceRecord interactionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return assistedUpdateActionRequest
  **/

  public String getAssistedUpdateActionRequest() {
    return assistedUpdateActionRequest;
  }

  public void setAssistedUpdateActionRequest(String assistedUpdateActionRequest) {
    this.assistedUpdateActionRequest = assistedUpdateActionRequest;
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


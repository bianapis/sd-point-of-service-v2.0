package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssistedInitiateInputModelAssistedInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssistedInitiateInputModel
 */
public class BQAssistedInitiateInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private Object assistedInitiateActionRecord = null;

  private BQAssistedInitiateInputModelAssistedInstanceRecord assistedInstanceRecord = null;


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
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQAssistedInitiateInputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQAssistedInitiateInputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


}


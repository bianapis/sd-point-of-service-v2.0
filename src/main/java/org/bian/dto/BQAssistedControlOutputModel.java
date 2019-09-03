package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssistedControlOutputModel
 */
public class BQAssistedControlOutputModel   {
  private String assistedControlActionTaskReference = null;

  private Object assistedControlActionTaskRecord = null;

  private String assistedControlActionResponse = null;

  private String assistedInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assisted instance control processing service call 
   * @return assistedControlActionTaskReference
  **/

  public String getAssistedControlActionTaskReference() {
    return assistedControlActionTaskReference;
  }

  public void setAssistedControlActionTaskReference(String assistedControlActionTaskReference) {
    this.assistedControlActionTaskReference = assistedControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return assistedControlActionTaskRecord
  **/

  public Object getAssistedControlActionTaskRecord() {
    return assistedControlActionTaskRecord;
  }

  public void setAssistedControlActionTaskRecord(Object assistedControlActionTaskRecord) {
    this.assistedControlActionTaskRecord = assistedControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return assistedControlActionResponse
  **/

  public String getAssistedControlActionResponse() {
    return assistedControlActionResponse;
  }

  public void setAssistedControlActionResponse(String assistedControlActionResponse) {
    this.assistedControlActionResponse = assistedControlActionResponse;
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


}


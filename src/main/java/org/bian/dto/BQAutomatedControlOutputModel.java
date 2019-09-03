package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAutomatedControlOutputModel
 */
public class BQAutomatedControlOutputModel   {
  private String automatedControlActionTaskReference = null;

  private Object automatedControlActionTaskRecord = null;

  private String automatedControlActionResponse = null;

  private String automatedInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Automated instance control processing service call 
   * @return automatedControlActionTaskReference
  **/

  public String getAutomatedControlActionTaskReference() {
    return automatedControlActionTaskReference;
  }

  public void setAutomatedControlActionTaskReference(String automatedControlActionTaskReference) {
    this.automatedControlActionTaskReference = automatedControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return automatedControlActionTaskRecord
  **/

  public Object getAutomatedControlActionTaskRecord() {
    return automatedControlActionTaskRecord;
  }

  public void setAutomatedControlActionTaskRecord(Object automatedControlActionTaskRecord) {
    this.automatedControlActionTaskRecord = automatedControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return automatedControlActionResponse
  **/

  public String getAutomatedControlActionResponse() {
    return automatedControlActionResponse;
  }

  public void setAutomatedControlActionResponse(String automatedControlActionResponse) {
    this.automatedControlActionResponse = automatedControlActionResponse;
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


}


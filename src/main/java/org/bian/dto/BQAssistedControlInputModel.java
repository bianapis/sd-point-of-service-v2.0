package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQAssistedControlInputModel
 */
public class BQAssistedControlInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String assistedInstanceReference = null;

  private Object assistedControlActionTaskRecord = null;

  private CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest assistedControlActionRequest = null;


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
   * Get assistedControlActionRequest
   * @return assistedControlActionRequest
  **/

  public CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest getAssistedControlActionRequest() {
    return assistedControlActionRequest;
  }

  public void setAssistedControlActionRequest(CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest assistedControlActionRequest) {
    this.assistedControlActionRequest = assistedControlActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQAutomatedControlInputModel
 */
public class BQAutomatedControlInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String automatedInstanceReference = null;

  private Object automatedControlActionTaskRecord = null;

  private CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest automatedControlActionRequest = null;


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
   * Get automatedControlActionRequest
   * @return automatedControlActionRequest
  **/

  public CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest getAutomatedControlActionRequest() {
    return automatedControlActionRequest;
  }

  public void setAutomatedControlActionRequest(CRPointofServiceOperatingSessionControlInputModelPointofServiceOperatingSessionControlActionRequest automatedControlActionRequest) {
    this.automatedControlActionRequest = automatedControlActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAutomatedInitiateInputModelAutomatedInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAutomatedInitiateInputModel
 */
public class BQAutomatedInitiateInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private Object automatedInitiateActionRecord = null;

  private BQAutomatedInitiateInputModelAutomatedInstanceRecord automatedInstanceRecord = null;


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
   * @return automatedInitiateActionRecord
  **/

  public Object getAutomatedInitiateActionRecord() {
    return automatedInitiateActionRecord;
  }

  public void setAutomatedInitiateActionRecord(Object automatedInitiateActionRecord) {
    this.automatedInitiateActionRecord = automatedInitiateActionRecord;
  }


  /**
   * Get automatedInstanceRecord
   * @return automatedInstanceRecord
  **/

  public BQAutomatedInitiateInputModelAutomatedInstanceRecord getAutomatedInstanceRecord() {
    return automatedInstanceRecord;
  }

  public void setAutomatedInstanceRecord(BQAutomatedInitiateInputModelAutomatedInstanceRecord automatedInstanceRecord) {
    this.automatedInstanceRecord = automatedInstanceRecord;
  }


}


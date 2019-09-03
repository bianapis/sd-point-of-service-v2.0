package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashPositionUpdateInputModelAssistedInstanceRecord;
import org.bian.dto.BQCashPositionUpdateInputModelAutomatedInstanceRecord;
import org.bian.dto.BQCashPositionUpdateInputModelPositionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCashPositionUpdateInputModel
 */
public class BQCashPositionUpdateInputModel   {
  private BQCashPositionUpdateInputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQCashPositionUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private String pointofServiceOperatingSessionInstanceReference = null;

  private String cashPositionInstanceReference = null;

  private BQCashPositionUpdateInputModelPositionInstanceRecord positionInstanceRecord = null;

  private Object cashPositionUpdateActionTaskRecord = null;

  private String cashPositionUpdateActionRequest = null;


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQCashPositionUpdateInputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQCashPositionUpdateInputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * Get automatedInstanceRecord
   * @return automatedInstanceRecord
  **/

  public BQCashPositionUpdateInputModelAutomatedInstanceRecord getAutomatedInstanceRecord() {
    return automatedInstanceRecord;
  }

  public void setAutomatedInstanceRecord(BQCashPositionUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord) {
    this.automatedInstanceRecord = automatedInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cash Position instance 
   * @return cashPositionInstanceReference
  **/

  public String getCashPositionInstanceReference() {
    return cashPositionInstanceReference;
  }

  public void setCashPositionInstanceReference(String cashPositionInstanceReference) {
    this.cashPositionInstanceReference = cashPositionInstanceReference;
  }


  /**
   * Get positionInstanceRecord
   * @return positionInstanceRecord
  **/

  public BQCashPositionUpdateInputModelPositionInstanceRecord getPositionInstanceRecord() {
    return positionInstanceRecord;
  }

  public void setPositionInstanceRecord(BQCashPositionUpdateInputModelPositionInstanceRecord positionInstanceRecord) {
    this.positionInstanceRecord = positionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cashPositionUpdateActionTaskRecord
  **/

  public Object getCashPositionUpdateActionTaskRecord() {
    return cashPositionUpdateActionTaskRecord;
  }

  public void setCashPositionUpdateActionTaskRecord(Object cashPositionUpdateActionTaskRecord) {
    this.cashPositionUpdateActionTaskRecord = cashPositionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return cashPositionUpdateActionRequest
  **/

  public String getCashPositionUpdateActionRequest() {
    return cashPositionUpdateActionRequest;
  }

  public void setCashPositionUpdateActionRequest(String cashPositionUpdateActionRequest) {
    this.cashPositionUpdateActionRequest = cashPositionUpdateActionRequest;
  }


}


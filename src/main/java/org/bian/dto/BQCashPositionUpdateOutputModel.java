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
 * BQCashPositionUpdateOutputModel
 */
public class BQCashPositionUpdateOutputModel   {
  private BQCashPositionUpdateInputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQCashPositionUpdateInputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private BQCashPositionUpdateInputModelPositionInstanceRecord positionInstanceRecord = null;

  private String cashPositionUpdateActionTaskReference = null;

  private Object cashPositionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return cashPositionUpdateActionTaskReference
  **/

  public String getCashPositionUpdateActionTaskReference() {
    return cashPositionUpdateActionTaskReference;
  }

  public void setCashPositionUpdateActionTaskReference(String cashPositionUpdateActionTaskReference) {
    this.cashPositionUpdateActionTaskReference = cashPositionUpdateActionTaskReference;
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


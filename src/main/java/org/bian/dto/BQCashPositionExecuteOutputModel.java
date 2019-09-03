package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashPositionExecuteOutputModelPositionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCashPositionExecuteOutputModel
 */
public class BQCashPositionExecuteOutputModel   {
  private BQCashPositionExecuteOutputModelPositionInstanceRecord positionInstanceRecord = null;

  private String cashPositionExecuteActionTaskReference = null;

  private Object cashPositionExecuteActionTaskRecord = null;

  private String cashPositionExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get positionInstanceRecord
   * @return positionInstanceRecord
  **/

  public BQCashPositionExecuteOutputModelPositionInstanceRecord getPositionInstanceRecord() {
    return positionInstanceRecord;
  }

  public void setPositionInstanceRecord(BQCashPositionExecuteOutputModelPositionInstanceRecord positionInstanceRecord) {
    this.positionInstanceRecord = positionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cash Position instance execute service call 
   * @return cashPositionExecuteActionTaskReference
  **/

  public String getCashPositionExecuteActionTaskReference() {
    return cashPositionExecuteActionTaskReference;
  }

  public void setCashPositionExecuteActionTaskReference(String cashPositionExecuteActionTaskReference) {
    this.cashPositionExecuteActionTaskReference = cashPositionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return cashPositionExecuteActionTaskRecord
  **/

  public Object getCashPositionExecuteActionTaskRecord() {
    return cashPositionExecuteActionTaskRecord;
  }

  public void setCashPositionExecuteActionTaskRecord(Object cashPositionExecuteActionTaskRecord) {
    this.cashPositionExecuteActionTaskRecord = cashPositionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cash Position execute transaction/record 
   * @return cashPositionExecuteRecordReference
  **/

  public String getCashPositionExecuteRecordReference() {
    return cashPositionExecuteRecordReference;
  }

  public void setCashPositionExecuteRecordReference(String cashPositionExecuteRecordReference) {
    this.cashPositionExecuteRecordReference = cashPositionExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}


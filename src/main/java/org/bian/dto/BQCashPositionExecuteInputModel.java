package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashPositionExecuteInputModelPositionInstanceRecord;
import org.bian.dto.CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQCashPositionExecuteInputModel
 */
public class BQCashPositionExecuteInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String cashPositionInstanceReference = null;

  private BQCashPositionExecuteInputModelPositionInstanceRecord positionInstanceRecord = null;

  private Object cashPositionExecuteActionTaskRecord = null;

  private CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public BQCashPositionExecuteInputModelPositionInstanceRecord getPositionInstanceRecord() {
    return positionInstanceRecord;
  }

  public void setPositionInstanceRecord(BQCashPositionExecuteInputModelPositionInstanceRecord positionInstanceRecord) {
    this.positionInstanceRecord = positionInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}


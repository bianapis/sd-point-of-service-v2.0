package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryExecuteInputModelInventoryInstanceRecord;
import org.bian.dto.CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQInventoryExecuteInputModel
 */
public class BQInventoryExecuteInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String inventoryInstanceReference = null;

  private BQInventoryExecuteInputModelInventoryInstanceRecord inventoryInstanceRecord = null;

  private Object inventoryExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inventory instance 
   * @return inventoryInstanceReference
  **/

  public String getInventoryInstanceReference() {
    return inventoryInstanceReference;
  }

  public void setInventoryInstanceReference(String inventoryInstanceReference) {
    this.inventoryInstanceReference = inventoryInstanceReference;
  }


  /**
   * Get inventoryInstanceRecord
   * @return inventoryInstanceRecord
  **/

  public BQInventoryExecuteInputModelInventoryInstanceRecord getInventoryInstanceRecord() {
    return inventoryInstanceRecord;
  }

  public void setInventoryInstanceRecord(BQInventoryExecuteInputModelInventoryInstanceRecord inventoryInstanceRecord) {
    this.inventoryInstanceRecord = inventoryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return inventoryExecuteActionTaskRecord
  **/

  public Object getInventoryExecuteActionTaskRecord() {
    return inventoryExecuteActionTaskRecord;
  }

  public void setInventoryExecuteActionTaskRecord(Object inventoryExecuteActionTaskRecord) {
    this.inventoryExecuteActionTaskRecord = inventoryExecuteActionTaskRecord;
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


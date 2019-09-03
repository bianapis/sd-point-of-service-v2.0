package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryExecuteOutputModelInventoryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInventoryExecuteOutputModel
 */
public class BQInventoryExecuteOutputModel   {
  private BQInventoryExecuteOutputModelInventoryInstanceRecord inventoryInstanceRecord = null;

  private String inventoryExecuteActionTaskReference = null;

  private Object inventoryExecuteActionTaskRecord = null;

  private String inventoryExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get inventoryInstanceRecord
   * @return inventoryInstanceRecord
  **/

  public BQInventoryExecuteOutputModelInventoryInstanceRecord getInventoryInstanceRecord() {
    return inventoryInstanceRecord;
  }

  public void setInventoryInstanceRecord(BQInventoryExecuteOutputModelInventoryInstanceRecord inventoryInstanceRecord) {
    this.inventoryInstanceRecord = inventoryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inventory instance execute service call 
   * @return inventoryExecuteActionTaskReference
  **/

  public String getInventoryExecuteActionTaskReference() {
    return inventoryExecuteActionTaskReference;
  }

  public void setInventoryExecuteActionTaskReference(String inventoryExecuteActionTaskReference) {
    this.inventoryExecuteActionTaskReference = inventoryExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inventory execute transaction/record 
   * @return inventoryExecuteRecordReference
  **/

  public String getInventoryExecuteRecordReference() {
    return inventoryExecuteRecordReference;
  }

  public void setInventoryExecuteRecordReference(String inventoryExecuteRecordReference) {
    this.inventoryExecuteRecordReference = inventoryExecuteRecordReference;
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


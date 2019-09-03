package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryUpdateInputModelInventoryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInventoryUpdateOutputModel
 */
public class BQInventoryUpdateOutputModel   {
  private BQInventoryUpdateInputModelInventoryInstanceRecord inventoryInstanceRecord = null;

  private String inventoryUpdateActionTaskReference = null;

  private Object inventoryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get inventoryInstanceRecord
   * @return inventoryInstanceRecord
  **/

  public BQInventoryUpdateInputModelInventoryInstanceRecord getInventoryInstanceRecord() {
    return inventoryInstanceRecord;
  }

  public void setInventoryInstanceRecord(BQInventoryUpdateInputModelInventoryInstanceRecord inventoryInstanceRecord) {
    this.inventoryInstanceRecord = inventoryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return inventoryUpdateActionTaskReference
  **/

  public String getInventoryUpdateActionTaskReference() {
    return inventoryUpdateActionTaskReference;
  }

  public void setInventoryUpdateActionTaskReference(String inventoryUpdateActionTaskReference) {
    this.inventoryUpdateActionTaskReference = inventoryUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inventoryUpdateActionTaskRecord
  **/

  public Object getInventoryUpdateActionTaskRecord() {
    return inventoryUpdateActionTaskRecord;
  }

  public void setInventoryUpdateActionTaskRecord(Object inventoryUpdateActionTaskRecord) {
    this.inventoryUpdateActionTaskRecord = inventoryUpdateActionTaskRecord;
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


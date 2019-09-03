package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryUpdateInputModelInventoryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInventoryUpdateInputModel
 */
public class BQInventoryUpdateInputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String inventoryInstanceReference = null;

  private BQInventoryUpdateInputModelInventoryInstanceRecord inventoryInstanceRecord = null;

  private Object inventoryUpdateActionTaskRecord = null;

  private String inventoryUpdateActionRequest = null;


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

  public BQInventoryUpdateInputModelInventoryInstanceRecord getInventoryInstanceRecord() {
    return inventoryInstanceRecord;
  }

  public void setInventoryInstanceRecord(BQInventoryUpdateInputModelInventoryInstanceRecord inventoryInstanceRecord) {
    this.inventoryInstanceRecord = inventoryInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return inventoryUpdateActionRequest
  **/

  public String getInventoryUpdateActionRequest() {
    return inventoryUpdateActionRequest;
  }

  public void setInventoryUpdateActionRequest(String inventoryUpdateActionRequest) {
    this.inventoryUpdateActionRequest = inventoryUpdateActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryUpdateInputModelInventoryInstanceRecord
 */
public class BQInventoryUpdateInputModelInventoryInstanceRecord   {
  private String servicingInventoryType = null;

  private Object servicingPositionInventoryRecord = null;

  private Object servicingInventoryTransactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of non-cash inventory (e.g. documents/forms, brochures) 
   * @return servicingInventoryType
  **/

  public String getServicingInventoryType() {
    return servicingInventoryType;
  }

  public void setServicingInventoryType(String servicingInventoryType) {
    this.servicingInventoryType = servicingInventoryType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Used to track inventory holdings at the position 
   * @return servicingPositionInventoryRecord
  **/

  public Object getServicingPositionInventoryRecord() {
    return servicingPositionInventoryRecord;
  }

  public void setServicingPositionInventoryRecord(Object servicingPositionInventoryRecord) {
    this.servicingPositionInventoryRecord = servicingPositionInventoryRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the transfer of inventory (e.g. documents issued) 
   * @return servicingInventoryTransactionRecord
  **/

  public Object getServicingInventoryTransactionRecord() {
    return servicingInventoryTransactionRecord;
  }

  public void setServicingInventoryTransactionRecord(Object servicingInventoryTransactionRecord) {
    this.servicingInventoryTransactionRecord = servicingInventoryTransactionRecord;
  }


}


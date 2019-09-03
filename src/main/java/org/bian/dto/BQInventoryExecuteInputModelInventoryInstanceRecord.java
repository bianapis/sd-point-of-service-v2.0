package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryExecuteInputModelInventoryInstanceRecord
 */
public class BQInventoryExecuteInputModelInventoryInstanceRecord   {
  private String servicingInventoryType = null;


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


}


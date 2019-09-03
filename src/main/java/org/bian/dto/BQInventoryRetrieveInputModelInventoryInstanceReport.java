package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryRetrieveInputModelInventoryInstanceReport
 */
public class BQInventoryRetrieveInputModelInventoryInstanceReport   {
  private String inventoryInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return inventoryInstanceReportReference
  **/

  public String getInventoryInstanceReportReference() {
    return inventoryInstanceReportReference;
  }

  public void setInventoryInstanceReportReference(String inventoryInstanceReportReference) {
    this.inventoryInstanceReportReference = inventoryInstanceReportReference;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInteractionUpdateInputModelAutomatedInstanceRecord
 */
public class BQInteractionUpdateInputModelAutomatedInstanceRecord   {
  private String businessUnitReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The business unit responsible for the automated service 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


}


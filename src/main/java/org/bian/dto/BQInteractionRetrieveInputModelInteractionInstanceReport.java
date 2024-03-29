package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInteractionRetrieveInputModelInteractionInstanceReport
 */
public class BQInteractionRetrieveInputModelInteractionInstanceReport   {
  private String interactionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return interactionInstanceReportReference
  **/

  public String getInteractionInstanceReportReference() {
    return interactionInstanceReportReference;
  }

  public void setInteractionInstanceReportReference(String interactionInstanceReportReference) {
    this.interactionInstanceReportReference = interactionInstanceReportReference;
  }


}


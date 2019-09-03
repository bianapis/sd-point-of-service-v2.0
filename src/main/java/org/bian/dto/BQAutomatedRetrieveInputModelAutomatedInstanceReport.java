package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAutomatedRetrieveInputModelAutomatedInstanceReport
 */
public class BQAutomatedRetrieveInputModelAutomatedInstanceReport   {
  private String automatedInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return automatedInstanceReportReference
  **/

  public String getAutomatedInstanceReportReference() {
    return automatedInstanceReportReference;
  }

  public void setAutomatedInstanceReportReference(String automatedInstanceReportReference) {
    this.automatedInstanceReportReference = automatedInstanceReportReference;
  }


}


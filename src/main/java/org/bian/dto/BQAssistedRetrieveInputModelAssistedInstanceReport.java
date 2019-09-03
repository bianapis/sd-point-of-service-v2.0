package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssistedRetrieveInputModelAssistedInstanceReport
 */
public class BQAssistedRetrieveInputModelAssistedInstanceReport   {
  private String assistedInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return assistedInstanceReportReference
  **/

  public String getAssistedInstanceReportReference() {
    return assistedInstanceReportReference;
  }

  public void setAssistedInstanceReportReference(String assistedInstanceReportReference) {
    this.assistedInstanceReportReference = assistedInstanceReportReference;
  }


}


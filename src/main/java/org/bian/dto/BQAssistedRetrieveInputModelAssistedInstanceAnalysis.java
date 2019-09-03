package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssistedRetrieveInputModelAssistedInstanceAnalysis
 */
public class BQAssistedRetrieveInputModelAssistedInstanceAnalysis   {
  private String assistedInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return assistedInstanceAnalysisReference
  **/

  public String getAssistedInstanceAnalysisReference() {
    return assistedInstanceAnalysisReference;
  }

  public void setAssistedInstanceAnalysisReference(String assistedInstanceAnalysisReference) {
    this.assistedInstanceAnalysisReference = assistedInstanceAnalysisReference;
  }


}


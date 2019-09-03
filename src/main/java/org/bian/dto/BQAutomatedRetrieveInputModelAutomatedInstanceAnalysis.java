package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAutomatedRetrieveInputModelAutomatedInstanceAnalysis
 */
public class BQAutomatedRetrieveInputModelAutomatedInstanceAnalysis   {
  private String automatedInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return automatedInstanceAnalysisReference
  **/

  public String getAutomatedInstanceAnalysisReference() {
    return automatedInstanceAnalysisReference;
  }

  public void setAutomatedInstanceAnalysisReference(String automatedInstanceAnalysisReference) {
    this.automatedInstanceAnalysisReference = automatedInstanceAnalysisReference;
  }


}


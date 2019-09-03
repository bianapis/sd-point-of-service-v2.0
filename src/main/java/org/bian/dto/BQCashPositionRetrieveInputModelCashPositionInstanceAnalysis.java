package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashPositionRetrieveInputModelCashPositionInstanceAnalysis
 */
public class BQCashPositionRetrieveInputModelCashPositionInstanceAnalysis   {
  private String cashPositionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return cashPositionInstanceAnalysisReference
  **/

  public String getCashPositionInstanceAnalysisReference() {
    return cashPositionInstanceAnalysisReference;
  }

  public void setCashPositionInstanceAnalysisReference(String cashPositionInstanceAnalysisReference) {
    this.cashPositionInstanceAnalysisReference = cashPositionInstanceAnalysisReference;
  }


}


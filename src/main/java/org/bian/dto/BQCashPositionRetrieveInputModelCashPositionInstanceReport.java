package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashPositionRetrieveInputModelCashPositionInstanceReport
 */
public class BQCashPositionRetrieveInputModelCashPositionInstanceReport   {
  private String cashPositionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cashPositionInstanceReportReference
  **/

  public String getCashPositionInstanceReportReference() {
    return cashPositionInstanceReportReference;
  }

  public void setCashPositionInstanceReportReference(String cashPositionInstanceReportReference) {
    this.cashPositionInstanceReportReference = cashPositionInstanceReportReference;
  }


}


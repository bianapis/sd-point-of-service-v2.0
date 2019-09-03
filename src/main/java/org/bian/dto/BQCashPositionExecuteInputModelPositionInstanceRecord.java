package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashPositionExecuteInputModelPositionInstanceRecord
 */
public class BQCashPositionExecuteInputModelPositionInstanceRecord   {
  private String servicingCurrency = null;

  private String productInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency being tracked 
   * @return servicingCurrency
  **/

  public String getServicingCurrency() {
    return servicingCurrency;
  }

  public void setServicingCurrency(String servicingCurrency) {
    this.servicingCurrency = servicingCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The link to the account product instance used to effect payments from the position 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}


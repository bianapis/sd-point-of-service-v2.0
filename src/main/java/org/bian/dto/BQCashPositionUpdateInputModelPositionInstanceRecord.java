package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashPositionUpdateInputModelPositionInstanceRecord
 */
public class BQCashPositionUpdateInputModelPositionInstanceRecord   {
  private String servicingCurrency = null;

  private Object servicingCashHoldingRecord = null;

  private String servicingCashTransactionReference = null;

  private Object servicingCashTransactionRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The current holding by currency/instrument 
   * @return servicingCashHoldingRecord
  **/

  public Object getServicingCashHoldingRecord() {
    return servicingCashHoldingRecord;
  }

  public void setServicingCashHoldingRecord(Object servicingCashHoldingRecord) {
    this.servicingCashHoldingRecord = servicingCashHoldingRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a cash transaction 
   * @return servicingCashTransactionReference
  **/

  public String getServicingCashTransactionReference() {
    return servicingCashTransactionReference;
  }

  public void setServicingCashTransactionReference(String servicingCashTransactionReference) {
    this.servicingCashTransactionReference = servicingCashTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the cash transaction (e.g. cash deposited to customer account) 
   * @return servicingCashTransactionRecord
  **/

  public Object getServicingCashTransactionRecord() {
    return servicingCashTransactionRecord;
  }

  public void setServicingCashTransactionRecord(Object servicingCashTransactionRecord) {
    this.servicingCashTransactionRecord = servicingCashTransactionRecord;
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


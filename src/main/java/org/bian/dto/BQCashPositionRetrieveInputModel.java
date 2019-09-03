package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashPositionRetrieveInputModelCashPositionInstanceAnalysis;
import org.bian.dto.BQCashPositionRetrieveInputModelCashPositionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCashPositionRetrieveInputModel
 */
public class BQCashPositionRetrieveInputModel   {
  private Object cashPositionRetrieveActionTaskRecord = null;

  private String cashPositionRetrieveActionRequest = null;

  private BQCashPositionRetrieveInputModelCashPositionInstanceReport cashPositionInstanceReport = null;

  private BQCashPositionRetrieveInputModelCashPositionInstanceAnalysis cashPositionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cashPositionRetrieveActionTaskRecord
  **/

  public Object getCashPositionRetrieveActionTaskRecord() {
    return cashPositionRetrieveActionTaskRecord;
  }

  public void setCashPositionRetrieveActionTaskRecord(Object cashPositionRetrieveActionTaskRecord) {
    this.cashPositionRetrieveActionTaskRecord = cashPositionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cashPositionRetrieveActionRequest
  **/

  public String getCashPositionRetrieveActionRequest() {
    return cashPositionRetrieveActionRequest;
  }

  public void setCashPositionRetrieveActionRequest(String cashPositionRetrieveActionRequest) {
    this.cashPositionRetrieveActionRequest = cashPositionRetrieveActionRequest;
  }


  /**
   * Get cashPositionInstanceReport
   * @return cashPositionInstanceReport
  **/

  public BQCashPositionRetrieveInputModelCashPositionInstanceReport getCashPositionInstanceReport() {
    return cashPositionInstanceReport;
  }

  public void setCashPositionInstanceReport(BQCashPositionRetrieveInputModelCashPositionInstanceReport cashPositionInstanceReport) {
    this.cashPositionInstanceReport = cashPositionInstanceReport;
  }


  /**
   * Get cashPositionInstanceAnalysis
   * @return cashPositionInstanceAnalysis
  **/

  public BQCashPositionRetrieveInputModelCashPositionInstanceAnalysis getCashPositionInstanceAnalysis() {
    return cashPositionInstanceAnalysis;
  }

  public void setCashPositionInstanceAnalysis(BQCashPositionRetrieveInputModelCashPositionInstanceAnalysis cashPositionInstanceAnalysis) {
    this.cashPositionInstanceAnalysis = cashPositionInstanceAnalysis;
  }


}


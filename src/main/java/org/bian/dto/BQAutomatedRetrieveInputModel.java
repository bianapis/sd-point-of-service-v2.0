package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAutomatedRetrieveInputModelAutomatedInstanceAnalysis;
import org.bian.dto.BQAutomatedRetrieveInputModelAutomatedInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAutomatedRetrieveInputModel
 */
public class BQAutomatedRetrieveInputModel   {
  private Object automatedRetrieveActionTaskRecord = null;

  private String automatedRetrieveActionRequest = null;

  private BQAutomatedRetrieveInputModelAutomatedInstanceReport automatedInstanceReport = null;

  private BQAutomatedRetrieveInputModelAutomatedInstanceAnalysis automatedInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return automatedRetrieveActionTaskRecord
  **/

  public Object getAutomatedRetrieveActionTaskRecord() {
    return automatedRetrieveActionTaskRecord;
  }

  public void setAutomatedRetrieveActionTaskRecord(Object automatedRetrieveActionTaskRecord) {
    this.automatedRetrieveActionTaskRecord = automatedRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return automatedRetrieveActionRequest
  **/

  public String getAutomatedRetrieveActionRequest() {
    return automatedRetrieveActionRequest;
  }

  public void setAutomatedRetrieveActionRequest(String automatedRetrieveActionRequest) {
    this.automatedRetrieveActionRequest = automatedRetrieveActionRequest;
  }


  /**
   * Get automatedInstanceReport
   * @return automatedInstanceReport
  **/

  public BQAutomatedRetrieveInputModelAutomatedInstanceReport getAutomatedInstanceReport() {
    return automatedInstanceReport;
  }

  public void setAutomatedInstanceReport(BQAutomatedRetrieveInputModelAutomatedInstanceReport automatedInstanceReport) {
    this.automatedInstanceReport = automatedInstanceReport;
  }


  /**
   * Get automatedInstanceAnalysis
   * @return automatedInstanceAnalysis
  **/

  public BQAutomatedRetrieveInputModelAutomatedInstanceAnalysis getAutomatedInstanceAnalysis() {
    return automatedInstanceAnalysis;
  }

  public void setAutomatedInstanceAnalysis(BQAutomatedRetrieveInputModelAutomatedInstanceAnalysis automatedInstanceAnalysis) {
    this.automatedInstanceAnalysis = automatedInstanceAnalysis;
  }


}


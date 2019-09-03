package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInteractionRetrieveInputModelInteractionInstanceAnalysis;
import org.bian.dto.BQInteractionRetrieveInputModelInteractionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInteractionRetrieveInputModel
 */
public class BQInteractionRetrieveInputModel   {
  private Object interactionRetrieveActionTaskRecord = null;

  private String interactionRetrieveActionRequest = null;

  private BQInteractionRetrieveInputModelInteractionInstanceReport interactionInstanceReport = null;

  private BQInteractionRetrieveInputModelInteractionInstanceAnalysis interactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return interactionRetrieveActionTaskRecord
  **/

  public Object getInteractionRetrieveActionTaskRecord() {
    return interactionRetrieveActionTaskRecord;
  }

  public void setInteractionRetrieveActionTaskRecord(Object interactionRetrieveActionTaskRecord) {
    this.interactionRetrieveActionTaskRecord = interactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return interactionRetrieveActionRequest
  **/

  public String getInteractionRetrieveActionRequest() {
    return interactionRetrieveActionRequest;
  }

  public void setInteractionRetrieveActionRequest(String interactionRetrieveActionRequest) {
    this.interactionRetrieveActionRequest = interactionRetrieveActionRequest;
  }


  /**
   * Get interactionInstanceReport
   * @return interactionInstanceReport
  **/

  public BQInteractionRetrieveInputModelInteractionInstanceReport getInteractionInstanceReport() {
    return interactionInstanceReport;
  }

  public void setInteractionInstanceReport(BQInteractionRetrieveInputModelInteractionInstanceReport interactionInstanceReport) {
    this.interactionInstanceReport = interactionInstanceReport;
  }


  /**
   * Get interactionInstanceAnalysis
   * @return interactionInstanceAnalysis
  **/

  public BQInteractionRetrieveInputModelInteractionInstanceAnalysis getInteractionInstanceAnalysis() {
    return interactionInstanceAnalysis;
  }

  public void setInteractionInstanceAnalysis(BQInteractionRetrieveInputModelInteractionInstanceAnalysis interactionInstanceAnalysis) {
    this.interactionInstanceAnalysis = interactionInstanceAnalysis;
  }


}


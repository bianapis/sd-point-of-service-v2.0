package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssistedRetrieveInputModelAssistedInstanceAnalysis;
import org.bian.dto.BQAssistedRetrieveInputModelAssistedInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAssistedRetrieveInputModel
 */
public class BQAssistedRetrieveInputModel   {
  private Object assistedRetrieveActionTaskRecord = null;

  private String assistedRetrieveActionRequest = null;

  private BQAssistedRetrieveInputModelAssistedInstanceReport assistedInstanceReport = null;

  private BQAssistedRetrieveInputModelAssistedInstanceAnalysis assistedInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assistedRetrieveActionTaskRecord
  **/

  public Object getAssistedRetrieveActionTaskRecord() {
    return assistedRetrieveActionTaskRecord;
  }

  public void setAssistedRetrieveActionTaskRecord(Object assistedRetrieveActionTaskRecord) {
    this.assistedRetrieveActionTaskRecord = assistedRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assistedRetrieveActionRequest
  **/

  public String getAssistedRetrieveActionRequest() {
    return assistedRetrieveActionRequest;
  }

  public void setAssistedRetrieveActionRequest(String assistedRetrieveActionRequest) {
    this.assistedRetrieveActionRequest = assistedRetrieveActionRequest;
  }


  /**
   * Get assistedInstanceReport
   * @return assistedInstanceReport
  **/

  public BQAssistedRetrieveInputModelAssistedInstanceReport getAssistedInstanceReport() {
    return assistedInstanceReport;
  }

  public void setAssistedInstanceReport(BQAssistedRetrieveInputModelAssistedInstanceReport assistedInstanceReport) {
    this.assistedInstanceReport = assistedInstanceReport;
  }


  /**
   * Get assistedInstanceAnalysis
   * @return assistedInstanceAnalysis
  **/

  public BQAssistedRetrieveInputModelAssistedInstanceAnalysis getAssistedInstanceAnalysis() {
    return assistedInstanceAnalysis;
  }

  public void setAssistedInstanceAnalysis(BQAssistedRetrieveInputModelAssistedInstanceAnalysis assistedInstanceAnalysis) {
    this.assistedInstanceAnalysis = assistedInstanceAnalysis;
  }


}


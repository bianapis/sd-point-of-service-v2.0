package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryRetrieveInputModelInventoryInstanceAnalysis;
import org.bian.dto.BQInventoryRetrieveInputModelInventoryInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInventoryRetrieveInputModel
 */
public class BQInventoryRetrieveInputModel   {
  private Object inventoryRetrieveActionTaskRecord = null;

  private String inventoryRetrieveActionRequest = null;

  private BQInventoryRetrieveInputModelInventoryInstanceReport inventoryInstanceReport = null;

  private BQInventoryRetrieveInputModelInventoryInstanceAnalysis inventoryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inventoryRetrieveActionTaskRecord
  **/

  public Object getInventoryRetrieveActionTaskRecord() {
    return inventoryRetrieveActionTaskRecord;
  }

  public void setInventoryRetrieveActionTaskRecord(Object inventoryRetrieveActionTaskRecord) {
    this.inventoryRetrieveActionTaskRecord = inventoryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return inventoryRetrieveActionRequest
  **/

  public String getInventoryRetrieveActionRequest() {
    return inventoryRetrieveActionRequest;
  }

  public void setInventoryRetrieveActionRequest(String inventoryRetrieveActionRequest) {
    this.inventoryRetrieveActionRequest = inventoryRetrieveActionRequest;
  }


  /**
   * Get inventoryInstanceReport
   * @return inventoryInstanceReport
  **/

  public BQInventoryRetrieveInputModelInventoryInstanceReport getInventoryInstanceReport() {
    return inventoryInstanceReport;
  }

  public void setInventoryInstanceReport(BQInventoryRetrieveInputModelInventoryInstanceReport inventoryInstanceReport) {
    this.inventoryInstanceReport = inventoryInstanceReport;
  }


  /**
   * Get inventoryInstanceAnalysis
   * @return inventoryInstanceAnalysis
  **/

  public BQInventoryRetrieveInputModelInventoryInstanceAnalysis getInventoryInstanceAnalysis() {
    return inventoryInstanceAnalysis;
  }

  public void setInventoryInstanceAnalysis(BQInventoryRetrieveInputModelInventoryInstanceAnalysis inventoryInstanceAnalysis) {
    this.inventoryInstanceAnalysis = inventoryInstanceAnalysis;
  }


}


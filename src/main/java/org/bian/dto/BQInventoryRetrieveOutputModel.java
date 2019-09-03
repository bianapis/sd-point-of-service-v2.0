package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryRetrieveOutputModelInventoryInstanceAnalysis;
import org.bian.dto.BQInventoryRetrieveOutputModelInventoryInstanceReport;
import org.bian.dto.BQInventoryRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord;
import org.bian.dto.BQInventoryUpdateInputModelInventoryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInventoryRetrieveOutputModel
 */
public class BQInventoryRetrieveOutputModel   {
  private BQInventoryRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;

  private BQInventoryUpdateInputModelInventoryInstanceRecord inventoryInstanceRecord = null;

  private String inventoryRetrieveActionTaskReference = null;

  private Object inventoryRetrieveActionTaskRecord = null;

  private String inventoryRetrieveActionResponse = null;

  private BQInventoryRetrieveOutputModelInventoryInstanceReport inventoryInstanceReport = null;

  private BQInventoryRetrieveOutputModelInventoryInstanceAnalysis inventoryInstanceAnalysis = null;


  /**
   * Get pointofServiceOperatingSessionInstanceRecord
   * @return pointofServiceOperatingSessionInstanceRecord
  **/

  public BQInventoryRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(BQInventoryRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


  /**
   * Get inventoryInstanceRecord
   * @return inventoryInstanceRecord
  **/

  public BQInventoryUpdateInputModelInventoryInstanceRecord getInventoryInstanceRecord() {
    return inventoryInstanceRecord;
  }

  public void setInventoryInstanceRecord(BQInventoryUpdateInputModelInventoryInstanceRecord inventoryInstanceRecord) {
    this.inventoryInstanceRecord = inventoryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inventory instance retrieve service call 
   * @return inventoryRetrieveActionTaskReference
  **/

  public String getInventoryRetrieveActionTaskReference() {
    return inventoryRetrieveActionTaskReference;
  }

  public void setInventoryRetrieveActionTaskReference(String inventoryRetrieveActionTaskReference) {
    this.inventoryRetrieveActionTaskReference = inventoryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return inventoryRetrieveActionResponse
  **/

  public String getInventoryRetrieveActionResponse() {
    return inventoryRetrieveActionResponse;
  }

  public void setInventoryRetrieveActionResponse(String inventoryRetrieveActionResponse) {
    this.inventoryRetrieveActionResponse = inventoryRetrieveActionResponse;
  }


  /**
   * Get inventoryInstanceReport
   * @return inventoryInstanceReport
  **/

  public BQInventoryRetrieveOutputModelInventoryInstanceReport getInventoryInstanceReport() {
    return inventoryInstanceReport;
  }

  public void setInventoryInstanceReport(BQInventoryRetrieveOutputModelInventoryInstanceReport inventoryInstanceReport) {
    this.inventoryInstanceReport = inventoryInstanceReport;
  }


  /**
   * Get inventoryInstanceAnalysis
   * @return inventoryInstanceAnalysis
  **/

  public BQInventoryRetrieveOutputModelInventoryInstanceAnalysis getInventoryInstanceAnalysis() {
    return inventoryInstanceAnalysis;
  }

  public void setInventoryInstanceAnalysis(BQInventoryRetrieveOutputModelInventoryInstanceAnalysis inventoryInstanceAnalysis) {
    this.inventoryInstanceAnalysis = inventoryInstanceAnalysis;
  }


}


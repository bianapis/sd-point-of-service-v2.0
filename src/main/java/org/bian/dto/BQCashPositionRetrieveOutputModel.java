package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashPositionRetrieveOutputModelAssistedInstanceRecord;
import org.bian.dto.BQCashPositionRetrieveOutputModelAutomatedInstanceRecord;
import org.bian.dto.BQCashPositionRetrieveOutputModelCashPositionInstanceAnalysis;
import org.bian.dto.BQCashPositionRetrieveOutputModelCashPositionInstanceReport;
import org.bian.dto.BQCashPositionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord;
import org.bian.dto.BQCashPositionRetrieveOutputModelPositionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCashPositionRetrieveOutputModel
 */
public class BQCashPositionRetrieveOutputModel   {
  private BQCashPositionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;

  private BQCashPositionRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQCashPositionRetrieveOutputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private BQCashPositionRetrieveOutputModelPositionInstanceRecord positionInstanceRecord = null;

  private String cashPositionRetrieveActionTaskReference = null;

  private Object cashPositionRetrieveActionTaskRecord = null;

  private String cashPositionRetrieveActionResponse = null;

  private BQCashPositionRetrieveOutputModelCashPositionInstanceReport cashPositionInstanceReport = null;

  private BQCashPositionRetrieveOutputModelCashPositionInstanceAnalysis cashPositionInstanceAnalysis = null;


  /**
   * Get pointofServiceOperatingSessionInstanceRecord
   * @return pointofServiceOperatingSessionInstanceRecord
  **/

  public BQCashPositionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(BQCashPositionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQCashPositionRetrieveOutputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQCashPositionRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * Get automatedInstanceRecord
   * @return automatedInstanceRecord
  **/

  public BQCashPositionRetrieveOutputModelAutomatedInstanceRecord getAutomatedInstanceRecord() {
    return automatedInstanceRecord;
  }

  public void setAutomatedInstanceRecord(BQCashPositionRetrieveOutputModelAutomatedInstanceRecord automatedInstanceRecord) {
    this.automatedInstanceRecord = automatedInstanceRecord;
  }


  /**
   * Get positionInstanceRecord
   * @return positionInstanceRecord
  **/

  public BQCashPositionRetrieveOutputModelPositionInstanceRecord getPositionInstanceRecord() {
    return positionInstanceRecord;
  }

  public void setPositionInstanceRecord(BQCashPositionRetrieveOutputModelPositionInstanceRecord positionInstanceRecord) {
    this.positionInstanceRecord = positionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cash Position instance retrieve service call 
   * @return cashPositionRetrieveActionTaskReference
  **/

  public String getCashPositionRetrieveActionTaskReference() {
    return cashPositionRetrieveActionTaskReference;
  }

  public void setCashPositionRetrieveActionTaskReference(String cashPositionRetrieveActionTaskReference) {
    this.cashPositionRetrieveActionTaskReference = cashPositionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cashPositionRetrieveActionResponse
  **/

  public String getCashPositionRetrieveActionResponse() {
    return cashPositionRetrieveActionResponse;
  }

  public void setCashPositionRetrieveActionResponse(String cashPositionRetrieveActionResponse) {
    this.cashPositionRetrieveActionResponse = cashPositionRetrieveActionResponse;
  }


  /**
   * Get cashPositionInstanceReport
   * @return cashPositionInstanceReport
  **/

  public BQCashPositionRetrieveOutputModelCashPositionInstanceReport getCashPositionInstanceReport() {
    return cashPositionInstanceReport;
  }

  public void setCashPositionInstanceReport(BQCashPositionRetrieveOutputModelCashPositionInstanceReport cashPositionInstanceReport) {
    this.cashPositionInstanceReport = cashPositionInstanceReport;
  }


  /**
   * Get cashPositionInstanceAnalysis
   * @return cashPositionInstanceAnalysis
  **/

  public BQCashPositionRetrieveOutputModelCashPositionInstanceAnalysis getCashPositionInstanceAnalysis() {
    return cashPositionInstanceAnalysis;
  }

  public void setCashPositionInstanceAnalysis(BQCashPositionRetrieveOutputModelCashPositionInstanceAnalysis cashPositionInstanceAnalysis) {
    this.cashPositionInstanceAnalysis = cashPositionInstanceAnalysis;
  }


}


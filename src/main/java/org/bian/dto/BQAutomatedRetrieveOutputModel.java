package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAutomatedRetrieveOutputModelAssistedInstanceRecord;
import org.bian.dto.BQAutomatedRetrieveOutputModelAutomatedInstanceAnalysis;
import org.bian.dto.BQAutomatedRetrieveOutputModelAutomatedInstanceRecord;
import org.bian.dto.BQAutomatedRetrieveOutputModelAutomatedInstanceReport;
import org.bian.dto.BQAutomatedRetrieveOutputModelInteractionInstanceRecord;
import org.bian.dto.BQAutomatedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAutomatedRetrieveOutputModel
 */
public class BQAutomatedRetrieveOutputModel   {
  private BQAutomatedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;

  private BQAutomatedRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQAutomatedRetrieveOutputModelAutomatedInstanceRecord automatedInstanceRecord = null;

  private String automatedRetrieveActionTaskReference = null;

  private Object automatedRetrieveActionTaskRecord = null;

  private String automatedRetrieveActionResponse = null;

  private BQAutomatedRetrieveOutputModelAutomatedInstanceReport automatedInstanceReport = null;

  private BQAutomatedRetrieveOutputModelAutomatedInstanceAnalysis automatedInstanceAnalysis = null;

  private BQAutomatedRetrieveOutputModelInteractionInstanceRecord interactionInstanceRecord = null;


  /**
   * Get pointofServiceOperatingSessionInstanceRecord
   * @return pointofServiceOperatingSessionInstanceRecord
  **/

  public BQAutomatedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(BQAutomatedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQAutomatedRetrieveOutputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQAutomatedRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * Get automatedInstanceRecord
   * @return automatedInstanceRecord
  **/

  public BQAutomatedRetrieveOutputModelAutomatedInstanceRecord getAutomatedInstanceRecord() {
    return automatedInstanceRecord;
  }

  public void setAutomatedInstanceRecord(BQAutomatedRetrieveOutputModelAutomatedInstanceRecord automatedInstanceRecord) {
    this.automatedInstanceRecord = automatedInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Automated instance retrieve service call 
   * @return automatedRetrieveActionTaskReference
  **/

  public String getAutomatedRetrieveActionTaskReference() {
    return automatedRetrieveActionTaskReference;
  }

  public void setAutomatedRetrieveActionTaskReference(String automatedRetrieveActionTaskReference) {
    this.automatedRetrieveActionTaskReference = automatedRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return automatedRetrieveActionResponse
  **/

  public String getAutomatedRetrieveActionResponse() {
    return automatedRetrieveActionResponse;
  }

  public void setAutomatedRetrieveActionResponse(String automatedRetrieveActionResponse) {
    this.automatedRetrieveActionResponse = automatedRetrieveActionResponse;
  }


  /**
   * Get automatedInstanceReport
   * @return automatedInstanceReport
  **/

  public BQAutomatedRetrieveOutputModelAutomatedInstanceReport getAutomatedInstanceReport() {
    return automatedInstanceReport;
  }

  public void setAutomatedInstanceReport(BQAutomatedRetrieveOutputModelAutomatedInstanceReport automatedInstanceReport) {
    this.automatedInstanceReport = automatedInstanceReport;
  }


  /**
   * Get automatedInstanceAnalysis
   * @return automatedInstanceAnalysis
  **/

  public BQAutomatedRetrieveOutputModelAutomatedInstanceAnalysis getAutomatedInstanceAnalysis() {
    return automatedInstanceAnalysis;
  }

  public void setAutomatedInstanceAnalysis(BQAutomatedRetrieveOutputModelAutomatedInstanceAnalysis automatedInstanceAnalysis) {
    this.automatedInstanceAnalysis = automatedInstanceAnalysis;
  }


  /**
   * Get interactionInstanceRecord
   * @return interactionInstanceRecord
  **/

  public BQAutomatedRetrieveOutputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQAutomatedRetrieveOutputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


}


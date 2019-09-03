package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssistedRetrieveOutputModelAssistedInstanceAnalysis;
import org.bian.dto.BQAssistedRetrieveOutputModelAssistedInstanceRecord;
import org.bian.dto.BQAssistedRetrieveOutputModelAssistedInstanceReport;
import org.bian.dto.BQAssistedRetrieveOutputModelInteractionInstanceRecord;
import org.bian.dto.BQAssistedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssistedRetrieveOutputModel
 */
public class BQAssistedRetrieveOutputModel   {
  private BQAssistedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;

  private BQAssistedRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private String assistedRetrieveActionTaskReference = null;

  private Object assistedRetrieveActionTaskRecord = null;

  private String assistedRetrieveActionResponse = null;

  private BQAssistedRetrieveOutputModelAssistedInstanceReport assistedInstanceReport = null;

  private BQAssistedRetrieveOutputModelAssistedInstanceAnalysis assistedInstanceAnalysis = null;

  private BQAssistedRetrieveOutputModelInteractionInstanceRecord interactionInstanceRecord = null;


  /**
   * Get pointofServiceOperatingSessionInstanceRecord
   * @return pointofServiceOperatingSessionInstanceRecord
  **/

  public BQAssistedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(BQAssistedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQAssistedRetrieveOutputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQAssistedRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assisted instance retrieve service call 
   * @return assistedRetrieveActionTaskReference
  **/

  public String getAssistedRetrieveActionTaskReference() {
    return assistedRetrieveActionTaskReference;
  }

  public void setAssistedRetrieveActionTaskReference(String assistedRetrieveActionTaskReference) {
    this.assistedRetrieveActionTaskReference = assistedRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return assistedRetrieveActionResponse
  **/

  public String getAssistedRetrieveActionResponse() {
    return assistedRetrieveActionResponse;
  }

  public void setAssistedRetrieveActionResponse(String assistedRetrieveActionResponse) {
    this.assistedRetrieveActionResponse = assistedRetrieveActionResponse;
  }


  /**
   * Get assistedInstanceReport
   * @return assistedInstanceReport
  **/

  public BQAssistedRetrieveOutputModelAssistedInstanceReport getAssistedInstanceReport() {
    return assistedInstanceReport;
  }

  public void setAssistedInstanceReport(BQAssistedRetrieveOutputModelAssistedInstanceReport assistedInstanceReport) {
    this.assistedInstanceReport = assistedInstanceReport;
  }


  /**
   * Get assistedInstanceAnalysis
   * @return assistedInstanceAnalysis
  **/

  public BQAssistedRetrieveOutputModelAssistedInstanceAnalysis getAssistedInstanceAnalysis() {
    return assistedInstanceAnalysis;
  }

  public void setAssistedInstanceAnalysis(BQAssistedRetrieveOutputModelAssistedInstanceAnalysis assistedInstanceAnalysis) {
    this.assistedInstanceAnalysis = assistedInstanceAnalysis;
  }


  /**
   * Get interactionInstanceRecord
   * @return interactionInstanceRecord
  **/

  public BQAssistedRetrieveOutputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQAssistedRetrieveOutputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


}


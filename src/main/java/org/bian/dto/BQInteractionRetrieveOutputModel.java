package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInteractionRetrieveOutputModelAssistedInstanceRecord;
import org.bian.dto.BQInteractionRetrieveOutputModelInteractionInstanceAnalysis;
import org.bian.dto.BQInteractionRetrieveOutputModelInteractionInstanceRecord;
import org.bian.dto.BQInteractionRetrieveOutputModelInteractionInstanceReport;
import org.bian.dto.BQInteractionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInteractionRetrieveOutputModel
 */
public class BQInteractionRetrieveOutputModel   {
  private BQInteractionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;

  private BQInteractionRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord = null;

  private BQInteractionRetrieveOutputModelInteractionInstanceRecord interactionInstanceRecord = null;

  private String interactionRetrieveActionTaskReference = null;

  private Object interactionRetrieveActionTaskRecord = null;

  private String interactionRetrieveActionResponse = null;

  private BQInteractionRetrieveOutputModelInteractionInstanceReport interactionInstanceReport = null;

  private BQInteractionRetrieveOutputModelInteractionInstanceAnalysis interactionInstanceAnalysis = null;


  /**
   * Get pointofServiceOperatingSessionInstanceRecord
   * @return pointofServiceOperatingSessionInstanceRecord
  **/

  public BQInteractionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(BQInteractionRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


  /**
   * Get assistedInstanceRecord
   * @return assistedInstanceRecord
  **/

  public BQInteractionRetrieveOutputModelAssistedInstanceRecord getAssistedInstanceRecord() {
    return assistedInstanceRecord;
  }

  public void setAssistedInstanceRecord(BQInteractionRetrieveOutputModelAssistedInstanceRecord assistedInstanceRecord) {
    this.assistedInstanceRecord = assistedInstanceRecord;
  }


  /**
   * Get interactionInstanceRecord
   * @return interactionInstanceRecord
  **/

  public BQInteractionRetrieveOutputModelInteractionInstanceRecord getInteractionInstanceRecord() {
    return interactionInstanceRecord;
  }

  public void setInteractionInstanceRecord(BQInteractionRetrieveOutputModelInteractionInstanceRecord interactionInstanceRecord) {
    this.interactionInstanceRecord = interactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interaction instance retrieve service call 
   * @return interactionRetrieveActionTaskReference
  **/

  public String getInteractionRetrieveActionTaskReference() {
    return interactionRetrieveActionTaskReference;
  }

  public void setInteractionRetrieveActionTaskReference(String interactionRetrieveActionTaskReference) {
    this.interactionRetrieveActionTaskReference = interactionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return interactionRetrieveActionResponse
  **/

  public String getInteractionRetrieveActionResponse() {
    return interactionRetrieveActionResponse;
  }

  public void setInteractionRetrieveActionResponse(String interactionRetrieveActionResponse) {
    this.interactionRetrieveActionResponse = interactionRetrieveActionResponse;
  }


  /**
   * Get interactionInstanceReport
   * @return interactionInstanceReport
  **/

  public BQInteractionRetrieveOutputModelInteractionInstanceReport getInteractionInstanceReport() {
    return interactionInstanceReport;
  }

  public void setInteractionInstanceReport(BQInteractionRetrieveOutputModelInteractionInstanceReport interactionInstanceReport) {
    this.interactionInstanceReport = interactionInstanceReport;
  }


  /**
   * Get interactionInstanceAnalysis
   * @return interactionInstanceAnalysis
  **/

  public BQInteractionRetrieveOutputModelInteractionInstanceAnalysis getInteractionInstanceAnalysis() {
    return interactionInstanceAnalysis;
  }

  public void setInteractionInstanceAnalysis(BQInteractionRetrieveOutputModelInteractionInstanceAnalysis interactionInstanceAnalysis) {
    this.interactionInstanceAnalysis = interactionInstanceAnalysis;
  }


}


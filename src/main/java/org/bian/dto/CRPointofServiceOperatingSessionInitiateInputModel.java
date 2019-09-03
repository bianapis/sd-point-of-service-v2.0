package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionInitiateInputModelPointofServiceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionInitiateInputModel
 */
public class CRPointofServiceOperatingSessionInitiateInputModel   {
  private String pointofServiceServicingSessionReference = null;

  private Object pointofServiceOperatingSessionInitiateActionRecord = null;

  private String pointofServiceOperatingSessionInstanceStatus = null;

  private CRPointofServiceOperatingSessionInitiateInputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return pointofServiceServicingSessionReference
  **/

  public String getPointofServiceServicingSessionReference() {
    return pointofServiceServicingSessionReference;
  }

  public void setPointofServiceServicingSessionReference(String pointofServiceServicingSessionReference) {
    this.pointofServiceServicingSessionReference = pointofServiceServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return pointofServiceOperatingSessionInitiateActionRecord
  **/

  public Object getPointofServiceOperatingSessionInitiateActionRecord() {
    return pointofServiceOperatingSessionInitiateActionRecord;
  }

  public void setPointofServiceOperatingSessionInitiateActionRecord(Object pointofServiceOperatingSessionInitiateActionRecord) {
    this.pointofServiceOperatingSessionInitiateActionRecord = pointofServiceOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Point of Service Operating Session instance (e.g. initialised, pending, active) 
   * @return pointofServiceOperatingSessionInstanceStatus
  **/

  public String getPointofServiceOperatingSessionInstanceStatus() {
    return pointofServiceOperatingSessionInstanceStatus;
  }

  public void setPointofServiceOperatingSessionInstanceStatus(String pointofServiceOperatingSessionInstanceStatus) {
    this.pointofServiceOperatingSessionInstanceStatus = pointofServiceOperatingSessionInstanceStatus;
  }


  /**
   * Get pointofServiceOperatingSessionInstanceRecord
   * @return pointofServiceOperatingSessionInstanceRecord
  **/

  public CRPointofServiceOperatingSessionInitiateInputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(CRPointofServiceOperatingSessionInitiateInputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


}


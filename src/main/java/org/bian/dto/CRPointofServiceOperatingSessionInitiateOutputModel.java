package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionInitiateOutputModelPointofServiceOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionInitiateOutputModel
 */
public class CRPointofServiceOperatingSessionInitiateOutputModel   {
  private String pointofServiceOperatingSessionInstanceReference = null;

  private String pointofServiceOperatingSessionInitiateActionReference = null;

  private Object pointofServiceOperatingSessionInitiateActionRecord = null;

  private String pointofServiceOperatingSessionInstanceStatus = null;

  private CRPointofServiceOperatingSessionInitiateOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Point of Service Operating Session instance 
   * @return pointofServiceOperatingSessionInstanceReference
  **/

  public String getPointofServiceOperatingSessionInstanceReference() {
    return pointofServiceOperatingSessionInstanceReference;
  }

  public void setPointofServiceOperatingSessionInstanceReference(String pointofServiceOperatingSessionInstanceReference) {
    this.pointofServiceOperatingSessionInstanceReference = pointofServiceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return pointofServiceOperatingSessionInitiateActionReference
  **/

  public String getPointofServiceOperatingSessionInitiateActionReference() {
    return pointofServiceOperatingSessionInitiateActionReference;
  }

  public void setPointofServiceOperatingSessionInitiateActionReference(String pointofServiceOperatingSessionInitiateActionReference) {
    this.pointofServiceOperatingSessionInitiateActionReference = pointofServiceOperatingSessionInitiateActionReference;
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

  public CRPointofServiceOperatingSessionInitiateOutputModelPointofServiceOperatingSessionInstanceRecord getPointofServiceOperatingSessionInstanceRecord() {
    return pointofServiceOperatingSessionInstanceRecord;
  }

  public void setPointofServiceOperatingSessionInstanceRecord(CRPointofServiceOperatingSessionInitiateOutputModelPointofServiceOperatingSessionInstanceRecord pointofServiceOperatingSessionInstanceRecord) {
    this.pointofServiceOperatingSessionInstanceRecord = pointofServiceOperatingSessionInstanceRecord;
  }


}


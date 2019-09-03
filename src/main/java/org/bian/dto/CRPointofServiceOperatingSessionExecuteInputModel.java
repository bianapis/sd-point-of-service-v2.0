package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionExecuteInputModel
 */
public class CRPointofServiceOperatingSessionExecuteInputModel   {
  private String pointofServiceServicingSessionReference = null;

  private String pointofServiceOperatingSessionInstanceReference = null;

  private Object pointofServiceOperatingSessionExecuteActionTaskRecord = null;

  private CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return pointofServiceOperatingSessionExecuteActionTaskRecord
  **/

  public Object getPointofServiceOperatingSessionExecuteActionTaskRecord() {
    return pointofServiceOperatingSessionExecuteActionTaskRecord;
  }

  public void setPointofServiceOperatingSessionExecuteActionTaskRecord(Object pointofServiceOperatingSessionExecuteActionTaskRecord) {
    this.pointofServiceOperatingSessionExecuteActionTaskRecord = pointofServiceOperatingSessionExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRPointofServiceOperatingSessionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}


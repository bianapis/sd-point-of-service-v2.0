package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionExecuteOutputModel
 */
public class CRPointofServiceOperatingSessionExecuteOutputModel   {
  private String pointofServiceOperatingSessionExecuteActionTaskReference = null;

  private Object pointofServiceOperatingSessionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Point of Service Operating Session instance execute service call 
   * @return pointofServiceOperatingSessionExecuteActionTaskReference
  **/

  public String getPointofServiceOperatingSessionExecuteActionTaskReference() {
    return pointofServiceOperatingSessionExecuteActionTaskReference;
  }

  public void setPointofServiceOperatingSessionExecuteActionTaskReference(String pointofServiceOperatingSessionExecuteActionTaskReference) {
    this.pointofServiceOperatingSessionExecuteActionTaskReference = pointofServiceOperatingSessionExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssistedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord
 */
public class BQAssistedRetrieveOutputModelPointofServiceOperatingSessionInstanceRecord   {
  private String servicingPositionConfigurationSetup = null;

  private String servicingPositionReference = null;

  private String servicingPositionType = null;

  private String servicingPositionLocation = null;

  private String servicingPositionFacilityType = null;

  private String servicingPositionFacilityReference = null;

  private String servicingPositionSchedule = null;

  private Object servicingPositionActivityReport = null;

  private String servicingPositionOperatingSessionStatistics = null;

  private String servicingPositionOperatingSessionReportType = null;

  private Object servicingPositionOperatingSessionReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines how the servicing position is set-up in terms of supporting functions and application connections 
   * @return servicingPositionConfigurationSetup
  **/

  public String getServicingPositionConfigurationSetup() {
    return servicingPositionConfigurationSetup;
  }

  public void setServicingPositionConfigurationSetup(String servicingPositionConfigurationSetup) {
    this.servicingPositionConfigurationSetup = servicingPositionConfigurationSetup;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_ExpjIMTGEeChad0JzLk7QA_159768178  bian-reference: PointOfService  general-info: Reference to the servicing position, used to route customer contacts 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of position (e.g. teller, relationship manager, servicing agent) 
   * @return servicingPositionType
  **/

  public String getServicingPositionType() {
    return servicingPositionType;
  }

  public void setServicingPositionType(String servicingPositionType) {
    this.servicingPositionType = servicingPositionType;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_ExpjIMTGEeChad0JzLk7QA_159768178/elements/_ExpjI8TGEeChad0JzLk7QA_-1786346298  bian-reference: PointOfService (as System).Location  general-info: The physical address/location of the position, branch reference etc. 
   * @return servicingPositionLocation
  **/

  public String getServicingPositionLocation() {
    return servicingPositionLocation;
  }

  public void setServicingPositionLocation(String servicingPositionLocation) {
    this.servicingPositionLocation = servicingPositionLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of function supported at the POS (e.g. customer servicing, FX, teller services, commissions) 
   * @return servicingPositionFacilityType
  **/

  public String getServicingPositionFacilityType() {
    return servicingPositionFacilityType;
  }

  public void setServicingPositionFacilityType(String servicingPositionFacilityType) {
    this.servicingPositionFacilityType = servicingPositionFacilityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the facilities and applications available/supporting the POS (e.g. customer servicing, FX, teller services, commissions) 
   * @return servicingPositionFacilityReference
  **/

  public String getServicingPositionFacilityReference() {
    return servicingPositionFacilityReference;
  }

  public void setServicingPositionFacilityReference(String servicingPositionFacilityReference) {
    this.servicingPositionFacilityReference = servicingPositionFacilityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The times the position will be available/staffed within this session. Allows for booking time in advance 
   * @return servicingPositionSchedule
  **/

  public String getServicingPositionSchedule() {
    return servicingPositionSchedule;
  }

  public void setServicingPositionSchedule(String servicingPositionSchedule) {
    this.servicingPositionSchedule = servicingPositionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Log of the activities during the session 
   * @return servicingPositionActivityReport
  **/

  public Object getServicingPositionActivityReport() {
    return servicingPositionActivityReport;
  }

  public void setServicingPositionActivityReport(Object servicingPositionActivityReport) {
    this.servicingPositionActivityReport = servicingPositionActivityReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service activity statistics that are maintained during the session (e.g. average contact time, wait time, service utilization, facility usage) 
   * @return servicingPositionOperatingSessionStatistics
  **/

  public String getServicingPositionOperatingSessionStatistics() {
    return servicingPositionOperatingSessionStatistics;
  }

  public void setServicingPositionOperatingSessionStatistics(String servicingPositionOperatingSessionStatistics) {
    this.servicingPositionOperatingSessionStatistics = servicingPositionOperatingSessionStatistics;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Session reports that can be accessed during the session (e.g. real-time status, session statistics) 
   * @return servicingPositionOperatingSessionReportType
  **/

  public String getServicingPositionOperatingSessionReportType() {
    return servicingPositionOperatingSessionReportType;
  }

  public void setServicingPositionOperatingSessionReportType(String servicingPositionOperatingSessionReportType) {
    this.servicingPositionOperatingSessionReportType = servicingPositionOperatingSessionReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The session activity report 
   * @return servicingPositionOperatingSessionReport
  **/

  public Object getServicingPositionOperatingSessionReport() {
    return servicingPositionOperatingSessionReport;
  }

  public void setServicingPositionOperatingSessionReport(Object servicingPositionOperatingSessionReport) {
    this.servicingPositionOperatingSessionReport = servicingPositionOperatingSessionReport;
  }


}


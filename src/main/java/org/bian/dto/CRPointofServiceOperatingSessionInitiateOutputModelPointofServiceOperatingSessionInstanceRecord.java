package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPointofServiceOperatingSessionInitiateOutputModelPointofServiceOperatingSessionInstanceRecord
 */
public class CRPointofServiceOperatingSessionInitiateOutputModelPointofServiceOperatingSessionInstanceRecord   {
  private String servicingPositionConfigurationSetup = null;

  private String servicingPositionReference = null;

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


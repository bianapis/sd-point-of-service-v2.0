/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class PointOfServiceApiController {

	@Autowired
	PointOfServiceApiService service;
	
	@Operate.Activate
	public BianResponse<SDPointofServiceActivateOutputModel> activate(@RequestBody BianRequest<SDPointofServiceActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDPointofServiceConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPointofServiceConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assisted")
	@Operate.Control
	public BianResponse<BQAssistedControlOutputModel> controlAssisted(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssistedControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlAssisted(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("automated")
	@Operate.Control
	public BianResponse<BQAutomatedControlOutputModel> controlAutomated(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAutomatedControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlAutomated(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("interaction")
	@Operate.Control
	public BianResponse<BQInteractionControlOutputModel> controlInteraction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInteractionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlInteraction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRPointofServiceOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPointofServiceOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashposition")
	@Operate.Execute
	public BianResponse<BQCashPositionExecuteOutputModel> executeCashposition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashPositionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeCashposition(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventory")
	@Operate.Execute
	public BianResponse<BQInventoryExecuteOutputModel> executeInventory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeInventory(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Execute
	public BianResponse<CRPointofServiceOperatingSessionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPointofServiceOperatingSessionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDPointofServiceFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPointofServiceFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRPointofServiceOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRPointofServiceOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assisted")
	@Operate.Initiate
	public BianResponse<BQAssistedInitiateOutputModel> initiateAssisted(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAssistedInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAssisted(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("automated")
	@Operate.Initiate
	public BianResponse<BQAutomatedInitiateOutputModel> initiateAutomated(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAutomatedInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAutomated(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Request
	public BianResponse<CRPointofServiceOperatingSessionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPointofServiceOperatingSessionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CRPointofServiceOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("assisted")
	@Operate.Retrieve
	public BianResponse<BQAssistedRetrieveOutputModel> retrieveAssisted(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssisted(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("automated")
	@Operate.Retrieve
	public BianResponse<BQAutomatedRetrieveOutputModel> retrieveAutomated(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAutomated(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("cashposition")
	@Operate.Retrieve
	public BianResponse<BQCashPositionRetrieveOutputModel> retrieveCashposition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCashposition(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("interaction")
	@Operate.Retrieve
	public BianResponse<BQInteractionRetrieveOutputModel> retrieveInteraction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInteraction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("inventory")
	@Operate.Retrieve
	public BianResponse<BQInventoryRetrieveOutputModel> retrieveInventory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventory(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDPointofServiceRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRPointofServiceOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPointofServiceOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assisted")
	@Operate.Update
	public BianResponse<BQAssistedUpdateOutputModel> updateAssisted(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssistedUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssisted(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("automated")
	@Operate.Update
	public BianResponse<BQAutomatedUpdateOutputModel> updateAutomated(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAutomatedUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAutomated(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashposition")
	@Operate.Update
	public BianResponse<BQCashPositionUpdateOutputModel> updateCashposition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashPositionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCashposition(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("interaction")
	@Operate.Update
	public BianResponse<BQInteractionUpdateOutputModel> updateInteraction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInteractionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInteraction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventory")
	@Operate.Update
	public BianResponse<BQInventoryUpdateOutputModel> updateInventory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInventory(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

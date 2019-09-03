/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PointOfServiceApiService {

	SDPointofServiceActivateOutputModel activate(SDPointofServiceActivateInputModel request);
	
	SDPointofServiceConfigureOutputModel configure(String sdReferenceId, SDPointofServiceConfigureInputModel request);
	
	BQAssistedControlOutputModel controlAssisted(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssistedControlInputModel request);
	
	BQAutomatedControlOutputModel controlAutomated(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAutomatedControlInputModel request);
	
	BQInteractionControlOutputModel controlInteraction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInteractionControlInputModel request);
	
	CRPointofServiceOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionControlInputModel request);
	
	BQCashPositionExecuteOutputModel executeCashposition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashPositionExecuteInputModel request);
	
	BQInventoryExecuteOutputModel executeInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryExecuteInputModel request);
	
	CRPointofServiceOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionExecuteInputModel request);
	
	SDPointofServiceFeedbackOutputModel feedback(String sdReferenceId, SDPointofServiceFeedbackInputModel request);
	
	CRPointofServiceOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRPointofServiceOperatingSessionInitiateInputModel request);
	
	BQAssistedInitiateOutputModel initiateAssisted(String sdReferenceId, String crReferenceId, BQAssistedInitiateInputModel request);
	
	BQAutomatedInitiateOutputModel initiateAutomated(String sdReferenceId, String crReferenceId, BQAutomatedInitiateInputModel request);
	
	CRPointofServiceOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionRequestInputModel request);
	
	CRPointofServiceOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAssistedRetrieveOutputModel retrieveAssisted(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQAutomatedRetrieveOutputModel retrieveAutomated(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCashPositionRetrieveOutputModel retrieveCashposition(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInteractionRetrieveOutputModel retrieveInteraction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInventoryRetrieveOutputModel retrieveInventory(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPointofServiceRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPointofServiceOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionUpdateInputModel request);
	
	BQAssistedUpdateOutputModel updateAssisted(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssistedUpdateInputModel request);
	
	BQAutomatedUpdateOutputModel updateAutomated(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAutomatedUpdateInputModel request);
	
	BQCashPositionUpdateOutputModel updateCashposition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashPositionUpdateInputModel request);
	
	BQInteractionUpdateOutputModel updateInteraction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInteractionUpdateInputModel request);
	
	BQInventoryUpdateOutputModel updateInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryUpdateInputModel request);
	
}

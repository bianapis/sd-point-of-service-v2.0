/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PointOfServiceApiServiceImpl implements PointOfServiceApiService {

	public SDPointofServiceActivateOutputModel activate(SDPointofServiceActivateInputModel request){
		return JsonReader.read("activate-SDPointofServiceActivateOutputModel.json",new TypeReference<SDPointofServiceActivateOutputModel>(){});
	}
	
	public SDPointofServiceConfigureOutputModel configure(String sdReferenceId, SDPointofServiceConfigureInputModel request){
		return JsonReader.read("configure-SDPointofServiceConfigureOutputModel.json",new TypeReference<SDPointofServiceConfigureOutputModel>(){});
	}
	
	public BQAssistedControlOutputModel controlAssisted(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssistedControlInputModel request){
		return JsonReader.read("control-BQAssistedControlOutputModel.json",new TypeReference<BQAssistedControlOutputModel>(){});
	}
	
	public BQAutomatedControlOutputModel controlAutomated(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAutomatedControlInputModel request){
		return JsonReader.read("control-BQAutomatedControlOutputModel.json",new TypeReference<BQAutomatedControlOutputModel>(){});
	}
	
	public BQInteractionControlOutputModel controlInteraction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInteractionControlInputModel request){
		return JsonReader.read("control-BQInteractionControlOutputModel.json",new TypeReference<BQInteractionControlOutputModel>(){});
	}
	
	public CRPointofServiceOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRPointofServiceOperatingSessionControlOutputModel.json",new TypeReference<CRPointofServiceOperatingSessionControlOutputModel>(){});
	}
	
	public BQCashPositionExecuteOutputModel executeCashposition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashPositionExecuteInputModel request){
		return JsonReader.read("execute-BQCashPositionExecuteOutputModel.json",new TypeReference<BQCashPositionExecuteOutputModel>(){});
	}
	
	public BQInventoryExecuteOutputModel executeInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryExecuteInputModel request){
		return JsonReader.read("execute-BQInventoryExecuteOutputModel.json",new TypeReference<BQInventoryExecuteOutputModel>(){});
	}
	
	public CRPointofServiceOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionExecuteInputModel request){
		return JsonReader.read("execute-CRPointofServiceOperatingSessionExecuteOutputModel.json",new TypeReference<CRPointofServiceOperatingSessionExecuteOutputModel>(){});
	}
	
	public SDPointofServiceFeedbackOutputModel feedback(String sdReferenceId, SDPointofServiceFeedbackInputModel request){
		return JsonReader.read("feedback-SDPointofServiceFeedbackOutputModel.json",new TypeReference<SDPointofServiceFeedbackOutputModel>(){});
	}
	
	public CRPointofServiceOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRPointofServiceOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRPointofServiceOperatingSessionInitiateOutputModel.json",new TypeReference<CRPointofServiceOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQAssistedInitiateOutputModel initiateAssisted(String sdReferenceId, String crReferenceId, BQAssistedInitiateInputModel request){
		return JsonReader.read("initiate-BQAssistedInitiateOutputModel.json",new TypeReference<BQAssistedInitiateOutputModel>(){});
	}
	
	public BQAutomatedInitiateOutputModel initiateAutomated(String sdReferenceId, String crReferenceId, BQAutomatedInitiateInputModel request){
		return JsonReader.read("initiate-BQAutomatedInitiateOutputModel.json",new TypeReference<BQAutomatedInitiateOutputModel>(){});
	}
	
	public CRPointofServiceOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRPointofServiceOperatingSessionRequestOutputModel.json",new TypeReference<CRPointofServiceOperatingSessionRequestOutputModel>(){});
	}
	
	public CRPointofServiceOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPointofServiceOperatingSessionRetrieveOutputModel.json",new TypeReference<CRPointofServiceOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAssistedRetrieveOutputModel retrieveAssisted(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssistedRetrieveOutputModel.json",new TypeReference<BQAssistedRetrieveOutputModel>(){});
	}
	
	public BQAutomatedRetrieveOutputModel retrieveAutomated(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAutomatedRetrieveOutputModel.json",new TypeReference<BQAutomatedRetrieveOutputModel>(){});
	}
	
	public BQCashPositionRetrieveOutputModel retrieveCashposition(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCashPositionRetrieveOutputModel.json",new TypeReference<BQCashPositionRetrieveOutputModel>(){});
	}
	
	public BQInteractionRetrieveOutputModel retrieveInteraction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInteractionRetrieveOutputModel.json",new TypeReference<BQInteractionRetrieveOutputModel>(){});
	}
	
	public BQInventoryRetrieveOutputModel retrieveInventory(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInventoryRetrieveOutputModel.json",new TypeReference<BQInventoryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPointofServiceRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPointofServiceRetrieveOutputModel.json",new TypeReference<SDPointofServiceRetrieveOutputModel>(){});
	}
	
	public CRPointofServiceOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPointofServiceOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRPointofServiceOperatingSessionUpdateOutputModel.json",new TypeReference<CRPointofServiceOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQAssistedUpdateOutputModel updateAssisted(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssistedUpdateInputModel request){
		return JsonReader.read("update-BQAssistedUpdateOutputModel.json",new TypeReference<BQAssistedUpdateOutputModel>(){});
	}
	
	public BQAutomatedUpdateOutputModel updateAutomated(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAutomatedUpdateInputModel request){
		return JsonReader.read("update-BQAutomatedUpdateOutputModel.json",new TypeReference<BQAutomatedUpdateOutputModel>(){});
	}
	
	public BQCashPositionUpdateOutputModel updateCashposition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCashPositionUpdateInputModel request){
		return JsonReader.read("update-BQCashPositionUpdateOutputModel.json",new TypeReference<BQCashPositionUpdateOutputModel>(){});
	}
	
	public BQInteractionUpdateOutputModel updateInteraction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInteractionUpdateInputModel request){
		return JsonReader.read("update-BQInteractionUpdateOutputModel.json",new TypeReference<BQInteractionUpdateOutputModel>(){});
	}
	
	public BQInventoryUpdateOutputModel updateInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryUpdateInputModel request){
		return JsonReader.read("update-BQInventoryUpdateOutputModel.json",new TypeReference<BQInventoryUpdateOutputModel>(){});
	}
	
}

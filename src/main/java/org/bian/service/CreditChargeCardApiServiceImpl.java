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
public class CreditChargeCardApiServiceImpl implements CreditChargeCardApiService {

	public Void terminate(String crReferenceId){
		return null;
	}
	
	public BillingBaseWithIdAndRoot executePostBillings(String crReferenceId, BillingBase request){
		return JsonReader.read("executePost-BillingBaseWithIdAndRoot.json",new TypeReference<BillingBaseWithIdAndRoot>(){});
	}
	
	public BillingBaseWithIdAndRoot executePutBillings(String crReferenceId, String bqReferenceId, BillingBase request){
		return JsonReader.read("executePut-BillingBaseWithIdAndRoot.json",new TypeReference<BillingBaseWithIdAndRoot>(){});
	}
	
	public CardTransactionBaseWithIdAndRoot executePostTransactions(String crReferenceId, CardTransactionBase request){
		return JsonReader.read("executePost-CardTransactionBaseWithIdAndRoot.json",new TypeReference<CardTransactionBaseWithIdAndRoot>(){});
	}
	
	public CardTransactionBaseWithIdAndRoot executePutTransactions(String crReferenceId, String bqReferenceId, CardTransactionBase request){
		return JsonReader.read("executePut-CardTransactionBaseWithIdAndRoot.json",new TypeReference<CardTransactionBaseWithIdAndRoot>(){});
	}
	
	public CreditChargeCardSetUpBaseWithIdAndStatus initiate(CreditChargeCardSetUpBase request){
		return JsonReader.read("initiate-CreditChargeCardSetUpBaseWithIdAndStatus.json",new TypeReference<CreditChargeCardSetUpBaseWithIdAndStatus>(){});
	}
	
	public CreditChargeCardRecordResponse record(String crReferenceId, CreditChargeCardRecordRequest request){
		return JsonReader.read("record-CreditChargeCardRecordResponse.json",new TypeReference<CreditChargeCardRecordResponse>(){});
	}
	
	public CreditChargeCardSetUpBaseWithIdAndStatus requestPost(CreditChargeCardSetUpBase request){
		return JsonReader.read("requestPost-CreditChargeCardSetUpBaseWithIdAndStatus.json",new TypeReference<CreditChargeCardSetUpBaseWithIdAndStatus>(){});
	}
	
	public CreditChargeCardSetUpBaseWithIdAndStatus requestPut(String crReferenceId, CreditChargeCardUpdateRequest request){
		return JsonReader.read("requestPut-CreditChargeCardSetUpBaseWithIdAndStatus.json",new TypeReference<CreditChargeCardSetUpBaseWithIdAndStatus>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BillingBaseWithIdAndRoot retrieveBillings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BillingBaseWithIdAndRoot.json",new TypeReference<BillingBaseWithIdAndRoot>(){});
	}
	
	public CardTransactionBaseWithIdAndRoot retrieveTransactions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTransactionBaseWithIdAndRoot.json",new TypeReference<CardTransactionBaseWithIdAndRoot>(){});
	}
	
	public CreditChargeCardSetUpBaseWithIdAndStatus retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CreditChargeCardSetUpBaseWithIdAndStatus.json",new TypeReference<CreditChargeCardSetUpBaseWithIdAndStatus>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CreditPlanBaseWithIdAndRoot retrieveCreditplans(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CreditPlanBaseWithIdAndRoot.json",new TypeReference<CreditPlanBaseWithIdAndRoot>(){});
	}
	
	public FeesAndPenaltiesBaseWithId retrieveFees(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FeesAndPenaltiesBaseWithId.json",new TypeReference<FeesAndPenaltiesBaseWithId>(){});
	}
	
	public CreditChargeCardInterestBaseWithId retrieveInterests(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CreditChargeCardInterestBaseWithId.json",new TypeReference<CreditChargeCardInterestBaseWithId>(){});
	}
	
	public StatementsBaseWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-StatementsBaseWithIdAndRoot.json",new TypeReference<StatementsBaseWithIdAndRoot>(){});
	}
	
	public CreditChargeCardSetUpBaseWithIdAndStatus update(String crReferenceId, CreditChargeCardUpdateRequest request){
		return JsonReader.read("update-CreditChargeCardSetUpBaseWithIdAndStatus.json",new TypeReference<CreditChargeCardSetUpBaseWithIdAndStatus>(){});
	}
	
}

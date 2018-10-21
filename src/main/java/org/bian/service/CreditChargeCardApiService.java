/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CreditChargeCardApiService {

	Void terminate(String crReferenceId);
	
	BillingBaseWithIdAndRoot executePostBillings(String crReferenceId, BillingBase request);
	
	BillingBaseWithIdAndRoot executePutBillings(String crReferenceId, String bqReferenceId, BillingBase request);
	
	CardTransactionBaseWithIdAndRoot executePostTransactions(String crReferenceId, CardTransactionBase request);
	
	CardTransactionBaseWithIdAndRoot executePutTransactions(String crReferenceId, String bqReferenceId, CardTransactionBase request);
	
	CreditChargeCardSetUpBaseWithIdAndStatus initiate(CreditChargeCardSetUpBase request);
	
	CreditChargeCardRecordResponse record(String crReferenceId, CreditChargeCardRecordRequest request);
	
	CreditChargeCardSetUpBaseWithIdAndStatus requestPost(CreditChargeCardSetUpBase request);
	
	CreditChargeCardSetUpBaseWithIdAndStatus requestPut(String crReferenceId, CreditChargeCardUpdateRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	BillingBaseWithIdAndRoot retrieveBillings(String crReferenceId, String bqReferenceId);
	
	CardTransactionBaseWithIdAndRoot retrieveTransactions(String crReferenceId, String bqReferenceId);
	
	CreditChargeCardSetUpBaseWithIdAndStatus retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	CreditPlanBaseWithIdAndRoot retrieveCreditplans(String crReferenceId, String bqReferenceId);
	
	FeesAndPenaltiesBaseWithId retrieveFees(String crReferenceId, String bqReferenceId);
	
	CreditChargeCardInterestBaseWithId retrieveInterests(String crReferenceId, String bqReferenceId);
	
	StatementsBaseWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId);
	
	CreditChargeCardSetUpBaseWithIdAndStatus update(String crReferenceId, CreditChargeCardUpdateRequest request);
	
}

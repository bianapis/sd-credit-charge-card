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
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CreditChargeCardApiController {

	@Autowired
	CreditChargeCardApiService service;
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@BQ("billings")
	@Fulfill.ExecutePost
	public BianResponse<BillingBaseWithIdAndRoot> executePostBillings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BillingBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostBillings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("billings")
	@Fulfill.ExecutePut
	public BianResponse<BillingBaseWithIdAndRoot> executePutBillings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BillingBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutBillings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactions")
	@Fulfill.ExecutePost
	public BianResponse<CardTransactionBaseWithIdAndRoot> executePostTransactions(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTransactionBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostTransactions(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactions")
	@Fulfill.ExecutePut
	public BianResponse<CardTransactionBaseWithIdAndRoot> executePutTransactions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTransactionBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutTransactions(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CreditChargeCardSetUpBaseWithIdAndStatus> initiate(@RequestBody BianRequest<CreditChargeCardSetUpBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<CreditChargeCardRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CreditChargeCardRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RequestPost
	public BianResponse<CreditChargeCardSetUpBaseWithIdAndStatus> requestPost(@RequestBody BianRequest<CreditChargeCardSetUpBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Fulfill.RequestPut
	public BianResponse<CreditChargeCardSetUpBaseWithIdAndStatus> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CreditChargeCardUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("billings")
	@Fulfill.Retrieve
	public BianResponse<BillingBaseWithIdAndRoot> retrieveBillings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBillings(crReferenceId, bqReferenceId));
	}
	
	@BQ("transactions")
	@Fulfill.Retrieve
	public BianResponse<CardTransactionBaseWithIdAndRoot> retrieveTransactions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactions(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CreditChargeCardSetUpBaseWithIdAndStatus> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("creditplans")
	@Fulfill.Retrieve
	public BianResponse<CreditPlanBaseWithIdAndRoot> retrieveCreditplans(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCreditplans(crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<FeesAndPenaltiesBaseWithId> retrieveFees(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(crReferenceId, bqReferenceId));
	}
	
	@BQ("interests")
	@Fulfill.Retrieve
	public BianResponse<CreditChargeCardInterestBaseWithId> retrieveInterests(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterests(crReferenceId, bqReferenceId));
	}
	
	@BQ("statements")
	@Fulfill.Retrieve
	public BianResponse<StatementsBaseWithIdAndRoot> retrieveStatements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStatements(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CreditChargeCardSetUpBaseWithIdAndStatus> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CreditChargeCardUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}

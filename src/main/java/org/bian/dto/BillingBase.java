package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BillingBase
 */
public class BillingBase   {
  private String billingParameters = null;

  private String accountInstanceReference = null;

  private String billingParty = null;

  private String billingAddress = null;

  private String billingPeriod = null;

  private String billingStatementReference = null;

  private String billingAmount = null;

  private String minimumRequiredPayment = null;

  private String paymentDueDate = null;

  private String transactionRecordReference = null;

  private String transactionType = null;

  private String transactionPrincipleAmount = null;

  private String transactionCounterparty = null;

  private String transactionObligation = null;

  private String transactionDateTime = null;

  private String paymentTransactionReference = null;

  private String paymentTransaction = null;

  private String paymentInstallment = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return billingParameters
  **/

  public String getBillingParameters() {
    return billingParameters;
  }

  public void setBillingParameters(String billingParameters) {
    this.billingParameters = billingParameters;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return accountInstanceReference
  **/

  public String getAccountInstanceReference() {
    return accountInstanceReference;
  }

  public void setAccountInstanceReference(String accountInstanceReference) {
    this.accountInstanceReference = accountInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return billingParty
  **/

  public String getBillingParty() {
    return billingParty;
  }

  public void setBillingParty(String billingParty) {
    this.billingParty = billingParty;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return billingAddress
  **/

  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration     
   * @return billingPeriod
  **/

  public String getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return billingStatementReference
  **/

  public String getBillingStatementReference() {
    return billingStatementReference;
  }

  public void setBillingStatementReference(String billingStatementReference) {
    this.billingStatementReference = billingStatementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return billingAmount
  **/

  public String getBillingAmount() {
    return billingAmount;
  }

  public void setBillingAmount(String billingAmount) {
    this.billingAmount = billingAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return minimumRequiredPayment
  **/

  public String getMinimumRequiredPayment() {
    return minimumRequiredPayment;
  }

  public void setMinimumRequiredPayment(String minimumRequiredPayment) {
    this.minimumRequiredPayment = minimumRequiredPayment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return paymentDueDate
  **/

  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Identifier     
   * @return transactionRecordReference
  **/

  public String getTransactionRecordReference() {
    return transactionRecordReference;
  }

  public void setTransactionRecordReference(String transactionRecordReference) {
    this.transactionRecordReference = transactionRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return transactionPrincipleAmount
  **/

  public String getTransactionPrincipleAmount() {
    return transactionPrincipleAmount;
  }

  public void setTransactionPrincipleAmount(String transactionPrincipleAmount) {
    this.transactionPrincipleAmount = transactionPrincipleAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return transactionCounterparty
  **/

  public String getTransactionCounterparty() {
    return transactionCounterparty;
  }

  public void setTransactionCounterparty(String transactionCounterparty) {
    this.transactionCounterparty = transactionCounterparty;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return transactionObligation
  **/

  public String getTransactionObligation() {
    return transactionObligation;
  }

  public void setTransactionObligation(String transactionObligation) {
    this.transactionObligation = transactionObligation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime     
   * @return transactionDateTime
  **/

  public String getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(String transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return paymentTransactionReference
  **/

  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }

  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentTransaction
  **/

  public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentInstallment
  **/

  public String getPaymentInstallment() {
    return paymentInstallment;
  }

  public void setPaymentInstallment(String paymentInstallment) {
    this.paymentInstallment = paymentInstallment;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardTransactionBaseWithIdAndRoot
 */
public class CardTransactionBaseWithIdAndRoot   {
  private String productInstanceReference = null;

  private String transactionRecordReference = null;

  private String accountInstanceReference = null;

  private String cardIssuingBankReference = null;

  private String merchantAcquiringBankReference = null;

  private String transactionType = null;

  private String transactionCurrency = null;

  private String transactionAmountType = null;

  private String transactionAmount = null;

  private String transactionMerchantReference = null;

  private String transactionLocationReference = null;

  private String transactionProductServiceReference = null;

  private String transactionDateTime = null;


  /**
   * `status: Registered` bian-reference: PaymentCardService(as Product).ProductIdentification       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY1e-MTGEeChad0JzLk7QA_2020447002)     
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.CardPaymentAcquiring.TransactionIdentification       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E3wLJ8TGEeChad0JzLk7QA_939531259/elements/_wd0NgQ93EeGeV5vP7Mvdig_1709618989)     
   * @return transactionRecordReference
  **/

  public String getTransactionRecordReference() {
    return transactionRecordReference;
  }

  public void setTransactionRecordReference(String transactionRecordReference) {
    this.transactionRecordReference = transactionRecordReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).Identification       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725)     
   * @return accountInstanceReference
  **/

  public String getAccountInstanceReference() {
    return accountInstanceReference;
  }

  public void setAccountInstanceReference(String accountInstanceReference) {
    this.accountInstanceReference = accountInstanceReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.CardPaymentPartyRole(as CardIssuer)       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Esum6cTGEeChad0JzLk7QA_3977948)       
   * @return cardIssuingBankReference
  **/

  public String getCardIssuingBankReference() {
    return cardIssuingBankReference;
  }

  public void setCardIssuingBankReference(String cardIssuingBankReference) {
    this.cardIssuingBankReference = cardIssuingBankReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.CardPaymentPartyRole(as AquirerRole)       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118cTGEeChad0JzLk7QA_1005284217)       
   * @return merchantAcquiringBankReference
  **/

  public String getMerchantAcquiringBankReference() {
    return merchantAcquiringBankReference;
  }

  public void setMerchantAcquiringBankReference(String merchantAcquiringBankReference) {
    this.merchantAcquiringBankReference = merchantAcquiringBankReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment(as Payment).Type  iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FColc8TGEeChad0JzLk7QA_1437769975)       
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment(as Payment).CurrencyExchange       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_X-mzAAYUEeKm2eoJiW4A2w_-1671012262) `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment(as Payment).CurrencyOfTransfer iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FCVqg8TGEeChad0JzLk7QA_258572872)       
   * @return transactionCurrency
  **/

  public String getTransactionCurrency() {
    return transactionCurrency;
  }

  public void setTransactionCurrency(String transactionCurrency) {
    this.transactionCurrency = transactionCurrency;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.AmountQualifier iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FBmDosTGEeChad0JzLk7QA_-1338623778/elements/_FBmDpcTGEeChad0JzLk7QA_-1697461645)       
   * @return transactionAmountType
  **/

  public String getTransactionAmountType() {
    return transactionAmountType;
  }

  public void setTransactionAmountType(String transactionAmountType) {
    this.transactionAmountType = transactionAmountType;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.DetailedAmount       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FBmDosTGEeChad0JzLk7QA_-1338623778/elements/_FBmDo8TGEeChad0JzLk7QA_-2067053593)   `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.CashBackAmount iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FBmDosTGEeChad0JzLk7QA_-1338623778/elements/_3ptQwLmAEeOpCN0IL2Swqw)       
   * @return transactionAmount
  **/

  public String getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(String transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.CardPaymentPartyRole(as MerchantRole)        iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvQ9hsTGEeChad0JzLk7QA_-1599811159)       
   * @return transactionMerchantReference
  **/

  public String getTransactionMerchantReference() {
    return transactionMerchantReference;
  }

  public void setTransactionMerchantReference(String transactionMerchantReference) {
    this.transactionMerchantReference = transactionMerchantReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment.CardPaymentAcquiring.Location       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E3wLJ8TGEeChad0JzLk7QA_939531259/elements/_I3GDcE20EeKnlYfGtmXcCw_-1822644744)       
   * @return transactionLocationReference
  **/

  public String getTransactionLocationReference() {
    return transactionLocationReference;
  }

  public void setTransactionLocationReference(String transactionLocationReference) {
    this.transactionLocationReference = transactionLocationReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment(as Payment).PaymentObligation.CommercialTrade.ProductDeliveryObligation.ProductDeliveryOffset.Product iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E23aUsTGEeChad0JzLk7QA_482851588/elements/_E23aV8TGEeChad0JzLk7QA_253240170)       
   * @return transactionProductServiceReference
  **/

  public String getTransactionProductServiceReference() {
    return transactionProductServiceReference;
  }

  public void setTransactionProductServiceReference(String transactionProductServiceReference) {
    this.transactionProductServiceReference = transactionProductServiceReference;
  }


  /**
   * Get transactionDateTime
   * @return transactionDateTime
  **/

  public String getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(String transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


}


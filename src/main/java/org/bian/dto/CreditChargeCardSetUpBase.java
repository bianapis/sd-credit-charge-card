package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditChargeCardSetUpBase
 */
public class CreditChargeCardSetUpBase   {
  private String productServiceReference = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String involvedPartyReference = null;

  private String involvedPartyObligationEntitlement = null;

  private String partyReference = null;

  private String issuedDeviceType = null;

  private String issuedDeviceReference = null;

  private String cardType = null;

  private String cardAccountCurrency = null;

  private String secondaryBillingCurrency = null;

  private String cardAccountLimits = null;

  private String allowedAccess = null;

  private String configurationOptions = null;

  private String taxReference = null;


  /**
   * `status: Registered` bian-reference: PaymentCardService(as Product) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304)     
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Payment.CardPaymentPartyRole(as CardholderRole) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Esum6MTGEeChad0JzLk7QA_-1553787351) `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).AccountPartyRole(as AccountOwnerRole) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046)       
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).AccountPartyRole(as AccountServicerRole)(as Role).Player(as Party).Location iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909)     
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement(as Agreement).RoleInAgreement(as GuaranteePartyRole) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_G7hIgGcwEeOYlMxMjJVrrQ)     
   * @return involvedPartyReference
  **/

  public String getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(String involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PaymentCardService.PaymentCardAgreement(as Agreement).Obligation     
   * @return involvedPartyObligationEntitlement
  **/

  public String getInvolvedPartyObligationEntitlement() {
    return involvedPartyObligationEntitlement;
  }

  public void setInvolvedPartyObligationEntitlement(String involvedPartyObligationEntitlement) {
    this.involvedPartyObligationEntitlement = involvedPartyObligationEntitlement;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).AccountPartyRole(as AccountOwnerRole).Player(as Party).Identification.LEI iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw) `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).AccountPartyRole(as AccountOwnerRole).Player(as Party).Identification.LEI iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw)       
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard(as Resource).Type        
   * @return issuedDeviceType
  **/

  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard(as Resource).ResourceIdentification        
   * @return issuedDeviceReference
  **/

  public String getIssuedDeviceReference() {
    return issuedDeviceReference;
  }

  public void setIssuedDeviceReference(String issuedDeviceReference) {
    this.issuedDeviceReference = issuedDeviceReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Type iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FColdMTGEeChad0JzLk7QA_-190433744/elements/_FC7gYsTGEeChad0JzLk7QA_-190433737)         
   * @return cardType
  **/

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).ReportingCurrency iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E4gZEsTGEeChad0JzLk7QA_-985441548)         `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardCurrencyCode iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FColdMTGEeChad0JzLk7QA_-190433744/elements/_DMqO0NaGEeODvZST7nrYEw) 
   * @return cardAccountCurrency
  **/

  public String getCardAccountCurrency() {
    return cardAccountCurrency;
  }

  public void setCardAccountCurrency(String cardAccountCurrency) {
    this.cardAccountCurrency = cardAccountCurrency;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).BaseCurrency iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_-69C4IDWEeKn8fN1QdMTXQ_-1456663445)         
   * @return secondaryBillingCurrency
  **/

  public String getSecondaryBillingCurrency() {
    return secondaryBillingCurrency;
  }

  public void setSecondaryBillingCurrency(String secondaryBillingCurrency) {
    this.secondaryBillingCurrency = secondaryBillingCurrency;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Limit iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FColdMTGEeChad0JzLk7QA_-190433744/elements/_XBWyQMmoEeGME5XqzhtJIg_1180664615) `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CreditAvailableAmount iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FColdMTGEeChad0JzLk7QA_-190433744/elements/_weaDYQ93EeGeV5vP7Mvdig_69336733)       
   * @return cardAccountLimits
  **/

  public String getCardAccountLimits() {
    return cardAccountLimits;
  }

  public void setCardAccountLimits(String cardAccountLimits) {
    this.cardAccountLimits = cardAccountLimits;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E10RdcTGEeChad0JzLk7QA_-917313471/elements/_E10RdsTGEeChad0JzLk7QA_-1031152537) bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).AccountRestriction.RestrictionType `status: Provisionally Registered` bian-reference: (PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount(as Account).AccountRestriction.RestrictionDescription)       
   * @return allowedAccess
  **/

  public String getAllowedAccess() {
    return allowedAccess;
  }

  public void setAllowedAccess(String allowedAccess) {
    this.allowedAccess = allowedAccess;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PaymentCardService(as Product).AvailableOption `status: Provisionally Registered` bian-reference: PaymentCardService(as Product).ProductUsage.SelectedOption  
   * @return configurationOptions
  **/

  public String getConfigurationOptions() {
    return configurationOptions;
  }

  public void setConfigurationOptions(String configurationOptions) {
    this.configurationOptions = configurationOptions;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount.Tax iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g)     
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


}


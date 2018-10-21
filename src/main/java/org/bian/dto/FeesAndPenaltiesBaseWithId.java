package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FeesAndPenaltiesBaseWithId
 */
public class FeesAndPenaltiesBaseWithId   {
  private String productInstanceReference = null;

  private String feeReference = null;

  private String feeConfiguration = null;

  private String feeType = null;

  private String feeCharge = null;

  private String feeProjectionsCommitments = null;


  /**
   * `status: Registered` bian-reference: PaymentCardService(as Product).ProductIdentification iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY1e-MTGEeChad0JzLk7QA_2020447002)     
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment(as Payment).Adjustment       iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_uwRncGnpEeG7Npk4oYag0A_1876689712) `status: Provisionally Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount.Adjustment 
   * @return feeReference
  **/

  public String getFeeReference() {
    return feeReference;
  }

  public void setFeeReference(String feeReference) {
    this.feeReference = feeReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardSpecificAdjustment     
   * @return feeConfiguration
  **/

  public String getFeeConfiguration() {
    return feeConfiguration;
  }

  public void setFeeConfiguration(String feeConfiguration) {
    this.feeConfiguration = feeConfiguration;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment(as Payment).Adjustment.Type iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816) `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount.Adjustment.Type iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816) `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount.Charges.ChargeType iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FMBK9sTGEeChad0JzLk7QA_-398781908/elements/_FMK79cTGEeChad0JzLk7QA_-398781898)       
   * @return feeType
  **/

  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.CardPayment(as Payment).Adjustment iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_uwRncGnpEeG7Npk4oYag0A_1876689712) `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.RelatedAccount.Charges iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_uwRncGnpEeG7Npk4oYag0A_1876689712)       
   * @return feeCharge
  **/

  public String getFeeCharge() {
    return feeCharge;
  }

  public void setFeeCharge(String feeCharge) {
    this.feeCharge = feeCharge;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return feeProjectionsCommitments
  **/

  public String getFeeProjectionsCommitments() {
    return feeProjectionsCommitments;
  }

  public void setFeeProjectionsCommitments(String feeProjectionsCommitments) {
    this.feeProjectionsCommitments = feeProjectionsCommitments;
  }


}


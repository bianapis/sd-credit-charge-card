package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditChargeCardInterestBaseWithId
 */
public class CreditChargeCardInterestBaseWithId   {
  private String productInstanceReference = null;

  private String interestRateReference = null;

  private String interestRateConfiguration = null;

  private String applicableInterestRates = null;

  private String rateApplicationSchedule = null;


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
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.Rate iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_9cTGEeChad0JzLk7QA_-447375958)       
   * @return interestRateReference
  **/

  public String getInterestRateReference() {
    return interestRateReference;
  }

  public void setInterestRateReference(String interestRateReference) {
    this.interestRateReference = interestRateReference;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.InterestCalculation iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-sTGEeChad0JzLk7QA_-1579176164) `status: Registered`           bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.TypeOfInterest iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591)         
   * @return interestRateConfiguration
  **/

  public String getInterestRateConfiguration() {
    return interestRateConfiguration;
  }

  public void setInterestRateConfiguration(String interestRateConfiguration) {
    this.interestRateConfiguration = interestRateConfiguration;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.InterestCalculation.Rate iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_FXgCMMTGEeChad0JzLk7QA_-398781619)   `status: Registered`           bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.InterestCalculation.RateType   iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_Fb9rccTGEeChad0JzLk7QA_1124003257)         
   * @return applicableInterestRates
  **/

  public String getApplicableInterestRates() {
    return applicableInterestRates;
  }

  public void setApplicableInterestRates(String applicableInterestRates) {
    this.applicableInterestRates = applicableInterestRates;
  }


  /**
   * `status: Registered` bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.InterestCalculation.CalculationDate iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_wfdMQw93EeGeV5vP7Mvdig_-121041167) `status: Registered`           bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.InterestCalculation.CalculationFrequency iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FXWRMsTGEeChad0JzLk7QA_-398781879/elements/_FXWRM8TGEeChad0JzLk7QA_2089104514)   `status: Registered`           bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.InterestCalculation.InterestAccrualDate   iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY1e-MTGEeChad0JzLk7QA_2020447002)   `status: Registered`           bian-reference: PaymentCardService.PaymentCardAgreement.PaymentCard.Interest.InterestCalculation.PaymentFrequency      iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_uwRncGnpEeG7Npk4oYag0A_1876689712)         
   * @return rateApplicationSchedule
  **/

  public String getRateApplicationSchedule() {
    return rateApplicationSchedule;
  }

  public void setRateApplicationSchedule(String rateApplicationSchedule) {
    this.rateApplicationSchedule = rateApplicationSchedule;
  }


}


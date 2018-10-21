package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditPlanBaseWithIdAndRoot
 */
public class CreditPlanBaseWithIdAndRoot   {
  private String productInstanceReference = null;

  private String creditPlanReference = null;

  private String creditPlanType = null;

  private String creditPlanTerms = null;

  private String creditPlanAccount = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return creditPlanReference
  **/

  public String getCreditPlanReference() {
    return creditPlanReference;
  }

  public void setCreditPlanReference(String creditPlanReference) {
    this.creditPlanReference = creditPlanReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return creditPlanType
  **/

  public String getCreditPlanType() {
    return creditPlanType;
  }

  public void setCreditPlanType(String creditPlanType) {
    this.creditPlanType = creditPlanType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return creditPlanTerms
  **/

  public String getCreditPlanTerms() {
    return creditPlanTerms;
  }

  public void setCreditPlanTerms(String creditPlanTerms) {
    this.creditPlanTerms = creditPlanTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return creditPlanAccount
  **/

  public String getCreditPlanAccount() {
    return creditPlanAccount;
  }

  public void setCreditPlanAccount(String creditPlanAccount) {
    this.creditPlanAccount = creditPlanAccount;
  }


}


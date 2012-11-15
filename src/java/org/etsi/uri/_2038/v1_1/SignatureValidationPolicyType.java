
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureValidationPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureValidationPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SigningPeriod" type="{http://uri.etsi.org/2038/v1.1.1#}TimePeriodType"/>
 *         &lt;element name="CommonRules" type="{http://uri.etsi.org/2038/v1.1.1#}CommonRulesType"/>
 *         &lt;element name="CommitmentRules" type="{http://uri.etsi.org/2038/v1.1.1#}CommitmentRulesListType"/>
 *         &lt;element name="SignPolicyExtensions" type="{http://uri.etsi.org/2038/v1.1.1#}SignPolExtensionsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureValidationPolicyType", propOrder = {
    "signingPeriod",
    "commonRules",
    "commitmentRules",
    "signPolicyExtensions"
})
public class SignatureValidationPolicyType {

    @XmlElement(name = "SigningPeriod", required = true)
    protected TimePeriodType signingPeriod;
    @XmlElement(name = "CommonRules", required = true)
    protected CommonRulesType commonRules;
    @XmlElement(name = "CommitmentRules", required = true)
    protected CommitmentRulesListType commitmentRules;
    @XmlElement(name = "SignPolicyExtensions")
    protected SignPolExtensionsListType signPolicyExtensions;

    /**
     * Gets the value of the signingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getSigningPeriod() {
        return signingPeriod;
    }

    /**
     * Sets the value of the signingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setSigningPeriod(TimePeriodType value) {
        this.signingPeriod = value;
    }

    /**
     * Gets the value of the commonRules property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.CommonRulesType }
     *     
     */
    public CommonRulesType getCommonRules() {
        return commonRules;
    }

    /**
     * Sets the value of the commonRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.CommonRulesType }
     *     
     */
    public void setCommonRules(CommonRulesType value) {
        this.commonRules = value;
    }

    /**
     * Gets the value of the commitmentRules property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.CommitmentRulesListType }
     *     
     */
    public CommitmentRulesListType getCommitmentRules() {
        return commitmentRules;
    }

    /**
     * Sets the value of the commitmentRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.CommitmentRulesListType }
     *     
     */
    public void setCommitmentRules(CommitmentRulesListType value) {
        this.commitmentRules = value;
    }

    /**
     * Gets the value of the signPolicyExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public SignPolExtensionsListType getSignPolicyExtensions() {
        return signPolicyExtensions;
    }

    /**
     * Sets the value of the signPolicyExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public void setSignPolicyExtensions(SignPolExtensionsListType value) {
        this.signPolicyExtensions = value;
    }

}


package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelCommitmentTypes" type="{http://uri.etsi.org/2038/v1.1.1#}SelectedCommitmentTypeList"/>
 *         &lt;element name="SignerAndVerifierRules" type="{http://uri.etsi.org/2038/v1.1.1#}SignerAndVerifierRulesType" minOccurs="0"/>
 *         &lt;element name="SigningCertTrustCondition" type="{http://uri.etsi.org/2038/v1.1.1#}SigningCertTrustConditionType" minOccurs="0"/>
 *         &lt;element name="TimeStampTrustCondition" type="{http://uri.etsi.org/2038/v1.1.1#}TimeStampTrustConditionType" minOccurs="0"/>
 *         &lt;element name="RoleTrustCondition" type="{http://uri.etsi.org/2038/v1.1.1#}RoleTrustConditionType" minOccurs="0"/>
 *         &lt;element name="AlgorithmConstraintSet" type="{http://uri.etsi.org/2038/v1.1.1#}AlgorithmConstraintSetType" minOccurs="0"/>
 *         &lt;element name="SignPolExtensions" type="{http://uri.etsi.org/2038/v1.1.1#}SignPolExtensionsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentRuleType", propOrder = {
    "selCommitmentTypes",
    "signerAndVerifierRules",
    "signingCertTrustCondition",
    "timeStampTrustCondition",
    "roleTrustCondition",
    "algorithmConstraintSet",
    "signPolExtensions"
})
public class CommitmentRuleType {

    @XmlElement(name = "SelCommitmentTypes", required = true)
    protected SelectedCommitmentTypeList selCommitmentTypes;
    @XmlElement(name = "SignerAndVerifierRules")
    protected SignerAndVerifierRulesType signerAndVerifierRules;
    @XmlElement(name = "SigningCertTrustCondition")
    protected SigningCertTrustConditionType signingCertTrustCondition;
    @XmlElement(name = "TimeStampTrustCondition")
    protected TimeStampTrustConditionType timeStampTrustCondition;
    @XmlElement(name = "RoleTrustCondition")
    protected RoleTrustConditionType roleTrustCondition;
    @XmlElement(name = "AlgorithmConstraintSet")
    protected AlgorithmConstraintSetType algorithmConstraintSet;
    @XmlElement(name = "SignPolExtensions")
    protected SignPolExtensionsListType signPolExtensions;

    /**
     * Gets the value of the selCommitmentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedCommitmentTypeList }
     *     
     */
    public SelectedCommitmentTypeList getSelCommitmentTypes() {
        return selCommitmentTypes;
    }

    /**
     * Sets the value of the selCommitmentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedCommitmentTypeList }
     *     
     */
    public void setSelCommitmentTypes(SelectedCommitmentTypeList value) {
        this.selCommitmentTypes = value;
    }

    /**
     * Gets the value of the signerAndVerifierRules property.
     * 
     * @return
     *     possible object is
     *     {@link SignerAndVerifierRulesType }
     *     
     */
    public SignerAndVerifierRulesType getSignerAndVerifierRules() {
        return signerAndVerifierRules;
    }

    /**
     * Sets the value of the signerAndVerifierRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerAndVerifierRulesType }
     *     
     */
    public void setSignerAndVerifierRules(SignerAndVerifierRulesType value) {
        this.signerAndVerifierRules = value;
    }

    /**
     * Gets the value of the signingCertTrustCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SigningCertTrustConditionType }
     *     
     */
    public SigningCertTrustConditionType getSigningCertTrustCondition() {
        return signingCertTrustCondition;
    }

    /**
     * Sets the value of the signingCertTrustCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningCertTrustConditionType }
     *     
     */
    public void setSigningCertTrustCondition(SigningCertTrustConditionType value) {
        this.signingCertTrustCondition = value;
    }

    /**
     * Gets the value of the timeStampTrustCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TimeStampTrustConditionType }
     *     
     */
    public TimeStampTrustConditionType getTimeStampTrustCondition() {
        return timeStampTrustCondition;
    }

    /**
     * Sets the value of the timeStampTrustCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStampTrustConditionType }
     *     
     */
    public void setTimeStampTrustCondition(TimeStampTrustConditionType value) {
        this.timeStampTrustCondition = value;
    }

    /**
     * Gets the value of the roleTrustCondition property.
     * 
     * @return
     *     possible object is
     *     {@link RoleTrustConditionType }
     *     
     */
    public RoleTrustConditionType getRoleTrustCondition() {
        return roleTrustCondition;
    }

    /**
     * Sets the value of the roleTrustCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleTrustConditionType }
     *     
     */
    public void setRoleTrustCondition(RoleTrustConditionType value) {
        this.roleTrustCondition = value;
    }

    /**
     * Gets the value of the algorithmConstraintSet property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.AlgorithmConstraintSetType }
     *     
     */
    public AlgorithmConstraintSetType getAlgorithmConstraintSet() {
        return algorithmConstraintSet;
    }

    /**
     * Sets the value of the algorithmConstraintSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.AlgorithmConstraintSetType }
     *     
     */
    public void setAlgorithmConstraintSet(AlgorithmConstraintSetType value) {
        this.algorithmConstraintSet = value;
    }

    /**
     * Gets the value of the signPolExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public SignPolExtensionsListType getSignPolExtensions() {
        return signPolExtensions;
    }

    /**
     * Sets the value of the signPolExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public void setSignPolExtensions(SignPolExtensionsListType value) {
        this.signPolExtensions = value;
    }

}

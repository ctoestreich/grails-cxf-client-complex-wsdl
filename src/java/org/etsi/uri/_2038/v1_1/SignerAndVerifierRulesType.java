
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerAndVerifierRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerAndVerifierRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerRules" type="{http://uri.etsi.org/2038/v1.1.1#}SignerRulesType"/>
 *         &lt;element name="VerifierRules" type="{http://uri.etsi.org/2038/v1.1.1#}VerifierRulesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerAndVerifierRulesType", propOrder = {
    "signerRules",
    "verifierRules"
})
public class SignerAndVerifierRulesType {

    @XmlElement(name = "SignerRules", required = true)
    protected SignerRulesType signerRules;
    @XmlElement(name = "VerifierRules", required = true)
    protected VerifierRulesType verifierRules;

    /**
     * Gets the value of the signerRules property.
     * 
     * @return
     *     possible object is
     *     {@link SignerRulesType }
     *     
     */
    public SignerRulesType getSignerRules() {
        return signerRules;
    }

    /**
     * Sets the value of the signerRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRulesType }
     *     
     */
    public void setSignerRules(SignerRulesType value) {
        this.signerRules = value;
    }

    /**
     * Gets the value of the verifierRules property.
     * 
     * @return
     *     possible object is
     *     {@link VerifierRulesType }
     *     
     */
    public VerifierRulesType getVerifierRules() {
        return verifierRules;
    }

    /**
     * Sets the value of the verifierRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifierRulesType }
     *     
     */
    public void setVerifierRules(VerifierRulesType value) {
        this.verifierRules = value;
    }

}

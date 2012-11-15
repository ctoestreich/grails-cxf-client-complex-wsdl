
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifierRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifierRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MandatedQUnsignedProperties" type="{http://uri.etsi.org/2038/v1.1.1#}QPropertiesListType"/>
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
@XmlType(name = "VerifierRulesType", propOrder = {
    "mandatedQUnsignedProperties",
    "signPolicyExtensions"
})
public class VerifierRulesType {

    @XmlElement(name = "MandatedQUnsignedProperties", required = true)
    protected QPropertiesListType mandatedQUnsignedProperties;
    @XmlElement(name = "SignPolicyExtensions")
    protected SignPolExtensionsListType signPolicyExtensions;

    /**
     * Gets the value of the mandatedQUnsignedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.QPropertiesListType }
     *     
     */
    public QPropertiesListType getMandatedQUnsignedProperties() {
        return mandatedQUnsignedProperties;
    }

    /**
     * Sets the value of the mandatedQUnsignedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.QPropertiesListType }
     *     
     */
    public void setMandatedQUnsignedProperties(QPropertiesListType value) {
        this.mandatedQUnsignedProperties = value;
    }

    /**
     * Gets the value of the signPolicyExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.SignPolExtensionsListType }
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
     *     {@link org.etsi.uri._2038.v1_1.SignPolExtensionsListType }
     *     
     */
    public void setSignPolicyExtensions(SignPolExtensionsListType value) {
        this.signPolicyExtensions = value;
    }

}

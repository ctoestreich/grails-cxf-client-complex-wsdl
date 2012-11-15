
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalSignedObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MandatedSignedQProperties" type="{http://uri.etsi.org/2038/v1.1.1#}QPropertiesListType"/>
 *         &lt;element name="MandatedUnsignedQProperties" type="{http://uri.etsi.org/2038/v1.1.1#}QPropertiesListType"/>
 *         &lt;element name="MandatedCertificateRef" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateReqType"/>
 *         &lt;element name="MandatedCertificateInfo" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateReqType"/>
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
@XmlType(name = "SignerRulesType", propOrder = {
    "externalSignedObjects",
    "mandatedSignedQProperties",
    "mandatedUnsignedQProperties",
    "mandatedCertificateRef",
    "mandatedCertificateInfo",
    "signPolicyExtensions"
})
public class SignerRulesType {

    @XmlElement(name = "ExternalSignedObjects")
    protected Boolean externalSignedObjects;
    @XmlElement(name = "MandatedSignedQProperties", required = true)
    protected QPropertiesListType mandatedSignedQProperties;
    @XmlElement(name = "MandatedUnsignedQProperties", required = true)
    protected QPropertiesListType mandatedUnsignedQProperties;
    @XmlElement(name = "MandatedCertificateRef", required = true)
    protected CertificateReqType mandatedCertificateRef;
    @XmlElement(name = "MandatedCertificateInfo", required = true)
    protected CertificateReqType mandatedCertificateInfo;
    @XmlElement(name = "SignPolicyExtensions")
    protected SignPolExtensionsListType signPolicyExtensions;

    /**
     * Gets the value of the externalSignedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalSignedObjects() {
        return externalSignedObjects;
    }

    /**
     * Sets the value of the externalSignedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalSignedObjects(Boolean value) {
        this.externalSignedObjects = value;
    }

    /**
     * Gets the value of the mandatedSignedQProperties property.
     * 
     * @return
     *     possible object is
     *     {@link QPropertiesListType }
     *     
     */
    public QPropertiesListType getMandatedSignedQProperties() {
        return mandatedSignedQProperties;
    }

    /**
     * Sets the value of the mandatedSignedQProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QPropertiesListType }
     *     
     */
    public void setMandatedSignedQProperties(QPropertiesListType value) {
        this.mandatedSignedQProperties = value;
    }

    /**
     * Gets the value of the mandatedUnsignedQProperties property.
     * 
     * @return
     *     possible object is
     *     {@link QPropertiesListType }
     *     
     */
    public QPropertiesListType getMandatedUnsignedQProperties() {
        return mandatedUnsignedQProperties;
    }

    /**
     * Sets the value of the mandatedUnsignedQProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QPropertiesListType }
     *     
     */
    public void setMandatedUnsignedQProperties(QPropertiesListType value) {
        this.mandatedUnsignedQProperties = value;
    }

    /**
     * Gets the value of the mandatedCertificateRef property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateReqType }
     *     
     */
    public CertificateReqType getMandatedCertificateRef() {
        return mandatedCertificateRef;
    }

    /**
     * Sets the value of the mandatedCertificateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateReqType }
     *     
     */
    public void setMandatedCertificateRef(CertificateReqType value) {
        this.mandatedCertificateRef = value;
    }

    /**
     * Gets the value of the mandatedCertificateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateReqType }
     *     
     */
    public CertificateReqType getMandatedCertificateInfo() {
        return mandatedCertificateInfo;
    }

    /**
     * Sets the value of the mandatedCertificateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateReqType }
     *     
     */
    public void setMandatedCertificateInfo(CertificateReqType value) {
        this.mandatedCertificateInfo = value;
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

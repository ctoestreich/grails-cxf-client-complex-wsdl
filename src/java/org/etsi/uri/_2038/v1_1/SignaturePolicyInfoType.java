
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;


/**
 * <p>Java class for SignaturePolicyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignPolicyIdentifier" type="{http://uri.etsi.org/01903/v1.2.2#}ObjectIdentifierType"/>
 *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PolicyIssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldOfApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignatureValidationPolicy" type="{http://uri.etsi.org/2038/v1.1.1#}SignatureValidationPolicyType"/>
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
@XmlType(name = "SignaturePolicyInfoType", propOrder = {
    "signPolicyIdentifier",
    "dateOfIssue",
    "policyIssuerName",
    "fieldOfApplication",
    "signatureValidationPolicy",
    "signPolExtensions"
})
public class SignaturePolicyInfoType {

    @XmlElement(name = "SignPolicyIdentifier", required = true)
    protected ObjectIdentifierType signPolicyIdentifier;
    @XmlElement(name = "DateOfIssue", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfIssue;
    @XmlElement(name = "PolicyIssuerName", required = true)
    protected String policyIssuerName;
    @XmlElement(name = "FieldOfApplication", required = true)
    protected String fieldOfApplication;
    @XmlElement(name = "SignatureValidationPolicy", required = true)
    protected SignatureValidationPolicyType signatureValidationPolicy;
    @XmlElement(name = "SignPolExtensions")
    protected SignPolExtensionsListType signPolExtensions;

    /**
     * Gets the value of the signPolicyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSignPolicyIdentifier() {
        return signPolicyIdentifier;
    }

    /**
     * Sets the value of the signPolicyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.ObjectIdentifierType }
     *     
     */
    public void setSignPolicyIdentifier(ObjectIdentifierType value) {
        this.signPolicyIdentifier = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setDateOfIssue(XMLGregorianCalendar value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the policyIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyIssuerName() {
        return policyIssuerName;
    }

    /**
     * Sets the value of the policyIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyIssuerName(String value) {
        this.policyIssuerName = value;
    }

    /**
     * Gets the value of the fieldOfApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldOfApplication() {
        return fieldOfApplication;
    }

    /**
     * Sets the value of the fieldOfApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldOfApplication(String value) {
        this.fieldOfApplication = value;
    }

    /**
     * Gets the value of the signatureValidationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValidationPolicyType }
     *     
     */
    public SignatureValidationPolicyType getSignatureValidationPolicy() {
        return signatureValidationPolicy;
    }

    /**
     * Sets the value of the signatureValidationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValidationPolicyType }
     *     
     */
    public void setSignatureValidationPolicy(SignatureValidationPolicyType value) {
        this.signatureValidationPolicy = value;
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

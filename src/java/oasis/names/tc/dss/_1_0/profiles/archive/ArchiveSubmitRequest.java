
package oasis.names.tc.dss._1_0.profiles.archive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.InputDocuments;
import oasis.names.tc.dss._1_0.core.schema.OptionalInputs;
import oasis.names.tc.dss._1_0.core.schema.SignatureObjectType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}OptionalInputs" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}InputDocuments" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureObject"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Profile" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionalInputs",
    "inputDocuments",
    "signatureObject"
})
@XmlRootElement(name = "ArchiveSubmitRequest")
public class ArchiveSubmitRequest {

    @XmlElement(name = "OptionalInputs", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected OptionalInputs optionalInputs;
    @XmlElement(name = "InputDocuments", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected InputDocuments inputDocuments;
    @XmlElement(name = "SignatureObject", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", required = true)
    protected SignatureObjectType signatureObject;
    @XmlAttribute(name = "RequestID")
    protected String requestID;
    @XmlAttribute(name = "Profile")
    @XmlSchemaType(name = "anyURI")
    protected String profile;

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.OptionalInputs }
     *     
     */
    public OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.OptionalInputs }
     *     
     */
    public void setOptionalInputs(OptionalInputs value) {
        this.optionalInputs = value;
    }

    /**
     * Gets the value of the inputDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.InputDocuments }
     *     
     */
    public InputDocuments getInputDocuments() {
        return inputDocuments;
    }

    /**
     * Sets the value of the inputDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.InputDocuments }
     *     
     */
    public void setInputDocuments(InputDocuments value) {
        this.inputDocuments = value;
    }

    /**
     * Gets the value of the signatureObject property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.SignatureObjectType }
     *     
     */
    public SignatureObjectType getSignatureObject() {
        return signatureObject;
    }

    /**
     * Sets the value of the signatureObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.SignatureObjectType }
     *     
     */
    public void setSignatureObject(SignatureObjectType value) {
        this.signatureObject = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

}

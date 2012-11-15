
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;


/**
 * <p>Java class for CommitmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitmentIdentifier" type="{http://uri.etsi.org/01903/v1.2.2#}ObjectIdentifierType"/>
 *         &lt;element name="FieldOfApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Semantics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentType", propOrder = {
    "commitmentIdentifier",
    "fieldOfApplication",
    "semantics"
})
public class CommitmentType {

    @XmlElement(name = "CommitmentIdentifier", required = true)
    protected ObjectIdentifierType commitmentIdentifier;
    @XmlElement(name = "FieldOfApplication")
    protected String fieldOfApplication;
    @XmlElement(name = "Semantics")
    protected String semantics;

    /**
     * Gets the value of the commitmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getCommitmentIdentifier() {
        return commitmentIdentifier;
    }

    /**
     * Sets the value of the commitmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setCommitmentIdentifier(ObjectIdentifierType value) {
        this.commitmentIdentifier = value;
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
     * Gets the value of the semantics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemantics() {
        return semantics;
    }

    /**
     * Sets the value of the semantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemantics(String value) {
        this.semantics = value;
    }

}

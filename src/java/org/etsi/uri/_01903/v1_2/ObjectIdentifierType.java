
package org.etsi.uri._01903.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.profiles.xss.SignaturePolicy;


/**
 * <p>Java class for ObjectIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://uri.etsi.org/01903/v1.2.2#}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentationReferences" type="{http://uri.etsi.org/01903/v1.2.2#}DocumentationReferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectIdentifierType", propOrder = {
    "identifier",
    "description",
    "documentationReferences"
})
@XmlSeeAlso({
    SignaturePolicy.class
})
public class ObjectIdentifierType {

    @XmlElement(name = "Identifier", required = true)
    protected IdentifierType identifier;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DocumentationReferences")
    protected DocumentationReferencesType documentationReferences;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.IdentifierType }
     *     
     */
    public IdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.IdentifierType }
     *     
     */
    public void setIdentifier(IdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the documentationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.DocumentationReferencesType }
     *     
     */
    public DocumentationReferencesType getDocumentationReferences() {
        return documentationReferences;
    }

    /**
     * Sets the value of the documentationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.DocumentationReferencesType }
     *     
     */
    public void setDocumentationReferences(DocumentationReferencesType value) {
        this.documentationReferences = value;
    }

}

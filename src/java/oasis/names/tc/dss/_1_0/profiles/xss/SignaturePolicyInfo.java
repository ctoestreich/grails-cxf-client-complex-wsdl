
package oasis.names.tc.dss._1_0.profiles.xss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;
import org.w3._2000._09.xmldsig.TransformsType;


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
 *         &lt;element name="SignaturePolicyIssuer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SignaturePolicyIdentifier" type="{http://uri.etsi.org/01903/v1.2.2#}ObjectIdentifierType"/>
 *         &lt;element name="SignaturePolicyDigestAlgorithm" type="{http://uri.etsi.org/01903/v1.2.2#}ObjectIdentifierType"/>
 *         &lt;element name="SignaturePolicyDigestValue" type="{http://www.w3.org/2000/09/xmldsig#}DigestValueType"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signaturePolicyIssuer",
    "signaturePolicyIdentifier",
    "signaturePolicyDigestAlgorithm",
    "signaturePolicyDigestValue",
    "transforms"
})
@XmlRootElement(name = "SignaturePolicyInfo")
public class SignaturePolicyInfo {

    @XmlElement(name = "SignaturePolicyIssuer", required = true)
    protected String signaturePolicyIssuer;
    @XmlElement(name = "SignaturePolicyIdentifier", required = true)
    protected ObjectIdentifierType signaturePolicyIdentifier;
    @XmlElement(name = "SignaturePolicyDigestAlgorithm", required = true)
    protected ObjectIdentifierType signaturePolicyDigestAlgorithm;
    @XmlElement(name = "SignaturePolicyDigestValue", required = true)
    protected byte[] signaturePolicyDigestValue;
    @XmlElement(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected TransformsType transforms;

    /**
     * Gets the value of the signaturePolicyIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturePolicyIssuer() {
        return signaturePolicyIssuer;
    }

    /**
     * Sets the value of the signaturePolicyIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturePolicyIssuer(String value) {
        this.signaturePolicyIssuer = value;
    }

    /**
     * Gets the value of the signaturePolicyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSignaturePolicyIdentifier() {
        return signaturePolicyIdentifier;
    }

    /**
     * Sets the value of the signaturePolicyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setSignaturePolicyIdentifier(ObjectIdentifierType value) {
        this.signaturePolicyIdentifier = value;
    }

    /**
     * Gets the value of the signaturePolicyDigestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSignaturePolicyDigestAlgorithm() {
        return signaturePolicyDigestAlgorithm;
    }

    /**
     * Sets the value of the signaturePolicyDigestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setSignaturePolicyDigestAlgorithm(ObjectIdentifierType value) {
        this.signaturePolicyDigestAlgorithm = value;
    }

    /**
     * Gets the value of the signaturePolicyDigestValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignaturePolicyDigestValue() {
        return signaturePolicyDigestValue;
    }

    /**
     * Sets the value of the signaturePolicyDigestValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignaturePolicyDigestValue(byte[] value) {
        this.signaturePolicyDigestValue = ((byte[]) value);
    }

    /**
     * Gets the value of the transforms property.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Sets the value of the transforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

}

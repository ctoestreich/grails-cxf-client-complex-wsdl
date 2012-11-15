
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.TransformsType;


/**
 * <p>Java class for SignaturePolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignPolicyDigestAlg" type="{http://www.w3.org/2000/09/xmldsig#}DigestMethodType"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *         &lt;element name="SignPolicyInfo" type="{http://uri.etsi.org/2038/v1.1.1#}SignaturePolicyInfoType"/>
 *         &lt;element name="SignPolicyDigest" type="{http://www.w3.org/2000/09/xmldsig#}DigestValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyType", propOrder = {
    "signPolicyDigestAlg",
    "transforms",
    "signPolicyInfo",
    "signPolicyDigest"
})
public class SignaturePolicyType {

    @XmlElement(name = "SignPolicyDigestAlg", required = true)
    protected DigestMethodType signPolicyDigestAlg;
    @XmlElement(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected TransformsType transforms;
    @XmlElement(name = "SignPolicyInfo", required = true)
    protected SignaturePolicyInfoType signPolicyInfo;
    @XmlElement(name = "SignPolicyDigest", required = true)
    protected byte[] signPolicyDigest;

    /**
     * Gets the value of the signPolicyDigestAlg property.
     * 
     * @return
     *     possible object is
     *     {@link DigestMethodType }
     *     
     */
    public DigestMethodType getSignPolicyDigestAlg() {
        return signPolicyDigestAlg;
    }

    /**
     * Sets the value of the signPolicyDigestAlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestMethodType }
     *     
     */
    public void setSignPolicyDigestAlg(DigestMethodType value) {
        this.signPolicyDigestAlg = value;
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

    /**
     * Gets the value of the signPolicyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyInfoType }
     *     
     */
    public SignaturePolicyInfoType getSignPolicyInfo() {
        return signPolicyInfo;
    }

    /**
     * Sets the value of the signPolicyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyInfoType }
     *     
     */
    public void setSignPolicyInfo(SignaturePolicyInfoType value) {
        this.signPolicyInfo = value;
    }

    /**
     * Gets the value of the signPolicyDigest property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignPolicyDigest() {
        return signPolicyDigest;
    }

    /**
     * Sets the value of the signPolicyDigest property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignPolicyDigest(byte[] value) {
        this.signPolicyDigest = ((byte[]) value);
    }

}

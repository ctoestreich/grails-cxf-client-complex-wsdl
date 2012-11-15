
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SigningCertTrustConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SigningCertTrustConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerTrustTrees" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateTrustTreesType"/>
 *         &lt;element name="SignerRevReq" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateRevReqType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigningCertTrustConditionType", propOrder = {
    "signerTrustTrees",
    "signerRevReq"
})
public class SigningCertTrustConditionType {

    @XmlElement(name = "SignerTrustTrees", required = true)
    protected CertificateTrustTreesType signerTrustTrees;
    @XmlElement(name = "SignerRevReq", required = true)
    protected CertificateRevReqType signerRevReq;

    /**
     * Gets the value of the signerTrustTrees property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateTrustTreesType }
     *     
     */
    public CertificateTrustTreesType getSignerTrustTrees() {
        return signerTrustTrees;
    }

    /**
     * Sets the value of the signerTrustTrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateTrustTreesType }
     *     
     */
    public void setSignerTrustTrees(CertificateTrustTreesType value) {
        this.signerTrustTrees = value;
    }

    /**
     * Gets the value of the signerRevReq property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateRevReqType }
     *     
     */
    public CertificateRevReqType getSignerRevReq() {
        return signerRevReq;
    }

    /**
     * Sets the value of the signerRevReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateRevReqType }
     *     
     */
    public void setSignerRevReq(CertificateRevReqType value) {
        this.signerRevReq = value;
    }

}

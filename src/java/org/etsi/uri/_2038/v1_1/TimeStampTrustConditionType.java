
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeStampTrustConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeStampTrustConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtsCertificateTrustTrees" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateTrustTreesType" minOccurs="0"/>
 *         &lt;element name="TtsRevReq" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateRevReqType" minOccurs="0"/>
 *         &lt;element name="TtsNameConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}NameConstraintsType" minOccurs="0"/>
 *         &lt;element name="CautionPeriod" type="{http://uri.etsi.org/2038/v1.1.1#}DeltaTimeType" minOccurs="0"/>
 *         &lt;element name="SignatureTimeStampDelay" type="{http://uri.etsi.org/2038/v1.1.1#}DeltaTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeStampTrustConditionType", propOrder = {
    "ttsCertificateTrustTrees",
    "ttsRevReq",
    "ttsNameConstraints",
    "cautionPeriod",
    "signatureTimeStampDelay"
})
public class TimeStampTrustConditionType {

    @XmlElement(name = "TtsCertificateTrustTrees")
    protected CertificateTrustTreesType ttsCertificateTrustTrees;
    @XmlElement(name = "TtsRevReq")
    protected CertificateRevReqType ttsRevReq;
    @XmlElement(name = "TtsNameConstraints")
    protected NameConstraintsType ttsNameConstraints;
    @XmlElement(name = "CautionPeriod")
    protected DeltaTimeType cautionPeriod;
    @XmlElement(name = "SignatureTimeStampDelay")
    protected DeltaTimeType signatureTimeStampDelay;

    /**
     * Gets the value of the ttsCertificateTrustTrees property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateTrustTreesType }
     *     
     */
    public CertificateTrustTreesType getTtsCertificateTrustTrees() {
        return ttsCertificateTrustTrees;
    }

    /**
     * Sets the value of the ttsCertificateTrustTrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateTrustTreesType }
     *     
     */
    public void setTtsCertificateTrustTrees(CertificateTrustTreesType value) {
        this.ttsCertificateTrustTrees = value;
    }

    /**
     * Gets the value of the ttsRevReq property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateRevReqType }
     *     
     */
    public CertificateRevReqType getTtsRevReq() {
        return ttsRevReq;
    }

    /**
     * Sets the value of the ttsRevReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateRevReqType }
     *     
     */
    public void setTtsRevReq(CertificateRevReqType value) {
        this.ttsRevReq = value;
    }

    /**
     * Gets the value of the ttsNameConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.NameConstraintsType }
     *     
     */
    public NameConstraintsType getTtsNameConstraints() {
        return ttsNameConstraints;
    }

    /**
     * Sets the value of the ttsNameConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.NameConstraintsType }
     *     
     */
    public void setTtsNameConstraints(NameConstraintsType value) {
        this.ttsNameConstraints = value;
    }

    /**
     * Gets the value of the cautionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.DeltaTimeType }
     *     
     */
    public DeltaTimeType getCautionPeriod() {
        return cautionPeriod;
    }

    /**
     * Sets the value of the cautionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.DeltaTimeType }
     *     
     */
    public void setCautionPeriod(DeltaTimeType value) {
        this.cautionPeriod = value;
    }

    /**
     * Gets the value of the signatureTimeStampDelay property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.DeltaTimeType }
     *     
     */
    public DeltaTimeType getSignatureTimeStampDelay() {
        return signatureTimeStampDelay;
    }

    /**
     * Sets the value of the signatureTimeStampDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.DeltaTimeType }
     *     
     */
    public void setSignatureTimeStampDelay(DeltaTimeType value) {
        this.signatureTimeStampDelay = value;
    }

}

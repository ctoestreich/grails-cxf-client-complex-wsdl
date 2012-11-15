
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateRevReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateRevReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndRevReq" type="{http://uri.etsi.org/2038/v1.1.1#}RevocationReqType"/>
 *         &lt;element name="CACerts" type="{http://uri.etsi.org/2038/v1.1.1#}RevocationReqType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateRevReqType", propOrder = {
    "endRevReq",
    "caCerts"
})
public class CertificateRevReqType {

    @XmlElement(name = "EndRevReq", required = true)
    protected RevocationReqType endRevReq;
    @XmlElement(name = "CACerts", required = true)
    protected RevocationReqType caCerts;

    /**
     * Gets the value of the endRevReq property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationReqType }
     *     
     */
    public RevocationReqType getEndRevReq() {
        return endRevReq;
    }

    /**
     * Sets the value of the endRevReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationReqType }
     *     
     */
    public void setEndRevReq(RevocationReqType value) {
        this.endRevReq = value;
    }

    /**
     * Gets the value of the caCerts property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationReqType }
     *     
     */
    public RevocationReqType getCACerts() {
        return caCerts;
    }

    /**
     * Sets the value of the caCerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationReqType }
     *     
     */
    public void setCACerts(RevocationReqType value) {
        this.caCerts = value;
    }

}

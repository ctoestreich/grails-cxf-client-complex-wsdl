
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevocationReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevocationReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnuRevReq" type="{http://uri.etsi.org/2038/v1.1.1#}EnuRevReqType"/>
 *         &lt;element name="exRevReq" type="{http://uri.etsi.org/2038/v1.1.1#}SignPolExtensionsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationReqType", propOrder = {
    "enuRevReq",
    "exRevReq"
})
public class RevocationReqType {

    @XmlElement(name = "EnuRevReq", required = true)
    protected EnuRevReqType enuRevReq;
    protected SignPolExtensionsListType exRevReq;

    /**
     * Gets the value of the enuRevReq property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.EnuRevReqType }
     *     
     */
    public EnuRevReqType getEnuRevReq() {
        return enuRevReq;
    }

    /**
     * Sets the value of the enuRevReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.EnuRevReqType }
     *     
     */
    public void setEnuRevReq(EnuRevReqType value) {
        this.enuRevReq = value;
    }

    /**
     * Gets the value of the exRevReq property.
     * 
     * @return
     *     possible object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public SignPolExtensionsListType getExRevReq() {
        return exRevReq;
    }

    /**
     * Sets the value of the exRevReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public void setExRevReq(SignPolExtensionsListType value) {
        this.exRevReq = value;
    }

}

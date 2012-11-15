
package org.oasis_open.docs.dss.oasis_dss_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.SignerRoleType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.2.2#}SignerRole"/>
 *         &lt;element name="BinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signerRole",
    "binaryValue"
})
@XmlRootElement(name = "SignerRole")
public class SignerRole {

    @XmlElement(name = "SignerRole", namespace = "http://uri.etsi.org/01903/v1.2.2#")
    protected SignerRoleType signerRole;
    @XmlElement(name = "BinaryValue")
    protected byte[] binaryValue;

    /**
     * Gets the value of the signerRole property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.SignerRoleType }
     *     
     */
    public SignerRoleType getSignerRole() {
        return signerRole;
    }

    /**
     * Sets the value of the signerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.SignerRoleType }
     *     
     */
    public void setSignerRole(SignerRoleType value) {
        this.signerRole = value;
    }

    /**
     * Gets the value of the binaryValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryValue() {
        return binaryValue;
    }

    /**
     * Sets the value of the binaryValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryValue(byte[] value) {
        this.binaryValue = value;
    }

}

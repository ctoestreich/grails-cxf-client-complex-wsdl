
package org.etsi.uri._02231.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig.KeyValueType;


/**
 * <p>Java class for digitalIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="digitalIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="keyValue" type="{http://www.w3.org/2000/09/xmldsig#}KeyValueType"/>
 *         &lt;sequence>
 *           &lt;element name="digitalIdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="digitalIdValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "digitalIdentityType", propOrder = {
    "x509Certificate",
    "keyValue",
    "digitalIdType",
    "digitalIdValue"
})
public class DigitalIdentityType {

    @XmlElement(name = "X509Certificate")
    protected byte[] x509Certificate;
    protected KeyValueType keyValue;
    protected String digitalIdType;
    protected Object digitalIdValue;

    /**
     * Gets the value of the x509Certificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Sets the value of the x509Certificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setX509Certificate(byte[] value) {
        this.x509Certificate = ((byte[]) value);
    }

    /**
     * Gets the value of the keyValue property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValueType }
     *     
     */
    public KeyValueType getKeyValue() {
        return keyValue;
    }

    /**
     * Sets the value of the keyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValueType }
     *     
     */
    public void setKeyValue(KeyValueType value) {
        this.keyValue = value;
    }

    /**
     * Gets the value of the digitalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalIdType() {
        return digitalIdType;
    }

    /**
     * Sets the value of the digitalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalIdType(String value) {
        this.digitalIdType = value;
    }

    /**
     * Gets the value of the digitalIdValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDigitalIdValue() {
        return digitalIdValue;
    }

    /**
     * Sets the value of the digitalIdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDigitalIdValue(Object value) {
        this.digitalIdValue = value;
    }

}

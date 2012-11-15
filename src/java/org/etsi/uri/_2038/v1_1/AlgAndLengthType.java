
package org.etsi.uri._2038.v1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlgAndLengthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgAndLengthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlgId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="MinKeyLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://uri.etsi.org/2038/v1.1.1#}SignPolExtensionsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgAndLengthType", propOrder = {
    "algId",
    "minKeyLength",
    "other"
})
public class AlgAndLengthType {

    @XmlElement(name = "AlgId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String algId;
    @XmlElement(name = "MinKeyLength")
    protected BigInteger minKeyLength;
    @XmlElement(name = "Other")
    protected SignPolExtensionsListType other;

    /**
     * Gets the value of the algId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgId() {
        return algId;
    }

    /**
     * Sets the value of the algId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgId(String value) {
        this.algId = value;
    }

    /**
     * Gets the value of the minKeyLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinKeyLength() {
        return minKeyLength;
    }

    /**
     * Sets the value of the minKeyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinKeyLength(BigInteger value) {
        this.minKeyLength = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public SignPolExtensionsListType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignPolExtensionsListType }
     *     
     */
    public void setOther(SignPolExtensionsListType value) {
        this.other = value;
    }

}

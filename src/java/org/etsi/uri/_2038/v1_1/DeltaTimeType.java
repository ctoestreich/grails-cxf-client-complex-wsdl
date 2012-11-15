
package org.etsi.uri._2038.v1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeltaTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeltaTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeltaSeconds" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DeltaMinutes" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DeltaHours" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DeltaDays" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeltaTimeType", propOrder = {
    "deltaSeconds",
    "deltaMinutes",
    "deltaHours",
    "deltaDays"
})
public class DeltaTimeType {

    @XmlElement(name = "DeltaSeconds", required = true)
    protected BigInteger deltaSeconds;
    @XmlElement(name = "DeltaMinutes", required = true)
    protected BigInteger deltaMinutes;
    @XmlElement(name = "DeltaHours", required = true)
    protected BigInteger deltaHours;
    @XmlElement(name = "DeltaDays", required = true)
    protected BigInteger deltaDays;

    /**
     * Gets the value of the deltaSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaSeconds() {
        return deltaSeconds;
    }

    /**
     * Sets the value of the deltaSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaSeconds(BigInteger value) {
        this.deltaSeconds = value;
    }

    /**
     * Gets the value of the deltaMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaMinutes() {
        return deltaMinutes;
    }

    /**
     * Sets the value of the deltaMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaMinutes(BigInteger value) {
        this.deltaMinutes = value;
    }

    /**
     * Gets the value of the deltaHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaHours() {
        return deltaHours;
    }

    /**
     * Sets the value of the deltaHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaHours(BigInteger value) {
        this.deltaHours = value;
    }

    /**
     * Gets the value of the deltaDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaDays() {
        return deltaDays;
    }

    /**
     * Sets the value of the deltaDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaDays(BigInteger value) {
        this.deltaDays = value;
    }

}


package org.etsi.uri._2038.v1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyConstraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyConstraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequireExplicitPolicy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="InhibitExplicitPolicy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyConstraintsType", propOrder = {
    "requireExplicitPolicy",
    "inhibitExplicitPolicy"
})
public class PolicyConstraintsType {

    @XmlElement(name = "RequireExplicitPolicy")
    protected BigInteger requireExplicitPolicy;
    @XmlElement(name = "InhibitExplicitPolicy")
    protected BigInteger inhibitExplicitPolicy;

    /**
     * Gets the value of the requireExplicitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequireExplicitPolicy() {
        return requireExplicitPolicy;
    }

    /**
     * Sets the value of the requireExplicitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequireExplicitPolicy(BigInteger value) {
        this.requireExplicitPolicy = value;
    }

    /**
     * Gets the value of the inhibitExplicitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInhibitExplicitPolicy() {
        return inhibitExplicitPolicy;
    }

    /**
     * Sets the value of the inhibitExplicitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInhibitExplicitPolicy(BigInteger value) {
        this.inhibitExplicitPolicy = value;
    }

}


package oasis.names.tc.dss._1_0.profiles.xss;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;
import org.etsi.uri._02231.v1.InternationalNamesType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchemeName" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}InternationalNamesType"/>
 *         &lt;element name="TSLSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TSLDigestAlgorithm" type="{http://uri.etsi.org/01903/v1.2.2#}ObjectIdentifierType"/>
 *         &lt;element name="TSLDigestValue" type="{http://www.w3.org/2000/09/xmldsig#}DigestValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schemeName",
    "tslSequenceNumber",
    "tslDigestAlgorithm",
    "tslDigestValue"
})
@XmlRootElement(name = "SchemeInfo")
public class SchemeInfo {

    @XmlElement(name = "SchemeName", required = true)
    protected InternationalNamesType schemeName;
    @XmlElement(name = "TSLSequenceNumber", required = true)
    protected BigInteger tslSequenceNumber;
    @XmlElement(name = "TSLDigestAlgorithm", required = true)
    protected ObjectIdentifierType tslDigestAlgorithm;
    @XmlElement(name = "TSLDigestValue", required = true)
    protected byte[] tslDigestValue;

    /**
     * Gets the value of the schemeName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getSchemeName() {
        return schemeName;
    }

    /**
     * Sets the value of the schemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setSchemeName(InternationalNamesType value) {
        this.schemeName = value;
    }

    /**
     * Gets the value of the tslSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getTSLSequenceNumber() {
        return tslSequenceNumber;
    }

    /**
     * Sets the value of the tslSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setTSLSequenceNumber(BigInteger value) {
        this.tslSequenceNumber = value;
    }

    /**
     * Gets the value of the tslDigestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getTSLDigestAlgorithm() {
        return tslDigestAlgorithm;
    }

    /**
     * Sets the value of the tslDigestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setTSLDigestAlgorithm(ObjectIdentifierType value) {
        this.tslDigestAlgorithm = value;
    }

    /**
     * Gets the value of the tslDigestValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTSLDigestValue() {
        return tslDigestValue;
    }

    /**
     * Sets the value of the tslDigestValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTSLDigestValue(byte[] value) {
        this.tslDigestValue = value;
    }

}

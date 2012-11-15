
package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.TransformsType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestValue"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transforms",
    "digestMethod",
    "digestValue"
})
@XmlRootElement(name = "DocumentHash")
public class DocumentHash
    extends DocumentBaseType
{

    @XmlElement(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected TransformsType transforms;
    @XmlElement(name = "DigestMethod", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected DigestMethodType digestMethod;
    @XmlElement(name = "DigestValue", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected byte[] digestValue;

    /**
     * Gets the value of the transforms property.
     * 
     * @return
     *     possible object is
     *     {@link org.w3._2000._09.xmldsig.TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Sets the value of the transforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.w3._2000._09.xmldsig.TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Gets the value of the digestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link org.w3._2000._09.xmldsig.DigestMethodType }
     *     
     */
    public DigestMethodType getDigestMethod() {
        return digestMethod;
    }

    /**
     * Sets the value of the digestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.w3._2000._09.xmldsig.DigestMethodType }
     *     
     */
    public void setDigestMethod(DigestMethodType value) {
        this.digestMethod = value;
    }

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDigestValue(byte[] value) {
        this.digestValue = value;
    }

}

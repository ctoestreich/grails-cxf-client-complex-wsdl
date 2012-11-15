
package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentBaseType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="InlineXML" type="{urn:oasis:names:tc:dss:1.0:core:schema}InlineXMLType"/>
 *           &lt;element name="Base64XML" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="EscapedXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Base64Data"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "inlineXML",
    "base64XML",
    "escapedXML",
    "base64Data"
})
public class DocumentType
    extends DocumentBaseType
{

    @XmlElement(name = "InlineXML")
    protected InlineXMLType inlineXML;
    @XmlElement(name = "Base64XML")
    protected byte[] base64XML;
    @XmlElement(name = "EscapedXML")
    protected String escapedXML;
    @XmlElement(name = "Base64Data")
    protected Base64Data base64Data;

    /**
     * Gets the value of the inlineXML property.
     * 
     * @return
     *     possible object is
     *     {@link InlineXMLType }
     *     
     */
    public InlineXMLType getInlineXML() {
        return inlineXML;
    }

    /**
     * Sets the value of the inlineXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineXMLType }
     *     
     */
    public void setInlineXML(InlineXMLType value) {
        this.inlineXML = value;
    }

    /**
     * Gets the value of the base64XML property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64XML() {
        return base64XML;
    }

    /**
     * Sets the value of the base64XML property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64XML(byte[] value) {
        this.base64XML = value;
    }

    /**
     * Gets the value of the escapedXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapedXML() {
        return escapedXML;
    }

    /**
     * Sets the value of the escapedXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapedXML(String value) {
        this.escapedXML = value;
    }

    /**
     * Gets the value of the base64Data property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.Base64Data }
     *     
     */
    public Base64Data getBase64Data() {
        return base64Data;
    }

    /**
     * Sets the value of the base64Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.Base64Data }
     *     
     */
    public void setBase64Data(Base64Data value) {
        this.base64Data = value;
    }

}

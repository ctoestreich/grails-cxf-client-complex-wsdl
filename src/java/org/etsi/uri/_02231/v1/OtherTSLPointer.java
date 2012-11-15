
package org.etsi.uri._02231.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherTSLPointer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherTSLPointer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TSLLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTSLPointer", propOrder = {
    "tslLocation",
    "additionalInformation"
})
public class OtherTSLPointer {

    @XmlElement(name = "TSLLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String tslLocation;
    @XmlElement(name = "AdditionalInformation", required = true)
    protected String additionalInformation;

    /**
     * Gets the value of the tslLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLLocation() {
        return tslLocation;
    }

    /**
     * Sets the value of the tslLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLLocation(String value) {
        this.tslLocation = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

}

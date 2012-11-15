
package org.etsi.uri._02231.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyOrLegalnoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyOrLegalnoticeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TSLPolicy" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="TSLLegalNotice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyOrLegalnoticeType", propOrder = {
    "tslPolicy",
    "tslLegalNotice"
})
public class PolicyOrLegalnoticeType {

    @XmlElement(name = "TSLPolicy")
    @XmlSchemaType(name = "anyURI")
    protected String tslPolicy;
    @XmlElement(name = "TSLLegalNotice")
    protected String tslLegalNotice;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the tslPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLPolicy() {
        return tslPolicy;
    }

    /**
     * Sets the value of the tslPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLPolicy(String value) {
        this.tslPolicy = value;
    }

    /**
     * Gets the value of the tslLegalNotice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLLegalNotice() {
        return tslLegalNotice;
    }

    /**
     * Sets the value of the tslLegalNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLLegalNotice(String value) {
        this.tslLegalNotice = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}

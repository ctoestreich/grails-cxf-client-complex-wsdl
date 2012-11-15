
package org.etsi.uri._02231.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig.SignatureType;


/**
 * <p>Java class for TrustStatusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustStatusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/02231/v1.0bis-2005-04#}TSLTag"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v1.0bis-2005-04#}SchemeInformation"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v1.0bis-2005-04#}TrustServiceProvider" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustStatusListType", propOrder = {
    "tslTag",
    "schemeInformation",
    "trustServiceProvider",
    "signature"
})
public class TrustStatusListType {

    @XmlElement(name = "TSLTag", required = true)
    protected String tslTag;
    @XmlElement(name = "SchemeInformation", required = true)
    protected TSLSchemeInformationType schemeInformation;
    @XmlElement(name = "TrustServiceProvider")
    protected List<TSPType> trustServiceProvider;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the tslTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLTag() {
        return tslTag;
    }

    /**
     * Sets the value of the tslTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLTag(String value) {
        this.tslTag = value;
    }

    /**
     * Gets the value of the schemeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSLSchemeInformationType }
     *     
     */
    public TSLSchemeInformationType getSchemeInformation() {
        return schemeInformation;
    }

    /**
     * Sets the value of the schemeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSLSchemeInformationType }
     *     
     */
    public void setSchemeInformation(TSLSchemeInformationType value) {
        this.schemeInformation = value;
    }

    /**
     * Gets the value of the trustServiceProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustServiceProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustServiceProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSPType }
     * 
     * 
     */
    public List<TSPType> getTrustServiceProvider() {
        if (trustServiceProvider == null) {
            trustServiceProvider = new ArrayList<TSPType>();
        }
        return this.trustServiceProvider;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}

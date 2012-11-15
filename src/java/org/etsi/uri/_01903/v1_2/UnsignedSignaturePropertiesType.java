
package org.etsi.uri._01903.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsignedSignaturePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsignedSignaturePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CounterSignature" type="{http://uri.etsi.org/01903/v1.2.2#}CounterSignatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignatureTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompleteCertificateRefs" type="{http://uri.etsi.org/01903/v1.2.2#}CompleteCertificateRefsType" minOccurs="0"/>
 *         &lt;element name="CompleteRevocationRefs" type="{http://uri.etsi.org/01903/v1.2.2#}CompleteRevocationRefsType" minOccurs="0"/>
 *         &lt;element name="AttributeCertificateRefs" type="{http://uri.etsi.org/01903/v1.2.2#}CompleteCertificateRefsType" minOccurs="0"/>
 *         &lt;element name="AttributeRevocationRefs" type="{http://uri.etsi.org/01903/v1.2.2#}CompleteRevocationRefsType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="SigAndRefsTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="RefsOnlyTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CertificateValues" type="{http://uri.etsi.org/01903/v1.2.2#}CertificateValuesType" minOccurs="0"/>
 *         &lt;element name="RevocationValues" type="{http://uri.etsi.org/01903/v1.2.2#}RevocationValuesType" minOccurs="0"/>
 *         &lt;element name="ArchiveTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsignedSignaturePropertiesType", propOrder = {
    "counterSignature",
    "signatureTimeStamp",
    "completeCertificateRefs",
    "completeRevocationRefs",
    "attributeCertificateRefs",
    "attributeRevocationRefs",
    "sigAndRefsTimeStamp",
    "refsOnlyTimeStamp",
    "certificateValues",
    "revocationValues",
    "archiveTimeStamp"
})
public class UnsignedSignaturePropertiesType {

    @XmlElement(name = "CounterSignature")
    protected List<CounterSignatureType> counterSignature;
    @XmlElement(name = "SignatureTimeStamp")
    protected List<TimeStampType> signatureTimeStamp;
    @XmlElement(name = "CompleteCertificateRefs")
    protected CompleteCertificateRefsType completeCertificateRefs;
    @XmlElement(name = "CompleteRevocationRefs")
    protected CompleteRevocationRefsType completeRevocationRefs;
    @XmlElement(name = "AttributeCertificateRefs")
    protected CompleteCertificateRefsType attributeCertificateRefs;
    @XmlElement(name = "AttributeRevocationRefs")
    protected CompleteRevocationRefsType attributeRevocationRefs;
    @XmlElement(name = "SigAndRefsTimeStamp")
    protected List<TimeStampType> sigAndRefsTimeStamp;
    @XmlElement(name = "RefsOnlyTimeStamp")
    protected List<TimeStampType> refsOnlyTimeStamp;
    @XmlElement(name = "CertificateValues")
    protected CertificateValuesType certificateValues;
    @XmlElement(name = "RevocationValues")
    protected RevocationValuesType revocationValues;
    @XmlElement(name = "ArchiveTimeStamp")
    protected List<TimeStampType> archiveTimeStamp;

    /**
     * Gets the value of the counterSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.CounterSignatureType }
     * 
     * 
     */
    public List<CounterSignatureType> getCounterSignature() {
        if (counterSignature == null) {
            counterSignature = new ArrayList<CounterSignatureType>();
        }
        return this.counterSignature;
    }

    /**
     * Gets the value of the signatureTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getSignatureTimeStamp() {
        if (signatureTimeStamp == null) {
            signatureTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.signatureTimeStamp;
    }

    /**
     * Gets the value of the completeCertificateRefs property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteCertificateRefsType }
     *     
     */
    public CompleteCertificateRefsType getCompleteCertificateRefs() {
        return completeCertificateRefs;
    }

    /**
     * Sets the value of the completeCertificateRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteCertificateRefsType }
     *     
     */
    public void setCompleteCertificateRefs(CompleteCertificateRefsType value) {
        this.completeCertificateRefs = value;
    }

    /**
     * Gets the value of the completeRevocationRefs property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteRevocationRefsType }
     *     
     */
    public CompleteRevocationRefsType getCompleteRevocationRefs() {
        return completeRevocationRefs;
    }

    /**
     * Sets the value of the completeRevocationRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteRevocationRefsType }
     *     
     */
    public void setCompleteRevocationRefs(CompleteRevocationRefsType value) {
        this.completeRevocationRefs = value;
    }

    /**
     * Gets the value of the attributeCertificateRefs property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteCertificateRefsType }
     *     
     */
    public CompleteCertificateRefsType getAttributeCertificateRefs() {
        return attributeCertificateRefs;
    }

    /**
     * Sets the value of the attributeCertificateRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteCertificateRefsType }
     *     
     */
    public void setAttributeCertificateRefs(CompleteCertificateRefsType value) {
        this.attributeCertificateRefs = value;
    }

    /**
     * Gets the value of the attributeRevocationRefs property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteRevocationRefsType }
     *     
     */
    public CompleteRevocationRefsType getAttributeRevocationRefs() {
        return attributeRevocationRefs;
    }

    /**
     * Sets the value of the attributeRevocationRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.CompleteRevocationRefsType }
     *     
     */
    public void setAttributeRevocationRefs(CompleteRevocationRefsType value) {
        this.attributeRevocationRefs = value;
    }

    /**
     * Gets the value of the sigAndRefsTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sigAndRefsTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigAndRefsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getSigAndRefsTimeStamp() {
        if (sigAndRefsTimeStamp == null) {
            sigAndRefsTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.sigAndRefsTimeStamp;
    }

    /**
     * Gets the value of the refsOnlyTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refsOnlyTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefsOnlyTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getRefsOnlyTimeStamp() {
        if (refsOnlyTimeStamp == null) {
            refsOnlyTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.refsOnlyTimeStamp;
    }

    /**
     * Gets the value of the certificateValues property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.CertificateValuesType }
     *     
     */
    public CertificateValuesType getCertificateValues() {
        return certificateValues;
    }

    /**
     * Sets the value of the certificateValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.CertificateValuesType }
     *     
     */
    public void setCertificateValues(CertificateValuesType value) {
        this.certificateValues = value;
    }

    /**
     * Gets the value of the revocationValues property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._01903.v1_2.RevocationValuesType }
     *     
     */
    public RevocationValuesType getRevocationValues() {
        return revocationValues;
    }

    /**
     * Sets the value of the revocationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._01903.v1_2.RevocationValuesType }
     *     
     */
    public void setRevocationValues(RevocationValuesType value) {
        this.revocationValues = value;
    }

    /**
     * Gets the value of the archiveTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getArchiveTimeStamp() {
        if (archiveTimeStamp == null) {
            archiveTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.archiveTimeStamp;
    }

}

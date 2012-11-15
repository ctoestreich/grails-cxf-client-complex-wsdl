
package org.etsi.uri._02231.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TSLSchemeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSLSchemeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TSLVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TSLSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SchemeName" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}InternationalNamesType"/>
 *         &lt;element name="SchemeOperatorAddress" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}AddressType"/>
 *         &lt;element name="SchemeInformationURN" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="StatusDeterminationApproach" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="SchemeType" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="SchemeTerritory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyOrLegalNotice" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}PolicyOrLegalnoticeType" minOccurs="0"/>
 *         &lt;element name="HistoricalInformationPeriod" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PointersToOtherTSL" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}OtherTSLPointersType" minOccurs="0"/>
 *         &lt;element name="ListIssueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NextUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSLSchemeInformationType", propOrder = {
    "tslVersionIdentifier",
    "tslSequenceNumber",
    "schemeName",
    "schemeOperatorAddress",
    "schemeInformationURN",
    "statusDeterminationApproach",
    "schemeType",
    "schemeTerritory",
    "policyOrLegalNotice",
    "historicalInformationPeriod",
    "pointersToOtherTSL",
    "listIssueDateTime",
    "nextUpdate"
})
public class TSLSchemeInformationType {

    @XmlElement(name = "TSLVersionIdentifier", required = true)
    protected BigInteger tslVersionIdentifier;
    @XmlElement(name = "TSLSequenceNumber", required = true)
    protected BigInteger tslSequenceNumber;
    @XmlElement(name = "SchemeName", required = true)
    protected InternationalNamesType schemeName;
    @XmlElement(name = "SchemeOperatorAddress", required = true)
    protected AddressType schemeOperatorAddress;
    @XmlElement(name = "SchemeInformationURN", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String schemeInformationURN;
    @XmlElement(name = "StatusDeterminationApproach", required = true)
    protected BigInteger statusDeterminationApproach;
    @XmlElement(name = "SchemeType")
    @XmlSchemaType(name = "anyURI")
    protected String schemeType;
    @XmlElement(name = "SchemeTerritory")
    protected String schemeTerritory;
    @XmlElement(name = "PolicyOrLegalNotice")
    protected PolicyOrLegalnoticeType policyOrLegalNotice;
    @XmlElement(name = "HistoricalInformationPeriod", required = true)
    protected BigInteger historicalInformationPeriod;
    @XmlElement(name = "PointersToOtherTSL")
    protected OtherTSLPointersType pointersToOtherTSL;
    @XmlElement(name = "ListIssueDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listIssueDateTime;
    @XmlElement(name = "NextUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextUpdate;

    /**
     * Gets the value of the tslVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getTSLVersionIdentifier() {
        return tslVersionIdentifier;
    }

    /**
     * Sets the value of the tslVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setTSLVersionIdentifier(BigInteger value) {
        this.tslVersionIdentifier = value;
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
     * Gets the value of the schemeName property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.InternationalNamesType }
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
     *     {@link org.etsi.uri._02231.v1.InternationalNamesType }
     *     
     */
    public void setSchemeName(InternationalNamesType value) {
        this.schemeName = value;
    }

    /**
     * Gets the value of the schemeOperatorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.AddressType }
     *     
     */
    public AddressType getSchemeOperatorAddress() {
        return schemeOperatorAddress;
    }

    /**
     * Sets the value of the schemeOperatorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._02231.v1.AddressType }
     *     
     */
    public void setSchemeOperatorAddress(AddressType value) {
        this.schemeOperatorAddress = value;
    }

    /**
     * Gets the value of the schemeInformationURN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeInformationURN() {
        return schemeInformationURN;
    }

    /**
     * Sets the value of the schemeInformationURN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeInformationURN(String value) {
        this.schemeInformationURN = value;
    }

    /**
     * Gets the value of the statusDeterminationApproach property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getStatusDeterminationApproach() {
        return statusDeterminationApproach;
    }

    /**
     * Sets the value of the statusDeterminationApproach property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setStatusDeterminationApproach(BigInteger value) {
        this.statusDeterminationApproach = value;
    }

    /**
     * Gets the value of the schemeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeType() {
        return schemeType;
    }

    /**
     * Sets the value of the schemeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeType(String value) {
        this.schemeType = value;
    }

    /**
     * Gets the value of the schemeTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeTerritory() {
        return schemeTerritory;
    }

    /**
     * Sets the value of the schemeTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeTerritory(String value) {
        this.schemeTerritory = value;
    }

    /**
     * Gets the value of the policyOrLegalNotice property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.PolicyOrLegalnoticeType }
     *     
     */
    public PolicyOrLegalnoticeType getPolicyOrLegalNotice() {
        return policyOrLegalNotice;
    }

    /**
     * Sets the value of the policyOrLegalNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._02231.v1.PolicyOrLegalnoticeType }
     *     
     */
    public void setPolicyOrLegalNotice(PolicyOrLegalnoticeType value) {
        this.policyOrLegalNotice = value;
    }

    /**
     * Gets the value of the historicalInformationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getHistoricalInformationPeriod() {
        return historicalInformationPeriod;
    }

    /**
     * Sets the value of the historicalInformationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setHistoricalInformationPeriod(BigInteger value) {
        this.historicalInformationPeriod = value;
    }

    /**
     * Gets the value of the pointersToOtherTSL property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.OtherTSLPointersType }
     *     
     */
    public OtherTSLPointersType getPointersToOtherTSL() {
        return pointersToOtherTSL;
    }

    /**
     * Sets the value of the pointersToOtherTSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._02231.v1.OtherTSLPointersType }
     *     
     */
    public void setPointersToOtherTSL(OtherTSLPointersType value) {
        this.pointersToOtherTSL = value;
    }

    /**
     * Gets the value of the listIssueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListIssueDateTime() {
        return listIssueDateTime;
    }

    /**
     * Sets the value of the listIssueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setListIssueDateTime(XMLGregorianCalendar value) {
        this.listIssueDateTime = value;
    }

    /**
     * Gets the value of the nextUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextUpdate() {
        return nextUpdate;
    }

    /**
     * Sets the value of the nextUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setNextUpdate(XMLGregorianCalendar value) {
        this.nextUpdate = value;
    }

}

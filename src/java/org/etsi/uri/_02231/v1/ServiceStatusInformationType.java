
package org.etsi.uri._02231.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ServiceStatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceStatusInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ServiceName" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}InternationalNamesType"/>
 *         &lt;element name="ServiceDigitalIdentity" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}digitalIdentityListType"/>
 *         &lt;element name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StatusStartingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStatusInformationType", propOrder = {
    "serviceTypeIdentifier",
    "serviceName",
    "serviceDigitalIdentity",
    "serviceStatus",
    "statusStartingTime"
})
public class ServiceStatusInformationType {

    @XmlElement(name = "ServiceTypeIdentifier", required = true)
    protected BigInteger serviceTypeIdentifier;
    @XmlElement(name = "ServiceName", required = true)
    protected InternationalNamesType serviceName;
    @XmlElement(name = "ServiceDigitalIdentity", required = true)
    protected DigitalIdentityListType serviceDigitalIdentity;
    @XmlElement(name = "ServiceStatus", required = true)
    protected BigInteger serviceStatus;
    @XmlElement(name = "StatusStartingTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusStartingTime;

    /**
     * Gets the value of the serviceTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getServiceTypeIdentifier() {
        return serviceTypeIdentifier;
    }

    /**
     * Sets the value of the serviceTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setServiceTypeIdentifier(BigInteger value) {
        this.serviceTypeIdentifier = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.InternationalNamesType }
     *     
     */
    public InternationalNamesType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._02231.v1.InternationalNamesType }
     *     
     */
    public void setServiceName(InternationalNamesType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceDigitalIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.DigitalIdentityListType }
     *     
     */
    public DigitalIdentityListType getServiceDigitalIdentity() {
        return serviceDigitalIdentity;
    }

    /**
     * Sets the value of the serviceDigitalIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._02231.v1.DigitalIdentityListType }
     *     
     */
    public void setServiceDigitalIdentity(DigitalIdentityListType value) {
        this.serviceDigitalIdentity = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setServiceStatus(BigInteger value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the statusStartingTime property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusStartingTime() {
        return statusStartingTime;
    }

    /**
     * Sets the value of the statusStartingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *     
     */
    public void setStatusStartingTime(XMLGregorianCalendar value) {
        this.statusStartingTime = value;
    }

}

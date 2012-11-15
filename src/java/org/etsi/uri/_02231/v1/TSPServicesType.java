
package org.etsi.uri._02231.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSPServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/02231/v1.0bis-2005-04#}ServiceInformation"/>
 *         &lt;element name="ServiceHistory" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}ServiceHistoryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPServicesType", propOrder = {
    "serviceInformation",
    "serviceHistory"
})
public class TSPServicesType {

    @XmlElement(name = "ServiceInformation", required = true)
    protected TSPServiceInformationType serviceInformation;
    @XmlElement(name = "ServiceHistory", required = true)
    protected ServiceHistoryType serviceHistory;

    /**
     * Gets the value of the serviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.TSPServiceInformationType }
     *     
     */
    public TSPServiceInformationType getServiceInformation() {
        return serviceInformation;
    }

    /**
     * Sets the value of the serviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._02231.v1.TSPServiceInformationType }
     *     
     */
    public void setServiceInformation(TSPServiceInformationType value) {
        this.serviceInformation = value;
    }

    /**
     * Gets the value of the serviceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._02231.v1.ServiceHistoryType }
     *     
     */
    public ServiceHistoryType getServiceHistory() {
        return serviceHistory;
    }

    /**
     * Sets the value of the serviceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._02231.v1.ServiceHistoryType }
     *     
     */
    public void setServiceHistory(ServiceHistoryType value) {
        this.serviceHistory = value;
    }

}

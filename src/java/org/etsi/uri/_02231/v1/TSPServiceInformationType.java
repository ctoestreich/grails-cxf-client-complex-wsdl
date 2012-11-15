
package org.etsi.uri._02231.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSPServiceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPServiceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/02231/v1.0bis-2005-04#}ServiceStatusInformation"/>
 *         &lt;element name="SchemeServiceDefinitionURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="TSPServiceDefinitionURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPServiceInformationType", propOrder = {
    "serviceStatusInformation",
    "schemeServiceDefinitionURI",
    "tspServiceDefinitionURI"
})
public class TSPServiceInformationType {

    @XmlElement(name = "ServiceStatusInformation", required = true)
    protected ServiceStatusInformationType serviceStatusInformation;
    @XmlElement(name = "SchemeServiceDefinitionURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemeServiceDefinitionURI;
    @XmlElement(name = "TSPServiceDefinitionURI")
    @XmlSchemaType(name = "anyURI")
    protected String tspServiceDefinitionURI;

    /**
     * Gets the value of the serviceStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatusInformationType }
     *     
     */
    public ServiceStatusInformationType getServiceStatusInformation() {
        return serviceStatusInformation;
    }

    /**
     * Sets the value of the serviceStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatusInformationType }
     *     
     */
    public void setServiceStatusInformation(ServiceStatusInformationType value) {
        this.serviceStatusInformation = value;
    }

    /**
     * Gets the value of the schemeServiceDefinitionURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeServiceDefinitionURI() {
        return schemeServiceDefinitionURI;
    }

    /**
     * Sets the value of the schemeServiceDefinitionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeServiceDefinitionURI(String value) {
        this.schemeServiceDefinitionURI = value;
    }

    /**
     * Gets the value of the tspServiceDefinitionURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPServiceDefinitionURI() {
        return tspServiceDefinitionURI;
    }

    /**
     * Sets the value of the tspServiceDefinitionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPServiceDefinitionURI(String value) {
        this.tspServiceDefinitionURI = value;
    }

}

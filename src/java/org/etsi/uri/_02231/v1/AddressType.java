
package org.etsi.uri._02231.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalAddresses" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}PostalAddressListType"/>
 *         &lt;element name="ElectronicAddress" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}ElectronicAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "postalAddresses",
    "electronicAddress"
})
public class AddressType {

    @XmlElement(name = "PostalAddresses", required = true)
    protected PostalAddressListType postalAddresses;
    @XmlElement(name = "ElectronicAddress", required = true)
    protected ElectronicAddressType electronicAddress;

    /**
     * Gets the value of the postalAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressListType }
     *     
     */
    public PostalAddressListType getPostalAddresses() {
        return postalAddresses;
    }

    /**
     * Sets the value of the postalAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressListType }
     *     
     */
    public void setPostalAddresses(PostalAddressListType value) {
        this.postalAddresses = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicAddressType }
     *     
     */
    public ElectronicAddressType getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicAddressType }
     *     
     */
    public void setElectronicAddress(ElectronicAddressType value) {
        this.electronicAddress = value;
    }

}

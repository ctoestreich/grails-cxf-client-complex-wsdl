
package org.etsi.uri._2038.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.AnyType;


/**
 * <p>Java class for SignPolExtensionsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignPolExtensionsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="SignPolExtension" type="{http://uri.etsi.org/01903/v1.2.2#}AnyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignPolExtensionsListType", propOrder = {
    "signPolExtension"
})
public class SignPolExtensionsListType {

    @XmlElement(name = "SignPolExtension", required = true)
    protected List<AnyType> signPolExtension;

    /**
     * Gets the value of the signPolExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signPolExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignPolExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.AnyType }
     * 
     * 
     */
    public List<AnyType> getSignPolExtension() {
        if (signPolExtension == null) {
            signPolExtension = new ArrayList<AnyType>();
        }
        return this.signPolExtension;
    }

}

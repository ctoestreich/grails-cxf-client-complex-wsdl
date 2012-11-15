
package org.etsi.uri._2038.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateTrustTreesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateTrustTreesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="CertificateTrustPoint" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateTrustPointType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateTrustTreesType", propOrder = {
    "certificateTrustPoint"
})
public class CertificateTrustTreesType {

    @XmlElement(name = "CertificateTrustPoint", required = true)
    protected List<CertificateTrustPointType> certificateTrustPoint;

    /**
     * Gets the value of the certificateTrustPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateTrustPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateTrustPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._2038.v1_1.CertificateTrustPointType }
     * 
     * 
     */
    public List<CertificateTrustPointType> getCertificateTrustPoint() {
        if (certificateTrustPoint == null) {
            certificateTrustPoint = new ArrayList<CertificateTrustPointType>();
        }
        return this.certificateTrustPoint;
    }

}

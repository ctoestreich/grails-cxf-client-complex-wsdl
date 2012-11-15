
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameConstraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameConstraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermittedSubtrees" type="{http://uri.etsi.org/2038/v1.1.1#}GeneralSubTreesListType" minOccurs="0"/>
 *         &lt;element name="ExcludedSubtrees" type="{http://uri.etsi.org/2038/v1.1.1#}GeneralSubTreesListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameConstraintsType", propOrder = {
    "permittedSubtrees",
    "excludedSubtrees"
})
public class NameConstraintsType {

    @XmlElement(name = "PermittedSubtrees")
    protected GeneralSubTreesListType permittedSubtrees;
    @XmlElement(name = "ExcludedSubtrees")
    protected GeneralSubTreesListType excludedSubtrees;

    /**
     * Gets the value of the permittedSubtrees property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public GeneralSubTreesListType getPermittedSubtrees() {
        return permittedSubtrees;
    }

    /**
     * Sets the value of the permittedSubtrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public void setPermittedSubtrees(GeneralSubTreesListType value) {
        this.permittedSubtrees = value;
    }

    /**
     * Gets the value of the excludedSubtrees property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public GeneralSubTreesListType getExcludedSubtrees() {
        return excludedSubtrees;
    }

    /**
     * Sets the value of the excludedSubtrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSubTreesListType }
     *     
     */
    public void setExcludedSubtrees(GeneralSubTreesListType value) {
        this.excludedSubtrees = value;
    }

}

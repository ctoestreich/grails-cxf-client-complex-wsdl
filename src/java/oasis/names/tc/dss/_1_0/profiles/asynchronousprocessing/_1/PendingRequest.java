
package oasis.names.tc.dss._1_0.profiles.asynchronousprocessing._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.OptionalInputs;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}OptionalInputs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionalInputs"
})
@XmlRootElement(name = "PendingRequest")
public class PendingRequest {

    @XmlElement(name = "OptionalInputs", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected OptionalInputs optionalInputs;

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.OptionalInputs }
     *     
     */
    public OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.OptionalInputs }
     *     
     */
    public void setOptionalInputs(OptionalInputs value) {
        this.optionalInputs = value;
    }

}

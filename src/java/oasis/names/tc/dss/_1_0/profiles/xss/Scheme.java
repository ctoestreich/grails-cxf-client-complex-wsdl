
package oasis.names.tc.dss._1_0.profiles.xss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._02231.v1.InternationalNamesType;


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
 *         &lt;element name="SchemeName" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}InternationalNamesType"/>
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
    "schemeName"
})
@XmlRootElement(name = "Scheme")
public class Scheme {

    @XmlElement(name = "SchemeName", required = true)
    protected InternationalNamesType schemeName;

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

}

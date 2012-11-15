
package oasis.names.tc.dss._1_0.profiles.xss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://uri.etsi.org/01903/v1.2.2#}ObjectIdentifierType">
 *       &lt;attribute name="allowPolicyMappings" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SignaturePolicy")
public class SignaturePolicy
    extends ObjectIdentifierType
{

    @XmlAttribute(name = "allowPolicyMappings")
    protected Boolean allowPolicyMappings;

    /**
     * Gets the value of the allowPolicyMappings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowPolicyMappings() {
        if (allowPolicyMappings == null) {
            return false;
        } else {
            return allowPolicyMappings;
        }
    }

    /**
     * Sets the value of the allowPolicyMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPolicyMappings(Boolean value) {
        this.allowPolicyMappings = value;
    }

}


package oasis.names.tc.dss._1_0.profiles.xss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ArchiveIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "archiveIdentifier"
})
@XmlRootElement(name = "ArchiveInfo")
public class ArchiveInfo {

    @XmlElement(name = "ArchiveIdentifier", required = true)
    protected Object archiveIdentifier;

    /**
     * Gets the value of the archiveIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArchiveIdentifier() {
        return archiveIdentifier;
    }

    /**
     * Sets the value of the archiveIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArchiveIdentifier(Object value) {
        this.archiveIdentifier = value;
    }

}

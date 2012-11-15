
package oasis.names.tc.dss._1_0.profiles.archive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.ResponseBaseType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}ResponseBaseType">
 *       &lt;sequence>
 *         &lt;element name="ArchiveIdentifier" type="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
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
@XmlRootElement(name = "ArchiveSubmitResponse")
public class ArchiveSubmitResponse
    extends ResponseBaseType
{

    @XmlElement(name = "ArchiveIdentifier")
    protected String archiveIdentifier;

    /**
     * Gets the value of the archiveIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveIdentifier() {
        return archiveIdentifier;
    }

    /**
     * Sets the value of the archiveIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveIdentifier(String value) {
        this.archiveIdentifier = value;
    }

}

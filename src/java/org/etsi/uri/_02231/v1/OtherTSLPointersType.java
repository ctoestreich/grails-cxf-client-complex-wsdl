
package org.etsi.uri._02231.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherTSLPointersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherTSLPointersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherTSLPointer" type="{http://uri.etsi.org/02231/v1.0bis-2005-04#}OtherTSLPointer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTSLPointersType", propOrder = {
    "otherTSLPointer"
})
public class OtherTSLPointersType {

    @XmlElement(name = "OtherTSLPointer", required = true)
    protected List<OtherTSLPointer> otherTSLPointer;

    /**
     * Gets the value of the otherTSLPointer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTSLPointer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTSLPointer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._02231.v1.OtherTSLPointer }
     * 
     * 
     */
    public List<OtherTSLPointer> getOtherTSLPointer() {
        if (otherTSLPointer == null) {
            otherTSLPointer = new ArrayList<OtherTSLPointer>();
        }
        return this.otherTSLPointer;
    }

}

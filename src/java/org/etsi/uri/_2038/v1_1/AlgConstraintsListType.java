
package org.etsi.uri._2038.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlgConstraintsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgConstraintsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="AlgAndLength" type="{http://uri.etsi.org/2038/v1.1.1#}AlgAndLengthType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgConstraintsListType", propOrder = {
    "algAndLength"
})
public class AlgConstraintsListType {

    @XmlElement(name = "AlgAndLength", required = true)
    protected List<AlgAndLengthType> algAndLength;

    /**
     * Gets the value of the algAndLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algAndLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgAndLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._2038.v1_1.AlgAndLengthType }
     * 
     * 
     */
    public List<AlgAndLengthType> getAlgAndLength() {
        if (algAndLength == null) {
            algAndLength = new ArrayList<AlgAndLengthType>();
        }
        return this.algAndLength;
    }

}

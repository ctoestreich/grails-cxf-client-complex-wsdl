
package org.etsi.uri._2038.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralSubTreesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralSubTreesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="GeneralSubTree" type="{http://uri.etsi.org/2038/v1.1.1#}GeneralSubTreeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralSubTreesListType", propOrder = {
    "generalSubTree"
})
public class GeneralSubTreesListType {

    @XmlElement(name = "GeneralSubTree", required = true)
    protected List<GeneralSubTreeType> generalSubTree;

    /**
     * Gets the value of the generalSubTree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalSubTree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralSubTree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralSubTreeType }
     * 
     * 
     */
    public List<GeneralSubTreeType> getGeneralSubTree() {
        if (generalSubTree == null) {
            generalSubTree = new ArrayList<GeneralSubTreeType>();
        }
        return this.generalSubTree;
    }

}

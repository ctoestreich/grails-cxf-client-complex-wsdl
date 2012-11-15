
package org.etsi.uri._2038.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectedCommitmentTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedCommitmentTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="SelCommitmentType" type="{http://uri.etsi.org/2038/v1.1.1#}SelectedCommitmentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedCommitmentTypeList", propOrder = {
    "selCommitmentType"
})
public class SelectedCommitmentTypeList {

    @XmlElement(name = "SelCommitmentType", required = true)
    protected List<SelectedCommitmentType> selCommitmentType;

    /**
     * Gets the value of the selCommitmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selCommitmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelCommitmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedCommitmentType }
     * 
     * 
     */
    public List<SelectedCommitmentType> getSelCommitmentType() {
        if (selCommitmentType == null) {
            selCommitmentType = new ArrayList<SelectedCommitmentType>();
        }
        return this.selCommitmentType;
    }

}

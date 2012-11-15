
package org.oasis_open.docs.dss.oasis_dss_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocReference" type="{http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#}DocReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocReferencesType", propOrder = {
    "docReference"
})
public class DocReferencesType {

    @XmlElement(name = "DocReference", required = true)
    protected List<DocReferenceType> docReference;

    /**
     * Gets the value of the docReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocReferenceType }
     * 
     * 
     */
    public List<DocReferenceType> getDocReference() {
        if (docReference == null) {
            docReference = new ArrayList<DocReferenceType>();
        }
        return this.docReference;
    }

}


package oasis.names.tc.dss._1_0.profiles.xss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._2038.v1_1.CommitmentType;


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
 *         &lt;element name="RequiredCommitments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CommitmentType" type="{http://uri.etsi.org/2038/v1.1.1#}CommitmentType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "requiredCommitments"
})
@XmlRootElement(name = "ReturnSignedResponse")
public class ReturnSignedResponse {

    @XmlElement(name = "RequiredCommitments")
    protected RequiredCommitments requiredCommitments;

    /**
     * Gets the value of the requiredCommitments property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.profiles.xss.ReturnSignedResponse.RequiredCommitments }
     *     
     */
    public RequiredCommitments getRequiredCommitments() {
        return requiredCommitments;
    }

    /**
     * Sets the value of the requiredCommitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.profiles.xss.ReturnSignedResponse.RequiredCommitments }
     *     
     */
    public void setRequiredCommitments(RequiredCommitments value) {
        this.requiredCommitments = value;
    }


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
     *         &lt;element name="CommitmentType" type="{http://uri.etsi.org/2038/v1.1.1#}CommitmentType" maxOccurs="unbounded"/>
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
        "commitmentType"
    })
    public static class RequiredCommitments {

        @XmlElement(name = "CommitmentType", required = true)
        protected List<CommitmentType> commitmentType;

        /**
         * Gets the value of the commitmentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commitmentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommitmentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommitmentType }
         * 
         * 
         */
        public List<CommitmentType> getCommitmentType() {
            if (commitmentType == null) {
                commitmentType = new ArrayList<CommitmentType>();
            }
            return this.commitmentType;
        }

    }

}

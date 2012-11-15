
package org.etsi.uri._2038.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentRulesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentRulesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="CommitmentRule" type="{http://uri.etsi.org/2038/v1.1.1#}CommitmentRuleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentRulesListType", propOrder = {
    "commitmentRule"
})
public class CommitmentRulesListType {

    @XmlElement(name = "CommitmentRule", required = true)
    protected List<CommitmentRuleType> commitmentRule;

    /**
     * Gets the value of the commitmentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitmentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitmentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentRuleType }
     * 
     * 
     */
    public List<CommitmentRuleType> getCommitmentRule() {
        if (commitmentRule == null) {
            commitmentRule = new ArrayList<CommitmentRuleType>();
        }
        return this.commitmentRule;
    }

}

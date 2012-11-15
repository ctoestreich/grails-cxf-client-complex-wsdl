
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectedCommitmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedCommitmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Empty" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="RecognizedCommitmentType" type="{http://uri.etsi.org/2038/v1.1.1#}CommitmentType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedCommitmentType", propOrder = {
    "empty",
    "recognizedCommitmentType"
})
public class SelectedCommitmentType {

    @XmlElement(name = "Empty")
    protected Object empty;
    @XmlElement(name = "RecognizedCommitmentType")
    protected CommitmentType recognizedCommitmentType;

    /**
     * Gets the value of the empty property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmpty() {
        return empty;
    }

    /**
     * Sets the value of the empty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmpty(Object value) {
        this.empty = value;
    }

    /**
     * Gets the value of the recognizedCommitmentType property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentType }
     *     
     */
    public CommitmentType getRecognizedCommitmentType() {
        return recognizedCommitmentType;
    }

    /**
     * Sets the value of the recognizedCommitmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentType }
     *     
     */
    public void setRecognizedCommitmentType(CommitmentType value) {
        this.recognizedCommitmentType = value;
    }

}

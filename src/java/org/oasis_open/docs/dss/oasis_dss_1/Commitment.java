
package org.oasis_open.docs.dss.oasis_dss_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.CommitmentTypeIndicationType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.2.2#}CommitmentTypeIndication"/>
 *         &lt;element name="BinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commitmentTypeIndication",
    "binaryValue"
})
@XmlRootElement(name = "Commitment")
public class Commitment {

    @XmlElement(name = "CommitmentTypeIndication", namespace = "http://uri.etsi.org/01903/v1.2.2#")
    protected CommitmentTypeIndicationType commitmentTypeIndication;
    @XmlElement(name = "BinaryValue")
    protected byte[] binaryValue;

    /**
     * Gets the value of the commitmentTypeIndication property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentTypeIndicationType }
     *     
     */
    public CommitmentTypeIndicationType getCommitmentTypeIndication() {
        return commitmentTypeIndication;
    }

    /**
     * Sets the value of the commitmentTypeIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentTypeIndicationType }
     *     
     */
    public void setCommitmentTypeIndication(CommitmentTypeIndicationType value) {
        this.commitmentTypeIndication = value;
    }

    /**
     * Gets the value of the binaryValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryValue() {
        return binaryValue;
    }

    /**
     * Sets the value of the binaryValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryValue(byte[] value) {
        this.binaryValue = ((byte[]) value);
    }

}

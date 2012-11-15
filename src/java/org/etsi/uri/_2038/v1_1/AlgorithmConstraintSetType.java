
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlgorithmConstraintSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmConstraintSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerAlgConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}AlgConstraintsListType" minOccurs="0"/>
 *         &lt;element name="EeCertAlgConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}AlgConstraintsListType" minOccurs="0"/>
 *         &lt;element name="CACertAlgConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}AlgConstraintsListType" minOccurs="0"/>
 *         &lt;element name="AaCertAlgConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}AlgConstraintsListType" minOccurs="0"/>
 *         &lt;element name="TSACertAlgConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}AlgConstraintsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmConstraintSetType", propOrder = {
    "signerAlgConstraints",
    "eeCertAlgConstraints",
    "caCertAlgConstraints",
    "aaCertAlgConstraints",
    "tsaCertAlgConstraints"
})
public class AlgorithmConstraintSetType {

    @XmlElement(name = "SignerAlgConstraints")
    protected AlgConstraintsListType signerAlgConstraints;
    @XmlElement(name = "EeCertAlgConstraints")
    protected AlgConstraintsListType eeCertAlgConstraints;
    @XmlElement(name = "CACertAlgConstraints")
    protected AlgConstraintsListType caCertAlgConstraints;
    @XmlElement(name = "AaCertAlgConstraints")
    protected AlgConstraintsListType aaCertAlgConstraints;
    @XmlElement(name = "TSACertAlgConstraints")
    protected AlgConstraintsListType tsaCertAlgConstraints;

    /**
     * Gets the value of the signerAlgConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getSignerAlgConstraints() {
        return signerAlgConstraints;
    }

    /**
     * Sets the value of the signerAlgConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public void setSignerAlgConstraints(AlgConstraintsListType value) {
        this.signerAlgConstraints = value;
    }

    /**
     * Gets the value of the eeCertAlgConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getEeCertAlgConstraints() {
        return eeCertAlgConstraints;
    }

    /**
     * Sets the value of the eeCertAlgConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public void setEeCertAlgConstraints(AlgConstraintsListType value) {
        this.eeCertAlgConstraints = value;
    }

    /**
     * Gets the value of the caCertAlgConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getCACertAlgConstraints() {
        return caCertAlgConstraints;
    }

    /**
     * Sets the value of the caCertAlgConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public void setCACertAlgConstraints(AlgConstraintsListType value) {
        this.caCertAlgConstraints = value;
    }

    /**
     * Gets the value of the aaCertAlgConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getAaCertAlgConstraints() {
        return aaCertAlgConstraints;
    }

    /**
     * Sets the value of the aaCertAlgConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public void setAaCertAlgConstraints(AlgConstraintsListType value) {
        this.aaCertAlgConstraints = value;
    }

    /**
     * Gets the value of the tsaCertAlgConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public AlgConstraintsListType getTSACertAlgConstraints() {
        return tsaCertAlgConstraints;
    }

    /**
     * Sets the value of the tsaCertAlgConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.AlgConstraintsListType }
     *     
     */
    public void setTSACertAlgConstraints(AlgConstraintsListType value) {
        this.tsaCertAlgConstraints = value;
    }

}

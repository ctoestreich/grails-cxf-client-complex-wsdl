
package org.etsi.uri._2038.v1_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateTrustPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateTrustPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrustPoint" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="PathLenConstraint" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AcceptablePolicySet" type="{http://uri.etsi.org/2038/v1.1.1#}AcceptablePoliciesListType" minOccurs="0"/>
 *         &lt;element name="NameConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}NameConstraintsType" minOccurs="0"/>
 *         &lt;element name="PolicyConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}PolicyConstraintsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateTrustPointType", propOrder = {
    "trustPoint",
    "pathLenConstraint",
    "acceptablePolicySet",
    "nameConstraints",
    "policyConstraints"
})
public class CertificateTrustPointType {

    @XmlElement(name = "TrustPoint", required = true)
    protected byte[] trustPoint;
    @XmlElement(name = "PathLenConstraint")
    protected BigInteger pathLenConstraint;
    @XmlElement(name = "AcceptablePolicySet")
    protected AcceptablePoliciesListType acceptablePolicySet;
    @XmlElement(name = "NameConstraints")
    protected NameConstraintsType nameConstraints;
    @XmlElement(name = "PolicyConstraints")
    protected PolicyConstraintsType policyConstraints;

    /**
     * Gets the value of the trustPoint property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTrustPoint() {
        return trustPoint;
    }

    /**
     * Sets the value of the trustPoint property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTrustPoint(byte[] value) {
        this.trustPoint = value;
    }

    /**
     * Gets the value of the pathLenConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getPathLenConstraint() {
        return pathLenConstraint;
    }

    /**
     * Sets the value of the pathLenConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setPathLenConstraint(BigInteger value) {
        this.pathLenConstraint = value;
    }

    /**
     * Gets the value of the acceptablePolicySet property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.AcceptablePoliciesListType }
     *     
     */
    public AcceptablePoliciesListType getAcceptablePolicySet() {
        return acceptablePolicySet;
    }

    /**
     * Sets the value of the acceptablePolicySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.AcceptablePoliciesListType }
     *     
     */
    public void setAcceptablePolicySet(AcceptablePoliciesListType value) {
        this.acceptablePolicySet = value;
    }

    /**
     * Gets the value of the nameConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link NameConstraintsType }
     *     
     */
    public NameConstraintsType getNameConstraints() {
        return nameConstraints;
    }

    /**
     * Sets the value of the nameConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameConstraintsType }
     *     
     */
    public void setNameConstraints(NameConstraintsType value) {
        this.nameConstraints = value;
    }

    /**
     * Gets the value of the policyConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyConstraintsType }
     *     
     */
    public PolicyConstraintsType getPolicyConstraints() {
        return policyConstraints;
    }

    /**
     * Sets the value of the policyConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyConstraintsType }
     *     
     */
    public void setPolicyConstraints(PolicyConstraintsType value) {
        this.policyConstraints = value;
    }

}

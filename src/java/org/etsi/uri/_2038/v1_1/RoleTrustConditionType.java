
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleTrustConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleTrustConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleMandated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HowCertRole" type="{http://uri.etsi.org/2038/v1.1.1#}HowCertRoleType"/>
 *         &lt;element name="AttrCertTrustTrees" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateTrustTreesType" minOccurs="0"/>
 *         &lt;element name="RoleRevReq" type="{http://uri.etsi.org/2038/v1.1.1#}CertificateRevReqType" minOccurs="0"/>
 *         &lt;element name="RoleConstraints" type="{http://uri.etsi.org/2038/v1.1.1#}RoleConstraintsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleTrustConditionType", propOrder = {
    "roleMandated",
    "howCertRole",
    "attrCertTrustTrees",
    "roleRevReq",
    "roleConstraints"
})
public class RoleTrustConditionType {

    @XmlElement(name = "RoleMandated")
    protected boolean roleMandated;
    @XmlElement(name = "HowCertRole", required = true)
    protected HowCertRoleType howCertRole;
    @XmlElement(name = "AttrCertTrustTrees")
    protected CertificateTrustTreesType attrCertTrustTrees;
    @XmlElement(name = "RoleRevReq")
    protected CertificateRevReqType roleRevReq;
    @XmlElement(name = "RoleConstraints")
    protected RoleConstraintsType roleConstraints;

    /**
     * Gets the value of the roleMandated property.
     * 
     */
    public boolean isRoleMandated() {
        return roleMandated;
    }

    /**
     * Sets the value of the roleMandated property.
     * 
     */
    public void setRoleMandated(boolean value) {
        this.roleMandated = value;
    }

    /**
     * Gets the value of the howCertRole property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.HowCertRoleType }
     *     
     */
    public HowCertRoleType getHowCertRole() {
        return howCertRole;
    }

    /**
     * Sets the value of the howCertRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.HowCertRoleType }
     *     
     */
    public void setHowCertRole(HowCertRoleType value) {
        this.howCertRole = value;
    }

    /**
     * Gets the value of the attrCertTrustTrees property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateTrustTreesType }
     *     
     */
    public CertificateTrustTreesType getAttrCertTrustTrees() {
        return attrCertTrustTrees;
    }

    /**
     * Sets the value of the attrCertTrustTrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateTrustTreesType }
     *     
     */
    public void setAttrCertTrustTrees(CertificateTrustTreesType value) {
        this.attrCertTrustTrees = value;
    }

    /**
     * Gets the value of the roleRevReq property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateRevReqType }
     *     
     */
    public CertificateRevReqType getRoleRevReq() {
        return roleRevReq;
    }

    /**
     * Sets the value of the roleRevReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.CertificateRevReqType }
     *     
     */
    public void setRoleRevReq(CertificateRevReqType value) {
        this.roleRevReq = value;
    }

    /**
     * Gets the value of the roleConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link org.etsi.uri._2038.v1_1.RoleConstraintsType }
     *     
     */
    public RoleConstraintsType getRoleConstraints() {
        return roleConstraints;
    }

    /**
     * Sets the value of the roleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.etsi.uri._2038.v1_1.RoleConstraintsType }
     *     
     */
    public void setRoleConstraints(RoleConstraintsType value) {
        this.roleConstraints = value;
    }

}

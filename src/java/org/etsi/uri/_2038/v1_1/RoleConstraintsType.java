
package org.etsi.uri._2038.v1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.AnyType;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;


/**
 * <p>Java class for RoleConstraintsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleConstraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleTypeConstraint" type="{http://uri.etsi.org/01903/v1.2.2#}ObjectIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoleValueConstraint" type="{http://uri.etsi.org/01903/v1.2.2#}AnyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleConstraintsType", propOrder = {
    "roleTypeConstraint",
    "roleValueConstraint"
})
public class RoleConstraintsType {

    @XmlElement(name = "RoleTypeConstraint")
    protected List<ObjectIdentifierType> roleTypeConstraint;
    @XmlElement(name = "RoleValueConstraint")
    protected List<AnyType> roleValueConstraint;

    /**
     * Gets the value of the roleTypeConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleTypeConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleTypeConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.ObjectIdentifierType }
     * 
     * 
     */
    public List<ObjectIdentifierType> getRoleTypeConstraint() {
        if (roleTypeConstraint == null) {
            roleTypeConstraint = new ArrayList<ObjectIdentifierType>();
        }
        return this.roleTypeConstraint;
    }

    /**
     * Gets the value of the roleValueConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleValueConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleValueConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.etsi.uri._01903.v1_2.AnyType }
     * 
     * 
     */
    public List<AnyType> getRoleValueConstraint() {
        if (roleValueConstraint == null) {
            roleValueConstraint = new ArrayList<AnyType>();
        }
        return this.roleValueConstraint;
    }

}


package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HowCertRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HowCertRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ClaimedRole"/>
 *     &lt;enumeration value="CertifiedRole"/>
 *     &lt;enumeration value="Either"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HowCertRoleType")
@XmlEnum
public enum HowCertRoleType {

    @XmlEnumValue("ClaimedRole")
    CLAIMED_ROLE("ClaimedRole"),
    @XmlEnumValue("CertifiedRole")
    CERTIFIED_ROLE("CertifiedRole"),
    @XmlEnumValue("Either")
    EITHER("Either");
    private final String value;

    HowCertRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HowCertRoleType fromValue(String v) {
        for (HowCertRoleType c: HowCertRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

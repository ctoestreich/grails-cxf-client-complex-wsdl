
package org.etsi.uri._2038.v1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateReqType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificateReqType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="signerOnly"/>
 *     &lt;enumeration value="fullPath"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificateReqType")
@XmlEnum
public enum CertificateReqType {

    @XmlEnumValue("signerOnly")
    SIGNER_ONLY("signerOnly"),
    @XmlEnumValue("fullPath")
    FULL_PATH("fullPath");
    private final String value;

    CertificateReqType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificateReqType fromValue(String v) {
        for (CertificateReqType c: CertificateReqType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package oasis.names.tc.dss._1_0.core.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import oasis.names.tc.dss._1_0.profiles.archive.UpdateSignature;
import oasis.names.tc.dss._1_0.profiles.xss.CounterSignature;
import oasis.names.tc.dss._1_0.profiles.xss.ReturnSignatureInfo;
import oasis.names.tc.dss._1_0.profiles.xss.ReturnSignedResponse;
import oasis.names.tc.dss._1_0.profiles.xss.ReturnX509CertificateInfo;
import oasis.names.tc.dss._1_0.profiles.xss.Scheme;
import oasis.names.tc.dss._1_0.profiles.xss.SignaturePolicy;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;
import org.etsi.uri._2038.v1_1.CertificateTrustTreesType;


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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ServicePolicy"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ClaimedIdentity"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Language"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}AdditionalProfile"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Schemas"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureType"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}AddTimestamp"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}IntendedAudience"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}KeySelector"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Properties"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}IncludeObject"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}IncludeEContent"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignaturePlacement"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignedReferences"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyManifests"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerificationTime"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}AdditionalKeyInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ReturnProcessingDetails"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ReturnSigningTime"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ReturnSignerIdentity"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ReturnUpdatedSignature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ReturnTransformedDocument"/>
 *           &lt;element ref="{http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#}SignatureForm"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}ReturnSignedResponse"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}ReturnSignatureInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}ReturnX509CertificateInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}CounterSignature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}ParallelSignature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}SignaturePolicy"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}Scheme"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}X509CertificateValidationOptions"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}RequireQualifiedCertificate"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchivePolicy"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}RetentionPeriod"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}UpdateSignature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveMode"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:1.0}ResponseID"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF}ReturnSignatureReason"/>
 *         &lt;/choice>
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
    "servicePolicyOrClaimedIdentityOrLanguage"
})
@XmlRootElement(name = "OptionalInputs")
public class OptionalInputs {

    @XmlElementRefs({
        @XmlElementRef(name = "RequireQualifiedCertificate", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = JAXBElement.class),
        @XmlElementRef(name = "CounterSignature", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = CounterSignature.class),
        @XmlElementRef(name = "AdditionalProfile", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "SignatureForm", namespace = "http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#", type = JAXBElement.class),
        @XmlElementRef(name = "SignedReferences", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = SignedReferences.class),
        @XmlElementRef(name = "ClaimedIdentity", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = ClaimedIdentity.class),
        @XmlElementRef(name = "UpdateSignature", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = UpdateSignature.class),
        @XmlElementRef(name = "X509CertificateValidationOptions", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = JAXBElement.class),
        @XmlElementRef(name = "SignaturePolicy", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = SignaturePolicy.class),
        @XmlElementRef(name = "IntendedAudience", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = IntendedAudience.class),
        @XmlElementRef(name = "ReturnSigningTime", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "ReturnSignedResponse", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = ReturnSignedResponse.class),
        @XmlElementRef(name = "RetentionPeriod", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
        @XmlElementRef(name = "ParallelSignature", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = JAXBElement.class),
        @XmlElementRef(name = "ReturnSignatureInfo", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = ReturnSignatureInfo.class),
        @XmlElementRef(name = "VerificationTime", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "Scheme", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = Scheme.class),
        @XmlElementRef(name = "IncludeObject", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = IncludeObject.class),
        @XmlElementRef(name = "AdditionalKeyInfo", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = AdditionalKeyInfo.class),
        @XmlElementRef(name = "Schemas", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "ArchivePolicy", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
        @XmlElementRef(name = "ReturnTransformedDocument", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = ReturnTransformedDocument.class),
        @XmlElementRef(name = "ReturnX509CertificateInfo", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = ReturnX509CertificateInfo.class),
        @XmlElementRef(name = "AddTimestamp", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = AddTimestamp.class),
        @XmlElementRef(name = "VerifyManifests", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseID", namespace = "urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:1.0", type = JAXBElement.class),
        @XmlElementRef(name = "ReturnProcessingDetails", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "ServicePolicy", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "IncludeEContent", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "ArchiveMode", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
        @XmlElementRef(name = "Properties", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = Properties.class),
        @XmlElementRef(name = "ReturnUpdatedSignature", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = ReturnUpdatedSignature.class),
        @XmlElementRef(name = "ReturnSignerIdentity", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "KeySelector", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = KeySelector.class),
        @XmlElementRef(name = "SignatureType", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "ReturnSignatureReason", namespace = "urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF", type = JAXBElement.class),
        @XmlElementRef(name = "SignaturePlacement", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = SignaturePlacement.class),
        @XmlElementRef(name = "Language", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class)
    })
    protected List<Object> servicePolicyOrClaimedIdentityOrLanguage;

    /**
     * Gets the value of the servicePolicyOrClaimedIdentityOrLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicePolicyOrClaimedIdentityOrLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicePolicyOrClaimedIdentityOrLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * {@link CounterSignature }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * {@link SignedReferences }
     * {@link oasis.names.tc.dss._1_0.core.schema.ClaimedIdentity }
     * {@link SignaturePolicy }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link org.etsi.uri._2038.v1_1.CertificateTrustTreesType }{@code >}
     * {@link UpdateSignature }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link oasis.names.tc.dss._1_0.core.schema.IntendedAudience }
     * {@link ReturnSignedResponse }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.Duration }{@code >}
     * {@link ReturnSignatureInfo }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     * {@link oasis.names.tc.dss._1_0.core.schema.IncludeObject }
     * {@link Scheme }
     * {@link oasis.names.tc.dss._1_0.core.schema.AdditionalKeyInfo }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link SchemasType }{@code >}
     * {@link ReturnTransformedDocument }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link org.etsi.uri._01903.v1_2.ObjectIdentifierType }{@code >}
     * {@link oasis.names.tc.dss._1_0.core.schema.AddTimestamp }
     * {@link ReturnX509CertificateInfo }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link ReturnUpdatedSignature }
     * {@link Properties }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * {@link oasis.names.tc.dss._1_0.core.schema.KeySelector }
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}
     * {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     * {@link SignaturePlacement }
     * 
     * 
     */
    public List<Object> getServicePolicyOrClaimedIdentityOrLanguage() {
        if (servicePolicyOrClaimedIdentityOrLanguage == null) {
            servicePolicyOrClaimedIdentityOrLanguage = new ArrayList<Object>();
        }
        return this.servicePolicyOrClaimedIdentityOrLanguage;
    }

}

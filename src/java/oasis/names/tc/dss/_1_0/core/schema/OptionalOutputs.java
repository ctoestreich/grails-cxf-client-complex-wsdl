
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
import oasis.names.tc.dss._1_0.profiles.xss.ArchiveInfo;
import oasis.names.tc.dss._1_0.profiles.xss.ResponseSignature;
import oasis.names.tc.dss._1_0.profiles.xss.SchemeInfo;
import oasis.names.tc.dss._1_0.profiles.xss.SignatureInfo;
import oasis.names.tc.dss._1_0.profiles.xss.SignaturePolicyInfo;
import oasis.names.tc.dss._1_0.profiles.xss.X509CertificateInfo;
import oasis.names.tc.saml._1_0.assertion.NameIdentifierType;


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
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentWithSignature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyManifestResults"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}ProcessingDetails"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SigningTime"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignerIdentity"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}UpdatedSignature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}TransformedDocument"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}ResponseSignature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}ArchiveInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}SignatureInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}X509CertificateInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}SignaturePolicyInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:XSS}SchemeInfo"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:1.0}ResponseID"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF}SignatureReason"/>
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
    "documentWithSignatureOrVerifyManifestResultsOrProcessingDetails"
})
@XmlRootElement(name = "OptionalOutputs")
public class OptionalOutputs {

    @XmlElementRefs({
        @XmlElementRef(name = "SignatureReason", namespace = "urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF", type = JAXBElement.class),
        @XmlElementRef(name = "DocumentWithSignature", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = DocumentWithSignature.class),
        @XmlElementRef(name = "SchemeInfo", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = SchemeInfo.class),
        @XmlElementRef(name = "SignerIdentity", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "X509CertificateInfo", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = X509CertificateInfo.class),
        @XmlElementRef(name = "ProcessingDetails", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = ProcessingDetails.class),
        @XmlElementRef(name = "UpdatedSignature", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = UpdatedSignature.class),
        @XmlElementRef(name = "ResponseID", namespace = "urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:1.0", type = JAXBElement.class),
        @XmlElementRef(name = "SignatureInfo", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = SignatureInfo.class),
        @XmlElementRef(name = "SigningTime", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = SigningTime.class),
        @XmlElementRef(name = "VerifyManifestResults", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = JAXBElement.class),
        @XmlElementRef(name = "TransformedDocument", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = TransformedDocument.class),
        @XmlElementRef(name = "ArchiveInfo", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = ArchiveInfo.class),
        @XmlElementRef(name = "ResponseSignature", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = ResponseSignature.class),
        @XmlElementRef(name = "SignaturePolicyInfo", namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", type = SignaturePolicyInfo.class)
    })
    protected List<Object> documentWithSignatureOrVerifyManifestResultsOrProcessingDetails;

    /**
     * Gets the value of the documentWithSignatureOrVerifyManifestResultsOrProcessingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentWithSignatureOrVerifyManifestResultsOrProcessingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentWithSignatureOrVerifyManifestResultsOrProcessingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link DocumentWithSignature }
     * {@link SchemeInfo }
     * {@link JAXBElement }{@code <}{@link NameIdentifierType }{@code >}
     * {@link X509CertificateInfo }
     * {@link ProcessingDetails }
     * {@link UpdatedSignature }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link SignatureInfo }
     * {@link SigningTime }
     * {@link JAXBElement }{@code <}{@link VerifyManifestResultsType }{@code >}
     * {@link TransformedDocument }
     * {@link ArchiveInfo }
     * {@link ResponseSignature }
     * {@link SignaturePolicyInfo }
     * 
     * 
     */
    public List<Object> getDocumentWithSignatureOrVerifyManifestResultsOrProcessingDetails() {
        if (documentWithSignatureOrVerifyManifestResultsOrProcessingDetails == null) {
            documentWithSignatureOrVerifyManifestResultsOrProcessingDetails = new ArrayList<Object>();
        }
        return this.documentWithSignatureOrVerifyManifestResultsOrProcessingDetails;
    }

}

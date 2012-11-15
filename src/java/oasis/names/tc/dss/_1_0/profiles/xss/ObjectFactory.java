
package oasis.names.tc.dss._1_0.profiles.xss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.etsi.uri._2038.v1_1.CertificateTrustTreesType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.dss._1_0.profiles.xss package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequireQualifiedCertificate_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:XSS", "RequireQualifiedCertificate");
    private final static QName _ParallelSignature_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:XSS", "ParallelSignature");
    private final static QName _X509CertificateValidationOptions_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:XSS", "X509CertificateValidationOptions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.dss._1_0.profiles.xss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnSignedResponse }
     * 
     */
    public ReturnSignedResponse createReturnSignedResponse() {
        return new ReturnSignedResponse();
    }

    /**
     * Create an instance of {@link SignaturePolicy }
     * 
     */
    public SignaturePolicy createSignaturePolicy() {
        return new SignaturePolicy();
    }

    /**
     * Create an instance of {@link Scheme }
     * 
     */
    public Scheme createScheme() {
        return new Scheme();
    }

    /**
     * Create an instance of {@link SignaturePolicyInfo }
     * 
     */
    public SignaturePolicyInfo createSignaturePolicyInfo() {
        return new SignaturePolicyInfo();
    }

    /**
     * Create an instance of {@link ReturnSignedResponse.RequiredCommitments }
     * 
     */
    public ReturnSignedResponse.RequiredCommitments createReturnSignedResponseRequiredCommitments() {
        return new ReturnSignedResponse.RequiredCommitments();
    }

    /**
     * Create an instance of {@link oasis.names.tc.dss._1_0.profiles.xss.ArchiveInfo }
     * 
     */
    public ArchiveInfo createArchiveInfo() {
        return new ArchiveInfo();
    }

    /**
     * Create an instance of {@link SchemeInfo }
     * 
     */
    public SchemeInfo createSchemeInfo() {
        return new SchemeInfo();
    }

    /**
     * Create an instance of {@link ReturnX509CertificateInfo }
     * 
     */
    public ReturnX509CertificateInfo createReturnX509CertificateInfo() {
        return new ReturnX509CertificateInfo();
    }

    /**
     * Create an instance of {@link ReturnSignatureInfo }
     * 
     */
    public ReturnSignatureInfo createReturnSignatureInfo() {
        return new ReturnSignatureInfo();
    }

    /**
     * Create an instance of {@link X509CertificateInfo }
     * 
     */
    public X509CertificateInfo createX509CertificateInfo() {
        return new X509CertificateInfo();
    }

    /**
     * Create an instance of {@link ResponseSignature }
     * 
     */
    public ResponseSignature createResponseSignature() {
        return new ResponseSignature();
    }

    /**
     * Create an instance of {@link SignatureInfo }
     * 
     */
    public SignatureInfo createSignatureInfo() {
        return new SignatureInfo();
    }

    /**
     * Create an instance of {@link oasis.names.tc.dss._1_0.profiles.xss.CounterSignature }
     * 
     */
    public CounterSignature createCounterSignature() {
        return new CounterSignature();
    }

    /**
     * Create an instance of {@link oasis.names.tc.dss._1_0.profiles.xss.BinaryAttributeValueType }
     * 
     */
    public BinaryAttributeValueType createBinaryAttributeValueType() {
        return new BinaryAttributeValueType();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", name = "RequireQualifiedCertificate")
    public JAXBElement<Object> createRequireQualifiedCertificate(Object value) {
        return new JAXBElement<Object>(_RequireQualifiedCertificate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", name = "ParallelSignature")
    public JAXBElement<Object> createParallelSignature(Object value) {
        return new JAXBElement<Object>(_ParallelSignature_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CertificateTrustTreesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:XSS", name = "X509CertificateValidationOptions")
    public JAXBElement<CertificateTrustTreesType> createX509CertificateValidationOptions(CertificateTrustTreesType value) {
        return new JAXBElement<CertificateTrustTreesType>(_X509CertificateValidationOptions_QNAME, CertificateTrustTreesType.class, null, value);
    }

}

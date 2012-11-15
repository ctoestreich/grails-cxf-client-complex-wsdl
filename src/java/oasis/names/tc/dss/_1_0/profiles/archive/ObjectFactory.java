
package oasis.names.tc.dss._1_0.profiles.archive;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import oasis.names.tc.dss._1_0.core.schema.ResponseBaseType;
import org.etsi.uri._01903.v1_2.ObjectIdentifierType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.dss._1_0.profiles.archive package. 
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

    private final static QName _ArchivePolicy_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchivePolicy");
    private final static QName _ArchiveMode_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchiveMode");
    private final static QName _ArchiveVerifyResponse_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchiveVerifyResponse");
    private final static QName _ArchiveModifyResponse_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchiveModifyResponse");
    private final static QName _RetentionPeriod_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "RetentionPeriod");
    private final static QName _ArchiveRetrievalRequest_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchiveRetrievalRequest");
    private final static QName _ArchiveDeleteRequest_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchiveDeleteRequest");
    private final static QName _ArchiveModifyRequest_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchiveModifyRequest");
    private final static QName _ArchiveVerifyRequest_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:archive", "ArchiveVerifyRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.dss._1_0.profiles.archive
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArchiveSubmitResponse }
     * 
     */
    public ArchiveSubmitResponse createArchiveSubmitResponse() {
        return new ArchiveSubmitResponse();
    }

    /**
     * Create an instance of {@link ArchiveSubmitRequest }
     * 
     */
    public ArchiveSubmitRequest createArchiveSubmitRequest() {
        return new ArchiveSubmitRequest();
    }

    /**
     * Create an instance of {@link ArchiveRetrievalResponse }
     * 
     */
    public ArchiveRetrievalResponse createArchiveRetrievalResponse() {
        return new ArchiveRetrievalResponse();
    }

    /**
     * Create an instance of {@link ArchiveDeleteResponse }
     * 
     */
    public ArchiveDeleteResponse createArchiveDeleteResponse() {
        return new ArchiveDeleteResponse();
    }

    /**
     * Create an instance of {@link UpdateSignature }
     * 
     */
    public UpdateSignature createUpdateSignature() {
        return new UpdateSignature();
    }

    /**
     * Create an instance of {@link ArchiveIdentifierRequest }
     * 
     */
    public ArchiveIdentifierRequest createArchiveIdentifierRequest() {
        return new ArchiveIdentifierRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchivePolicy")
    public JAXBElement<ObjectIdentifierType> createArchivePolicy(ObjectIdentifierType value) {
        return new JAXBElement<ObjectIdentifierType>(_ArchivePolicy_QNAME, ObjectIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchiveMode")
    public JAXBElement<String> createArchiveMode(String value) {
        return new JAXBElement<String>(_ArchiveMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchiveVerifyResponse")
    public JAXBElement<ResponseBaseType> createArchiveVerifyResponse(ResponseBaseType value) {
        return new JAXBElement<ResponseBaseType>(_ArchiveVerifyResponse_QNAME, ResponseBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchiveModifyResponse")
    public JAXBElement<ResponseBaseType> createArchiveModifyResponse(ResponseBaseType value) {
        return new JAXBElement<ResponseBaseType>(_ArchiveModifyResponse_QNAME, ResponseBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "RetentionPeriod")
    public JAXBElement<Duration> createRetentionPeriod(Duration value) {
        return new JAXBElement<Duration>(_RetentionPeriod_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchiveRetrievalRequest")
    public JAXBElement<ArchiveIdentifierRequest> createArchiveRetrievalRequest(ArchiveIdentifierRequest value) {
        return new JAXBElement<ArchiveIdentifierRequest>(_ArchiveRetrievalRequest_QNAME, ArchiveIdentifierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchiveDeleteRequest")
    public JAXBElement<ArchiveIdentifierRequest> createArchiveDeleteRequest(ArchiveIdentifierRequest value) {
        return new JAXBElement<ArchiveIdentifierRequest>(_ArchiveDeleteRequest_QNAME, ArchiveIdentifierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchiveModifyRequest")
    public JAXBElement<ArchiveIdentifierRequest> createArchiveModifyRequest(ArchiveIdentifierRequest value) {
        return new JAXBElement<ArchiveIdentifierRequest>(_ArchiveModifyRequest_QNAME, ArchiveIdentifierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", name = "ArchiveVerifyRequest")
    public JAXBElement<ArchiveIdentifierRequest> createArchiveVerifyRequest(ArchiveIdentifierRequest value) {
        return new JAXBElement<ArchiveIdentifierRequest>(_ArchiveVerifyRequest_QNAME, ArchiveIdentifierRequest.class, null, value);
    }

}

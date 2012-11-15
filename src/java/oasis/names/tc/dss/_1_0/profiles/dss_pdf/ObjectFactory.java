
package oasis.names.tc.dss._1_0.profiles.dss_pdf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.dss._1_0.profiles.dss_pdf package. 
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

    private final static QName _SignatureReason_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF", "SignatureReason");
    private final static QName _ReturnSignatureReason_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF", "ReturnSignatureReason");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.dss._1_0.profiles.dss_pdf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF", name = "SignatureReason")
    public JAXBElement<String> createSignatureReason(String value) {
        return new JAXBElement<String>(_SignatureReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:DSS_PDF", name = "ReturnSignatureReason")
    public JAXBElement<Object> createReturnSignatureReason(Object value) {
        return new JAXBElement<Object>(_ReturnSignatureReason_QNAME, Object.class, null, value);
    }

}

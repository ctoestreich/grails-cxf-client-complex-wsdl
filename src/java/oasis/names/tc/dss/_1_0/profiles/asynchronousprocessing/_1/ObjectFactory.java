
package oasis.names.tc.dss._1_0.profiles.asynchronousprocessing._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.dss._1_0.profiles.asynchronousprocessing._1 package. 
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

    private final static QName _ResponseID_QNAME = new QName("urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:1.0", "ResponseID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.dss._1_0.profiles.asynchronousprocessing._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PendingRequest }
     * 
     */
    public PendingRequest createPendingRequest() {
        return new PendingRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:dss:1.0:profiles:asynchronousprocessing:1.0", name = "ResponseID")
    public JAXBElement<String> createResponseID(String value) {
        return new JAXBElement<String>(_ResponseID_QNAME, String.class, null, value);
    }

}

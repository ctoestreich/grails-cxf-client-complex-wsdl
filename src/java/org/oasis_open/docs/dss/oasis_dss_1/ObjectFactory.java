
package org.oasis_open.docs.dss.oasis_dss_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.dss.oasis_dss_1 package. 
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

    private final static QName _DocsFormat_QNAME = new QName("http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#", "DocsFormat");
    private final static QName _DocsToBeTimeStamped_QNAME = new QName("http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#", "DocsToBeTimeStamped");
    private final static QName _SignatureForm_QNAME = new QName("http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#", "SignatureForm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.dss.oasis_dss_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.dss.oasis_dss_1.Commitment }
     * 
     */
    public Commitment createCommitment() {
        return new Commitment();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.dss.oasis_dss_1.DocsFormatType }
     * 
     */
    public DocsFormatType createDocsFormatType() {
        return new DocsFormatType();
    }

    /**
     * Create an instance of {@link SignerRole }
     * 
     */
    public SignerRole createSignerRole() {
        return new SignerRole();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.dss.oasis_dss_1.DocReferencesType }
     * 
     */
    public DocReferencesType createDocReferencesType() {
        return new DocReferencesType();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.dss.oasis_dss_1.DocReferenceType }
     * 
     */
    public DocReferenceType createDocReferenceType() {
        return new DocReferenceType();
    }

    /**
     * Create an instance of {@link org.oasis_open.docs.dss.oasis_dss_1.DocFormatType }
     * 
     */
    public DocFormatType createDocFormatType() {
        return new DocFormatType();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link org.oasis_open.docs.dss.oasis_dss_1.DocsFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#", name = "DocsFormat")
    public JAXBElement<DocsFormatType> createDocsFormat(DocsFormatType value) {
        return new JAXBElement<DocsFormatType>(_DocsFormat_QNAME, DocsFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link org.oasis_open.docs.dss.oasis_dss_1.DocReferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#", name = "DocsToBeTimeStamped")
    public JAXBElement<DocReferencesType> createDocsToBeTimeStamped(DocReferencesType value) {
        return new JAXBElement<DocReferencesType>(_DocsToBeTimeStamped_QNAME, DocReferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#", name = "SignatureForm")
    public JAXBElement<String> createSignatureForm(String value) {
        return new JAXBElement<String>(_SignatureForm_QNAME, String.class, null, value);
    }

}

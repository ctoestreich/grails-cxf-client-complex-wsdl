
package org.etsi.uri._02231.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.etsi.uri._02231.v1 package. 
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

    private final static QName _ServiceInformation_QNAME = new QName("http://uri.etsi.org/02231/v1.0bis-2005-04#", "ServiceInformation");
    private final static QName _TrustServiceProvider_QNAME = new QName("http://uri.etsi.org/02231/v1.0bis-2005-04#", "TrustServiceProvider");
    private final static QName _TSLTag_QNAME = new QName("http://uri.etsi.org/02231/v1.0bis-2005-04#", "TSLTag");
    private final static QName _TSPServices_QNAME = new QName("http://uri.etsi.org/02231/v1.0bis-2005-04#", "TSPServices");
    private final static QName _TrustStatusList_QNAME = new QName("http://uri.etsi.org/02231/v1.0bis-2005-04#", "TrustStatusList");
    private final static QName _ServiceStatusInformation_QNAME = new QName("http://uri.etsi.org/02231/v1.0bis-2005-04#", "ServiceStatusInformation");
    private final static QName _SchemeInformation_QNAME = new QName("http://uri.etsi.org/02231/v1.0bis-2005-04#", "SchemeInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.etsi.uri._02231.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ElectronicAddressType }
     * 
     */
    public ElectronicAddressType createElectronicAddressType() {
        return new ElectronicAddressType();
    }

    /**
     * Create an instance of {@link DigitalIdentityType }
     * 
     */
    public DigitalIdentityType createDigitalIdentityType() {
        return new DigitalIdentityType();
    }

    /**
     * Create an instance of {@link DigitalIdentityListType }
     * 
     */
    public DigitalIdentityListType createDigitalIdentityListType() {
        return new DigitalIdentityListType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link TrustStatusListType }
     * 
     */
    public TrustStatusListType createTrustStatusListType() {
        return new TrustStatusListType();
    }

    /**
     * Create an instance of {@link InternationalNamesType.Name }
     * 
     */
    public InternationalNamesType.Name createInternationalNamesTypeName() {
        return new InternationalNamesType.Name();
    }

    /**
     * Create an instance of {@link TSPInformationType }
     * 
     */
    public TSPInformationType createTSPInformationType() {
        return new TSPInformationType();
    }

    /**
     * Create an instance of {@link TSPServiceInformationType }
     * 
     */
    public TSPServiceInformationType createTSPServiceInformationType() {
        return new TSPServiceInformationType();
    }

    /**
     * Create an instance of {@link InternationalNamesType }
     * 
     */
    public InternationalNamesType createInternationalNamesType() {
        return new InternationalNamesType();
    }

    /**
     * Create an instance of {@link ServiceStatusInformationType }
     * 
     */
    public ServiceStatusInformationType createServiceStatusInformationType() {
        return new ServiceStatusInformationType();
    }

    /**
     * Create an instance of {@link TSLSchemeInformationType }
     * 
     */
    public TSLSchemeInformationType createTSLSchemeInformationType() {
        return new TSLSchemeInformationType();
    }

    /**
     * Create an instance of {@link PostalAddressType }
     * 
     */
    public PostalAddressType createPostalAddressType() {
        return new PostalAddressType();
    }

    /**
     * Create an instance of {@link OtherTSLPointer }
     * 
     */
    public OtherTSLPointer createOtherTSLPointer() {
        return new OtherTSLPointer();
    }

    /**
     * Create an instance of {@link PostalAddressListType }
     * 
     */
    public PostalAddressListType createPostalAddressListType() {
        return new PostalAddressListType();
    }

    /**
     * Create an instance of {@link OtherTSLPointersType }
     * 
     */
    public OtherTSLPointersType createOtherTSLPointersType() {
        return new OtherTSLPointersType();
    }

    /**
     * Create an instance of {@link TSPServicesType }
     * 
     */
    public TSPServicesType createTSPServicesType() {
        return new TSPServicesType();
    }

    /**
     * Create an instance of {@link PolicyOrLegalnoticeType }
     * 
     */
    public PolicyOrLegalnoticeType createPolicyOrLegalnoticeType() {
        return new PolicyOrLegalnoticeType();
    }

    /**
     * Create an instance of {@link TSPType }
     * 
     */
    public TSPType createTSPType() {
        return new TSPType();
    }

    /**
     * Create an instance of {@link ServiceHistoryType }
     * 
     */
    public ServiceHistoryType createServiceHistoryType() {
        return new ServiceHistoryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPServiceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v1.0bis-2005-04#", name = "ServiceInformation")
    public JAXBElement<TSPServiceInformationType> createServiceInformation(TSPServiceInformationType value) {
        return new JAXBElement<TSPServiceInformationType>(_ServiceInformation_QNAME, TSPServiceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v1.0bis-2005-04#", name = "TrustServiceProvider")
    public JAXBElement<TSPType> createTrustServiceProvider(TSPType value) {
        return new JAXBElement<TSPType>(_TrustServiceProvider_QNAME, TSPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v1.0bis-2005-04#", name = "TSLTag")
    public JAXBElement<String> createTSLTag(String value) {
        return new JAXBElement<String>(_TSLTag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSPServicesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v1.0bis-2005-04#", name = "TSPServices")
    public JAXBElement<TSPServicesType> createTSPServices(TSPServicesType value) {
        return new JAXBElement<TSPServicesType>(_TSPServices_QNAME, TSPServicesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustStatusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v1.0bis-2005-04#", name = "TrustStatusList")
    public JAXBElement<TrustStatusListType> createTrustStatusList(TrustStatusListType value) {
        return new JAXBElement<TrustStatusListType>(_TrustStatusList_QNAME, TrustStatusListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatusInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v1.0bis-2005-04#", name = "ServiceStatusInformation")
    public JAXBElement<ServiceStatusInformationType> createServiceStatusInformation(ServiceStatusInformationType value) {
        return new JAXBElement<ServiceStatusInformationType>(_ServiceStatusInformation_QNAME, ServiceStatusInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSLSchemeInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v1.0bis-2005-04#", name = "SchemeInformation")
    public JAXBElement<TSLSchemeInformationType> createSchemeInformation(TSLSchemeInformationType value) {
        return new JAXBElement<TSLSchemeInformationType>(_SchemeInformation_QNAME, TSLSchemeInformationType.class, null, value);
    }

}

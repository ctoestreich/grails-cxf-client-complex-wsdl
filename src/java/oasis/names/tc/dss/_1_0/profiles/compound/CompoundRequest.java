
package oasis.names.tc.dss._1_0.profiles.compound;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.OptionalInputs;
import oasis.names.tc.dss._1_0.core.schema.SignRequest;
import oasis.names.tc.dss._1_0.core.schema.VerifyRequest;
import oasis.names.tc.dss._1_0.profiles.archive.ArchiveIdentifierRequest;
import oasis.names.tc.dss._1_0.profiles.archive.ArchiveSubmitRequest;


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
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}OptionalInputs" minOccurs="0"/>
 *         &lt;element name="Requests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyRequest"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignRequest"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveSubmitRequest"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveRetrievalRequest"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveModifyRequest"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveVerifyRequest"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveDeleteRequest"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Profile" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionalInputs",
    "requests"
})
@XmlRootElement(name = "CompoundRequest")
public class CompoundRequest {

    @XmlElement(name = "OptionalInputs", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected OptionalInputs optionalInputs;
    @XmlElement(name = "Requests", required = true)
    protected CompoundRequest.Requests requests;
    @XmlAttribute(name = "RequestID")
    protected String requestID;
    @XmlAttribute(name = "Profile")
    @XmlSchemaType(name = "anyURI")
    protected String profile;

    /**
     * Gets the value of the optionalInputs property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalInputs }
     *     
     */
    public OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Sets the value of the optionalInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalInputs }
     *     
     */
    public void setOptionalInputs(OptionalInputs value) {
        this.optionalInputs = value;
    }

    /**
     * Gets the value of the requests property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundRequest.Requests }
     *     
     */
    public CompoundRequest.Requests getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundRequest.Requests }
     *     
     */
    public void setRequests(CompoundRequest.Requests value) {
        this.requests = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }


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
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyRequest"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignRequest"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveSubmitRequest"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveRetrievalRequest"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveModifyRequest"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveVerifyRequest"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveDeleteRequest"/>
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
        "verifyRequestOrSignRequestOrArchiveSubmitRequest"
    })
    public static class Requests {

        @XmlElementRefs({
            @XmlElementRef(name = "ArchiveSubmitRequest", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = ArchiveSubmitRequest.class),
            @XmlElementRef(name = "VerifyRequest", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = VerifyRequest.class),
            @XmlElementRef(name = "ArchiveDeleteRequest", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
            @XmlElementRef(name = "ArchiveModifyRequest", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
            @XmlElementRef(name = "ArchiveVerifyRequest", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
            @XmlElementRef(name = "ArchiveRetrievalRequest", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
            @XmlElementRef(name = "SignRequest", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = SignRequest.class)
        })
        protected List<Object> verifyRequestOrSignRequestOrArchiveSubmitRequest;

        /**
         * Gets the value of the verifyRequestOrSignRequestOrArchiveSubmitRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the verifyRequestOrSignRequestOrArchiveSubmitRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVerifyRequestOrSignRequestOrArchiveSubmitRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArchiveSubmitRequest }
         * {@link VerifyRequest }
         * {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}
         * {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}
         * {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}
         * {@link JAXBElement }{@code <}{@link ArchiveIdentifierRequest }{@code >}
         * {@link SignRequest }
         * 
         * 
         */
        public List<Object> getVerifyRequestOrSignRequestOrArchiveSubmitRequest() {
            if (verifyRequestOrSignRequestOrArchiveSubmitRequest == null) {
                verifyRequestOrSignRequestOrArchiveSubmitRequest = new ArrayList<Object>();
            }
            return this.verifyRequestOrSignRequestOrArchiveSubmitRequest;
        }

    }

}

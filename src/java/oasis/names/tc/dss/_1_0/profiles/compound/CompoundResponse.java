
package oasis.names.tc.dss._1_0.profiles.compound;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.OptionalOutputs;
import oasis.names.tc.dss._1_0.core.schema.ResponseBaseType;
import oasis.names.tc.dss._1_0.core.schema.SignResponse;
import oasis.names.tc.dss._1_0.core.schema.VerifyResponse;
import oasis.names.tc.dss._1_0.profiles.archive.ArchiveDeleteResponse;
import oasis.names.tc.dss._1_0.profiles.archive.ArchiveRetrievalResponse;
import oasis.names.tc.dss._1_0.profiles.archive.ArchiveSubmitResponse;


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
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}OptionalOutputs" minOccurs="0"/>
 *         &lt;element name="Responses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyResponse"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignResponse"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveSubmitResponse"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveRetrievalResponse"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveModifyResponse"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveVerifyResponse"/>
 *                     &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveDeleteResponse"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "optionalOutputs",
    "responses"
})
@XmlRootElement(name = "CompoundResponse")
public class CompoundResponse {

    @XmlElement(name = "OptionalOutputs", namespace = "urn:oasis:names:tc:dss:1.0:core:schema")
    protected OptionalOutputs optionalOutputs;
    @XmlElement(name = "Responses", required = true)
    protected Responses responses;

    /**
     * Gets the value of the optionalOutputs property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.OptionalOutputs }
     *     
     */
    public OptionalOutputs getOptionalOutputs() {
        return optionalOutputs;
    }

    /**
     * Sets the value of the optionalOutputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.core.schema.OptionalOutputs }
     *     
     */
    public void setOptionalOutputs(OptionalOutputs value) {
        this.optionalOutputs = value;
    }

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link oasis.names.tc.dss._1_0.profiles.compound.CompoundResponse.Responses }
     *     
     */
    public Responses getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link oasis.names.tc.dss._1_0.profiles.compound.CompoundResponse.Responses }
     *     
     */
    public void setResponses(Responses value) {
        this.responses = value;
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
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}VerifyResponse"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignResponse"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveSubmitResponse"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveRetrievalResponse"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveModifyResponse"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveVerifyResponse"/>
     *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:profiles:archive}ArchiveDeleteResponse"/>
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
        "verifyResponseOrSignResponseOrArchiveSubmitResponse"
    })
    public static class Responses {

        @XmlElementRefs({
            @XmlElementRef(name = "ArchiveRetrievalResponse", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = ArchiveRetrievalResponse.class),
            @XmlElementRef(name = "VerifyResponse", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = VerifyResponse.class),
            @XmlElementRef(name = "ArchiveVerifyResponse", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
            @XmlElementRef(name = "ArchiveSubmitResponse", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = ArchiveSubmitResponse.class),
            @XmlElementRef(name = "ArchiveModifyResponse", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = JAXBElement.class),
            @XmlElementRef(name = "ArchiveDeleteResponse", namespace = "urn:oasis:names:tc:dss:1.0:profiles:archive", type = ArchiveDeleteResponse.class),
            @XmlElementRef(name = "SignResponse", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", type = SignResponse.class)
        })
        protected List<Object> verifyResponseOrSignResponseOrArchiveSubmitResponse;

        /**
         * Gets the value of the verifyResponseOrSignResponseOrArchiveSubmitResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the verifyResponseOrSignResponseOrArchiveSubmitResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVerifyResponseOrSignResponseOrArchiveSubmitResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link oasis.names.tc.dss._1_0.profiles.archive.ArchiveRetrievalResponse }
         * {@link oasis.names.tc.dss._1_0.core.schema.VerifyResponse }
         * {@link javax.xml.bind.JAXBElement }{@code <}{@link oasis.names.tc.dss._1_0.core.schema.ResponseBaseType }{@code >}
         * {@link oasis.names.tc.dss._1_0.profiles.archive.ArchiveSubmitResponse }
         * {@link javax.xml.bind.JAXBElement }{@code <}{@link oasis.names.tc.dss._1_0.core.schema.ResponseBaseType }{@code >}
         * {@link oasis.names.tc.dss._1_0.profiles.archive.ArchiveDeleteResponse }
         * {@link oasis.names.tc.dss._1_0.core.schema.SignResponse }
         * 
         * 
         */
        public List<Object> getVerifyResponseOrSignResponseOrArchiveSubmitResponse() {
            if (verifyResponseOrSignResponseOrArchiveSubmitResponse == null) {
                verifyResponseOrSignResponseOrArchiveSubmitResponse = new ArrayList<Object>();
            }
            return this.verifyResponseOrSignResponseOrArchiveSubmitResponse;
        }

    }

}

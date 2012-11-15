
package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * This Type clearly expresses the fact that content of InlineXML should be
 * 						equivalent to a complete XML Document. I.e. having only one
 * 						DocumentElement and not allowing anything but PI's and Comments before
 * 						and after this one element. The attribute ignorePIsComments indicates
 * 						how to deal with PI's and Comments as a number of parsers will also
 * 						ignore them and a server will have to be able to know if PI's and
 * 						Comments have gone missing after parsing and if the client would have
 * 						wanted them to be signed.
 * 
 * <p>Java class for InlineXMLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlineXMLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax'/>
 *       &lt;/sequence>
 *       &lt;attribute name="ignorePIs" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ignoreComments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InlineXMLType", propOrder = {
    "any"
})
public class InlineXMLType {

    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "ignorePIs")
    protected Boolean ignorePIs;
    @XmlAttribute(name = "ignoreComments")
    protected Boolean ignoreComments;

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Gets the value of the ignorePIs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnorePIs() {
        if (ignorePIs == null) {
            return true;
        } else {
            return ignorePIs;
        }
    }

    /**
     * Sets the value of the ignorePIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorePIs(Boolean value) {
        this.ignorePIs = value;
    }

    /**
     * Gets the value of the ignoreComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreComments() {
        if (ignoreComments == null) {
            return true;
        } else {
            return ignoreComments;
        }
    }

    /**
     * Sets the value of the ignoreComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreComments(Boolean value) {
        this.ignoreComments = value;
    }

}

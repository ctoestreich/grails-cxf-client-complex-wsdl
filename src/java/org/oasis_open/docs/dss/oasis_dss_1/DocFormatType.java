
package org.oasis_open.docs.dss.oasis_dss_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_2.DataObjectFormatType;


/**
 * <p>Java class for DocFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocFormatType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.docs.oasis-open.org/dss/oasis-dss-1.0-profiles-XAdES-cd-01#}DocReferenceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.2.2#}DataObjectFormat"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocFormatType", propOrder = {
    "dataObjectFormat"
})
public class DocFormatType
    extends DocReferenceType
{

    @XmlElement(name = "DataObjectFormat", namespace = "http://uri.etsi.org/01903/v1.2.2#", required = true)
    protected DataObjectFormatType dataObjectFormat;

    /**
     * Gets the value of the dataObjectFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectFormatType }
     *     
     */
    public DataObjectFormatType getDataObjectFormat() {
        return dataObjectFormat;
    }

    /**
     * Sets the value of the dataObjectFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectFormatType }
     *     
     */
    public void setDataObjectFormat(DataObjectFormatType value) {
        this.dataObjectFormat = value;
    }

}

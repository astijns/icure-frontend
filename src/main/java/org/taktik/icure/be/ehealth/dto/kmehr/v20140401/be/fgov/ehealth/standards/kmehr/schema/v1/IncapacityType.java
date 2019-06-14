//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 03:48:40 PM CEST 
//


package org.taktik.icure.be.ehealth.dto.kmehr.v20140401.be.fgov.ehealth.standards.kmehr.schema.v1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.taktik.icure.be.ehealth.dto.kmehr.v20140401.be.fgov.ehealth.standards.kmehr.cd.v1.CDINCAPACITY;


/**
 * <p>Java class for incapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="incapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cd" type="{http://www.ehealth.fgov.be/standards/kmehr/cd/v1}CD-INCAPACITY" maxOccurs="unbounded"/>
 *         &lt;element name="incapacityreason" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}incapacityreasonType" minOccurs="0"/>
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="outofhomeallowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "incapacityType", propOrder = {
    "cds",
    "incapacityreason",
    "percentage",
    "outofhomeallowed"
})
public class IncapacityType
    implements Serializable
{

    private final static long serialVersionUID = 20140401L;
    @XmlElement(name = "cd", required = true)
    protected List<CDINCAPACITY> cds;
    protected IncapacityreasonType incapacityreason;
    protected BigDecimal percentage;
    protected Boolean outofhomeallowed;

    /**
     * Gets the value of the cds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDINCAPACITY }
     * 
     * 
     */
    public List<CDINCAPACITY> getCds() {
        if (cds == null) {
            cds = new ArrayList<CDINCAPACITY>();
        }
        return this.cds;
    }

    /**
     * Gets the value of the incapacityreason property.
     * 
     * @return
     *     possible object is
     *     {@link IncapacityreasonType }
     *     
     */
    public IncapacityreasonType getIncapacityreason() {
        return incapacityreason;
    }

    /**
     * Sets the value of the incapacityreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncapacityreasonType }
     *     
     */
    public void setIncapacityreason(IncapacityreasonType value) {
        this.incapacityreason = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the outofhomeallowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutofhomeallowed() {
        return outofhomeallowed;
    }

    /**
     * Sets the value of the outofhomeallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutofhomeallowed(Boolean value) {
        this.outofhomeallowed = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 03:49:26 PM CEST 
//


package org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20150901.be.fgov.ehealth.standards.kmehr.schema.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20150901.org.w3.xmldsig.Signature;
import org.taktik.icure.services.external.rest.v1.dto.be.ehealth.kmehr.v20150901.org.w3.xmlenc.EncryptedType;


/**
 * to transfer medical information about one or several patients (using one folder per patient).
 * 
 * <p>Java class for kmehrmessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kmehrmessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confidentiality" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}confidentialityType" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}headerType"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="folder" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}folderType" maxOccurs="unbounded"/>
 *             &lt;element name="Signature" type="{http://www.w3.org/2000/09/xmldsig#}SignatureType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="EncryptedData" type="{http://www.w3.org/2001/04/xmlenc#}EncryptedType"/>
 *           &lt;element name="Base64EncryptedData" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}Base64EncryptedDataType"/>
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
@XmlType(name = "kmehrmessageType", propOrder = {
    "confidentiality",
    "header",
    "base64EncryptedData",
    "encryptedData",
    "folders",
    "signature"
})
@XmlRootElement(name = "kmehrmessage")
public class Kmehrmessage
    implements Serializable
{

    private final static long serialVersionUID = 20150901L;
    protected ConfidentialityType confidentiality;
    @XmlElement(required = true)
    protected HeaderType header;
    @XmlElement(name = "Base64EncryptedData")
    protected Base64EncryptedDataType base64EncryptedData;
    @XmlElement(name = "EncryptedData")
    protected EncryptedType encryptedData;
    @XmlElement(name = "folder")
    protected List<FolderType> folders;
    @XmlElementRef(name = "Signature", namespace = "http://www.ehealth.fgov.be/standards/kmehr/schema/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<Signature> signature;

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityType }
     *     
     */
    public ConfidentialityType getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityType }
     *     
     */
    public void setConfidentiality(ConfidentialityType value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the base64EncryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link Base64EncryptedDataType }
     *     
     */
    public Base64EncryptedDataType getBase64EncryptedData() {
        return base64EncryptedData;
    }

    /**
     * Sets the value of the base64EncryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64EncryptedDataType }
     *     
     */
    public void setBase64EncryptedData(Base64EncryptedDataType value) {
        this.base64EncryptedData = value;
    }

    /**
     * Gets the value of the encryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedType }
     *     
     */
    public EncryptedType getEncryptedData() {
        return encryptedData;
    }

    /**
     * Sets the value of the encryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedType }
     *     
     */
    public void setEncryptedData(EncryptedType value) {
        this.encryptedData = value;
    }

    /**
     * Gets the value of the folders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderType }
     * 
     * 
     */
    public List<FolderType> getFolders() {
        if (folders == null) {
            folders = new ArrayList<FolderType>();
        }
        return this.folders;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Signature }{@code >}
     *     
     */
    public JAXBElement<Signature> getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Signature }{@code >}
     *     
     */
    public void setSignature(JAXBElement<Signature> value) {
        this.signature = value;
    }

}

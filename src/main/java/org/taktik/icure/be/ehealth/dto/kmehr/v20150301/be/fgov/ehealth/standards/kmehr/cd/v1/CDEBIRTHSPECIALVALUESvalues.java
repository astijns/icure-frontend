//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 03:49:19 PM CEST 
//


package org.taktik.icure.be.ehealth.dto.kmehr.v20150301.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD-EBIRTH-SPECIALVALUESvalues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-EBIRTH-SPECIALVALUESvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noanswer"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="nottested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-EBIRTH-SPECIALVALUESvalues")
@XmlEnum
public enum CDEBIRTHSPECIALVALUESvalues {

    @XmlEnumValue("noanswer")
    NOANSWER("noanswer"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("nottested")
    NOTTESTED("nottested");
    private final String value;

    CDEBIRTHSPECIALVALUESvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDEBIRTHSPECIALVALUESvalues fromValue(String v) {
        for (CDEBIRTHSPECIALVALUESvalues c: CDEBIRTHSPECIALVALUESvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

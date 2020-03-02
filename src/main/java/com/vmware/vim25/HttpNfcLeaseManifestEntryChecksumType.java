
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNfcLeaseManifestEntryChecksumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HttpNfcLeaseManifestEntryChecksumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sha1"/>
 *     &lt;enumeration value="sha256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HttpNfcLeaseManifestEntryChecksumType")
@XmlEnum
public enum HttpNfcLeaseManifestEntryChecksumType {

    @XmlEnumValue("sha1")
    SHA_1("sha1"),
    @XmlEnumValue("sha256")
    SHA_256("sha256");
    private final String value;

    HttpNfcLeaseManifestEntryChecksumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HttpNfcLeaseManifestEntryChecksumType fromValue(String v) {
        for (HttpNfcLeaseManifestEntryChecksumType c: HttpNfcLeaseManifestEntryChecksumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

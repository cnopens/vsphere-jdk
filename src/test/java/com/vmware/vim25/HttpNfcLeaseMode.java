
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNfcLeaseMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HttpNfcLeaseMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pushOrGet"/>
 *     &lt;enumeration value="pull"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HttpNfcLeaseMode")
@XmlEnum
public enum HttpNfcLeaseMode {

    @XmlEnumValue("pushOrGet")
    PUSH_OR_GET("pushOrGet"),
    @XmlEnumValue("pull")
    PULL("pull");
    private final String value;

    HttpNfcLeaseMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HttpNfcLeaseMode fromValue(String v) {
        for (HttpNfcLeaseMode c: HttpNfcLeaseMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

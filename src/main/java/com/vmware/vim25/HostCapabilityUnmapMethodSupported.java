
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCapabilityUnmapMethodSupported.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostCapabilityUnmapMethodSupported">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="priority"/>
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="dynamic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostCapabilityUnmapMethodSupported")
@XmlEnum
public enum HostCapabilityUnmapMethodSupported {

    @XmlEnumValue("priority")
    PRIORITY("priority"),
    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic");
    private final String value;

    HostCapabilityUnmapMethodSupported(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostCapabilityUnmapMethodSupported fromValue(String v) {
        for (HostCapabilityUnmapMethodSupported c: HostCapabilityUnmapMethodSupported.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwarePackageVibType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoftwarePackageVibType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bootbank"/>
 *     &lt;enumeration value="tools"/>
 *     &lt;enumeration value="meta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoftwarePackageVibType")
@XmlEnum
public enum SoftwarePackageVibType {

    @XmlEnumValue("bootbank")
    BOOTBANK("bootbank"),
    @XmlEnumValue("tools")
    TOOLS("tools"),
    @XmlEnumValue("meta")
    META("meta");
    private final String value;

    SoftwarePackageVibType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoftwarePackageVibType fromValue(String v) {
        for (SoftwarePackageVibType c: SoftwarePackageVibType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

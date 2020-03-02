
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVmfsVolumeUnmapPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostVmfsVolumeUnmapPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostVmfsVolumeUnmapPriority")
@XmlEnum
public enum HostVmfsVolumeUnmapPriority {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("low")
    LOW("low");
    private final String value;

    HostVmfsVolumeUnmapPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostVmfsVolumeUnmapPriority fromValue(String v) {
        for (HostVmfsVolumeUnmapPriority c: HostVmfsVolumeUnmapPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NvdimmRangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="volatileRange"/>
 *     &lt;enumeration value="persistentRange"/>
 *     &lt;enumeration value="controlRange"/>
 *     &lt;enumeration value="blockRange"/>
 *     &lt;enumeration value="volatileVirtualDiskRange"/>
 *     &lt;enumeration value="volatileVirtualCDRange"/>
 *     &lt;enumeration value="persistentVirtualDiskRange"/>
 *     &lt;enumeration value="persistentVirtualCDRange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NvdimmRangeType")
@XmlEnum
public enum NvdimmRangeType {

    @XmlEnumValue("volatileRange")
    VOLATILE_RANGE("volatileRange"),
    @XmlEnumValue("persistentRange")
    PERSISTENT_RANGE("persistentRange"),
    @XmlEnumValue("controlRange")
    CONTROL_RANGE("controlRange"),
    @XmlEnumValue("blockRange")
    BLOCK_RANGE("blockRange"),
    @XmlEnumValue("volatileVirtualDiskRange")
    VOLATILE_VIRTUAL_DISK_RANGE("volatileVirtualDiskRange"),
    @XmlEnumValue("volatileVirtualCDRange")
    VOLATILE_VIRTUAL_CD_RANGE("volatileVirtualCDRange"),
    @XmlEnumValue("persistentVirtualDiskRange")
    PERSISTENT_VIRTUAL_DISK_RANGE("persistentVirtualDiskRange"),
    @XmlEnumValue("persistentVirtualCDRange")
    PERSISTENT_VIRTUAL_CD_RANGE("persistentVirtualCDRange");
    private final String value;

    NvdimmRangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NvdimmRangeType fromValue(String v) {
        for (NvdimmRangeType c: NvdimmRangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

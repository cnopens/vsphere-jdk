
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vslmVStorageObjectControlFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vslmVStorageObjectControlFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keepAfterDeleteVm"/>
 *     &lt;enumeration value="disableRelocation"/>
 *     &lt;enumeration value="enableChangedBlockTracking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vslmVStorageObjectControlFlag")
@XmlEnum
public enum VslmVStorageObjectControlFlag {

    @XmlEnumValue("keepAfterDeleteVm")
    KEEP_AFTER_DELETE_VM("keepAfterDeleteVm"),
    @XmlEnumValue("disableRelocation")
    DISABLE_RELOCATION("disableRelocation"),
    @XmlEnumValue("enableChangedBlockTracking")
    ENABLE_CHANGED_BLOCK_TRACKING("enableChangedBlockTracking");
    private final String value;

    VslmVStorageObjectControlFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VslmVStorageObjectControlFlag fromValue(String v) {
        for (VslmVStorageObjectControlFlag c: VslmVStorageObjectControlFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

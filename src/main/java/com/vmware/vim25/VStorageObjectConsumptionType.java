
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObjectConsumptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VStorageObjectConsumptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="disk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VStorageObjectConsumptionType")
@XmlEnum
public enum VStorageObjectConsumptionType {

    @XmlEnumValue("disk")
    DISK("disk");
    private final String value;

    VStorageObjectConsumptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VStorageObjectConsumptionType fromValue(String v) {
        for (VStorageObjectConsumptionType c: VStorageObjectConsumptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

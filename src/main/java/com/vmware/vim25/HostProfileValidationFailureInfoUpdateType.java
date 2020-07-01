
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileValidationFailureInfoUpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostProfileValidationFailureInfoUpdateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HostBased"/>
 *     &lt;enumeration value="Import"/>
 *     &lt;enumeration value="Edit"/>
 *     &lt;enumeration value="Compose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostProfileValidationFailureInfoUpdateType")
@XmlEnum
public enum HostProfileValidationFailureInfoUpdateType {

    @XmlEnumValue("HostBased")
    HOST_BASED("HostBased"),
    @XmlEnumValue("Import")
    IMPORT("Import"),
    @XmlEnumValue("Edit")
    EDIT("Edit"),
    @XmlEnumValue("Compose")
    COMPOSE("Compose");
    private final String value;

    HostProfileValidationFailureInfoUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostProfileValidationFailureInfoUpdateType fromValue(String v) {
        for (HostProfileValidationFailureInfoUpdateType c: HostProfileValidationFailureInfoUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

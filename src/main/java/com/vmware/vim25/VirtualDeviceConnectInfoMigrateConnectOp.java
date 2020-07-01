
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceConnectInfoMigrateConnectOp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualDeviceConnectInfoMigrateConnectOp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="connect"/>
 *     &lt;enumeration value="disconnect"/>
 *     &lt;enumeration value="unset"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualDeviceConnectInfoMigrateConnectOp")
@XmlEnum
public enum VirtualDeviceConnectInfoMigrateConnectOp {

    @XmlEnumValue("connect")
    CONNECT("connect"),
    @XmlEnumValue("disconnect")
    DISCONNECT("disconnect"),
    @XmlEnumValue("unset")
    UNSET("unset");
    private final String value;

    VirtualDeviceConnectInfoMigrateConnectOp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualDeviceConnectInfoMigrateConnectOp fromValue(String v) {
        for (VirtualDeviceConnectInfoMigrateConnectOp c: VirtualDeviceConnectInfoMigrateConnectOp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

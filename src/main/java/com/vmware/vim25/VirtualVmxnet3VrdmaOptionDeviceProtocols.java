
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnet3VrdmaOptionDeviceProtocols.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualVmxnet3VrdmaOptionDeviceProtocols">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rocev1"/>
 *     &lt;enumeration value="rocev2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualVmxnet3VrdmaOptionDeviceProtocols")
@XmlEnum
public enum VirtualVmxnet3VrdmaOptionDeviceProtocols {

    @XmlEnumValue("rocev1")
    ROCEV_1("rocev1"),
    @XmlEnumValue("rocev2")
    ROCEV_2("rocev2");
    private final String value;

    VirtualVmxnet3VrdmaOptionDeviceProtocols(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualVmxnet3VrdmaOptionDeviceProtocols fromValue(String v) {
        for (VirtualVmxnet3VrdmaOptionDeviceProtocols c: VirtualVmxnet3VrdmaOptionDeviceProtocols.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

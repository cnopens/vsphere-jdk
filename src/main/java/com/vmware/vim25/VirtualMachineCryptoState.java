
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineCryptoState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualMachineCryptoState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unlocked"/>
 *     &lt;enumeration value="locked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualMachineCryptoState")
@XmlEnum
public enum VirtualMachineCryptoState {

    @XmlEnumValue("unlocked")
    UNLOCKED("unlocked"),
    @XmlEnumValue("locked")
    LOCKED("locked");
    private final String value;

    VirtualMachineCryptoState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualMachineCryptoState fromValue(String v) {
        for (VirtualMachineCryptoState c: VirtualMachineCryptoState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

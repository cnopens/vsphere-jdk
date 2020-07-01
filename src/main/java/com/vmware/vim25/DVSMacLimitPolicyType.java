
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSMacLimitPolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DVSMacLimitPolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allow"/>
 *     &lt;enumeration value="drop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DVSMacLimitPolicyType")
@XmlEnum
public enum DVSMacLimitPolicyType {

    @XmlEnumValue("allow")
    ALLOW("allow"),
    @XmlEnumValue("drop")
    DROP("drop");
    private final String value;

    DVSMacLimitPolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DVSMacLimitPolicyType fromValue(String v) {
        for (DVSMacLimitPolicyType c: DVSMacLimitPolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

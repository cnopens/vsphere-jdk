
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskRuleSpecRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VirtualDiskRuleSpecRuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="affinity"/>
 *     &lt;enumeration value="antiAffinity"/>
 *     &lt;enumeration value="disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VirtualDiskRuleSpecRuleType")
@XmlEnum
public enum VirtualDiskRuleSpecRuleType {

    @XmlEnumValue("affinity")
    AFFINITY("affinity"),
    @XmlEnumValue("antiAffinity")
    ANTI_AFFINITY("antiAffinity"),
    @XmlEnumValue("disabled")
    DISABLED("disabled");
    private final String value;

    VirtualDiskRuleSpecRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualDiskRuleSpecRuleType fromValue(String v) {
        for (VirtualDiskRuleSpecRuleType c: VirtualDiskRuleSpecRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VchaClusterState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VchaClusterState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="healthy"/>
 *     &lt;enumeration value="degraded"/>
 *     &lt;enumeration value="isolated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VchaClusterState")
@XmlEnum
public enum VchaClusterState {

    @XmlEnumValue("healthy")
    HEALTHY("healthy"),
    @XmlEnumValue("degraded")
    DEGRADED("degraded"),
    @XmlEnumValue("isolated")
    ISOLATED("isolated");
    private final String value;

    VchaClusterState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VchaClusterState fromValue(String v) {
        for (VchaClusterState c: VchaClusterState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileManagerCompositionResultResultElementStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostProfileManagerCompositionResultResultElementStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostProfileManagerCompositionResultResultElementStatus")
@XmlEnum
public enum HostProfileManagerCompositionResultResultElementStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    HostProfileManagerCompositionResultResultElementStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostProfileManagerCompositionResultResultElementStatus fromValue(String v) {
        for (HostProfileManagerCompositionResultResultElementStatus c: HostProfileManagerCompositionResultResultElementStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

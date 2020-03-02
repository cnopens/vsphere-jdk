
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileManagerCompositionValidationResultResultElementStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostProfileManagerCompositionValidationResultResultElementStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostProfileManagerCompositionValidationResultResultElementStatus")
@XmlEnum
public enum HostProfileManagerCompositionValidationResultResultElementStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    HostProfileManagerCompositionValidationResultResultElementStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostProfileManagerCompositionValidationResultResultElementStatus fromValue(String v) {
        for (HostProfileManagerCompositionValidationResultResultElementStatus c: HostProfileManagerCompositionValidationResultResultElementStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

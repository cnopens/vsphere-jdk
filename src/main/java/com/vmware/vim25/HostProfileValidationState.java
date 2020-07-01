
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileValidationState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostProfileValidationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ready"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostProfileValidationState")
@XmlEnum
public enum HostProfileValidationState {

    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    HostProfileValidationState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostProfileValidationState fromValue(String v) {
        for (HostProfileValidationState c: HostProfileValidationState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

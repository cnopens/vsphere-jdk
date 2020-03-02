
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmInterleaveSetState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NvdimmInterleaveSetState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invalid"/>
 *     &lt;enumeration value="active"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NvdimmInterleaveSetState")
@XmlEnum
public enum NvdimmInterleaveSetState {

    @XmlEnumValue("invalid")
    INVALID("invalid"),
    @XmlEnumValue("active")
    ACTIVE("active");
    private final String value;

    NvdimmInterleaveSetState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NvdimmInterleaveSetState fromValue(String v) {
        for (NvdimmInterleaveSetState c: NvdimmInterleaveSetState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

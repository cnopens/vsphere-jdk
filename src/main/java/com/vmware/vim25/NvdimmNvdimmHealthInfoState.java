
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmNvdimmHealthInfoState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NvdimmNvdimmHealthInfoState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NvdimmNvdimmHealthInfoState")
@XmlEnum
public enum NvdimmNvdimmHealthInfoState {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    NvdimmNvdimmHealthInfoState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NvdimmNvdimmHealthInfoState fromValue(String v) {
        for (NvdimmNvdimmHealthInfoState c: NvdimmNvdimmHealthInfoState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmNamespaceState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NvdimmNamespaceState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invalid"/>
 *     &lt;enumeration value="notInUse"/>
 *     &lt;enumeration value="inUse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NvdimmNamespaceState")
@XmlEnum
public enum NvdimmNamespaceState {

    @XmlEnumValue("invalid")
    INVALID("invalid"),
    @XmlEnumValue("notInUse")
    NOT_IN_USE("notInUse"),
    @XmlEnumValue("inUse")
    IN_USE("inUse");
    private final String value;

    NvdimmNamespaceState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NvdimmNamespaceState fromValue(String v) {
        for (NvdimmNamespaceState c: NvdimmNamespaceState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

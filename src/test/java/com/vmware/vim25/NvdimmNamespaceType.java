
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmNamespaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NvdimmNamespaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blockNamespace"/>
 *     &lt;enumeration value="persistentNamespace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NvdimmNamespaceType")
@XmlEnum
public enum NvdimmNamespaceType {

    @XmlEnumValue("blockNamespace")
    BLOCK_NAMESPACE("blockNamespace"),
    @XmlEnumValue("persistentNamespace")
    PERSISTENT_NAMESPACE("persistentNamespace");
    private final String value;

    NvdimmNamespaceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NvdimmNamespaceType fromValue(String v) {
        for (NvdimmNamespaceType c: NvdimmNamespaceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

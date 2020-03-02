
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmNamespaceHealthStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NvdimmNamespaceHealthStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="missing"/>
 *     &lt;enumeration value="labelMissing"/>
 *     &lt;enumeration value="interleaveBroken"/>
 *     &lt;enumeration value="labelInconsistent"/>
 *     &lt;enumeration value="bttCorrupt"/>
 *     &lt;enumeration value="badBlockSize"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NvdimmNamespaceHealthStatus")
@XmlEnum
public enum NvdimmNamespaceHealthStatus {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("missing")
    MISSING("missing"),
    @XmlEnumValue("labelMissing")
    LABEL_MISSING("labelMissing"),
    @XmlEnumValue("interleaveBroken")
    INTERLEAVE_BROKEN("interleaveBroken"),
    @XmlEnumValue("labelInconsistent")
    LABEL_INCONSISTENT("labelInconsistent"),
    @XmlEnumValue("bttCorrupt")
    BTT_CORRUPT("bttCorrupt"),
    @XmlEnumValue("badBlockSize")
    BAD_BLOCK_SIZE("badBlockSize");
    private final String value;

    NvdimmNamespaceHealthStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NvdimmNamespaceHealthStatus fromValue(String v) {
        for (NvdimmNamespaceHealthStatus c: NvdimmNamespaceHealthStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

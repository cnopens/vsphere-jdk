
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDigestInfoDigestMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostDigestInfoDigestMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHA1"/>
 *     &lt;enumeration value="MD5"/>
 *     &lt;enumeration value="SHA256"/>
 *     &lt;enumeration value="SHA384"/>
 *     &lt;enumeration value="SHA512"/>
 *     &lt;enumeration value="SM3_256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostDigestInfoDigestMethodType")
@XmlEnum
public enum HostDigestInfoDigestMethodType {

    @XmlEnumValue("SHA1")
    SHA_1("SHA1"),
    @XmlEnumValue("MD5")
    MD_5("MD5"),
    @XmlEnumValue("SHA256")
    SHA_256("SHA256"),
    @XmlEnumValue("SHA384")
    SHA_384("SHA384"),
    @XmlEnumValue("SHA512")
    SHA_512("SHA512"),
    @XmlEnumValue("SM3_256")
    SM_3_256("SM3_256");
    private final String value;

    HostDigestInfoDigestMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostDigestInfoDigestMethodType fromValue(String v) {
        for (HostDigestInfoDigestMethodType c: HostDigestInfoDigestMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

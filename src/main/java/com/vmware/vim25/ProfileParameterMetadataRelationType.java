
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileParameterMetadataRelationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileParameterMetadataRelationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dynamic_relation"/>
 *     &lt;enumeration value="extensible_relation"/>
 *     &lt;enumeration value="localizable_relation"/>
 *     &lt;enumeration value="static_relation"/>
 *     &lt;enumeration value="validation_relation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProfileParameterMetadataRelationType")
@XmlEnum
public enum ProfileParameterMetadataRelationType {

    @XmlEnumValue("dynamic_relation")
    DYNAMIC_RELATION("dynamic_relation"),
    @XmlEnumValue("extensible_relation")
    EXTENSIBLE_RELATION("extensible_relation"),
    @XmlEnumValue("localizable_relation")
    LOCALIZABLE_RELATION("localizable_relation"),
    @XmlEnumValue("static_relation")
    STATIC_RELATION("static_relation"),
    @XmlEnumValue("validation_relation")
    VALIDATION_RELATION("validation_relation");
    private final String value;

    ProfileParameterMetadataRelationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileParameterMetadataRelationType fromValue(String v) {
        for (ProfileParameterMetadataRelationType c: ProfileParameterMetadataRelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

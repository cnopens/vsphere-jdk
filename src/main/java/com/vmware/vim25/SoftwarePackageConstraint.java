
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwarePackageConstraint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SoftwarePackageConstraint">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equals"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="lessThanEqual"/>
 *     &lt;enumeration value="greaterThanEqual"/>
 *     &lt;enumeration value="greaterThan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoftwarePackageConstraint")
@XmlEnum
public enum SoftwarePackageConstraint {

    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanEqual")
    LESS_THAN_EQUAL("lessThanEqual"),
    @XmlEnumValue("greaterThanEqual")
    GREATER_THAN_EQUAL("greaterThanEqual"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan");
    private final String value;

    SoftwarePackageConstraint(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoftwarePackageConstraint fromValue(String v) {
        for (SoftwarePackageConstraint c: SoftwarePackageConstraint.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

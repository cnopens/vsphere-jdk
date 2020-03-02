
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerFileValidationInfoStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnswerFileValidationInfoStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="failed_defaults"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnswerFileValidationInfoStatus")
@XmlEnum
public enum AnswerFileValidationInfoStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("failed_defaults")
    FAILED_DEFAULTS("failed_defaults");
    private final String value;

    AnswerFileValidationInfoStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerFileValidationInfoStatus fromValue(String v) {
        for (AnswerFileValidationInfoStatus c: AnswerFileValidationInfoStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

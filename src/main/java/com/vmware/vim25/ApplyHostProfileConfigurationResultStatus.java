
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplyHostProfileConfigurationResultStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplyHostProfileConfigurationResultStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="reboot_failed"/>
 *     &lt;enumeration value="stateless_reboot_failed"/>
 *     &lt;enumeration value="check_compliance_failed"/>
 *     &lt;enumeration value="state_not_satisfied"/>
 *     &lt;enumeration value="exit_maintenancemode_failed"/>
 *     &lt;enumeration value="canceled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplyHostProfileConfigurationResultStatus")
@XmlEnum
public enum ApplyHostProfileConfigurationResultStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("reboot_failed")
    REBOOT_FAILED("reboot_failed"),
    @XmlEnumValue("stateless_reboot_failed")
    STATELESS_REBOOT_FAILED("stateless_reboot_failed"),
    @XmlEnumValue("check_compliance_failed")
    CHECK_COMPLIANCE_FAILED("check_compliance_failed"),
    @XmlEnumValue("state_not_satisfied")
    STATE_NOT_SATISFIED("state_not_satisfied"),
    @XmlEnumValue("exit_maintenancemode_failed")
    EXIT_MAINTENANCEMODE_FAILED("exit_maintenancemode_failed"),
    @XmlEnumValue("canceled")
    CANCELED("canceled");
    private final String value;

    ApplyHostProfileConfigurationResultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplyHostProfileConfigurationResultStatus fromValue(String v) {
        for (ApplyHostProfileConfigurationResultStatus c: ApplyHostProfileConfigurationResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

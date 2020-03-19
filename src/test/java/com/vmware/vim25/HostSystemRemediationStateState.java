
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSystemRemediationStateState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostSystemRemediationStateState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="remediationReady"/>
 *     &lt;enumeration value="precheckRemediationRunning"/>
 *     &lt;enumeration value="precheckRemediationComplete"/>
 *     &lt;enumeration value="precheckRemediationFailed"/>
 *     &lt;enumeration value="remediationRunning"/>
 *     &lt;enumeration value="remediationFailed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostSystemRemediationStateState")
@XmlEnum
public enum HostSystemRemediationStateState {

    @XmlEnumValue("remediationReady")
    REMEDIATION_READY("remediationReady"),
    @XmlEnumValue("precheckRemediationRunning")
    PRECHECK_REMEDIATION_RUNNING("precheckRemediationRunning"),
    @XmlEnumValue("precheckRemediationComplete")
    PRECHECK_REMEDIATION_COMPLETE("precheckRemediationComplete"),
    @XmlEnumValue("precheckRemediationFailed")
    PRECHECK_REMEDIATION_FAILED("precheckRemediationFailed"),
    @XmlEnumValue("remediationRunning")
    REMEDIATION_RUNNING("remediationRunning"),
    @XmlEnumValue("remediationFailed")
    REMEDIATION_FAILED("remediationFailed");
    private final String value;

    HostSystemRemediationStateState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostSystemRemediationStateState fromValue(String v) {
        for (HostSystemRemediationStateState c: HostSystemRemediationStateState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

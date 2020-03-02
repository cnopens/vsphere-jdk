
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterInfraUpdateHaConfigInfoRemediationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClusterInfraUpdateHaConfigInfoRemediationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QuarantineMode"/>
 *     &lt;enumeration value="MaintenanceMode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClusterInfraUpdateHaConfigInfoRemediationType")
@XmlEnum
public enum ClusterInfraUpdateHaConfigInfoRemediationType {

    @XmlEnumValue("QuarantineMode")
    QUARANTINE_MODE("QuarantineMode"),
    @XmlEnumValue("MaintenanceMode")
    MAINTENANCE_MODE("MaintenanceMode");
    private final String value;

    ClusterInfraUpdateHaConfigInfoRemediationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClusterInfraUpdateHaConfigInfoRemediationType fromValue(String v) {
        for (ClusterInfraUpdateHaConfigInfoRemediationType c: ClusterInfraUpdateHaConfigInfoRemediationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

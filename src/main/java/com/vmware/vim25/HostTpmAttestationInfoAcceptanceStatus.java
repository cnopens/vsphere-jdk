
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmAttestationInfoAcceptanceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HostTpmAttestationInfoAcceptanceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="notAccepted"/>
 *     &lt;enumeration value="accepted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HostTpmAttestationInfoAcceptanceStatus")
@XmlEnum
public enum HostTpmAttestationInfoAcceptanceStatus {

    @XmlEnumValue("notAccepted")
    NOT_ACCEPTED("notAccepted"),
    @XmlEnumValue("accepted")
    ACCEPTED("accepted");
    private final String value;

    HostTpmAttestationInfoAcceptanceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HostTpmAttestationInfoAcceptanceStatus fromValue(String v) {
        for (HostTpmAttestationInfoAcceptanceStatus c: HostTpmAttestationInfoAcceptanceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

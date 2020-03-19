
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmFilterSpecAlarmTypeByTrigger.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmFilterSpecAlarmTypeByTrigger">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="triggerTypeAll"/>
 *     &lt;enumeration value="triggerTypeEvent"/>
 *     &lt;enumeration value="triggerTypeMetric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlarmFilterSpecAlarmTypeByTrigger")
@XmlEnum
public enum AlarmFilterSpecAlarmTypeByTrigger {

    @XmlEnumValue("triggerTypeAll")
    TRIGGER_TYPE_ALL("triggerTypeAll"),
    @XmlEnumValue("triggerTypeEvent")
    TRIGGER_TYPE_EVENT("triggerTypeEvent"),
    @XmlEnumValue("triggerTypeMetric")
    TRIGGER_TYPE_METRIC("triggerTypeMetric");
    private final String value;

    AlarmFilterSpecAlarmTypeByTrigger(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlarmFilterSpecAlarmTypeByTrigger fromValue(String v) {
        for (AlarmFilterSpecAlarmTypeByTrigger c: AlarmFilterSpecAlarmTypeByTrigger.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

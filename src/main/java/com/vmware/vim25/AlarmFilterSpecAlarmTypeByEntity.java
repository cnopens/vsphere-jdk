
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmFilterSpecAlarmTypeByEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmFilterSpecAlarmTypeByEntity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="entityTypeAll"/>
 *     &lt;enumeration value="entityTypeHost"/>
 *     &lt;enumeration value="entityTypeVm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlarmFilterSpecAlarmTypeByEntity")
@XmlEnum
public enum AlarmFilterSpecAlarmTypeByEntity {

    @XmlEnumValue("entityTypeAll")
    ENTITY_TYPE_ALL("entityTypeAll"),
    @XmlEnumValue("entityTypeHost")
    ENTITY_TYPE_HOST("entityTypeHost"),
    @XmlEnumValue("entityTypeVm")
    ENTITY_TYPE_VM("entityTypeVm");
    private final String value;

    AlarmFilterSpecAlarmTypeByEntity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlarmFilterSpecAlarmTypeByEntity fromValue(String v) {
        for (AlarmFilterSpecAlarmTypeByEntity c: AlarmFilterSpecAlarmTypeByEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IoFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IoFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cache"/>
 *     &lt;enumeration value="replication"/>
 *     &lt;enumeration value="encryption"/>
 *     &lt;enumeration value="compression"/>
 *     &lt;enumeration value="inspection"/>
 *     &lt;enumeration value="datastoreIoControl"/>
 *     &lt;enumeration value="dataProvider"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IoFilterType")
@XmlEnum
public enum IoFilterType {

    @XmlEnumValue("cache")
    CACHE("cache"),
    @XmlEnumValue("replication")
    REPLICATION("replication"),
    @XmlEnumValue("encryption")
    ENCRYPTION("encryption"),
    @XmlEnumValue("compression")
    COMPRESSION("compression"),
    @XmlEnumValue("inspection")
    INSPECTION("inspection"),
    @XmlEnumValue("datastoreIoControl")
    DATASTORE_IO_CONTROL("datastoreIoControl"),
    @XmlEnumValue("dataProvider")
    DATA_PROVIDER("dataProvider");
    private final String value;

    IoFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IoFilterType fromValue(String v) {
        for (IoFilterType c: IoFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

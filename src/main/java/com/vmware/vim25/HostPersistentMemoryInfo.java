
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPersistentMemoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostPersistentMemoryInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="capacityInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="volumeUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPersistentMemoryInfo", propOrder = {
    "capacityInMB",
    "volumeUUID"
})
public class HostPersistentMemoryInfo
    extends DynamicData
{

    protected Long capacityInMB;
    protected String volumeUUID;

    /**
     * Gets the value of the capacityInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacityInMB(Long value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the volumeUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUUID() {
        return volumeUUID;
    }

    /**
     * Sets the value of the volumeUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUUID(String value) {
        this.volumeUUID = value;
    }

}

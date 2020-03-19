
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVDIMMOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualNVDIMMOption">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDeviceOption">
 *       &lt;sequence>
 *         &lt;element name="capacityInMB" type="{urn:vim25}LongOption"/>
 *         &lt;element name="growable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hotGrowable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="granularityInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMOption", propOrder = {
    "capacityInMB",
    "growable",
    "hotGrowable",
    "granularityInMB"
})
public class VirtualNVDIMMOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected LongOption capacityInMB;
    protected boolean growable;
    protected boolean hotGrowable;
    protected long granularityInMB;

    /**
     * Gets the value of the capacityInMB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setCapacityInMB(LongOption value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the growable property.
     * 
     */
    public boolean isGrowable() {
        return growable;
    }

    /**
     * Sets the value of the growable property.
     * 
     */
    public void setGrowable(boolean value) {
        this.growable = value;
    }

    /**
     * Gets the value of the hotGrowable property.
     * 
     */
    public boolean isHotGrowable() {
        return hotGrowable;
    }

    /**
     * Sets the value of the hotGrowable property.
     * 
     */
    public void setHotGrowable(boolean value) {
        this.hotGrowable = value;
    }

    /**
     * Gets the value of the granularityInMB property.
     * 
     */
    public long getGranularityInMB() {
        return granularityInMB;
    }

    /**
     * Sets the value of the granularityInMB property.
     * 
     */
    public void setGranularityInMB(long value) {
        this.granularityInMB = value;
    }

}

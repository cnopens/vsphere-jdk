
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskLocalPMemBackingOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualDiskLocalPMemBackingOption">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDeviceFileBackingOption">
 *       &lt;sequence>
 *         &lt;element name="diskMode" type="{urn:vim25}ChoiceOption"/>
 *         &lt;element name="growable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hotGrowable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskLocalPMemBackingOption", propOrder = {
    "diskMode",
    "growable",
    "hotGrowable",
    "uuid"
})
public class VirtualDiskLocalPMemBackingOption
    extends VirtualDeviceFileBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption diskMode;
    protected boolean growable;
    protected boolean hotGrowable;
    protected boolean uuid;

    /**
     * Gets the value of the diskMode property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDiskMode() {
        return diskMode;
    }

    /**
     * Sets the value of the diskMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDiskMode(ChoiceOption value) {
        this.diskMode = value;
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
     * Gets the value of the uuid property.
     * 
     */
    public boolean isUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     */
    public void setUuid(boolean value) {
        this.uuid = value;
    }

}

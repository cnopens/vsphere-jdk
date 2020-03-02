
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObjectAssociationsVmDiskAssociations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VStorageObjectAssociationsVmDiskAssociations">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="vmId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diskKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectAssociationsVmDiskAssociations", propOrder = {
    "vmId",
    "diskKey"
})
public class VStorageObjectAssociationsVmDiskAssociations
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vmId;
    protected int diskKey;

    /**
     * Gets the value of the vmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmId() {
        return vmId;
    }

    /**
     * Sets the value of the vmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmId(String value) {
        this.vmId = value;
    }

    /**
     * Gets the value of the diskKey property.
     * 
     */
    public int getDiskKey() {
        return diskKey;
    }

    /**
     * Sets the value of the diskKey property.
     * 
     */
    public void setDiskKey(int value) {
        this.diskKey = value;
    }

}

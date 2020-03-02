
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSharedGpuCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostSharedGpuCapabilities">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="vgpu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="diskSnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="memorySnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suspendSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="migrateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSharedGpuCapabilities", propOrder = {
    "vgpu",
    "diskSnapshotSupported",
    "memorySnapshotSupported",
    "suspendSupported",
    "migrateSupported"
})
public class HostSharedGpuCapabilities
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vgpu;
    protected boolean diskSnapshotSupported;
    protected boolean memorySnapshotSupported;
    protected boolean suspendSupported;
    protected boolean migrateSupported;

    /**
     * Gets the value of the vgpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgpu() {
        return vgpu;
    }

    /**
     * Sets the value of the vgpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgpu(String value) {
        this.vgpu = value;
    }

    /**
     * Gets the value of the diskSnapshotSupported property.
     * 
     */
    public boolean isDiskSnapshotSupported() {
        return diskSnapshotSupported;
    }

    /**
     * Sets the value of the diskSnapshotSupported property.
     * 
     */
    public void setDiskSnapshotSupported(boolean value) {
        this.diskSnapshotSupported = value;
    }

    /**
     * Gets the value of the memorySnapshotSupported property.
     * 
     */
    public boolean isMemorySnapshotSupported() {
        return memorySnapshotSupported;
    }

    /**
     * Sets the value of the memorySnapshotSupported property.
     * 
     */
    public void setMemorySnapshotSupported(boolean value) {
        this.memorySnapshotSupported = value;
    }

    /**
     * Gets the value of the suspendSupported property.
     * 
     */
    public boolean isSuspendSupported() {
        return suspendSupported;
    }

    /**
     * Sets the value of the suspendSupported property.
     * 
     */
    public void setSuspendSupported(boolean value) {
        this.suspendSupported = value;
    }

    /**
     * Gets the value of the migrateSupported property.
     * 
     */
    public boolean isMigrateSupported() {
        return migrateSupported;
    }

    /**
     * Sets the value of the migrateSupported property.
     * 
     */
    public void setMigrateSupported(boolean value) {
        this.migrateSupported = value;
    }

}

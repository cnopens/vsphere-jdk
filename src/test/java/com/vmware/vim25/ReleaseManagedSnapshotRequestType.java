
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReleaseManagedSnapshotRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseManagedSnapshotRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="vdisk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datacenter" type="{urn:vim25}ManagedObjectReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseManagedSnapshotRequestType", propOrder = {
    "_this",
    "vdisk",
    "datacenter"
})
public class ReleaseManagedSnapshotRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String vdisk;
    protected ManagedObjectReference datacenter;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the vdisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVdisk() {
        return vdisk;
    }

    /**
     * Sets the value of the vdisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVdisk(String value) {
        this.vdisk = value;
    }

    /**
     * Gets the value of the datacenter property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatacenter() {
        return datacenter;
    }

    /**
     * Sets the value of the datacenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatacenter(ManagedObjectReference value) {
        this.datacenter = value;
    }

}

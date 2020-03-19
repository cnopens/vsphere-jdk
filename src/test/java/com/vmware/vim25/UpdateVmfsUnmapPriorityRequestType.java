
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateVmfsUnmapPriorityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateVmfsUnmapPriorityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="vmfsUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unmapPriority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVmfsUnmapPriorityRequestType", propOrder = {
    "_this",
    "vmfsUuid",
    "unmapPriority"
})
public class UpdateVmfsUnmapPriorityRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String vmfsUuid;
    @XmlElement(required = true)
    protected String unmapPriority;

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
     * Gets the value of the vmfsUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmfsUuid() {
        return vmfsUuid;
    }

    /**
     * Sets the value of the vmfsUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmfsUuid(String value) {
        this.vmfsUuid = value;
    }

    /**
     * Gets the value of the unmapPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmapPriority() {
        return unmapPriority;
    }

    /**
     * Sets the value of the unmapPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmapPriority(String value) {
        this.unmapPriority = value;
    }

}

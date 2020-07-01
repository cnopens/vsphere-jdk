
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVDIMMBackingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualNVDIMMBackingInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDeviceFileBackingInfo">
 *       &lt;sequence>
 *         &lt;element name="parent" type="{urn:vim25}VirtualNVDIMMBackingInfo" minOccurs="0"/>
 *         &lt;element name="changeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMBackingInfo", propOrder = {
    "parent",
    "changeId"
})
public class VirtualNVDIMMBackingInfo
    extends VirtualDeviceFileBackingInfo
{

    protected VirtualNVDIMMBackingInfo parent;
    protected String changeId;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualNVDIMMBackingInfo }
     *     
     */
    public VirtualNVDIMMBackingInfo getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualNVDIMMBackingInfo }
     *     
     */
    public void setParent(VirtualNVDIMMBackingInfo value) {
        this.parent = value;
    }

    /**
     * Gets the value of the changeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * Sets the value of the changeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeId(String value) {
        this.changeId = value;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VslmCreateSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VslmCreateSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keepAfterDeleteVm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backingSpec" type="{urn:vim25}VslmCreateSpecBackingSpec"/>
 *         &lt;element name="capacityInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="profile" type="{urn:vim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpec", propOrder = {
    "name",
    "keepAfterDeleteVm",
    "backingSpec",
    "capacityInMB",
    "profile"
})
public class VslmCreateSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String name;
    protected Boolean keepAfterDeleteVm;
    @XmlElement(required = true)
    protected VslmCreateSpecBackingSpec backingSpec;
    protected long capacityInMB;
    protected List<VirtualMachineProfileSpec> profile;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the keepAfterDeleteVm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAfterDeleteVm() {
        return keepAfterDeleteVm;
    }

    /**
     * Sets the value of the keepAfterDeleteVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAfterDeleteVm(Boolean value) {
        this.keepAfterDeleteVm = value;
    }

    /**
     * Gets the value of the backingSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VslmCreateSpecBackingSpec }
     *     
     */
    public VslmCreateSpecBackingSpec getBackingSpec() {
        return backingSpec;
    }

    /**
     * Sets the value of the backingSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VslmCreateSpecBackingSpec }
     *     
     */
    public void setBackingSpec(VslmCreateSpecBackingSpec value) {
        this.backingSpec = value;
    }

    /**
     * Gets the value of the capacityInMB property.
     * 
     */
    public long getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     */
    public void setCapacityInMB(long value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineProfileSpec }
     * 
     * 
     */
    public List<VirtualMachineProfileSpec> getProfile() {
        if (profile == null) {
            profile = new ArrayList<VirtualMachineProfileSpec>();
        }
        return this.profile;
    }

}

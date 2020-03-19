
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObjectAssociations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VStorageObjectAssociations">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:vim25}ID"/>
 *         &lt;element name="vmDiskAssociations" type="{urn:vim25}VStorageObjectAssociationsVmDiskAssociations" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fault" type="{urn:vim25}LocalizedMethodFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectAssociations", propOrder = {
    "id",
    "vmDiskAssociations",
    "fault"
})
public class VStorageObjectAssociations
    extends DynamicData
{

    @XmlElement(required = true)
    protected ID id;
    protected List<VStorageObjectAssociationsVmDiskAssociations> vmDiskAssociations;
    protected LocalizedMethodFault fault;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setId(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the vmDiskAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmDiskAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmDiskAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VStorageObjectAssociationsVmDiskAssociations }
     * 
     * 
     */
    public List<VStorageObjectAssociationsVmDiskAssociations> getVmDiskAssociations() {
        if (vmDiskAssociations == null) {
            vmDiskAssociations = new ArrayList<VStorageObjectAssociationsVmDiskAssociations>();
        }
        return this.vmDiskAssociations;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setFault(LocalizedMethodFault value) {
        this.fault = value;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineProfileDetailsDiskProfileDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVirtualMachineProfileDetailsDiskProfileDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VirtualMachineProfileDetailsDiskProfileDetails" type="{urn:vim25}VirtualMachineProfileDetailsDiskProfileDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineProfileDetailsDiskProfileDetails", propOrder = {
    "virtualMachineProfileDetailsDiskProfileDetails"
})
public class ArrayOfVirtualMachineProfileDetailsDiskProfileDetails {

    @XmlElement(name = "VirtualMachineProfileDetailsDiskProfileDetails")
    protected List<VirtualMachineProfileDetailsDiskProfileDetails> virtualMachineProfileDetailsDiskProfileDetails;

    /**
     * Gets the value of the virtualMachineProfileDetailsDiskProfileDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineProfileDetailsDiskProfileDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualMachineProfileDetailsDiskProfileDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineProfileDetailsDiskProfileDetails }
     * 
     * 
     */
    public List<VirtualMachineProfileDetailsDiskProfileDetails> getVirtualMachineProfileDetailsDiskProfileDetails() {
        if (virtualMachineProfileDetailsDiskProfileDetails == null) {
            virtualMachineProfileDetailsDiskProfileDetails = new ArrayList<VirtualMachineProfileDetailsDiskProfileDetails>();
        }
        return this.virtualMachineProfileDetailsDiskProfileDetails;
    }

}

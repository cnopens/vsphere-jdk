
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineProfileDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineProfileDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="profile" type="{urn:vim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diskProfileDetails" type="{urn:vim25}VirtualMachineProfileDetailsDiskProfileDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineProfileDetails", propOrder = {
    "profile",
    "diskProfileDetails"
})
public class VirtualMachineProfileDetails
    extends DynamicData
{

    protected List<VirtualMachineProfileSpec> profile;
    protected List<VirtualMachineProfileDetailsDiskProfileDetails> diskProfileDetails;

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

    /**
     * Gets the value of the diskProfileDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskProfileDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiskProfileDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineProfileDetailsDiskProfileDetails }
     * 
     * 
     */
    public List<VirtualMachineProfileDetailsDiskProfileDetails> getDiskProfileDetails() {
        if (diskProfileDetails == null) {
            diskProfileDetails = new ArrayList<VirtualMachineProfileDetailsDiskProfileDetails>();
        }
        return this.diskProfileDetails;
    }

}

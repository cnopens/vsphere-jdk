
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDefinedProfileSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualMachineDefinedProfileSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualMachineProfileSpec">
 *       &lt;sequence>
 *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="replicationSpec" type="{urn:vim25}ReplicationSpec" minOccurs="0"/>
 *         &lt;element name="profileData" type="{urn:vim25}VirtualMachineProfileRawData" minOccurs="0"/>
 *         &lt;element name="profileParams" type="{urn:vim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDefinedProfileSpec", propOrder = {
    "profileId",
    "replicationSpec",
    "profileData",
    "profileParams"
})
public class VirtualMachineDefinedProfileSpec
    extends VirtualMachineProfileSpec
{

    @XmlElement(required = true)
    protected String profileId;
    protected ReplicationSpec replicationSpec;
    protected VirtualMachineProfileRawData profileData;
    protected List<KeyValue> profileParams;

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the replicationSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationSpec }
     *     
     */
    public ReplicationSpec getReplicationSpec() {
        return replicationSpec;
    }

    /**
     * Sets the value of the replicationSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationSpec }
     *     
     */
    public void setReplicationSpec(ReplicationSpec value) {
        this.replicationSpec = value;
    }

    /**
     * Gets the value of the profileData property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineProfileRawData }
     *     
     */
    public VirtualMachineProfileRawData getProfileData() {
        return profileData;
    }

    /**
     * Sets the value of the profileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineProfileRawData }
     *     
     */
    public void setProfileData(VirtualMachineProfileRawData value) {
        this.profileData = value;
    }

    /**
     * Gets the value of the profileParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * 
     * 
     */
    public List<KeyValue> getProfileParams() {
        if (profileParams == null) {
            profileParams = new ArrayList<KeyValue>();
        }
        return this.profileParams;
    }

}

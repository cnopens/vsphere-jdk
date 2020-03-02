
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostEnterMaintenanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostEnterMaintenanceResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="vmFaults" type="{urn:vim25}FaultsByVM" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hostFaults" type="{urn:vim25}FaultsByHost" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEnterMaintenanceResult", propOrder = {
    "vmFaults",
    "hostFaults"
})
public class HostEnterMaintenanceResult
    extends DynamicData
{

    protected List<FaultsByVM> vmFaults;
    protected List<FaultsByHost> hostFaults;

    /**
     * Gets the value of the vmFaults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmFaults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultsByVM }
     * 
     * 
     */
    public List<FaultsByVM> getVmFaults() {
        if (vmFaults == null) {
            vmFaults = new ArrayList<FaultsByVM>();
        }
        return this.vmFaults;
    }

    /**
     * Gets the value of the hostFaults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostFaults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultsByHost }
     * 
     * 
     */
    public List<FaultsByHost> getHostFaults() {
        if (hostFaults == null) {
            hostFaults = new ArrayList<FaultsByHost>();
        }
        return this.hostFaults;
    }

}

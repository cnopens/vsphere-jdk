
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PMemDatastoreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PMemDatastoreInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DatastoreInfo">
 *       &lt;sequence>
 *         &lt;element name="pmem" type="{urn:vim25}HostPMemVolume"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMemDatastoreInfo", propOrder = {
    "pmem"
})
public class PMemDatastoreInfo
    extends DatastoreInfo
{

    @XmlElement(required = true)
    protected HostPMemVolume pmem;

    /**
     * Gets the value of the pmem property.
     * 
     * @return
     *     possible object is
     *     {@link HostPMemVolume }
     *     
     */
    public HostPMemVolume getPmem() {
        return pmem;
    }

    /**
     * Sets the value of the pmem property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPMemVolume }
     *     
     */
    public void setPmem(HostPMemVolume value) {
        this.pmem = value;
    }

}

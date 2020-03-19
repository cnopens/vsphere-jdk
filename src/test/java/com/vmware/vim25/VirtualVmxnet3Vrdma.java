
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnet3Vrdma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualVmxnet3Vrdma">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualVmxnet3">
 *       &lt;sequence>
 *         &lt;element name="deviceProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3Vrdma", propOrder = {
    "deviceProtocol"
})
public class VirtualVmxnet3Vrdma
    extends VirtualVmxnet3
{

    protected String deviceProtocol;

    /**
     * Gets the value of the deviceProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceProtocol() {
        return deviceProtocol;
    }

    /**
     * Sets the value of the deviceProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceProtocol(String value) {
        this.deviceProtocol = value;
    }

}

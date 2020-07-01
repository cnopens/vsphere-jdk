
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnet3VrdmaOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualVmxnet3VrdmaOption">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualVmxnet3Option">
 *       &lt;sequence>
 *         &lt;element name="deviceProtocol" type="{urn:vim25}ChoiceOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3VrdmaOption", propOrder = {
    "deviceProtocol"
})
public class VirtualVmxnet3VrdmaOption
    extends VirtualVmxnet3Option
{

    protected ChoiceOption deviceProtocol;

    /**
     * Gets the value of the deviceProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDeviceProtocol() {
        return deviceProtocol;
    }

    /**
     * Sets the value of the deviceProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDeviceProtocol(ChoiceOption value) {
        this.deviceProtocol = value;
    }

}

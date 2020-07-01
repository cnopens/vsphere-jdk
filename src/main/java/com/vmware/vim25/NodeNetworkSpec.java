
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeNetworkSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeNetworkSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="ipSettings" type="{urn:vim25}CustomizationIPSettings"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeNetworkSpec", propOrder = {
    "ipSettings"
})
@XmlSeeAlso({
    PassiveNodeNetworkSpec.class
})
public class NodeNetworkSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected CustomizationIPSettings ipSettings;

    /**
     * Gets the value of the ipSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIPSettings }
     *     
     */
    public CustomizationIPSettings getIpSettings() {
        return ipSettings;
    }

    /**
     * Sets the value of the ipSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIPSettings }
     *     
     */
    public void setIpSettings(CustomizationIPSettings value) {
        this.ipSettings = value;
    }

}

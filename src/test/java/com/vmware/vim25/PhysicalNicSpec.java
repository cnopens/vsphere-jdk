
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNicSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalNicSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="ip" type="{urn:vim25}HostIpConfig" minOccurs="0"/>
 *         &lt;element name="linkSpeed" type="{urn:vim25}PhysicalNicLinkInfo" minOccurs="0"/>
 *         &lt;element name="enableEnhancedNetworkingStack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicSpec", propOrder = {
    "ip",
    "linkSpeed",
    "enableEnhancedNetworkingStack"
})
public class PhysicalNicSpec
    extends DynamicData
{

    protected HostIpConfig ip;
    protected PhysicalNicLinkInfo linkSpeed;
    protected Boolean enableEnhancedNetworkingStack;

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpConfig }
     *     
     */
    public HostIpConfig getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpConfig }
     *     
     */
    public void setIp(HostIpConfig value) {
        this.ip = value;
    }

    /**
     * Gets the value of the linkSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalNicLinkInfo }
     *     
     */
    public PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }

    /**
     * Sets the value of the linkSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalNicLinkInfo }
     *     
     */
    public void setLinkSpeed(PhysicalNicLinkInfo value) {
        this.linkSpeed = value;
    }

    /**
     * Gets the value of the enableEnhancedNetworkingStack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEnhancedNetworkingStack() {
        return enableEnhancedNetworkingStack;
    }

    /**
     * Sets the value of the enableEnhancedNetworkingStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEnhancedNetworkingStack(Boolean value) {
        this.enableEnhancedNetworkingStack = value;
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VchaNodeRuntimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VchaNodeRuntimeInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="nodeState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaNodeRuntimeInfo", propOrder = {
    "nodeState",
    "nodeRole",
    "nodeIp"
})
public class VchaNodeRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String nodeState;
    @XmlElement(required = true)
    protected String nodeRole;
    @XmlElement(required = true)
    protected String nodeIp;

    /**
     * Gets the value of the nodeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeState() {
        return nodeState;
    }

    /**
     * Sets the value of the nodeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeState(String value) {
        this.nodeState = value;
    }

    /**
     * Gets the value of the nodeRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeRole() {
        return nodeRole;
    }

    /**
     * Sets the value of the nodeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeRole(String value) {
        this.nodeRole = value;
    }

    /**
     * Gets the value of the nodeIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeIp() {
        return nodeIp;
    }

    /**
     * Sets the value of the nodeIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeIp(String value) {
        this.nodeIp = value;
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDependencyRuleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClusterDependencyRuleInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}ClusterRuleInfo">
 *       &lt;sequence>
 *         &lt;element name="vmGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dependsOnVmGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDependencyRuleInfo", propOrder = {
    "vmGroup",
    "dependsOnVmGroup"
})
public class ClusterDependencyRuleInfo
    extends ClusterRuleInfo
{

    @XmlElement(required = true)
    protected String vmGroup;
    @XmlElement(required = true)
    protected String dependsOnVmGroup;

    /**
     * Gets the value of the vmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmGroup() {
        return vmGroup;
    }

    /**
     * Sets the value of the vmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmGroup(String value) {
        this.vmGroup = value;
    }

    /**
     * Gets the value of the dependsOnVmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependsOnVmGroup() {
        return dependsOnVmGroup;
    }

    /**
     * Sets the value of the dependsOnVmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependsOnVmGroup(String value) {
        this.dependsOnVmGroup = value;
    }

}

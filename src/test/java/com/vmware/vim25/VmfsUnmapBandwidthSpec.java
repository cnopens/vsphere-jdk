
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsUnmapBandwidthSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmfsUnmapBandwidthSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="policy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fixedValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dynamicMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dynamicMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsUnmapBandwidthSpec", propOrder = {
    "policy",
    "fixedValue",
    "dynamicMin",
    "dynamicMax"
})
public class VmfsUnmapBandwidthSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String policy;
    protected long fixedValue;
    protected long dynamicMin;
    protected long dynamicMax;

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
    }

    /**
     * Gets the value of the fixedValue property.
     * 
     */
    public long getFixedValue() {
        return fixedValue;
    }

    /**
     * Sets the value of the fixedValue property.
     * 
     */
    public void setFixedValue(long value) {
        this.fixedValue = value;
    }

    /**
     * Gets the value of the dynamicMin property.
     * 
     */
    public long getDynamicMin() {
        return dynamicMin;
    }

    /**
     * Sets the value of the dynamicMin property.
     * 
     */
    public void setDynamicMin(long value) {
        this.dynamicMin = value;
    }

    /**
     * Gets the value of the dynamicMax property.
     * 
     */
    public long getDynamicMax() {
        return dynamicMax;
    }

    /**
     * Sets the value of the dynamicMax property.
     * 
     */
    public void setDynamicMax(long value) {
        this.dynamicMax = value;
    }

}

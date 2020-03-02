
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NvdimmSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="numDimms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="healthStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="persistentCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="blockCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="availableCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numInterleavesets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numNamespaces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmSummary", propOrder = {
    "numDimms",
    "healthStatus",
    "totalCapacity",
    "persistentCapacity",
    "blockCapacity",
    "availableCapacity",
    "numInterleavesets",
    "numNamespaces"
})
public class NvdimmSummary
    extends DynamicData
{

    protected int numDimms;
    @XmlElement(required = true)
    protected String healthStatus;
    protected long totalCapacity;
    protected long persistentCapacity;
    protected long blockCapacity;
    protected long availableCapacity;
    protected int numInterleavesets;
    protected int numNamespaces;

    /**
     * Gets the value of the numDimms property.
     * 
     */
    public int getNumDimms() {
        return numDimms;
    }

    /**
     * Sets the value of the numDimms property.
     * 
     */
    public void setNumDimms(int value) {
        this.numDimms = value;
    }

    /**
     * Gets the value of the healthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * Sets the value of the healthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthStatus(String value) {
        this.healthStatus = value;
    }

    /**
     * Gets the value of the totalCapacity property.
     * 
     */
    public long getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the value of the totalCapacity property.
     * 
     */
    public void setTotalCapacity(long value) {
        this.totalCapacity = value;
    }

    /**
     * Gets the value of the persistentCapacity property.
     * 
     */
    public long getPersistentCapacity() {
        return persistentCapacity;
    }

    /**
     * Sets the value of the persistentCapacity property.
     * 
     */
    public void setPersistentCapacity(long value) {
        this.persistentCapacity = value;
    }

    /**
     * Gets the value of the blockCapacity property.
     * 
     */
    public long getBlockCapacity() {
        return blockCapacity;
    }

    /**
     * Sets the value of the blockCapacity property.
     * 
     */
    public void setBlockCapacity(long value) {
        this.blockCapacity = value;
    }

    /**
     * Gets the value of the availableCapacity property.
     * 
     */
    public long getAvailableCapacity() {
        return availableCapacity;
    }

    /**
     * Sets the value of the availableCapacity property.
     * 
     */
    public void setAvailableCapacity(long value) {
        this.availableCapacity = value;
    }

    /**
     * Gets the value of the numInterleavesets property.
     * 
     */
    public int getNumInterleavesets() {
        return numInterleavesets;
    }

    /**
     * Sets the value of the numInterleavesets property.
     * 
     */
    public void setNumInterleavesets(int value) {
        this.numInterleavesets = value;
    }

    /**
     * Gets the value of the numNamespaces property.
     * 
     */
    public int getNumNamespaces() {
        return numNamespaces;
    }

    /**
     * Sets the value of the numNamespaces property.
     * 
     */
    public void setNumNamespaces(int value) {
        this.numNamespaces = value;
    }

}

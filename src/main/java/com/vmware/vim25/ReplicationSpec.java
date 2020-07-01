
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplicationSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="replicationGroupId" type="{urn:vim25}ReplicationGroupId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSpec", propOrder = {
    "replicationGroupId"
})
public class ReplicationSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected ReplicationGroupId replicationGroupId;

    /**
     * Gets the value of the replicationGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationGroupId }
     *     
     */
    public ReplicationGroupId getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * Sets the value of the replicationGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationGroupId }
     *     
     */
    public void setReplicationGroupId(ReplicationGroupId value) {
        this.replicationGroupId = value;
    }

}

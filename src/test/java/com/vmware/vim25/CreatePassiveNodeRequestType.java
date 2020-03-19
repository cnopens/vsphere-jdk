
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPassiveNodeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPassiveNodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="passiveDeploymentSpec" type="{urn:vim25}PassiveNodeDeploymentSpec"/>
 *         &lt;element name="sourceVcSpec" type="{urn:vim25}SourceNodeSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPassiveNodeRequestType", propOrder = {
    "_this",
    "passiveDeploymentSpec",
    "sourceVcSpec"
})
public class CreatePassiveNodeRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected PassiveNodeDeploymentSpec passiveDeploymentSpec;
    @XmlElement(required = true)
    protected SourceNodeSpec sourceVcSpec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the passiveDeploymentSpec property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveNodeDeploymentSpec }
     *     
     */
    public PassiveNodeDeploymentSpec getPassiveDeploymentSpec() {
        return passiveDeploymentSpec;
    }

    /**
     * Sets the value of the passiveDeploymentSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveNodeDeploymentSpec }
     *     
     */
    public void setPassiveDeploymentSpec(PassiveNodeDeploymentSpec value) {
        this.passiveDeploymentSpec = value;
    }

    /**
     * Gets the value of the sourceVcSpec property.
     * 
     * @return
     *     possible object is
     *     {@link SourceNodeSpec }
     *     
     */
    public SourceNodeSpec getSourceVcSpec() {
        return sourceVcSpec;
    }

    /**
     * Sets the value of the sourceVcSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceNodeSpec }
     *     
     */
    public void setSourceVcSpec(SourceNodeSpec value) {
        this.sourceVcSpec = value;
    }

}

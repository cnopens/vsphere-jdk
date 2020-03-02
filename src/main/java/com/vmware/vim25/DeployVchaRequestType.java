
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deployVchaRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deployVchaRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="deploymentSpec" type="{urn:vim25}VchaClusterDeploymentSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployVchaRequestType", propOrder = {
    "_this",
    "deploymentSpec"
})
public class DeployVchaRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected VchaClusterDeploymentSpec deploymentSpec;

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
     * Gets the value of the deploymentSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VchaClusterDeploymentSpec }
     *     
     */
    public VchaClusterDeploymentSpec getDeploymentSpec() {
        return deploymentSpec;
    }

    /**
     * Sets the value of the deploymentSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VchaClusterDeploymentSpec }
     *     
     */
    public void setDeploymentSpec(VchaClusterDeploymentSpec value) {
        this.deploymentSpec = value;
    }

}

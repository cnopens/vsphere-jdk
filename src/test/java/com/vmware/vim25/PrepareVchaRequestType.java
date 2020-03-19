
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prepareVchaRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prepareVchaRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="networkSpec" type="{urn:vim25}VchaClusterNetworkSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prepareVchaRequestType", propOrder = {
    "_this",
    "networkSpec"
})
public class PrepareVchaRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected VchaClusterNetworkSpec networkSpec;

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
     * Gets the value of the networkSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VchaClusterNetworkSpec }
     *     
     */
    public VchaClusterNetworkSpec getNetworkSpec() {
        return networkSpec;
    }

    /**
     * Sets the value of the networkSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VchaClusterNetworkSpec }
     *     
     */
    public void setNetworkSpec(VchaClusterNetworkSpec value) {
        this.networkSpec = value;
    }

}

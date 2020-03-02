
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VslmCreateSpecDiskFileBackingSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VslmCreateSpecDiskFileBackingSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VslmCreateSpecBackingSpec">
 *       &lt;sequence>
 *         &lt;element name="provisioningType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpecDiskFileBackingSpec", propOrder = {
    "provisioningType"
})
public class VslmCreateSpecDiskFileBackingSpec
    extends VslmCreateSpecBackingSpec
{

    protected String provisioningType;

    /**
     * Gets the value of the provisioningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningType() {
        return provisioningType;
    }

    /**
     * Sets the value of the provisioningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningType(String value) {
        this.provisioningType = value;
    }

}

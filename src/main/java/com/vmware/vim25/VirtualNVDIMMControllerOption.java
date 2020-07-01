
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVDIMMControllerOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualNVDIMMControllerOption">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualControllerOption">
 *       &lt;sequence>
 *         &lt;element name="numNVDIMMControllers" type="{urn:vim25}IntOption"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMControllerOption", propOrder = {
    "numNVDIMMControllers"
})
public class VirtualNVDIMMControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numNVDIMMControllers;

    /**
     * Gets the value of the numNVDIMMControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumNVDIMMControllers() {
        return numNVDIMMControllers;
    }

    /**
     * Sets the value of the numNVDIMMControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumNVDIMMControllers(IntOption value) {
        this.numNVDIMMControllers = value;
    }

}

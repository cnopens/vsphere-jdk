
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfvslmInfrastructureObjectPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfvslmInfrastructureObjectPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vslmInfrastructureObjectPolicy" type="{urn:vim25}vslmInfrastructureObjectPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfvslmInfrastructureObjectPolicy", propOrder = {
    "vslmInfrastructureObjectPolicy"
})
public class ArrayOfvslmInfrastructureObjectPolicy {

    protected List<VslmInfrastructureObjectPolicy> vslmInfrastructureObjectPolicy;

    /**
     * Gets the value of the vslmInfrastructureObjectPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vslmInfrastructureObjectPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVslmInfrastructureObjectPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VslmInfrastructureObjectPolicy }
     * 
     * 
     */
    public List<VslmInfrastructureObjectPolicy> getVslmInfrastructureObjectPolicy() {
        if (vslmInfrastructureObjectPolicy == null) {
            vslmInfrastructureObjectPolicy = new ArrayList<VslmInfrastructureObjectPolicy>();
        }
        return this.vslmInfrastructureObjectPolicy;
    }

}

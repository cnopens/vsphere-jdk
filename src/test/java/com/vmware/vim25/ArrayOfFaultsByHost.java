
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFaultsByHost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFaultsByHost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaultsByHost" type="{urn:vim25}FaultsByHost" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaultsByHost", propOrder = {
    "faultsByHost"
})
public class ArrayOfFaultsByHost {

    @XmlElement(name = "FaultsByHost")
    protected List<FaultsByHost> faultsByHost;

    /**
     * Gets the value of the faultsByHost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultsByHost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultsByHost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultsByHost }
     * 
     * 
     */
    public List<FaultsByHost> getFaultsByHost() {
        if (faultsByHost == null) {
            faultsByHost = new ArrayList<FaultsByHost>();
        }
        return this.faultsByHost;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfApplyHostProfileConfigurationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfApplyHostProfileConfigurationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplyHostProfileConfigurationResult" type="{urn:vim25}ApplyHostProfileConfigurationResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApplyHostProfileConfigurationResult", propOrder = {
    "applyHostProfileConfigurationResult"
})
public class ArrayOfApplyHostProfileConfigurationResult {

    @XmlElement(name = "ApplyHostProfileConfigurationResult")
    protected List<ApplyHostProfileConfigurationResult> applyHostProfileConfigurationResult;

    /**
     * Gets the value of the applyHostProfileConfigurationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyHostProfileConfigurationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyHostProfileConfigurationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplyHostProfileConfigurationResult }
     * 
     * 
     */
    public List<ApplyHostProfileConfigurationResult> getApplyHostProfileConfigurationResult() {
        if (applyHostProfileConfigurationResult == null) {
            applyHostProfileConfigurationResult = new ArrayList<ApplyHostProfileConfigurationResult>();
        }
        return this.applyHostProfileConfigurationResult;
    }

}

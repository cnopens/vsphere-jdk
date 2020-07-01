
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNvdimmNamespaceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNvdimmNamespaceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NvdimmNamespaceInfo" type="{urn:vim25}NvdimmNamespaceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmNamespaceInfo", propOrder = {
    "nvdimmNamespaceInfo"
})
public class ArrayOfNvdimmNamespaceInfo {

    @XmlElement(name = "NvdimmNamespaceInfo")
    protected List<NvdimmNamespaceInfo> nvdimmNamespaceInfo;

    /**
     * Gets the value of the nvdimmNamespaceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nvdimmNamespaceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNvdimmNamespaceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmNamespaceInfo }
     * 
     * 
     */
    public List<NvdimmNamespaceInfo> getNvdimmNamespaceInfo() {
        if (nvdimmNamespaceInfo == null) {
            nvdimmNamespaceInfo = new ArrayList<NvdimmNamespaceInfo>();
        }
        return this.nvdimmNamespaceInfo;
    }

}

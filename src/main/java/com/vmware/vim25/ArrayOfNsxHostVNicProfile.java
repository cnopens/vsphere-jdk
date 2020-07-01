
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNsxHostVNicProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNsxHostVNicProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NsxHostVNicProfile" type="{urn:vim25}NsxHostVNicProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNsxHostVNicProfile", propOrder = {
    "nsxHostVNicProfile"
})
public class ArrayOfNsxHostVNicProfile {

    @XmlElement(name = "NsxHostVNicProfile")
    protected List<NsxHostVNicProfile> nsxHostVNicProfile;

    /**
     * Gets the value of the nsxHostVNicProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsxHostVNicProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsxHostVNicProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsxHostVNicProfile }
     * 
     * 
     */
    public List<NsxHostVNicProfile> getNsxHostVNicProfile() {
        if (nsxHostVNicProfile == null) {
            nsxHostVNicProfile = new ArrayList<NsxHostVNicProfile>();
        }
        return this.nsxHostVNicProfile;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfileMetadataProfileOperationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfileMetadataProfileOperationMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileMetadataProfileOperationMessage" type="{urn:vim25}ProfileMetadataProfileOperationMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileMetadataProfileOperationMessage", propOrder = {
    "profileMetadataProfileOperationMessage"
})
public class ArrayOfProfileMetadataProfileOperationMessage {

    @XmlElement(name = "ProfileMetadataProfileOperationMessage")
    protected List<ProfileMetadataProfileOperationMessage> profileMetadataProfileOperationMessage;

    /**
     * Gets the value of the profileMetadataProfileOperationMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileMetadataProfileOperationMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileMetadataProfileOperationMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileMetadataProfileOperationMessage }
     * 
     * 
     */
    public List<ProfileMetadataProfileOperationMessage> getProfileMetadataProfileOperationMessage() {
        if (profileMetadataProfileOperationMessage == null) {
            profileMetadataProfileOperationMessage = new ArrayList<ProfileMetadataProfileOperationMessage>();
        }
        return this.profileMetadataProfileOperationMessage;
    }

}

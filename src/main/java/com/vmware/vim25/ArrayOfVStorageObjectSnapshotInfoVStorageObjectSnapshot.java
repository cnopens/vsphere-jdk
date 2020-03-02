
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVStorageObjectSnapshotInfoVStorageObjectSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVStorageObjectSnapshotInfoVStorageObjectSnapshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VStorageObjectSnapshotInfoVStorageObjectSnapshot" type="{urn:vim25}VStorageObjectSnapshotInfoVStorageObjectSnapshot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVStorageObjectSnapshotInfoVStorageObjectSnapshot", propOrder = {
    "vStorageObjectSnapshotInfoVStorageObjectSnapshot"
})
public class ArrayOfVStorageObjectSnapshotInfoVStorageObjectSnapshot {

    @XmlElement(name = "VStorageObjectSnapshotInfoVStorageObjectSnapshot")
    protected List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> vStorageObjectSnapshotInfoVStorageObjectSnapshot;

    /**
     * Gets the value of the vStorageObjectSnapshotInfoVStorageObjectSnapshot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vStorageObjectSnapshotInfoVStorageObjectSnapshot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVStorageObjectSnapshotInfoVStorageObjectSnapshot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VStorageObjectSnapshotInfoVStorageObjectSnapshot }
     * 
     * 
     */
    public List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> getVStorageObjectSnapshotInfoVStorageObjectSnapshot() {
        if (vStorageObjectSnapshotInfoVStorageObjectSnapshot == null) {
            vStorageObjectSnapshotInfoVStorageObjectSnapshot = new ArrayList<VStorageObjectSnapshotInfoVStorageObjectSnapshot>();
        }
        return this.vStorageObjectSnapshotInfoVStorageObjectSnapshot;
    }

}

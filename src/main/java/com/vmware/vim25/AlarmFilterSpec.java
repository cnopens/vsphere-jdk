
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmFilterSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmFilterSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn:vim25}ManagedEntityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeTrigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmFilterSpec", propOrder = {
    "status",
    "typeEntity",
    "typeTrigger"
})
public class AlarmFilterSpec
    extends DynamicData
{

    protected List<ManagedEntityStatus> status;
    protected String typeEntity;
    protected String typeTrigger;

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedEntityStatus }
     * 
     * 
     */
    public List<ManagedEntityStatus> getStatus() {
        if (status == null) {
            status = new ArrayList<ManagedEntityStatus>();
        }
        return this.status;
    }

    /**
     * Gets the value of the typeEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEntity() {
        return typeEntity;
    }

    /**
     * Sets the value of the typeEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEntity(String value) {
        this.typeEntity = value;
    }

    /**
     * Gets the value of the typeTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTrigger() {
        return typeTrigger;
    }

    /**
     * Sets the value of the typeTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTrigger(String value) {
        this.typeTrigger = value;
    }

}


package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BaseConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseConfigInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:vim25}ID"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="keepAfterDeleteVm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="relocationDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nativeSnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changedBlockTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backing" type="{urn:vim25}BaseConfigInfoBackingInfo"/>
 *         &lt;element name="iofilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfo", propOrder = {
    "id",
    "name",
    "createTime",
    "keepAfterDeleteVm",
    "relocationDisabled",
    "nativeSnapshotSupported",
    "changedBlockTrackingEnabled",
    "backing",
    "iofilter"
})
@XmlSeeAlso({
    VStorageObjectConfigInfo.class
})
public class BaseConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ID id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected Boolean keepAfterDeleteVm;
    protected Boolean relocationDisabled;
    protected Boolean nativeSnapshotSupported;
    protected Boolean changedBlockTrackingEnabled;
    @XmlElement(required = true)
    protected BaseConfigInfoBackingInfo backing;
    protected List<String> iofilter;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setId(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the keepAfterDeleteVm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAfterDeleteVm() {
        return keepAfterDeleteVm;
    }

    /**
     * Sets the value of the keepAfterDeleteVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAfterDeleteVm(Boolean value) {
        this.keepAfterDeleteVm = value;
    }

    /**
     * Gets the value of the relocationDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelocationDisabled() {
        return relocationDisabled;
    }

    /**
     * Sets the value of the relocationDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelocationDisabled(Boolean value) {
        this.relocationDisabled = value;
    }

    /**
     * Gets the value of the nativeSnapshotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNativeSnapshotSupported() {
        return nativeSnapshotSupported;
    }

    /**
     * Sets the value of the nativeSnapshotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNativeSnapshotSupported(Boolean value) {
        this.nativeSnapshotSupported = value;
    }

    /**
     * Gets the value of the changedBlockTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedBlockTrackingEnabled() {
        return changedBlockTrackingEnabled;
    }

    /**
     * Sets the value of the changedBlockTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedBlockTrackingEnabled(Boolean value) {
        this.changedBlockTrackingEnabled = value;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link BaseConfigInfoBackingInfo }
     *     
     */
    public BaseConfigInfoBackingInfo getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseConfigInfoBackingInfo }
     *     
     */
    public void setBacking(BaseConfigInfoBackingInfo value) {
        this.backing = value;
    }

    /**
     * Gets the value of the iofilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iofilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIofilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIofilter() {
        if (iofilter == null) {
            iofilter = new ArrayList<String>();
        }
        return this.iofilter;
    }

}

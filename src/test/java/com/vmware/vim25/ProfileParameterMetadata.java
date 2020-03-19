
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileParameterMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileParameterMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:vim25}ExtendedElementDescription"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="securitySensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="parameterRelations" type="{urn:vim25}ProfileParameterMetadataParameterRelationMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileParameterMetadata", propOrder = {
    "id",
    "type",
    "optional",
    "defaultValue",
    "hidden",
    "securitySensitive",
    "readOnly",
    "parameterRelations"
})
public class ProfileParameterMetadata
    extends DynamicData
{

    @XmlElement(required = true)
    protected ExtendedElementDescription id;
    @XmlElement(required = true)
    protected String type;
    protected boolean optional;
    protected Object defaultValue;
    protected Boolean hidden;
    protected Boolean securitySensitive;
    protected Boolean readOnly;
    protected List<ProfileParameterMetadataParameterRelationMetadata> parameterRelations;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedElementDescription }
     *     
     */
    public ExtendedElementDescription getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedElementDescription }
     *     
     */
    public void setId(ExtendedElementDescription value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     */
    public boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     */
    public void setOptional(boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultValue(Object value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the securitySensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecuritySensitive() {
        return securitySensitive;
    }

    /**
     * Sets the value of the securitySensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecuritySensitive(Boolean value) {
        this.securitySensitive = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the parameterRelations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterRelations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterRelations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileParameterMetadataParameterRelationMetadata }
     * 
     * 
     */
    public List<ProfileParameterMetadataParameterRelationMetadata> getParameterRelations() {
        if (parameterRelations == null) {
            parameterRelations = new ArrayList<ProfileParameterMetadataParameterRelationMetadata>();
        }
        return this.parameterRelations;
    }

}

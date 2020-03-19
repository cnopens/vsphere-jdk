
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileMetadataProfileOperationMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileMetadataProfileOperationMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{urn:vim25}LocalizableMessage"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileMetadataProfileOperationMessage", propOrder = {
    "operationName",
    "message"
})
public class ProfileMetadataProfileOperationMessage
    extends DynamicData
{

    @XmlElement(required = true)
    protected String operationName;
    @XmlElement(required = true)
    protected LocalizableMessage message;

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizableMessage }
     *     
     */
    public LocalizableMessage getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizableMessage }
     *     
     */
    public void setMessage(LocalizableMessage value) {
        this.message = value;
    }

}

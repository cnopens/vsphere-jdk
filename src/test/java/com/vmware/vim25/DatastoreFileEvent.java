
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreFileEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatastoreFileEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DatastoreEvent">
 *       &lt;sequence>
 *         &lt;element name="targetFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="succeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreFileEvent", propOrder = {
    "targetFile",
    "sourceOfOperation",
    "succeeded"
})
@XmlSeeAlso({
    DatastoreFileDeletedEvent.class,
    DatastoreFileMovedEvent.class,
    DatastoreFileCopiedEvent.class
})
public class DatastoreFileEvent
    extends DatastoreEvent
{

    @XmlElement(required = true)
    protected String targetFile;
    protected String sourceOfOperation;
    protected Boolean succeeded;

    /**
     * Gets the value of the targetFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFile() {
        return targetFile;
    }

    /**
     * Sets the value of the targetFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFile(String value) {
        this.targetFile = value;
    }

    /**
     * Gets the value of the sourceOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfOperation() {
        return sourceOfOperation;
    }

    /**
     * Sets the value of the sourceOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfOperation(String value) {
        this.sourceOfOperation = value;
    }

    /**
     * Gets the value of the succeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSucceeded() {
        return succeeded;
    }

    /**
     * Sets the value of the succeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSucceeded(Boolean value) {
        this.succeeded = value;
    }

}

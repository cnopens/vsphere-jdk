
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSMacManagementPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DVSMacManagementPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}InheritablePolicy">
 *       &lt;sequence>
 *         &lt;element name="allowPromiscuous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="macChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forgedTransmits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="macLearningPolicy" type="{urn:vim25}DVSMacLearningPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSMacManagementPolicy", propOrder = {
    "allowPromiscuous",
    "macChanges",
    "forgedTransmits",
    "macLearningPolicy"
})
public class DVSMacManagementPolicy
    extends InheritablePolicy
{

    protected Boolean allowPromiscuous;
    protected Boolean macChanges;
    protected Boolean forgedTransmits;
    protected DVSMacLearningPolicy macLearningPolicy;

    /**
     * Gets the value of the allowPromiscuous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPromiscuous() {
        return allowPromiscuous;
    }

    /**
     * Sets the value of the allowPromiscuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPromiscuous(Boolean value) {
        this.allowPromiscuous = value;
    }

    /**
     * Gets the value of the macChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMacChanges() {
        return macChanges;
    }

    /**
     * Sets the value of the macChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMacChanges(Boolean value) {
        this.macChanges = value;
    }

    /**
     * Gets the value of the forgedTransmits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForgedTransmits() {
        return forgedTransmits;
    }

    /**
     * Sets the value of the forgedTransmits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForgedTransmits(Boolean value) {
        this.forgedTransmits = value;
    }

    /**
     * Gets the value of the macLearningPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DVSMacLearningPolicy }
     *     
     */
    public DVSMacLearningPolicy getMacLearningPolicy() {
        return macLearningPolicy;
    }

    /**
     * Sets the value of the macLearningPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSMacLearningPolicy }
     *     
     */
    public void setMacLearningPolicy(DVSMacLearningPolicy value) {
        this.macLearningPolicy = value;
    }

}

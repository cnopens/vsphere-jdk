
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnableCryptoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnableCryptoRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="keyPlain" type="{urn:vim25}CryptoKeyPlain"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnableCryptoRequestType", propOrder = {
    "_this",
    "keyPlain"
})
public class EnableCryptoRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected CryptoKeyPlain keyPlain;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the keyPlain property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyPlain }
     *     
     */
    public CryptoKeyPlain getKeyPlain() {
        return keyPlain;
    }

    /**
     * Sets the value of the keyPlain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyPlain }
     *     
     */
    public void setKeyPlain(CryptoKeyPlain value) {
        this.keyPlain = value;
    }

}

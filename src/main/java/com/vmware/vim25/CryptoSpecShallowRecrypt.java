
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoSpecShallowRecrypt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptoSpecShallowRecrypt">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}CryptoSpec">
 *       &lt;sequence>
 *         &lt;element name="newKeyId" type="{urn:vim25}CryptoKeyId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSpecShallowRecrypt", propOrder = {
    "newKeyId"
})
public class CryptoSpecShallowRecrypt
    extends CryptoSpec
{

    @XmlElement(required = true)
    protected CryptoKeyId newKeyId;

    /**
     * Gets the value of the newKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyId }
     *     
     */
    public CryptoKeyId getNewKeyId() {
        return newKeyId;
    }

    /**
     * Sets the value of the newKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyId }
     *     
     */
    public void setNewKeyId(CryptoKeyId value) {
        this.newKeyId = value;
    }

}

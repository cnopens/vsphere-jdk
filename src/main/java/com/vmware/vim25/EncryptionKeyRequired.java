
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionKeyRequired complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptionKeyRequired">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}InvalidState">
 *       &lt;sequence>
 *         &lt;element name="requiredKey" type="{urn:vim25}CryptoKeyId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionKeyRequired", propOrder = {
    "requiredKey"
})
public class EncryptionKeyRequired
    extends InvalidState
{

    protected List<CryptoKeyId> requiredKey;

    /**
     * Gets the value of the requiredKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptoKeyId }
     * 
     * 
     */
    public List<CryptoKeyId> getRequiredKey() {
        if (requiredKey == null) {
            requiredKey = new ArrayList<CryptoKeyId>();
        }
        return this.requiredKey;
    }

}

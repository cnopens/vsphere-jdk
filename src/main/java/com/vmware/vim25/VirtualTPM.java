
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualTPM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualTPM">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}VirtualDevice">
 *       &lt;sequence>
 *         &lt;element name="endorsementKeyCertificateSigningRequest" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endorsementKeyCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualTPM", propOrder = {
    "endorsementKeyCertificateSigningRequest",
    "endorsementKeyCertificate"
})
public class VirtualTPM
    extends VirtualDevice
{

    protected List<byte[]> endorsementKeyCertificateSigningRequest;
    protected List<byte[]> endorsementKeyCertificate;

    /**
     * Gets the value of the endorsementKeyCertificateSigningRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementKeyCertificateSigningRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementKeyCertificateSigningRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getEndorsementKeyCertificateSigningRequest() {
        if (endorsementKeyCertificateSigningRequest == null) {
            endorsementKeyCertificateSigningRequest = new ArrayList<byte[]>();
        }
        return this.endorsementKeyCertificateSigningRequest;
    }

    /**
     * Gets the value of the endorsementKeyCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementKeyCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementKeyCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getEndorsementKeyCertificate() {
        if (endorsementKeyCertificate == null) {
            endorsementKeyCertificate = new ArrayList<byte[]>();
        }
        return this.endorsementKeyCertificate;
    }

}


package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoManagerKmipServerCertInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptoManagerKmipServerCertInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certInfo" type="{urn:vim25}CryptoManagerKmipCertificateInfo" minOccurs="0"/>
 *         &lt;element name="clientTrustServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipServerCertInfo", propOrder = {
    "certificate",
    "certInfo",
    "clientTrustServer"
})
public class CryptoManagerKmipServerCertInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String certificate;
    protected CryptoManagerKmipCertificateInfo certInfo;
    protected Boolean clientTrustServer;

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the certInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoManagerKmipCertificateInfo }
     *     
     */
    public CryptoManagerKmipCertificateInfo getCertInfo() {
        return certInfo;
    }

    /**
     * Sets the value of the certInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoManagerKmipCertificateInfo }
     *     
     */
    public void setCertInfo(CryptoManagerKmipCertificateInfo value) {
        this.certInfo = value;
    }

    /**
     * Gets the value of the clientTrustServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientTrustServer() {
        return clientTrustServer;
    }

    /**
     * Sets the value of the clientTrustServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientTrustServer(Boolean value) {
        this.clientTrustServer = value;
    }

}

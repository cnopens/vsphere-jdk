
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNfcLeaseCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HttpNfcLeaseCapabilities">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="pullModeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="corsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseCapabilities", propOrder = {
    "pullModeSupported",
    "corsSupported"
})
public class HttpNfcLeaseCapabilities
    extends DynamicData
{

    protected boolean pullModeSupported;
    protected boolean corsSupported;

    /**
     * Gets the value of the pullModeSupported property.
     * 
     */
    public boolean isPullModeSupported() {
        return pullModeSupported;
    }

    /**
     * Sets the value of the pullModeSupported property.
     * 
     */
    public void setPullModeSupported(boolean value) {
        this.pullModeSupported = value;
    }

    /**
     * Gets the value of the corsSupported property.
     * 
     */
    public boolean isCorsSupported() {
        return corsSupported;
    }

    /**
     * Sets the value of the corsSupported property.
     * 
     */
    public void setCorsSupported(boolean value) {
        this.corsSupported = value;
    }

}

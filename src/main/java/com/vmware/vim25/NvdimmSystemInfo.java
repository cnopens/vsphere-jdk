
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmSystemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NvdimmSystemInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}DynamicData">
 *       &lt;sequence>
 *         &lt;element name="summary" type="{urn:vim25}NvdimmSummary" minOccurs="0"/>
 *         &lt;element name="dimms" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dimmInfo" type="{urn:vim25}NvdimmDimmInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interleaveSet" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="iSetInfo" type="{urn:vim25}NvdimmInterleaveSetInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="namespace" type="{urn:vim25}NvdimmGuid" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nsInfo" type="{urn:vim25}NvdimmNamespaceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmSystemInfo", propOrder = {
    "summary",
    "dimms",
    "dimmInfo",
    "interleaveSet",
    "iSetInfo",
    "namespace",
    "nsInfo"
})
public class NvdimmSystemInfo
    extends DynamicData
{

    protected NvdimmSummary summary;
    @XmlElement(type = Integer.class)
    protected List<Integer> dimms;
    protected List<NvdimmDimmInfo> dimmInfo;
    @XmlElement(type = Integer.class)
    protected List<Integer> interleaveSet;
    protected List<NvdimmInterleaveSetInfo> iSetInfo;
    protected List<NvdimmGuid> namespace;
    protected List<NvdimmNamespaceInfo> nsInfo;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link NvdimmSummary }
     *     
     */
    public NvdimmSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NvdimmSummary }
     *     
     */
    public void setSummary(NvdimmSummary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the dimms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getDimms() {
        if (dimms == null) {
            dimms = new ArrayList<Integer>();
        }
        return this.dimms;
    }

    /**
     * Gets the value of the dimmInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimmInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimmInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmDimmInfo }
     * 
     * 
     */
    public List<NvdimmDimmInfo> getDimmInfo() {
        if (dimmInfo == null) {
            dimmInfo = new ArrayList<NvdimmDimmInfo>();
        }
        return this.dimmInfo;
    }

    /**
     * Gets the value of the interleaveSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interleaveSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterleaveSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getInterleaveSet() {
        if (interleaveSet == null) {
            interleaveSet = new ArrayList<Integer>();
        }
        return this.interleaveSet;
    }

    /**
     * Gets the value of the iSetInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iSetInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISetInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmInterleaveSetInfo }
     * 
     * 
     */
    public List<NvdimmInterleaveSetInfo> getISetInfo() {
        if (iSetInfo == null) {
            iSetInfo = new ArrayList<NvdimmInterleaveSetInfo>();
        }
        return this.iSetInfo;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namespace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamespace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmGuid }
     * 
     * 
     */
    public List<NvdimmGuid> getNamespace() {
        if (namespace == null) {
            namespace = new ArrayList<NvdimmGuid>();
        }
        return this.namespace;
    }

    /**
     * Gets the value of the nsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmNamespaceInfo }
     * 
     * 
     */
    public List<NvdimmNamespaceInfo> getNsInfo() {
        if (nsInfo == null) {
            nsInfo = new ArrayList<NvdimmNamespaceInfo>();
        }
        return this.nsInfo;
    }

}

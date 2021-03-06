
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "FilterInUseFault", targetNamespace = "urn:vim25")
public class FilterInUseFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FilterInUse faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public FilterInUseFaultMsg(String message, FilterInUse faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public FilterInUseFaultMsg(String message, FilterInUse faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.FilterInUse
     */
    public FilterInUse getFaultInfo() {
        return faultInfo;
    }

}

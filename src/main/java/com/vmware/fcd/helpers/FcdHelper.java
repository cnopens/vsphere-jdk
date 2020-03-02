/*
 * *****************************************************
 * Copyright VMware, Inc. 2016.  All Rights Reserved.
 * *****************************************************
 *
 * DISCLAIMER. THIS PROGRAM IS PROVIDED TO YOU "AS IS" WITHOUT
 * WARRANTIES OR CONDITIONS # OF ANY KIND, WHETHER ORAL OR WRITTEN,
 * EXPRESS OR IMPLIED. THE AUTHOR SPECIFICALLY # DISCLAIMS ANY IMPLIED
 * WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY # QUALITY,
 * NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.vmware.fcd.helpers;

import com.vmware.vim25.ID;

/**
 * Helper class for FCD Samples
 *
 */
public class FcdHelper {

    /**
     * Utility method to wrap ID string in an ID object.
     * 
     * @param idStr The idStr to be wrapped.
     * @return id in ID format.
     */
    public static ID makeId(String idStr) {
        ID id = new ID();
        id.setId(idStr);
        return id;
    }
}

/*
 * ******************************************************
 * Copyright VMware, Inc. 2016.  All Rights Reserved.
 * ******************************************************
 *
 * DISCLAIMER. THIS PROGRAM IS PROVIDED TO YOU "AS IS" WITHOUT
 * WARRANTIES OR CONDITIONS # OF ANY KIND, WHETHER ORAL OR WRITTEN,
 * EXPRESS OR IMPLIED. THE AUTHOR SPECIFICALLY # DISCLAIMS ANY IMPLIED
 * WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY # QUALITY,
 * NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.vmware.fcd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vmware.common.annotations.Action;
import com.vmware.common.annotations.Before;
import com.vmware.common.annotations.Option;
import com.vmware.common.annotations.Sample;
import com.vmware.connection.ConnectedVimServiceBase;
import com.vmware.vim25.BaseConfigInfoBackingInfo;
import com.vmware.vim25.BaseConfigInfoDiskFileBackingInfoProvisioningType;
import com.vmware.vim25.BaseConfigInfoFileBackingInfo;
import com.vmware.vim25.FileFaultFaultMsg;
import com.vmware.vim25.ID;
import com.vmware.vim25.InvalidCollectorVersionFaultMsg;
import com.vmware.vim25.InvalidDatastoreFaultMsg;
import com.vmware.vim25.InvalidPropertyFaultMsg;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotFoundFaultMsg;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VStorageObject;
import com.vmware.vim25.VirtualDiskCompatibilityMode;
import com.vmware.vim25.VslmCreateSpec;
import com.vmware.vim25.VslmCreateSpecBackingSpec;
import com.vmware.vim25.VslmCreateSpecDiskFileBackingSpec;
import com.vmware.vim25.VslmCreateSpecRawDiskMappingBackingSpec;

/**
 * <pre>
 * FcdCreate
 *
 * This sample creates a virtual storage object
 *
 * <b>Parameters:</b>
 * url                    [required] : url of the web service
 * username               [required] : username for the authentication
 * password               [required] : password for the authentication
 * vstorageobjectname     [required] : Name of the disk
 * datastorename          [required] : Name of the datastore
 * vstorageobjectsizeinMB [required] : Size of the disk(in MB)
 * provisioningtype       [optional] : Type of provisioning for the disk
 *                                     [thin | eagerZeroedThick |
 *                                     lazyZeroedThick | virtualMode |
 *                                     physicalMode]
 * devicename             [optional] : Canonical name of the LUN to use for disk types
 *
 * <b>Command Line:</b>
 * Create a disk (virtual storage object) given vstorageobject name, datastore
 * name and vstorageobject size
 * run.bat com.vmware.vm.FcdCreate --url [webserviceurl]
 * --username [username] --password [password]
 * --vstorageobjectname [vstorageobjectname] --datastorename [datastorename]
 * --vstorageobject [vstorageobject]
 *
 * Create a disk (virtual storage object) given vstorageobject name, datastore
 * names, vstorageobject size and provisioning type of vstorageobject
 * run.bat com.vmware.vm.FcdCreate --url [webserviceurl]
 * --username [username] --password [password]
 * --vstorageobjectname [vstorageobjectname] --datastorename [datastorename]
 * --vstorageobject [vstorageobject] --provisioningtype [provisioningtype]
 * --devicename [devicename]
 *
 * Ex: devicename :: vmhba0:0:0:0
 * </pre>
 */
@Sample(name = "fcd-create", description = "This sample creates a virtual"
        + " storage object(FCD).")
public class FcdCreate extends ConnectedVimServiceBase {

    private String vStorageObjectName;
    private String datastoreName;
    private long vStorageObjectSizeInMB;
    private String provisioningType = "thin"; // Default.
    private String deviceName;
    private final Map<String, DiskProvisioningTypes> provisioningTypeHashMap =
            new HashMap<String, DiskProvisioningTypes>();

    private static enum DiskProvisioningTypes {
        THIN("thin"),
        EAGER_ZEROED_THICK("eagerZeroedThick"),
        LAZY_ZEROED_THICK("lazyZeroedThick"),
        VIRTUAL_MODE("virtualMode"),
        PHYSICAL_MODE("physicalMode");

        private final String value;

        private DiskProvisioningTypes(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * @param vStorageObjectName the vStorageObjectName to set
     */
    @Option(name = "vstorageobjectname",
            required = true,
            description = "Name of the Disk.")
    public void setVStorageObjectName(String vStorageObjectName) {
        this.vStorageObjectName = vStorageObjectName;
    }

    /**
     * @param datastoreName the datastoreName to set
     */
    @Option(name = "datastorename",
            required = true,
            description = "Name of datastore.")
    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * @param vStorageObjectSizeInMB the vStorageObjectSizeInMB to set
     */
    @Option(name = "vstorageobjectsizeinMB",
            required = true,
            description = "Size of the Disk (in MB)")
    public void setVStorageObjectSize(long vStorageObjectSizeInMB) {
        this.vStorageObjectSizeInMB = vStorageObjectSizeInMB;
    }

    /**
     * @param provisioningType the provisioningType to set
     */
    @Option(name = "provisioningtype",
            required = false,
            description = "Provisioning Type of the Disk.\n [thin | " +
            "eagerZeroedThick | lazyZeroedThick | virtualMode | physicalMode]")
    public void setProvisioningType(String provisioningType) {
        this.provisioningType = provisioningType;
    }

    /**
     * @param deviceName the deviceName to set
     */
    @Option(name = "devicename",
            required = false,
            description = "Canonical name of the LUN to use for RDM" +
            " provisioning type.")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Before
    public void init() {
        provisioningTypeHashMap.put("thin", DiskProvisioningTypes.THIN);
        provisioningTypeHashMap.put("eagerzeroedthick",
                DiskProvisioningTypes.EAGER_ZEROED_THICK);
        provisioningTypeHashMap.put("lazyzeroedthick",
                DiskProvisioningTypes.LAZY_ZEROED_THICK);
        provisioningTypeHashMap.put("virtualmode",
                DiskProvisioningTypes.VIRTUAL_MODE);
        provisioningTypeHashMap.put("physicalmode",
                DiskProvisioningTypes.PHYSICAL_MODE);
    }

    /**
     * This method returns a boolean value specifying whether the Task is
     * succeeded or failed.
     *
     * @param task
     *            ManagedObjectReference representing the Task.
     * @return boolean value representing the Task result.
     * @throws InvalidCollectorVersionFaultMsg
     *
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidPropertyFaultMsg
     */
    boolean getTaskResultAfterDone(ManagedObjectReference task)
            throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg,
            InvalidCollectorVersionFaultMsg {

        boolean retVal = false;

        // info has a property - state for state of the task
        Object[] result = waitForValues.wait(task, new String[] { "info.state",
                "info.error" }, new String[] { "state" },
                new Object[][] { new Object[] { TaskInfoState.SUCCESS,
                        TaskInfoState.ERROR } });

        if (result[0].equals(TaskInfoState.SUCCESS)) {
            retVal = true;
        }
        if (result[1] instanceof LocalizedMethodFault) {
            throw new RuntimeException(
                    ((LocalizedMethodFault) result[1]).getLocalizedMessage());
        }
        return retVal;
    }

    /**
     * Creates the virtual storage object.
     *
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidDatastoreFaultMsg
     * @throws FileFaultFaultMsg
     * @throws InvalidCollectorVersionFaultMsg
     * @throws InvalidPropertyFaultMsg
     * @throws NotFoundFaultMsg
     *
     * @throws Exception
     *             the exception
     */
    void createVStorageObject() throws IllegalArgumentException,
            FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg,
            InvalidPropertyFaultMsg, InvalidCollectorVersionFaultMsg,
            NotFoundFaultMsg {
        // Get vStorageObjectManager Mor.
        ManagedObjectReference morVStrObjManager = connection
                .getServiceContent().getVStorageObjectManager();

        // Init provisioning types:
        DiskProvisioningTypes diskProvisioningType = provisioningTypeHashMap
                .get(provisioningType.trim().toLowerCase());

        if(diskProvisioningType == null){
            throw new RuntimeException("The input provisioning Type is not valid.");
        }
        // Get all the input Mor's required for creating VStorageObject.
        ManagedObjectReference morDatastore = getMOREFs.inContainerByType(
                serviceContent.getRootFolder(), "Datastore").get(datastoreName);

        if(morDatastore == null){
            throw new RuntimeException("The datastore name is not valid.");
        }

        // Create a create spec for VStorageObject
        VslmCreateSpec vslmCreateSpec = generateVslmCreateSpec(morDatastore,
                diskProvisioningType);
        System.out.println("Operation: Creating a vStorageObject");
        ManagedObjectReference createDiskTaskMor = vimPort.createDiskTask(
                morVStrObjManager, vslmCreateSpec);
        VStorageObject createdVStorageObject = null;
        if (getTaskResultAfterDone(createDiskTaskMor)) {
            createdVStorageObject = (VStorageObject) getMOREFs.entityProps(
                    createDiskTaskMor, new String[] { "info.result" }).get(
                    "info.result");
            System.out.printf(
                    "Success: Created vStorageObject :  %n [ Name = %s ]"
                            + " %n [ Uuid = %s ] %n [ DatastorePath = %s ]%n",
                    createdVStorageObject.getConfig().getName(),
                    createdVStorageObject.getConfig().getId().getId(),
                    getFcdFilePath(createdVStorageObject));
        } else {
            String msg = "Error: Creating [ " + vStorageObjectName
                    + "] vStorageObject";
            throw new RuntimeException(msg);
        }

        // Retrieve a list of all the virtual storage objects in given datastore
        // and verify if the created vStorageObject is present in the returned
        // list.
        System.out.println("Operation: List all vStorageObjects in datastore.");
        List<ID> listOfVStrObj = vimPort.listVStorageObject(morVStrObjManager,
                morDatastore);

        if (isFcdIdInFcdList(Arrays.asList(createdVStorageObject.getConfig()
                .getId().getId()), listOfVStrObj)) {
            System.out.printf(
                    "Success: listVStorageObject contains the created"
                            + " vStorageObjectId : %n [ %s ]%n",
                    createdVStorageObject.getConfig().getId().getId());
        } else {
            String msg = "Error: Created VStorageObject [ "
                    + createdVStorageObject.getConfig().getId().getId()
                    + "] is not present in the returned list from vc.";
            throw new RuntimeException(msg);
        }

        // Retrieve all the properties of a virtual storage objects based on the
        // Uuid of the vStorageObject obtained from the list call.
        System.out.println("Operation: Retrieve the  createdVStorageObjects in"
                + " datastore.");
        VStorageObject retrievedVStrObj = vimPort.retrieveVStorageObject(
                morVStrObjManager, createdVStorageObject.getConfig().getId(),
                morDatastore);
        if (retrievedVStrObj.getConfig().getId().getId()
                .equals(createdVStorageObject.getConfig().getId().getId())) {
            System.out.printf(
                    "Success: Retrieved vStorageObject :: %n [ %s ]%n",
                    retrievedVStrObj.getConfig().getId().getId());
        } else {
            String msg = "Error: Created VStorageObject [ "
                    + createdVStorageObject.getConfig().getId().getId()
                    + "] and retrieved VStorageObject are different.";
            throw new RuntimeException(msg);
        }
    }

    /**
     * Verifies if Fcd Id List&lt;String&gt; is included in fcdIDList
     *
     * @param fcdStrIdList
     *            List of FCD IDs as String
     * @param fcdIdList
     *            List of FCD IDs as ID
     * @return true if fcdIDList&lt;ID&gt; contains all the fcds in
     *         fcdStrIDList&lt;String&gt;
     */
    public static boolean isFcdIdInFcdList(List<String> fcdStrIdList,
            List<ID> fcdIdList) {
        List<String> fcdIDAsStringList = new ArrayList<String>();
        for (ID fcdID : fcdIdList) {
            fcdIDAsStringList.add(fcdID.getId());
        }
        if (fcdIDAsStringList.containsAll(fcdStrIdList)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method constructs a VslmCreateSpec for the vStorageObject
     *
     * @param dsMor The ManagedObjectReferece of the datastore
     * @param provisioningType The provisioningType of the disk
     * @return VslmCreateSpec
     * @throws IllegalArgumentException
     */
    public VslmCreateSpec generateVslmCreateSpec(ManagedObjectReference dsMor,
            DiskProvisioningTypes provisioningType)
            throws IllegalArgumentException {
        System.out.println("Info :: Creating VslmCreateSpec with dsMor: "
                + dsMor.getValue() + " provisioningType:"
                + provisioningType.toString());
        VslmCreateSpecBackingSpec vslmCreateSpecBackingSpec;
        if (provisioningType != DiskProvisioningTypes.VIRTUAL_MODE
                && provisioningType != DiskProvisioningTypes.PHYSICAL_MODE) {
            VslmCreateSpecDiskFileBackingSpec diskFileBackingSpec =
                    new VslmCreateSpecDiskFileBackingSpec();
            diskFileBackingSpec.setDatastore(dsMor);
            diskFileBackingSpec.setProvisioningType(
                    BaseConfigInfoDiskFileBackingInfoProvisioningType
                            .valueOf(provisioningType.toString()).value());
            vslmCreateSpecBackingSpec = diskFileBackingSpec;
        } else {
            if (deviceName == null || deviceName.isEmpty()) {
                throw new IllegalArgumentException(
                        "The devicename is mandatory for specified disktype [ "
                                + provisioningType.value() + " ]");
            }
            VslmCreateSpecRawDiskMappingBackingSpec rdmBackingSpec =
                    new VslmCreateSpecRawDiskMappingBackingSpec();
            rdmBackingSpec.setDatastore(dsMor);
            rdmBackingSpec.setCompatibilityMode(VirtualDiskCompatibilityMode
                    .valueOf(provisioningType.toString()).value());
            rdmBackingSpec.setLunUuid(deviceName);
            vslmCreateSpecBackingSpec = rdmBackingSpec;
        }
        VslmCreateSpec createSpec = new VslmCreateSpec();
        createSpec.setBackingSpec(vslmCreateSpecBackingSpec);
        createSpec.setName(vStorageObjectName);
        createSpec.setCapacityInMB(vStorageObjectSizeInMB);
        return createSpec;
    }

    /**
     * Util method to get the FilePath of a given VStorageObject.
     *
     * @param vStorageObject The vStorageObject whose path is to be found.
     * @return filePath of vStorageObject
     */
    public static String getFcdFilePath(VStorageObject vStorageObject) {
        BaseConfigInfoBackingInfo backingInfo = vStorageObject.getConfig()
                .getBacking();
        if (backingInfo instanceof BaseConfigInfoFileBackingInfo) {
            BaseConfigInfoFileBackingInfo fileBackingInfo
            = (BaseConfigInfoFileBackingInfo) backingInfo;
            return fileBackingInfo.getFilePath();
        }
        return null;
    }

    @Action
    public void run() throws IllegalArgumentException, RuntimeException,
            FileFaultFaultMsg, InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg,
            InvalidPropertyFaultMsg, InvalidCollectorVersionFaultMsg,
            NotFoundFaultMsg {
        init();
        createVStorageObject();
    }
}

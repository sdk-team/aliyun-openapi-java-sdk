/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateInstance_GatedLaunchRequest extends RpcAcsRequest<CreateInstance_GatedLaunchResponse> {
	
	public CreateInstance_GatedLaunchRequest() {
		super("Ecs", "2014-05-26", "CreateInstance_GatedLaunch");
	}

	private Integer dataDisk3Size;

	private Long resourceOwnerId;

	private String dataDisk3Category;

	private String hostName;

	private String password;

	private String dataDisk2SnapshotId;

	private String dataDisk3DiskName;

	private Integer dataDisk4Size;

	private List<Tag> tags;

	private String nodeControllerId;

	private Integer period;

	private Long ownerId;

	private Boolean dataDisk2DeleteWithInstance;

	private String vSwitchId;

	private String privateIpAddress;

	private String spotStrategy;

	private String instanceName;

	private Boolean dataDisk3DeleteWithInstance;

	private String internetChargeType;

	private String dataDisk3Device;

	private String zoneId;

	private Boolean dataDisk4DeleteWithInstance;

	private String dataDisk2DiskName;

	private Integer internetMaxBandwidthIn;

	private Boolean dataDisk1DeleteWithInstance;

	private Boolean useAdditionalService;

	private String imageId;

	private String dataDisk1SnapshotId;

	private String dataDisk1Device;

	private String clientToken;

	private String vlanId;

	private String dataDisk2Device;

	private String ioOptimized;

	private String securityGroupId;

	private Integer internetMaxBandwidthOut;

	private String dataDisk4Description;

	private String description;

	private String dataDisk1DiskName;

	private String dataDisk3Description;

	private String dataDisk4DiskName;

	private String systemDiskCategory;

	private String userData;

	private String dataDisk1Description;

	private String dataDisk4Category;

	private String dataDisk2Description;

	private String instanceType;

	private String dataDisk2Category;

	private Integer dataDisk1Size;

	private String instanceChargeType;

	private String deploymentSetId;

	private String innerIpAddress;

	private String dataDisk3SnapshotId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String systemDiskDiskName;

	private Integer dataDisk2Size;

	private String clusterId;

	private String dataDisk1Category;

	private Integer systemDiskSize;

	private String dataDisk4SnapshotId;

	private String dataDisk4Device;

	private String systemDiskDescription;

	public Integer getDataDisk3Size() {
		return this.dataDisk3Size;
	}

	public void setDataDisk3Size(Integer dataDisk3Size) {
		this.dataDisk3Size = dataDisk3Size;
		if(dataDisk3Size != null){
			putQueryParameter("DataDisk.3.Size", dataDisk3Size.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDataDisk3Category() {
		return this.dataDisk3Category;
	}

	public void setDataDisk3Category(String dataDisk3Category) {
		this.dataDisk3Category = dataDisk3Category;
		if(dataDisk3Category != null){
			putQueryParameter("DataDisk.3.Category", dataDisk3Category);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getDataDisk2SnapshotId() {
		return this.dataDisk2SnapshotId;
	}

	public void setDataDisk2SnapshotId(String dataDisk2SnapshotId) {
		this.dataDisk2SnapshotId = dataDisk2SnapshotId;
		if(dataDisk2SnapshotId != null){
			putQueryParameter("DataDisk.2.SnapshotId", dataDisk2SnapshotId);
		}
	}

	public String getDataDisk3DiskName() {
		return this.dataDisk3DiskName;
	}

	public void setDataDisk3DiskName(String dataDisk3DiskName) {
		this.dataDisk3DiskName = dataDisk3DiskName;
		if(dataDisk3DiskName != null){
			putQueryParameter("DataDisk.3.DiskName", dataDisk3DiskName);
		}
	}

	public Integer getDataDisk4Size() {
		return this.dataDisk4Size;
	}

	public void setDataDisk4Size(Integer dataDisk4Size) {
		this.dataDisk4Size = dataDisk4Size;
		if(dataDisk4Size != null){
			putQueryParameter("DataDisk.4.Size", dataDisk4Size.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getNodeControllerId() {
		return this.nodeControllerId;
	}

	public void setNodeControllerId(String nodeControllerId) {
		this.nodeControllerId = nodeControllerId;
		if(nodeControllerId != null){
			putQueryParameter("NodeControllerId", nodeControllerId);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getDataDisk2DeleteWithInstance() {
		return this.dataDisk2DeleteWithInstance;
	}

	public void setDataDisk2DeleteWithInstance(Boolean dataDisk2DeleteWithInstance) {
		this.dataDisk2DeleteWithInstance = dataDisk2DeleteWithInstance;
		if(dataDisk2DeleteWithInstance != null){
			putQueryParameter("DataDisk.2.DeleteWithInstance", dataDisk2DeleteWithInstance.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public Boolean getDataDisk3DeleteWithInstance() {
		return this.dataDisk3DeleteWithInstance;
	}

	public void setDataDisk3DeleteWithInstance(Boolean dataDisk3DeleteWithInstance) {
		this.dataDisk3DeleteWithInstance = dataDisk3DeleteWithInstance;
		if(dataDisk3DeleteWithInstance != null){
			putQueryParameter("DataDisk.3.DeleteWithInstance", dataDisk3DeleteWithInstance.toString());
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getDataDisk3Device() {
		return this.dataDisk3Device;
	}

	public void setDataDisk3Device(String dataDisk3Device) {
		this.dataDisk3Device = dataDisk3Device;
		if(dataDisk3Device != null){
			putQueryParameter("DataDisk.3.Device", dataDisk3Device);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Boolean getDataDisk4DeleteWithInstance() {
		return this.dataDisk4DeleteWithInstance;
	}

	public void setDataDisk4DeleteWithInstance(Boolean dataDisk4DeleteWithInstance) {
		this.dataDisk4DeleteWithInstance = dataDisk4DeleteWithInstance;
		if(dataDisk4DeleteWithInstance != null){
			putQueryParameter("DataDisk.4.DeleteWithInstance", dataDisk4DeleteWithInstance.toString());
		}
	}

	public String getDataDisk2DiskName() {
		return this.dataDisk2DiskName;
	}

	public void setDataDisk2DiskName(String dataDisk2DiskName) {
		this.dataDisk2DiskName = dataDisk2DiskName;
		if(dataDisk2DiskName != null){
			putQueryParameter("DataDisk.2.DiskName", dataDisk2DiskName);
		}
	}

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
		}
	}

	public Boolean getDataDisk1DeleteWithInstance() {
		return this.dataDisk1DeleteWithInstance;
	}

	public void setDataDisk1DeleteWithInstance(Boolean dataDisk1DeleteWithInstance) {
		this.dataDisk1DeleteWithInstance = dataDisk1DeleteWithInstance;
		if(dataDisk1DeleteWithInstance != null){
			putQueryParameter("DataDisk.1.DeleteWithInstance", dataDisk1DeleteWithInstance.toString());
		}
	}

	public Boolean getUseAdditionalService() {
		return this.useAdditionalService;
	}

	public void setUseAdditionalService(Boolean useAdditionalService) {
		this.useAdditionalService = useAdditionalService;
		if(useAdditionalService != null){
			putQueryParameter("UseAdditionalService", useAdditionalService.toString());
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getDataDisk1SnapshotId() {
		return this.dataDisk1SnapshotId;
	}

	public void setDataDisk1SnapshotId(String dataDisk1SnapshotId) {
		this.dataDisk1SnapshotId = dataDisk1SnapshotId;
		if(dataDisk1SnapshotId != null){
			putQueryParameter("DataDisk.1.SnapshotId", dataDisk1SnapshotId);
		}
	}

	public String getDataDisk1Device() {
		return this.dataDisk1Device;
	}

	public void setDataDisk1Device(String dataDisk1Device) {
		this.dataDisk1Device = dataDisk1Device;
		if(dataDisk1Device != null){
			putQueryParameter("DataDisk.1.Device", dataDisk1Device);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
		if(vlanId != null){
			putQueryParameter("VlanId", vlanId);
		}
	}

	public String getDataDisk2Device() {
		return this.dataDisk2Device;
	}

	public void setDataDisk2Device(String dataDisk2Device) {
		this.dataDisk2Device = dataDisk2Device;
		if(dataDisk2Device != null){
			putQueryParameter("DataDisk.2.Device", dataDisk2Device);
		}
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getDataDisk4Description() {
		return this.dataDisk4Description;
	}

	public void setDataDisk4Description(String dataDisk4Description) {
		this.dataDisk4Description = dataDisk4Description;
		if(dataDisk4Description != null){
			putQueryParameter("DataDisk.4.Description", dataDisk4Description);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDataDisk1DiskName() {
		return this.dataDisk1DiskName;
	}

	public void setDataDisk1DiskName(String dataDisk1DiskName) {
		this.dataDisk1DiskName = dataDisk1DiskName;
		if(dataDisk1DiskName != null){
			putQueryParameter("DataDisk.1.DiskName", dataDisk1DiskName);
		}
	}

	public String getDataDisk3Description() {
		return this.dataDisk3Description;
	}

	public void setDataDisk3Description(String dataDisk3Description) {
		this.dataDisk3Description = dataDisk3Description;
		if(dataDisk3Description != null){
			putQueryParameter("DataDisk.3.Description", dataDisk3Description);
		}
	}

	public String getDataDisk4DiskName() {
		return this.dataDisk4DiskName;
	}

	public void setDataDisk4DiskName(String dataDisk4DiskName) {
		this.dataDisk4DiskName = dataDisk4DiskName;
		if(dataDisk4DiskName != null){
			putQueryParameter("DataDisk.4.DiskName", dataDisk4DiskName);
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getDataDisk1Description() {
		return this.dataDisk1Description;
	}

	public void setDataDisk1Description(String dataDisk1Description) {
		this.dataDisk1Description = dataDisk1Description;
		if(dataDisk1Description != null){
			putQueryParameter("DataDisk.1.Description", dataDisk1Description);
		}
	}

	public String getDataDisk4Category() {
		return this.dataDisk4Category;
	}

	public void setDataDisk4Category(String dataDisk4Category) {
		this.dataDisk4Category = dataDisk4Category;
		if(dataDisk4Category != null){
			putQueryParameter("DataDisk.4.Category", dataDisk4Category);
		}
	}

	public String getDataDisk2Description() {
		return this.dataDisk2Description;
	}

	public void setDataDisk2Description(String dataDisk2Description) {
		this.dataDisk2Description = dataDisk2Description;
		if(dataDisk2Description != null){
			putQueryParameter("DataDisk.2.Description", dataDisk2Description);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getDataDisk2Category() {
		return this.dataDisk2Category;
	}

	public void setDataDisk2Category(String dataDisk2Category) {
		this.dataDisk2Category = dataDisk2Category;
		if(dataDisk2Category != null){
			putQueryParameter("DataDisk.2.Category", dataDisk2Category);
		}
	}

	public Integer getDataDisk1Size() {
		return this.dataDisk1Size;
	}

	public void setDataDisk1Size(Integer dataDisk1Size) {
		this.dataDisk1Size = dataDisk1Size;
		if(dataDisk1Size != null){
			putQueryParameter("DataDisk.1.Size", dataDisk1Size.toString());
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getDeploymentSetId() {
		return this.deploymentSetId;
	}

	public void setDeploymentSetId(String deploymentSetId) {
		this.deploymentSetId = deploymentSetId;
		if(deploymentSetId != null){
			putQueryParameter("DeploymentSetId", deploymentSetId);
		}
	}

	public String getInnerIpAddress() {
		return this.innerIpAddress;
	}

	public void setInnerIpAddress(String innerIpAddress) {
		this.innerIpAddress = innerIpAddress;
		if(innerIpAddress != null){
			putQueryParameter("InnerIpAddress", innerIpAddress);
		}
	}

	public String getDataDisk3SnapshotId() {
		return this.dataDisk3SnapshotId;
	}

	public void setDataDisk3SnapshotId(String dataDisk3SnapshotId) {
		this.dataDisk3SnapshotId = dataDisk3SnapshotId;
		if(dataDisk3SnapshotId != null){
			putQueryParameter("DataDisk.3.SnapshotId", dataDisk3SnapshotId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getSystemDiskDiskName() {
		return this.systemDiskDiskName;
	}

	public void setSystemDiskDiskName(String systemDiskDiskName) {
		this.systemDiskDiskName = systemDiskDiskName;
		if(systemDiskDiskName != null){
			putQueryParameter("SystemDisk.DiskName", systemDiskDiskName);
		}
	}

	public Integer getDataDisk2Size() {
		return this.dataDisk2Size;
	}

	public void setDataDisk2Size(Integer dataDisk2Size) {
		this.dataDisk2Size = dataDisk2Size;
		if(dataDisk2Size != null){
			putQueryParameter("DataDisk.2.Size", dataDisk2Size.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getDataDisk1Category() {
		return this.dataDisk1Category;
	}

	public void setDataDisk1Category(String dataDisk1Category) {
		this.dataDisk1Category = dataDisk1Category;
		if(dataDisk1Category != null){
			putQueryParameter("DataDisk.1.Category", dataDisk1Category);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize.toString());
		}
	}

	public String getDataDisk4SnapshotId() {
		return this.dataDisk4SnapshotId;
	}

	public void setDataDisk4SnapshotId(String dataDisk4SnapshotId) {
		this.dataDisk4SnapshotId = dataDisk4SnapshotId;
		if(dataDisk4SnapshotId != null){
			putQueryParameter("DataDisk.4.SnapshotId", dataDisk4SnapshotId);
		}
	}

	public String getDataDisk4Device() {
		return this.dataDisk4Device;
	}

	public void setDataDisk4Device(String dataDisk4Device) {
		this.dataDisk4Device = dataDisk4Device;
		if(dataDisk4Device != null){
			putQueryParameter("DataDisk.4.Device", dataDisk4Device);
		}
	}

	public String getSystemDiskDescription() {
		return this.systemDiskDescription;
	}

	public void setSystemDiskDescription(String systemDiskDescription) {
		this.systemDiskDescription = systemDiskDescription;
		if(systemDiskDescription != null){
			putQueryParameter("SystemDisk.Description", systemDiskDescription);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateInstance_GatedLaunchResponse> getResponseClass() {
		return CreateInstance_GatedLaunchResponse.class;
	}

}

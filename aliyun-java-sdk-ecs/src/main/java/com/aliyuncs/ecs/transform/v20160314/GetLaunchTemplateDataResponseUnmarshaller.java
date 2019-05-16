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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.GetLaunchTemplateDataResponse;
import com.aliyuncs.ecs.model.v20160314.GetLaunchTemplateDataResponse.LaunchTemplateData;
import com.aliyuncs.ecs.model.v20160314.GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisk;
import com.aliyuncs.ecs.model.v20160314.GetLaunchTemplateDataResponse.LaunchTemplateData.InstanceTag;
import com.aliyuncs.ecs.model.v20160314.GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterface;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLaunchTemplateDataResponseUnmarshaller {

	public static GetLaunchTemplateDataResponse unmarshall(GetLaunchTemplateDataResponse getLaunchTemplateDataResponse, UnmarshallerContext context) {
		
		getLaunchTemplateDataResponse.setRequestId(context.stringValue("GetLaunchTemplateDataResponse.RequestId"));

		LaunchTemplateData launchTemplateData = new LaunchTemplateData();
		launchTemplateData.setImageId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ImageId"));
		launchTemplateData.setImageOwnerAlias(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ImageOwnerAlias"));
		launchTemplateData.setPasswordInherit(context.booleanValue("GetLaunchTemplateDataResponse.LaunchTemplateData.PasswordInherit"));
		launchTemplateData.setInstanceType(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InstanceType"));
		launchTemplateData.setSecurityGroupId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SecurityGroupId"));
		launchTemplateData.setVpcId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.VpcId"));
		launchTemplateData.setVSwitchId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.VSwitchId"));
		launchTemplateData.setInstanceName(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InstanceName"));
		launchTemplateData.setDescription(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Description"));
		launchTemplateData.setInternetMaxBandwidthIn(context.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InternetMaxBandwidthIn"));
		launchTemplateData.setInternetMaxBandwidthOut(context.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InternetMaxBandwidthOut"));
		launchTemplateData.setHostName(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.HostName"));
		launchTemplateData.setZoneId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ZoneId"));
		launchTemplateData.setSystemDiskSize(context.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Size"));
		launchTemplateData.setSystemDiskCategory(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Category"));
		launchTemplateData.setSystemDiskDiskName(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.DiskName"));
		launchTemplateData.setSystemDiskDescription(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Description"));
		launchTemplateData.setSystemDiskIops(context.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Iops"));
		launchTemplateData.setIoOptimized(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.IoOptimized"));
		launchTemplateData.setInstanceChargeType(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InstanceChargeType"));
		launchTemplateData.setPeriod(context.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Period"));
		launchTemplateData.setInternetChargeType(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InternetChargeType"));
		launchTemplateData.setEnableVmOsConfig(context.booleanValue("GetLaunchTemplateDataResponse.LaunchTemplateData.EnableVmOsConfig"));
		launchTemplateData.setNetworkType(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkType"));
		launchTemplateData.setUserData(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.UserData"));
		launchTemplateData.setKeyPairName(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.KeyPairName"));
		launchTemplateData.setRamRoleName(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.RamRoleName"));
		launchTemplateData.setAutoReleaseTime(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.AutoReleaseTime"));
		launchTemplateData.setSpotStrategy(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SpotStrategy"));
		launchTemplateData.setSpotPriceLimit(context.floatValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SpotPriceLimit"));
		launchTemplateData.setSpotDuration(context.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SpotDuration"));
		launchTemplateData.setResourceGroupId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ResourceGroupId"));
		launchTemplateData.setSecurityEnhancementStrategy(context.booleanValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SecurityEnhancementStrategy"));

		List<DataDisk> dataDisks = new ArrayList<DataDisk>();
		for (int i = 0; i < context.lengthValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks.Length"); i++) {
			DataDisk dataDisk = new DataDisk();
			dataDisk.setSize(context.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Size"));
			dataDisk.setSnapshotId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].SnapshotId"));
			dataDisk.setCategory(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Category"));
			dataDisk.setEncrypted(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Encrypted"));
			dataDisk.setDiskName(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].DiskName"));
			dataDisk.setDescription(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Description"));
			dataDisk.setDeleteWithInstance(context.booleanValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].DeleteWithInstance"));
			dataDisk.setDevice(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Device"));

			dataDisks.add(dataDisk);
		}
		launchTemplateData.setDataDisks(dataDisks);

		List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
		for (int i = 0; i < context.lengthValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces.Length"); i++) {
			NetworkInterface networkInterface = new NetworkInterface();
			networkInterface.setPrimaryIpAddress(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].PrimaryIpAddress"));
			networkInterface.setVSwitchId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].VSwitchId"));
			networkInterface.setSecurityGroupId(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].SecurityGroupId"));
			networkInterface.setNetworkInterfaceName(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].NetworkInterfaceName"));
			networkInterface.setDescription(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].Description"));

			networkInterfaces.add(networkInterface);
		}
		launchTemplateData.setNetworkInterfaces(networkInterfaces);

		List<InstanceTag> tags = new ArrayList<InstanceTag>();
		for (int i = 0; i < context.lengthValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Tags.Length"); i++) {
			InstanceTag instanceTag = new InstanceTag();
			instanceTag.setKey(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Tags["+ i +"].Key"));
			instanceTag.setValue(context.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Tags["+ i +"].Value"));

			tags.add(instanceTag);
		}
		launchTemplateData.setTags(tags);
		getLaunchTemplateDataResponse.setLaunchTemplateData(launchTemplateData);
	 
	 	return getLaunchTemplateDataResponse;
	}
}
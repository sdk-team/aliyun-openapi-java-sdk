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

	public static GetLaunchTemplateDataResponse unmarshall(GetLaunchTemplateDataResponse getLaunchTemplateDataResponse, UnmarshallerContext _ctx) {
		
		getLaunchTemplateDataResponse.setRequestId(_ctx.stringValue("GetLaunchTemplateDataResponse.RequestId"));

		LaunchTemplateData launchTemplateData = new LaunchTemplateData();
		launchTemplateData.setImageId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ImageId"));
		launchTemplateData.setImageOwnerAlias(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ImageOwnerAlias"));
		launchTemplateData.setInstanceType(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InstanceType"));
		launchTemplateData.setSecurityGroupId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SecurityGroupId"));
		launchTemplateData.setVpcId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.VpcId"));
		launchTemplateData.setVSwitchId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.VSwitchId"));
		launchTemplateData.setInstanceName(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InstanceName"));
		launchTemplateData.setDescription(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Description"));
		launchTemplateData.setInternetMaxBandwidthIn(_ctx.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InternetMaxBandwidthIn"));
		launchTemplateData.setInternetMaxBandwidthOut(_ctx.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InternetMaxBandwidthOut"));
		launchTemplateData.setHostName(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.HostName"));
		launchTemplateData.setZoneId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ZoneId"));
		launchTemplateData.setSystemDiskSize(_ctx.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Size"));
		launchTemplateData.setSystemDiskCategory(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Category"));
		launchTemplateData.setSystemDiskDiskName(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.DiskName"));
		launchTemplateData.setSystemDiskDescription(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Description"));
		launchTemplateData.setSystemDiskIops(_ctx.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SystemDisk.Iops"));
		launchTemplateData.setIoOptimized(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.IoOptimized"));
		launchTemplateData.setInstanceChargeType(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InstanceChargeType"));
		launchTemplateData.setPeriod(_ctx.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Period"));
		launchTemplateData.setInternetChargeType(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.InternetChargeType"));
		launchTemplateData.setEnableVmOsConfig(_ctx.booleanValue("GetLaunchTemplateDataResponse.LaunchTemplateData.EnableVmOsConfig"));
		launchTemplateData.setNetworkType(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkType"));
		launchTemplateData.setUserData(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.UserData"));
		launchTemplateData.setKeyPairName(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.KeyPairName"));
		launchTemplateData.setRamRoleName(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.RamRoleName"));
		launchTemplateData.setAutoReleaseTime(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.AutoReleaseTime"));
		launchTemplateData.setSpotStrategy(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SpotStrategy"));
		launchTemplateData.setSpotPriceLimit(_ctx.floatValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SpotPriceLimit"));
		launchTemplateData.setSpotDuration(_ctx.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SpotDuration"));
		launchTemplateData.setResourceGroupId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.ResourceGroupId"));
		launchTemplateData.setSecurityEnhancementStrategy(_ctx.booleanValue("GetLaunchTemplateDataResponse.LaunchTemplateData.SecurityEnhancementStrategy"));

		List<DataDisk> dataDisks = new ArrayList<DataDisk>();
		for (int i = 0; i < _ctx.lengthValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks.Length"); i++) {
			DataDisk dataDisk = new DataDisk();
			dataDisk.setSize(_ctx.integerValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Size"));
			dataDisk.setSnapshotId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].SnapshotId"));
			dataDisk.setCategory(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Category"));
			dataDisk.setEncrypted(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Encrypted"));
			dataDisk.setDiskName(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].DiskName"));
			dataDisk.setDescription(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].Description"));
			dataDisk.setDeleteWithInstance(_ctx.booleanValue("GetLaunchTemplateDataResponse.LaunchTemplateData.DataDisks["+ i +"].DeleteWithInstance"));

			dataDisks.add(dataDisk);
		}
		launchTemplateData.setDataDisks(dataDisks);

		List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
		for (int i = 0; i < _ctx.lengthValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces.Length"); i++) {
			NetworkInterface networkInterface = new NetworkInterface();
			networkInterface.setPrimaryIpAddress(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].PrimaryIpAddress"));
			networkInterface.setVSwitchId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].VSwitchId"));
			networkInterface.setSecurityGroupId(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].SecurityGroupId"));
			networkInterface.setNetworkInterfaceName(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].NetworkInterfaceName"));
			networkInterface.setDescription(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.NetworkInterfaces["+ i +"].Description"));

			networkInterfaces.add(networkInterface);
		}
		launchTemplateData.setNetworkInterfaces(networkInterfaces);

		List<InstanceTag> tags = new ArrayList<InstanceTag>();
		for (int i = 0; i < _ctx.lengthValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Tags.Length"); i++) {
			InstanceTag instanceTag = new InstanceTag();
			instanceTag.setKey(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Tags["+ i +"].Key"));
			instanceTag.setValue(_ctx.stringValue("GetLaunchTemplateDataResponse.LaunchTemplateData.Tags["+ i +"].Value"));

			tags.add(instanceTag);
		}
		launchTemplateData.setTags(tags);
		getLaunchTemplateDataResponse.setLaunchTemplateData(launchTemplateData);
	 
	 	return getLaunchTemplateDataResponse;
	}
}
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

package com.aliyuncs.ecsdemo.transform.v20190620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.CpuOptions;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.DedicatedHostAttribute;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.DedicatedInstanceAttribute;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.EcsCapacityReservationAttr;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.EipAddress;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.LockReason;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.NetworkInterface;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.Tag;
import com.aliyuncs.ecsdemo.model.v20190620.CreateInstanceAResponse.Instance.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceAResponseUnmarshaller {

	public static CreateInstanceAResponse unmarshall(CreateInstanceAResponse createInstanceAResponse, UnmarshallerContext _ctx) {
		
		createInstanceAResponse.setRequestId(_ctx.stringValue("CreateInstanceAResponse.RequestId"));
		createInstanceAResponse.setTotalCount(_ctx.integerValue("CreateInstanceAResponse.TotalCount"));
		createInstanceAResponse.setPageNumber(_ctx.integerValue("CreateInstanceAResponse.PageNumber"));
		createInstanceAResponse.setPageSize(_ctx.integerValue("CreateInstanceAResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceAResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InstanceName"));
			instance.setDescription(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].Description"));
			instance.setImageId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].ImageId"));
			instance.setOSName(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].OSName"));
			instance.setOSNameEn(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].OSNameEn"));
			instance.setOSType(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].OSType"));
			instance.setRegionId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].ZoneId"));
			instance.setClusterId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].ClusterId"));
			instance.setInstanceType(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InstanceType"));
			instance.setCpu(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].Cpu"));
			instance.setMemory(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].Memory"));
			instance.setHostName(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].HostName"));
			instance.setDeploymentSetId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].DeploymentSetId"));
			instance.setStatus(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].Status"));
			instance.setSerialNumber(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].SerialNumber"));
			instance.setInternetChargeType(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InternetChargeType"));
			instance.setInternetMaxBandwidthIn(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].InternetMaxBandwidthIn"));
			instance.setInternetMaxBandwidthOut(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].InternetMaxBandwidthOut"));
			instance.setVlanId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].VlanId"));
			instance.setCreationTime(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].CreationTime"));
			instance.setStartTime(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].StartTime"));
			instance.setInstanceNetworkType(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setInstanceChargeType(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InstanceChargeType"));
			instance.setSaleCycle(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].SaleCycle"));
			instance.setExpiredTime(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].ExpiredTime"));
			instance.setAutoReleaseTime(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].AutoReleaseTime"));
			instance.setIoOptimized(_ctx.booleanValue("CreateInstanceAResponse.Instances["+ i +"].IoOptimized"));
			instance.setDeviceAvailable(_ctx.booleanValue("CreateInstanceAResponse.Instances["+ i +"].DeviceAvailable"));
			instance.setInstanceTypeFamily(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InstanceTypeFamily"));
			instance.setLocalStorageCapacity(_ctx.longValue("CreateInstanceAResponse.Instances["+ i +"].LocalStorageCapacity"));
			instance.setLocalStorageAmount(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].LocalStorageAmount"));
			instance.setGPUAmount(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].GPUAmount"));
			instance.setGPUSpec(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].GPUSpec"));
			instance.setSpotStrategy(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].SpotStrategy"));
			instance.setSpotPriceLimit(_ctx.floatValue("CreateInstanceAResponse.Instances["+ i +"].SpotPriceLimit"));
			instance.setResourceGroupId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].ResourceGroupId"));
			instance.setKeyPairName(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].KeyPairName"));
			instance.setRecyclable(_ctx.booleanValue("CreateInstanceAResponse.Instances["+ i +"].Recyclable"));
			instance.setHpcClusterId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].HpcClusterId"));
			instance.setStoppedMode(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].StoppedMode"));
			instance.setCreditSpecification(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].CreditSpecification"));
			instance.setDeletionProtection(_ctx.booleanValue("CreateInstanceAResponse.Instances["+ i +"].DeletionProtection"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			instance.setSecurityGroupIds(securityGroupIds);

			List<String> publicIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].PublicIpAddress.Length"); j++) {
				publicIpAddress.add(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].PublicIpAddress["+ j +"]"));
			}
			instance.setPublicIpAddress(publicIpAddress);

			List<String> innerIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].InnerIpAddress.Length"); j++) {
				innerIpAddress.add(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].InnerIpAddress["+ j +"]"));
			}
			instance.setInnerIpAddress(innerIpAddress);

			List<String> rdmaIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].RdmaIpAddress.Length"); j++) {
				rdmaIpAddress.add(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].RdmaIpAddress["+ j +"]"));
			}
			instance.setRdmaIpAddress(rdmaIpAddress);

			VpcAttributes vpcAttributes = new VpcAttributes();
			vpcAttributes.setVpcId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].VpcAttributes.VpcId"));
			vpcAttributes.setVSwitchId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].VpcAttributes.VSwitchId"));
			vpcAttributes.setNatIpAddress(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].VpcAttributes.NatIpAddress"));

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress["+ j +"]"));
			}
			vpcAttributes.setPrivateIpAddress(privateIpAddress);
			instance.setVpcAttributes(vpcAttributes);

			EipAddress eipAddress = new EipAddress();
			eipAddress.setAllocationId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].EipAddress.AllocationId"));
			eipAddress.setIpAddress(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].EipAddress.IpAddress"));
			eipAddress.setBandwidth(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].EipAddress.Bandwidth"));
			eipAddress.setInternetChargeType(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].EipAddress.InternetChargeType"));
			eipAddress.setIsSupportUnassociate(_ctx.booleanValue("CreateInstanceAResponse.Instances["+ i +"].EipAddress.IsSupportUnassociate"));
			instance.setEipAddress(eipAddress);

			DedicatedHostAttribute dedicatedHostAttribute = new DedicatedHostAttribute();
			dedicatedHostAttribute.setDedicatedHostId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].DedicatedHostAttribute.DedicatedHostId"));
			dedicatedHostAttribute.setDedicatedHostName(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].DedicatedHostAttribute.DedicatedHostName"));
			instance.setDedicatedHostAttribute(dedicatedHostAttribute);

			EcsCapacityReservationAttr ecsCapacityReservationAttr = new EcsCapacityReservationAttr();
			ecsCapacityReservationAttr.setCapacityReservationId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].EcsCapacityReservationAttr.CapacityReservationId"));
			ecsCapacityReservationAttr.setCapacityReservationPreference(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].EcsCapacityReservationAttr.CapacityReservationPreference"));
			instance.setEcsCapacityReservationAttr(ecsCapacityReservationAttr);

			DedicatedInstanceAttribute dedicatedInstanceAttribute = new DedicatedInstanceAttribute();
			dedicatedInstanceAttribute.setTenancy(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].DedicatedInstanceAttribute.Tenancy"));
			dedicatedInstanceAttribute.setAffinity(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].DedicatedInstanceAttribute.Affinity"));
			instance.setDedicatedInstanceAttribute(dedicatedInstanceAttribute);

			CpuOptions cpuOptions = new CpuOptions();
			cpuOptions.setCoreCount(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].CpuOptions.CoreCount"));
			cpuOptions.setThreadsPerCore(_ctx.integerValue("CreateInstanceAResponse.Instances["+ i +"].CpuOptions.ThreadsPerCore"));
			cpuOptions.setNuma(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].CpuOptions.Numa"));
			instance.setCpuOptions(cpuOptions);

			List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].NetworkInterfaces.Length"); j++) {
				NetworkInterface networkInterface = new NetworkInterface();
				networkInterface.setNetworkInterfaceId(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].NetworkInterfaceId"));
				networkInterface.setMacAddress(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].MacAddress"));
				networkInterface.setPrimaryIpAddress(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].NetworkInterfaces["+ j +"].PrimaryIpAddress"));

				networkInterfaces.add(networkInterface);
			}
			instance.setNetworkInterfaces(networkInterfaces);

			List<LockReason> operationLocks = new ArrayList<LockReason>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].OperationLocks.Length"); j++) {
				LockReason lockReason = new LockReason();
				lockReason.setLockReason(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].OperationLocks["+ j +"].LockReason"));
				lockReason.setLockMsg(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].OperationLocks["+ j +"].LockMsg"));

				operationLocks.add(lockReason);
			}
			instance.setOperationLocks(operationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("CreateInstanceAResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("CreateInstanceAResponse.Instances["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			instance.setTags(tags);

			instances.add(instance);
		}
		createInstanceAResponse.setInstances(instances);
	 
	 	return createInstanceAResponse;
	}
}
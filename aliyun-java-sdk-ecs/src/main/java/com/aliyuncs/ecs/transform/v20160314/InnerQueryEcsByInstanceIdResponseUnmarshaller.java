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

import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInstanceIdResponse;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInstanceIdResponse.EcsInstance;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceMode;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInstanceIdResponse.EcsInstance.Region;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryEcsByInstanceIdResponseUnmarshaller {

	public static InnerQueryEcsByInstanceIdResponse unmarshall(InnerQueryEcsByInstanceIdResponse innerQueryEcsByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		innerQueryEcsByInstanceIdResponse.setRequestId(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.RequestId"));

		EcsInstance ecsInstance = new EcsInstance();
		ecsInstance.setRecoverable(_ctx.booleanValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Recoverable"));
		ecsInstance.setEipInstanceId(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.EipInstanceId"));
		ecsInstance.setIsWin(_ctx.booleanValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.IsWin"));
		ecsInstance.setGmtRelease(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.GmtRelease"));
		ecsInstance.setSerialNumber(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.SerialNumber"));
		ecsInstance.setInstanceTypeGeneration(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.InstanceTypeGeneration"));
		ecsInstance.setIntranetRx(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.IntranetRx"));
		ecsInstance.setImageProductCode(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.ImageProductCode"));
		ecsInstance.setEcsBusinessStatus(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.EcsBusinessStatus"));
		ecsInstance.setDescription(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Description"));
		ecsInstance.setInternetIp(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.InternetIp"));
		ecsInstance.setImageNo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.ImageNo"));
		ecsInstance.setInternetRx(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.InternetRx"));
		ecsInstance.setStatus(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Status"));
		ecsInstance.setImageName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.ImageName"));
		ecsInstance.setOsType(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.OsType"));
		ecsInstance.setHostname(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Hostname"));
		ecsInstance.setEipBandwidth(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.EipBandwidth"));
		ecsInstance.setNetWorkType(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.NetWorkType"));
		ecsInstance.setNatIp(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.NatIp"));
		ecsInstance.setInstanceType(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.InstanceType"));
		ecsInstance.setRecoverPolicy(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.RecoverPolicy"));
		ecsInstance.setIoOptimized(_ctx.booleanValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.IoOptimized"));
		ecsInstance.setOsName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.OsName"));
		ecsInstance.setIntranetIp(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.IntranetIp"));
		ecsInstance.setEip(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Eip"));
		ecsInstance.setGmtModified(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.GmtModified"));
		ecsInstance.setIopsSize(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.IopsSize"));
		ecsInstance.setSystemDiskCategory(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.SystemDiskCategory"));
		ecsInstance.setIntranetTx(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.IntranetTx"));
		ecsInstance.setGmtStarted(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.GmtStarted"));
		ecsInstance.setGmtSync(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.GmtSync"));
		ecsInstance.setCores(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Cores"));
		ecsInstance.setAliUid(_ctx.longValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.AliUid"));
		ecsInstance.setImageId(_ctx.longValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.ImageId"));
		ecsInstance.setGmtCreated(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.GmtCreated"));
		ecsInstance.setGroupNo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.GroupNo"));
		ecsInstance.setVpcInstanceId(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.VpcInstanceId"));
		ecsInstance.setBid(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Bid"));
		ecsInstance.setAgentId(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.AgentId"));
		ecsInstance.setRealHostname(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.RealHostname"));
		ecsInstance.setInstanceId(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.InstanceId"));
		ecsInstance.setInstanceTypeFamily(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.InstanceTypeFamily"));
		ecsInstance.setNetworkValidation(_ctx.booleanValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.NetworkValidation"));
		ecsInstance.setZoneId(_ctx.longValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.ZoneId"));
		ecsInstance.setMemory(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Memory"));
		ecsInstance.setInternetTx(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.InternetTx"));
		ecsInstance.setVswitchInstanceId(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.VswitchInstanceId"));
		ecsInstance.setImageType(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.ImageType"));
		ecsInstance.setIzId(_ctx.longValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.IzId"));
		ecsInstance.setDiskSize(_ctx.integerValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.DiskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.Id"));
		region.setIsActive(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.IsActive"));
		region.setRegionEnName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.RegionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.RegionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.RegionName"));
		region.setRegionMemo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.RegionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.RegionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupportImageCopy(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.Attributes.SupportImageCopy"));
		attributes.setInternalUse(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.Attributes.InternalUse"));
		attributes.setAkName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Region.Attributes.AkName"));
		region.setAttributes(attributes);
		ecsInstance.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.RegionNo"));
		iz.setStatus(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.Status"));
		iz.setNo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.No"));
		iz.setEnName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.EnName"));
		iz.setCnName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.CnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.SupportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.SupportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.SupportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.SupportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel.Length"); i++) {
			IzResourceMode izResourceMode = new IzResourceMode();
			izResourceMode.setSupportIoOptimized(_ctx.booleanValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation["+ j +"]"));
			}
			izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories["+ j +"]"));
			}
			izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceMode);
		}
		iz.setIzResourceModel(izResourceModel);
		ecsInstance.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.ZoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.IsWritable"));
		zone.setZoneName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.ZoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.ZoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.IsActive"));
		zone.setId(_ctx.longValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.Id"));
		zone.setZoneEnName(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.ZoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.ZoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.RouteIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.RegionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.SupportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerQueryEcsByInstanceIdResponse.EcsInstance.Zone.SupportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		ecsInstance.setZone(zone);
		innerQueryEcsByInstanceIdResponse.setEcsInstance(ecsInstance);
	 
	 	return innerQueryEcsByInstanceIdResponse;
	}
}
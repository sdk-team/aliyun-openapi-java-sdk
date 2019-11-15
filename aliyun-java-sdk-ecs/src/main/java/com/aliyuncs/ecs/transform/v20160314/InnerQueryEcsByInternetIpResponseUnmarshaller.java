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

import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInternetIpResponse;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInternetIpResponse.EcsInstance;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInternetIpResponse.EcsInstance.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceMode;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInternetIpResponse.EcsInstance.Region;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInternetIpResponse.EcsInstance.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByInternetIpResponse.EcsInstance.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryEcsByInternetIpResponseUnmarshaller {

	public static InnerQueryEcsByInternetIpResponse unmarshall(InnerQueryEcsByInternetIpResponse innerQueryEcsByInternetIpResponse, UnmarshallerContext _ctx) {
		
		innerQueryEcsByInternetIpResponse.setRequestId(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.RequestId"));

		EcsInstance ecsInstance = new EcsInstance();
		ecsInstance.setRecoverable(_ctx.booleanValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Recoverable"));
		ecsInstance.setEipInstanceId(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.EipInstanceId"));
		ecsInstance.setIsWin(_ctx.booleanValue("InnerQueryEcsByInternetIpResponse.EcsInstance.IsWin"));
		ecsInstance.setGmtRelease(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.GmtRelease"));
		ecsInstance.setSerialNumber(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.SerialNumber"));
		ecsInstance.setInstanceTypeGeneration(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.InstanceTypeGeneration"));
		ecsInstance.setIntranetRx(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.IntranetRx"));
		ecsInstance.setImageProductCode(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.ImageProductCode"));
		ecsInstance.setEcsBusinessStatus(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.EcsBusinessStatus"));
		ecsInstance.setDescription(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Description"));
		ecsInstance.setInternetIp(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.InternetIp"));
		ecsInstance.setImageNo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.ImageNo"));
		ecsInstance.setInternetRx(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.InternetRx"));
		ecsInstance.setStatus(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Status"));
		ecsInstance.setImageName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.ImageName"));
		ecsInstance.setOsType(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.OsType"));
		ecsInstance.setHostname(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Hostname"));
		ecsInstance.setEipBandwidth(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.EipBandwidth"));
		ecsInstance.setNetWorkType(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.NetWorkType"));
		ecsInstance.setNatIp(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.NatIp"));
		ecsInstance.setInstanceType(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.InstanceType"));
		ecsInstance.setRecoverPolicy(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.RecoverPolicy"));
		ecsInstance.setIoOptimized(_ctx.booleanValue("InnerQueryEcsByInternetIpResponse.EcsInstance.IoOptimized"));
		ecsInstance.setOsName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.OsName"));
		ecsInstance.setIntranetIp(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.IntranetIp"));
		ecsInstance.setEip(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Eip"));
		ecsInstance.setGmtModified(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.GmtModified"));
		ecsInstance.setIopsSize(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.IopsSize"));
		ecsInstance.setSystemDiskCategory(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.SystemDiskCategory"));
		ecsInstance.setIntranetTx(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.IntranetTx"));
		ecsInstance.setGmtStarted(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.GmtStarted"));
		ecsInstance.setGmtSync(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.GmtSync"));
		ecsInstance.setCores(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Cores"));
		ecsInstance.setAliUid(_ctx.longValue("InnerQueryEcsByInternetIpResponse.EcsInstance.AliUid"));
		ecsInstance.setImageId(_ctx.longValue("InnerQueryEcsByInternetIpResponse.EcsInstance.ImageId"));
		ecsInstance.setGmtCreated(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.GmtCreated"));
		ecsInstance.setGroupNo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.GroupNo"));
		ecsInstance.setVpcInstanceId(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.VpcInstanceId"));
		ecsInstance.setBid(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Bid"));
		ecsInstance.setAgentId(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.AgentId"));
		ecsInstance.setRealHostname(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.RealHostname"));
		ecsInstance.setInstanceId(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.InstanceId"));
		ecsInstance.setInstanceTypeFamily(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.InstanceTypeFamily"));
		ecsInstance.setNetworkValidation(_ctx.booleanValue("InnerQueryEcsByInternetIpResponse.EcsInstance.NetworkValidation"));
		ecsInstance.setZoneId(_ctx.longValue("InnerQueryEcsByInternetIpResponse.EcsInstance.ZoneId"));
		ecsInstance.setMemory(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Memory"));
		ecsInstance.setInternetTx(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.InternetTx"));
		ecsInstance.setVswitchInstanceId(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.VswitchInstanceId"));
		ecsInstance.setImageType(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.ImageType"));
		ecsInstance.setIzId(_ctx.longValue("InnerQueryEcsByInternetIpResponse.EcsInstance.IzId"));
		ecsInstance.setDiskSize(_ctx.integerValue("InnerQueryEcsByInternetIpResponse.EcsInstance.DiskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.Id"));
		region.setIsActive(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.IsActive"));
		region.setRegionEnName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.RegionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.RegionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.RegionName"));
		region.setRegionMemo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.RegionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.RegionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupportImageCopy(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.Attributes.SupportImageCopy"));
		attributes.setInternalUse(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.Attributes.InternalUse"));
		attributes.setAkName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Region.Attributes.AkName"));
		region.setAttributes(attributes);
		ecsInstance.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.RegionNo"));
		iz.setStatus(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.Status"));
		iz.setNo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.No"));
		iz.setEnName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.EnName"));
		iz.setCnName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.CnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.SupportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.SupportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.SupportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.SupportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel.Length"); i++) {
			IzResourceMode izResourceMode = new IzResourceMode();
			izResourceMode.setSupportIoOptimized(_ctx.booleanValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation["+ j +"]"));
			}
			izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories["+ j +"]"));
			}
			izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceMode);
		}
		iz.setIzResourceModel(izResourceModel);
		ecsInstance.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.ZoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.IsWritable"));
		zone.setZoneName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.ZoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.ZoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.IsActive"));
		zone.setId(_ctx.longValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.Id"));
		zone.setZoneEnName(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.ZoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.ZoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.RouteIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.RegionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.SupportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerQueryEcsByInternetIpResponse.EcsInstance.Zone.SupportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		ecsInstance.setZone(zone);
		innerQueryEcsByInternetIpResponse.setEcsInstance(ecsInstance);
	 
	 	return innerQueryEcsByInternetIpResponse;
	}
}
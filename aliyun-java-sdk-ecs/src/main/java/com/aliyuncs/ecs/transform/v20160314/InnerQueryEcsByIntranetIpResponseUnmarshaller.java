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

import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByIntranetIpResponse;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByIntranetIpResponse.EcsInstance;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceMode;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByIntranetIpResponse.EcsInstance.Region;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryEcsByIntranetIpResponseUnmarshaller {

	public static InnerQueryEcsByIntranetIpResponse unmarshall(InnerQueryEcsByIntranetIpResponse innerQueryEcsByIntranetIpResponse, UnmarshallerContext _ctx) {
		
		innerQueryEcsByIntranetIpResponse.setRequestId(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.RequestId"));

		EcsInstance ecsInstance = new EcsInstance();
		ecsInstance.setRecoverable(_ctx.booleanValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Recoverable"));
		ecsInstance.setEipInstanceId(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.EipInstanceId"));
		ecsInstance.setIsWin(_ctx.booleanValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.IsWin"));
		ecsInstance.setGmtRelease(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.GmtRelease"));
		ecsInstance.setSerialNumber(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.SerialNumber"));
		ecsInstance.setInstanceTypeGeneration(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.InstanceTypeGeneration"));
		ecsInstance.setIntranetRx(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.IntranetRx"));
		ecsInstance.setImageProductCode(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.ImageProductCode"));
		ecsInstance.setEcsBusinessStatus(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.EcsBusinessStatus"));
		ecsInstance.setDescription(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Description"));
		ecsInstance.setInternetIp(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.InternetIp"));
		ecsInstance.setImageNo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.ImageNo"));
		ecsInstance.setInternetRx(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.InternetRx"));
		ecsInstance.setStatus(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Status"));
		ecsInstance.setImageName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.ImageName"));
		ecsInstance.setOsType(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.OsType"));
		ecsInstance.setHostname(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Hostname"));
		ecsInstance.setEipBandwidth(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.EipBandwidth"));
		ecsInstance.setNetWorkType(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.NetWorkType"));
		ecsInstance.setNatIp(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.NatIp"));
		ecsInstance.setInstanceType(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.InstanceType"));
		ecsInstance.setRecoverPolicy(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.RecoverPolicy"));
		ecsInstance.setIoOptimized(_ctx.booleanValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.IoOptimized"));
		ecsInstance.setOsName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.OsName"));
		ecsInstance.setIntranetIp(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.IntranetIp"));
		ecsInstance.setEip(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Eip"));
		ecsInstance.setGmtModified(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.GmtModified"));
		ecsInstance.setIopsSize(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.IopsSize"));
		ecsInstance.setSystemDiskCategory(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.SystemDiskCategory"));
		ecsInstance.setIntranetTx(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.IntranetTx"));
		ecsInstance.setGmtStarted(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.GmtStarted"));
		ecsInstance.setGmtSync(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.GmtSync"));
		ecsInstance.setCores(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Cores"));
		ecsInstance.setAliUid(_ctx.longValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.AliUid"));
		ecsInstance.setImageId(_ctx.longValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.ImageId"));
		ecsInstance.setGmtCreated(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.GmtCreated"));
		ecsInstance.setGroupNo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.GroupNo"));
		ecsInstance.setVpcInstanceId(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.VpcInstanceId"));
		ecsInstance.setBid(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Bid"));
		ecsInstance.setAgentId(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.AgentId"));
		ecsInstance.setRealHostname(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.RealHostname"));
		ecsInstance.setInstanceId(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.InstanceId"));
		ecsInstance.setInstanceTypeFamily(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.InstanceTypeFamily"));
		ecsInstance.setNetworkValidation(_ctx.booleanValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.NetworkValidation"));
		ecsInstance.setZoneId(_ctx.longValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.ZoneId"));
		ecsInstance.setMemory(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Memory"));
		ecsInstance.setInternetTx(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.InternetTx"));
		ecsInstance.setVswitchInstanceId(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.VswitchInstanceId"));
		ecsInstance.setImageType(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.ImageType"));
		ecsInstance.setIzId(_ctx.longValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.IzId"));
		ecsInstance.setDiskSize(_ctx.integerValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.DiskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.Id"));
		region.setIsActive(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.IsActive"));
		region.setRegionEnName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.RegionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.RegionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.RegionName"));
		region.setRegionMemo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.RegionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.RegionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupportImageCopy(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.Attributes.SupportImageCopy"));
		attributes.setInternalUse(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.Attributes.InternalUse"));
		attributes.setAkName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Region.Attributes.AkName"));
		region.setAttributes(attributes);
		ecsInstance.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.RegionNo"));
		iz.setStatus(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.Status"));
		iz.setNo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.No"));
		iz.setEnName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.EnName"));
		iz.setCnName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.CnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.SupportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.SupportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.SupportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.SupportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel.Length"); i++) {
			IzResourceMode izResourceMode = new IzResourceMode();
			izResourceMode.setSupportIoOptimized(_ctx.booleanValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation["+ j +"]"));
			}
			izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories["+ j +"]"));
			}
			izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceMode);
		}
		iz.setIzResourceModel(izResourceModel);
		ecsInstance.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.ZoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.IsWritable"));
		zone.setZoneName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.ZoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.ZoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.IsActive"));
		zone.setId(_ctx.longValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.Id"));
		zone.setZoneEnName(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.ZoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.ZoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.RouteIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.RegionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.SupportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerQueryEcsByIntranetIpResponse.EcsInstance.Zone.SupportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		ecsInstance.setZone(zone);
		innerQueryEcsByIntranetIpResponse.setEcsInstance(ecsInstance);
	 
	 	return innerQueryEcsByIntranetIpResponse;
	}
}
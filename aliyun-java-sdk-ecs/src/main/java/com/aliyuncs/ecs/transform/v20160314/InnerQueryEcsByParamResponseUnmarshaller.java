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

import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByParamResponse;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByParamResponse.EcsInstance;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByParamResponse.EcsInstance.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByParamResponse.EcsInstance.Iz.IzResourceMode;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByParamResponse.EcsInstance.Region;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByParamResponse.EcsInstance.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerQueryEcsByParamResponse.EcsInstance.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryEcsByParamResponseUnmarshaller {

	public static InnerQueryEcsByParamResponse unmarshall(InnerQueryEcsByParamResponse innerQueryEcsByParamResponse, UnmarshallerContext _ctx) {
		
		innerQueryEcsByParamResponse.setRequestId(_ctx.stringValue("InnerQueryEcsByParamResponse.RequestId"));
		innerQueryEcsByParamResponse.setPageNumber(_ctx.integerValue("InnerQueryEcsByParamResponse.PageNumber"));
		innerQueryEcsByParamResponse.setPageSize(_ctx.integerValue("InnerQueryEcsByParamResponse.PageSize"));

		List<EcsInstance> ecsInstances = new ArrayList<EcsInstance>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances.Length"); i++) {
			EcsInstance ecsInstance = new EcsInstance();
			ecsInstance.setRecoverable(_ctx.booleanValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Recoverable"));
			ecsInstance.setEipInstanceId(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].EipInstanceId"));
			ecsInstance.setIsWin(_ctx.booleanValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].IsWin"));
			ecsInstance.setGmtRelease(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].GmtRelease"));
			ecsInstance.setSerialNumber(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].SerialNumber"));
			ecsInstance.setInstanceTypeGeneration(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].InstanceTypeGeneration"));
			ecsInstance.setIntranetRx(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].IntranetRx"));
			ecsInstance.setImageProductCode(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].ImageProductCode"));
			ecsInstance.setEcsBusinessStatus(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].EcsBusinessStatus"));
			ecsInstance.setDescription(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Description"));
			ecsInstance.setInternetIp(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].InternetIp"));
			ecsInstance.setImageNo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].ImageNo"));
			ecsInstance.setInternetRx(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].InternetRx"));
			ecsInstance.setStatus(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Status"));
			ecsInstance.setImageName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].ImageName"));
			ecsInstance.setOsType(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].OsType"));
			ecsInstance.setHostname(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Hostname"));
			ecsInstance.setEipBandwidth(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].EipBandwidth"));
			ecsInstance.setNetWorkType(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].NetWorkType"));
			ecsInstance.setNatIp(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].NatIp"));
			ecsInstance.setInstanceType(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].InstanceType"));
			ecsInstance.setRecoverPolicy(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].RecoverPolicy"));
			ecsInstance.setIoOptimized(_ctx.booleanValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].IoOptimized"));
			ecsInstance.setOsName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].OsName"));
			ecsInstance.setIntranetIp(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].IntranetIp"));
			ecsInstance.setEip(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Eip"));
			ecsInstance.setGmtModified(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].GmtModified"));
			ecsInstance.setIopsSize(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].IopsSize"));
			ecsInstance.setSystemDiskCategory(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].SystemDiskCategory"));
			ecsInstance.setIntranetTx(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].IntranetTx"));
			ecsInstance.setGmtStarted(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].GmtStarted"));
			ecsInstance.setGmtSync(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].GmtSync"));
			ecsInstance.setCores(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Cores"));
			ecsInstance.setAliUid(_ctx.longValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].AliUid"));
			ecsInstance.setImageId(_ctx.longValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].ImageId"));
			ecsInstance.setGmtCreated(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].GmtCreated"));
			ecsInstance.setGroupNo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].GroupNo"));
			ecsInstance.setVpcInstanceId(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].VpcInstanceId"));
			ecsInstance.setBid(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Bid"));
			ecsInstance.setAgentId(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].AgentId"));
			ecsInstance.setRealHostname(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].RealHostname"));
			ecsInstance.setInstanceId(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].InstanceId"));
			ecsInstance.setInstanceTypeFamily(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].InstanceTypeFamily"));
			ecsInstance.setNetworkValidation(_ctx.booleanValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].NetworkValidation"));
			ecsInstance.setZoneId(_ctx.longValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].ZoneId"));
			ecsInstance.setMemory(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Memory"));
			ecsInstance.setInternetTx(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].InternetTx"));
			ecsInstance.setVswitchInstanceId(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].VswitchInstanceId"));
			ecsInstance.setImageType(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].ImageType"));
			ecsInstance.setIzId(_ctx.longValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].IzId"));
			ecsInstance.setDiskSize(_ctx.integerValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].DiskSize"));

			Region region = new Region();
			region.setId(_ctx.longValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.Id"));
			region.setIsActive(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.IsActive"));
			region.setRegionEnName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.RegionEnName"));
			region.setRegionNoAlias(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.RegionNoAlias"));
			region.setRegionName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.RegionName"));
			region.setRegionMemo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.RegionMemo"));
			region.setRegionNo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.RegionNo"));

			Attributes attributes = new Attributes();
			attributes.setSupportImageCopy(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.Attributes.SupportImageCopy"));
			attributes.setInternalUse(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.Attributes.InternalUse"));
			attributes.setAkName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Region.Attributes.AkName"));
			region.setAttributes(attributes);
			ecsInstance.setRegion(region);

			Iz iz = new Iz();
			iz.setRegionNo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.RegionNo"));
			iz.setStatus(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.Status"));
			iz.setNo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.No"));
			iz.setEnName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.EnName"));
			iz.setCnName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.CnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.SupportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel.Length"); j++) {
				IzResourceMode izResourceMode = new IzResourceMode();
				izResourceMode.setSupportIoOptimized(_ctx.booleanValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].AllowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].AllowedResourceCreation["+ k +"]"));
				}
				izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedDataDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceGenerations["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedNetworkCategories["+ k +"]"));
				}
				izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedSystemDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypes["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceMode);
			}
			iz.setIzResourceModel(izResourceModel);
			ecsInstance.setIz(iz);

			Zone zone = new Zone();
			zone.setZoneMemo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.ZoneMemo"));
			zone.setIsWritable(_ctx.booleanValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.IsWritable"));
			zone.setZoneName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.ZoneName"));
			zone.setZoneNoAlias(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.ZoneNoAlias"));
			zone.setIsActive(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.IsActive"));
			zone.setId(_ctx.longValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.Id"));
			zone.setZoneEnName(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.ZoneEnName"));
			zone.setZoneNo(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.ZoneNo"));
			zone.setRouteIpSegment(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.RouteIpSegment"));
			zone.setRegionId(_ctx.longValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.RegionId"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.SupportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(_ctx.stringValue("InnerQueryEcsByParamResponse.EcsInstances["+ i +"].Zone.SupportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);
			ecsInstance.setZone(zone);

			ecsInstances.add(ecsInstance);
		}
		innerQueryEcsByParamResponse.setEcsInstances(ecsInstances);
	 
	 	return innerQueryEcsByParamResponse;
	}
}
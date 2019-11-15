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

import com.aliyuncs.ecs.model.v20160314.InnerQueryInstanceByParamResponse;
import com.aliyuncs.ecs.model.v20160314.InnerQueryInstanceByParamResponse.InstanceAsyncModel;
import com.aliyuncs.ecs.model.v20160314.InnerQueryInstanceByParamResponse.InstanceAsyncModel.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerQueryInstanceByParamResponse.InstanceAsyncModel.Iz.IzResourceMode;
import com.aliyuncs.ecs.model.v20160314.InnerQueryInstanceByParamResponse.InstanceAsyncModel.Region;
import com.aliyuncs.ecs.model.v20160314.InnerQueryInstanceByParamResponse.InstanceAsyncModel.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryInstanceByParamResponseUnmarshaller {

	public static InnerQueryInstanceByParamResponse unmarshall(InnerQueryInstanceByParamResponse innerQueryInstanceByParamResponse, UnmarshallerContext _ctx) {
		
		innerQueryInstanceByParamResponse.setRequestId(_ctx.stringValue("InnerQueryInstanceByParamResponse.RequestId"));
		innerQueryInstanceByParamResponse.setTotalCount(_ctx.integerValue("InnerQueryInstanceByParamResponse.TotalCount"));
		innerQueryInstanceByParamResponse.setPageNumber(_ctx.integerValue("InnerQueryInstanceByParamResponse.PageNumber"));
		innerQueryInstanceByParamResponse.setPageSize(_ctx.integerValue("InnerQueryInstanceByParamResponse.PageSize"));

		List<InstanceAsyncModel> instanceAsyncModels = new ArrayList<InstanceAsyncModel>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels.Length"); i++) {
			InstanceAsyncModel instanceAsyncModel = new InstanceAsyncModel();
			instanceAsyncModel.setImageType(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].ImageType"));
			instanceAsyncModel.setRecoverPolicy(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].RecoverPolicy"));
			instanceAsyncModel.setBusinessStatus(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].BusinessStatus"));
			instanceAsyncModel.setIntranetIp(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].IntranetIp"));
			instanceAsyncModel.setDiskSize(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].DiskSize"));
			instanceAsyncModel.setOsName(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].OsName"));
			instanceAsyncModel.setIzId(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].IzId"));
			instanceAsyncModel.setIoOptimized(_ctx.booleanValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].IoOptimized"));
			instanceAsyncModel.setStatus(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Status"));
			instanceAsyncModel.setImageName(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].ImageName"));
			instanceAsyncModel.setInternetRx(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].InternetRx"));
			instanceAsyncModel.setInternetTx(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].InternetTx"));
			instanceAsyncModel.setZoneId(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].ZoneId"));
			instanceAsyncModel.setMemory(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Memory"));
			instanceAsyncModel.setHostname(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Hostname"));
			instanceAsyncModel.setAgentId(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].AgentId"));
			instanceAsyncModel.setInstanceId(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].InstanceId"));
			instanceAsyncModel.setOsType(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].OsType"));
			instanceAsyncModel.setEcsBusinessStatus(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].EcsBusinessStatus"));
			instanceAsyncModel.setGroupNo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].GroupNo"));
			instanceAsyncModel.setId(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Id"));
			instanceAsyncModel.setImageId(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].ImageId"));
			instanceAsyncModel.setGmtCreated(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].GmtCreated"));
			instanceAsyncModel.setInternetIp(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].InternetIp"));
			instanceAsyncModel.setBid(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Bid"));
			instanceAsyncModel.setImageNo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].ImageNo"));
			instanceAsyncModel.setGmtModified(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].GmtModified"));
			instanceAsyncModel.setIsWin(_ctx.booleanValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].IsWin"));
			instanceAsyncModel.setRecoverable(_ctx.booleanValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Recoverable"));
			instanceAsyncModel.setImagePc(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].ImagePc"));
			instanceAsyncModel.setIntranetRx(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].IntranetRx"));
			instanceAsyncModel.setAliUid(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].AliUid"));
			instanceAsyncModel.setGmtStarted(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].GmtStarted"));
			instanceAsyncModel.setIntranetTx(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].IntranetTx"));
			instanceAsyncModel.setCores(_ctx.integerValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Cores"));
			instanceAsyncModel.setGmtSync(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].GmtSync"));
			instanceAsyncModel.setSystemDiskCategory(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].SystemDiskCategory"));
			instanceAsyncModel.setGmtRelease(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].GmtRelease"));

			Zone zone = new Zone();
			zone.setZoneNo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.ZoneNo"));
			zone.setId(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.Id"));
			zone.setIsActive(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.IsActive"));
			zone.setZoneNoAlias(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.ZoneNoAlias"));
			zone.setRegionId(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.RegionId"));
			zone.setRouteIpSegment(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.RouteIpSegment"));
			zone.setZoneMemo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.ZoneMemo"));
			zone.setZoneName(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.ZoneName"));
			zone.setIsWritable(_ctx.booleanValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.IsWritable"));
			zone.setAvailableZoneID(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.AvailableZoneID"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.SupportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.SupportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);

			List<String> networkType = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.NetworkType.Length"); j++) {
				networkType.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.NetworkType["+ j +"]"));
			}
			zone.setNetworkType(networkType);

			List<String> diskType = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.DiskType.Length"); j++) {
				diskType.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Zone.DiskType["+ j +"]"));
			}
			zone.setDiskType(diskType);
			instanceAsyncModel.setZone(zone);

			Iz iz = new Iz();
			iz.setRegionNo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.RegionNo"));
			iz.setStatus(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.Status"));
			iz.setNo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.No"));
			iz.setEnName(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.EnName"));
			iz.setCnName(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.CnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.SupportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.SupportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.SupportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.SupportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel.Length"); j++) {
				IzResourceMode izResourceMode = new IzResourceMode();
				izResourceMode.setSupportIoOptimized(_ctx.booleanValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].AllowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].AllowedResourceCreation["+ k +"]"));
				}
				izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedDataDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceGenerations["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedNetworkCategories["+ k +"]"));
				}
				izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedSystemDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypes["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceMode);
			}
			iz.setIzResourceModel(izResourceModel);
			instanceAsyncModel.setIz(iz);

			Region region = new Region();
			region.setRegionNoAlias(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Region.RegionNoAlias"));
			region.setRegionNo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Region.RegionNo"));
			region.setRegionName(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Region.RegionName"));
			region.setRegionMemo(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Region.RegionMemo"));
			region.setId(_ctx.longValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Region.Id"));
			region.setIsActive(_ctx.stringValue("InnerQueryInstanceByParamResponse.InstanceAsyncModels["+ i +"].Region.IsActive"));
			instanceAsyncModel.setRegion(region);

			instanceAsyncModels.add(instanceAsyncModel);
		}
		innerQueryInstanceByParamResponse.setInstanceAsyncModels(instanceAsyncModels);
	 
	 	return innerQueryInstanceByParamResponse;
	}
}
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

import com.aliyuncs.ecs.model.v20160314.InnerInstanceQueryByParamResponse;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceQueryByParamResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceQueryByParamResponse.Item.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceQueryByParamResponse.Item.Iz.IzResourceModelItem;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceQueryByParamResponse.Item.Region;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceQueryByParamResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceQueryByParamResponseUnmarshaller {

	public static InnerInstanceQueryByParamResponse unmarshall(InnerInstanceQueryByParamResponse innerInstanceQueryByParamResponse, UnmarshallerContext _ctx) {
		
		innerInstanceQueryByParamResponse.setRequestId(_ctx.stringValue("InnerInstanceQueryByParamResponse.RequestId"));
		innerInstanceQueryByParamResponse.setCount(_ctx.integerValue("InnerInstanceQueryByParamResponse.count"));
		innerInstanceQueryByParamResponse.setPageNo(_ctx.integerValue("InnerInstanceQueryByParamResponse.pageNo"));
		innerInstanceQueryByParamResponse.setPageSize(_ctx.integerValue("InnerInstanceQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerInstanceQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerInstanceQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerInstanceQueryByParamResponse.errorCode.isSuccess"));
		innerInstanceQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setImageType(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageType"));
			item.setRecoverPolicy(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].recoverPolicy"));
			item.setBusinessStatus(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].businessStatus"));
			item.setIntranetIp(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].intranetIp"));
			item.setDiskSize(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].diskSize"));
			item.setOsName(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].osName"));
			item.setIzId(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].izId"));
			item.setIoOptimized(_ctx.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].ioOptimized"));
			item.setStatus(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].status"));
			item.setImageName(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageName"));
			item.setInternetRx(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].internetRx"));
			item.setInternetTx(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].internetTx"));
			item.setZoneId(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].zoneId"));
			item.setMemory(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].memory"));
			item.setHostname(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].hostname"));
			item.setAgentId(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].agentId"));
			item.setInstanceId(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].instanceId"));
			item.setOsType(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].osType"));
			item.setEcsBusinessStatus(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].ecsBusinessStatus"));
			item.setGroupNo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].groupNo"));
			item.setId(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].id"));
			item.setImageId(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageId"));
			item.setGmtCreated(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtCreated"));
			item.setInternetIp(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].internetIp"));
			item.setBid(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].bid"));
			item.setImageNo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageNo"));
			item.setGmtModified(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtModified"));
			item.setIsWin(_ctx.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].isWin"));
			item.setRecoverable(_ctx.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].recoverable"));
			item.setImagePc(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imagePc"));
			item.setIntranetRx(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].intranetRx"));
			item.setAliUid(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].aliUid"));
			item.setGmtStarted(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtStarted"));
			item.setIntranetTx(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].intranetTx"));
			item.setCores(_ctx.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].cores"));
			item.setGmtSync(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtSync"));
			item.setSystemDiskCategory(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].systemDiskCategory"));
			item.setGmtRelease(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtRelease"));

			Zone zone = new Zone();
			zone.setZoneNo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneNo"));
			zone.setId(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.id"));
			zone.setIsActive(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.isActive"));
			zone.setZoneNoAlias(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setRegionId(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.regionId"));
			zone.setRouteIpSegment(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setZoneMemo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneMemo"));
			zone.setZoneName(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneName"));
			zone.setIsWritable(_ctx.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.isWritable"));
			zone.setAvailableZoneID(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.availableZoneID"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);

			List<String> networkType = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.networkType.Length"); j++) {
				networkType.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.networkType["+ j +"]"));
			}
			zone.setNetworkType(networkType);

			List<String> diskType = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.diskType.Length"); j++) {
				diskType.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.diskType["+ j +"]"));
			}
			zone.setDiskType(diskType);
			item.setZone(zone);

			Iz iz = new Iz();
			iz.setRegionNo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.regionNo"));
			iz.setStatus(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.status"));
			iz.setNo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.no"));
			iz.setEnName(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.enName"));
			iz.setCnName(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.cnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
			for (int j = 0; j < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
				izResourceModelItem.setSupportIoOptimized(_ctx.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceModelItem);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Region region = new Region();
			region.setRegionNoAlias(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionNo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionNo"));
			region.setRegionName(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionMemo"));
			region.setId(_ctx.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.id"));
			region.setIsActive(_ctx.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.isActive"));
			item.setRegion(region);

			data.add(item);
		}
		innerInstanceQueryByParamResponse.setData(data);
	 
	 	return innerInstanceQueryByParamResponse;
	}
}
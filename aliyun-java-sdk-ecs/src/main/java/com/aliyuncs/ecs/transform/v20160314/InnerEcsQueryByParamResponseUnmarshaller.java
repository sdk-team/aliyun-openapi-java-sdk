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

import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse.Item.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse.Item.Iz.IzResourceModelItem;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse.Item.Region;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse.Item.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByParamResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByParamResponseUnmarshaller {

	public static InnerEcsQueryByParamResponse unmarshall(InnerEcsQueryByParamResponse innerEcsQueryByParamResponse, UnmarshallerContext _ctx) {
		
		innerEcsQueryByParamResponse.setRequestId(_ctx.stringValue("InnerEcsQueryByParamResponse.RequestId"));
		innerEcsQueryByParamResponse.setCount(_ctx.integerValue("InnerEcsQueryByParamResponse.count"));
		innerEcsQueryByParamResponse.setPageNo(_ctx.integerValue("InnerEcsQueryByParamResponse.pageNo"));
		innerEcsQueryByParamResponse.setPageSize(_ctx.integerValue("InnerEcsQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsQueryByParamResponse.errorCode.isSuccess"));
		innerEcsQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRecoverable(_ctx.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].recoverable"));
			item.setEipInstanceId(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].eipInstanceId"));
			item.setIsWin(_ctx.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].isWin"));
			item.setGmtRelease(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtRelease"));
			item.setSerialNumber(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].serialNumber"));
			item.setInstanceTypeGeneration(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceTypeGeneration"));
			item.setIntranetRx(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].intranetRx"));
			item.setImageProductCode(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageProductCode"));
			item.setEcsBusinessStatus(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].ecsBusinessStatus"));
			item.setDescription(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].description"));
			item.setInternetIp(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].internetIp"));
			item.setImageNo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageNo"));
			item.setInternetRx(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].internetRx"));
			item.setStatus(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].status"));
			item.setImageName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageName"));
			item.setOsType(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].osType"));
			item.setHostname(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].hostname"));
			item.setEipBandwidth(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].eipBandwidth"));
			item.setNetWorkType(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].netWorkType"));
			item.setNatIp(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].natIp"));
			item.setInstanceType(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceType"));
			item.setRecoverPolicy(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].recoverPolicy"));
			item.setIoOptimized(_ctx.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].ioOptimized"));
			item.setOsName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].osName"));
			item.setIntranetIp(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].intranetIp"));
			item.setEip(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].eip"));
			item.setGmtModified(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtModified"));
			item.setIopsSize(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].iopsSize"));
			item.setSystemDiskCategory(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].systemDiskCategory"));
			item.setIntranetTx(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].intranetTx"));
			item.setGmtStarted(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtStarted"));
			item.setGmtSync(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtSync"));
			item.setCores(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].cores"));
			item.setAliUid(_ctx.longValue("InnerEcsQueryByParamResponse.data["+ i +"].aliUid"));
			item.setImageId(_ctx.longValue("InnerEcsQueryByParamResponse.data["+ i +"].imageId"));
			item.setGmtCreated(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtCreated"));
			item.setGroupNo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].groupNo"));
			item.setVpcInstanceId(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].vpcInstanceId"));
			item.setBid(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].bid"));
			item.setAgentId(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].agentId"));
			item.setRealHostname(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].realHostname"));
			item.setInstanceId(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceId"));
			item.setInstanceTypeFamily(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceTypeFamily"));
			item.setNetworkValidation(_ctx.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].networkValidation"));
			item.setZoneId(_ctx.longValue("InnerEcsQueryByParamResponse.data["+ i +"].zoneId"));
			item.setMemory(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].memory"));
			item.setInternetTx(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].internetTx"));
			item.setVswitchInstanceId(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].vswitchInstanceId"));
			item.setImageType(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageType"));
			item.setIzId(_ctx.longValue("InnerEcsQueryByParamResponse.data["+ i +"].izId"));
			item.setDiskSize(_ctx.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].diskSize"));

			Region region = new Region();
			region.setId(_ctx.longValue("InnerEcsQueryByParamResponse.data["+ i +"].region.id"));
			region.setIsActive(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.isActive"));
			region.setRegionEnName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionEnName"));
			region.setRegionNoAlias(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionMemo"));
			region.setRegionNo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionNo"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.attributes.support_image_copy"));
			attributes.setInternal_use(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.attributes.internal_use"));
			attributes.setAk_name(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.attributes.ak_name"));
			region.setAttributes(attributes);
			item.setRegion(region);

			Iz iz = new Iz();
			iz.setRegionNo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.regionNo"));
			iz.setStatus(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.status"));
			iz.setNo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.no"));
			iz.setEnName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.enName"));
			iz.setCnName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.cnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
				izResourceModelItem.setSupportIoOptimized(_ctx.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceModelItem);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Zone zone = new Zone();
			zone.setZoneMemo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneMemo"));
			zone.setIsWritable(_ctx.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.isWritable"));
			zone.setZoneName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneName"));
			zone.setZoneNoAlias(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setIsActive(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.isActive"));
			zone.setId(_ctx.longValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.id"));
			zone.setZoneEnName(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneEnName"));
			zone.setZoneNo(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneNo"));
			zone.setRouteIpSegment(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setRegionId(_ctx.longValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.regionId"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(_ctx.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);
			item.setZone(zone);

			data.add(item);
		}
		innerEcsQueryByParamResponse.setData(data);
	 
	 	return innerEcsQueryByParamResponse;
	}
}
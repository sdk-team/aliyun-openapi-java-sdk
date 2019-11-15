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

import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse.Item.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse.Item.Iz.IzResourceModelItem;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse.Item.Region;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse.Item.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByIpResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByIpResponseUnmarshaller {

	public static InnerEcsQueryByIpResponse unmarshall(InnerEcsQueryByIpResponse innerEcsQueryByIpResponse, UnmarshallerContext _ctx) {
		
		innerEcsQueryByIpResponse.setRequestId(_ctx.stringValue("InnerEcsQueryByIpResponse.RequestId"));
		innerEcsQueryByIpResponse.setCount(_ctx.integerValue("InnerEcsQueryByIpResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsQueryByIpResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsQueryByIpResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsQueryByIpResponse.errorCode.isSuccess"));
		innerEcsQueryByIpResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByIpResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRecoverable(_ctx.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].recoverable"));
			item.setEipInstanceId(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].eipInstanceId"));
			item.setIsWin(_ctx.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].isWin"));
			item.setGmtRelease(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtRelease"));
			item.setSerialNumber(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].serialNumber"));
			item.setInstanceTypeGeneration(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceTypeGeneration"));
			item.setIntranetRx(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].intranetRx"));
			item.setImageProductCode(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageProductCode"));
			item.setEcsBusinessStatus(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].ecsBusinessStatus"));
			item.setDescription(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].description"));
			item.setInternetIp(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].internetIp"));
			item.setImageNo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageNo"));
			item.setInternetRx(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].internetRx"));
			item.setStatus(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].status"));
			item.setImageName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageName"));
			item.setOsType(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].osType"));
			item.setHostname(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].hostname"));
			item.setEipBandwidth(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].eipBandwidth"));
			item.setNetWorkType(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].netWorkType"));
			item.setNatIp(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].natIp"));
			item.setInstanceType(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceType"));
			item.setRecoverPolicy(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].recoverPolicy"));
			item.setIoOptimized(_ctx.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].ioOptimized"));
			item.setOsName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].osName"));
			item.setIntranetIp(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].intranetIp"));
			item.setEip(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].eip"));
			item.setGmtModified(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtModified"));
			item.setIopsSize(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].iopsSize"));
			item.setSystemDiskCategory(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].systemDiskCategory"));
			item.setIntranetTx(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].intranetTx"));
			item.setGmtStarted(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtStarted"));
			item.setGmtSync(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtSync"));
			item.setCores(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].cores"));
			item.setAliUid(_ctx.longValue("InnerEcsQueryByIpResponse.data["+ i +"].aliUid"));
			item.setImageId(_ctx.longValue("InnerEcsQueryByIpResponse.data["+ i +"].imageId"));
			item.setGmtCreated(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtCreated"));
			item.setGroupNo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].groupNo"));
			item.setVpcInstanceId(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].vpcInstanceId"));
			item.setBid(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].bid"));
			item.setAgentId(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].agentId"));
			item.setRealHostname(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].realHostname"));
			item.setInstanceId(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceId"));
			item.setInstanceTypeFamily(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceTypeFamily"));
			item.setNetworkValidation(_ctx.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].networkValidation"));
			item.setZoneId(_ctx.longValue("InnerEcsQueryByIpResponse.data["+ i +"].zoneId"));
			item.setMemory(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].memory"));
			item.setInternetTx(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].internetTx"));
			item.setVswitchInstanceId(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].vswitchInstanceId"));
			item.setImageType(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageType"));
			item.setIzId(_ctx.longValue("InnerEcsQueryByIpResponse.data["+ i +"].izId"));
			item.setDiskSize(_ctx.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].diskSize"));

			Region region = new Region();
			region.setId(_ctx.longValue("InnerEcsQueryByIpResponse.data["+ i +"].region.id"));
			region.setIsActive(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.isActive"));
			region.setRegionEnName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionEnName"));
			region.setRegionNoAlias(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionMemo"));
			region.setRegionNo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionNo"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.attributes.support_image_copy"));
			attributes.setInternal_use(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.attributes.internal_use"));
			attributes.setAk_name(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.attributes.ak_name"));
			region.setAttributes(attributes);
			item.setRegion(region);

			Iz iz = new Iz();
			iz.setRegionNo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.regionNo"));
			iz.setStatus(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.status"));
			iz.setNo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.no"));
			iz.setEnName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.enName"));
			iz.setCnName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.cnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
				izResourceModelItem.setSupportIoOptimized(_ctx.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceModelItem);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Zone zone = new Zone();
			zone.setZoneMemo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneMemo"));
			zone.setIsWritable(_ctx.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.isWritable"));
			zone.setZoneName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneName"));
			zone.setZoneNoAlias(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setIsActive(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.isActive"));
			zone.setId(_ctx.longValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.id"));
			zone.setZoneEnName(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneEnName"));
			zone.setZoneNo(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneNo"));
			zone.setRouteIpSegment(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setRegionId(_ctx.longValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.regionId"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(_ctx.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);
			item.setZone(zone);

			data.add(item);
		}
		innerEcsQueryByIpResponse.setData(data);
	 
	 	return innerEcsQueryByIpResponse;
	}
}
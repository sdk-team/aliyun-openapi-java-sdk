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

import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Region;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Zone;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInstanceIdResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByInstanceIdResponseUnmarshaller {

	public static InnerEcsQueryByInstanceIdResponse unmarshall(InnerEcsQueryByInstanceIdResponse innerEcsQueryByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		innerEcsQueryByInstanceIdResponse.setRequestId(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsQueryByInstanceIdResponse.errorCode.isSuccess"));
		innerEcsQueryByInstanceIdResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(_ctx.booleanValue("InnerEcsQueryByInstanceIdResponse.data.recoverable"));
		data.setEipInstanceId(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.eipInstanceId"));
		data.setIsWin(_ctx.booleanValue("InnerEcsQueryByInstanceIdResponse.data.isWin"));
		data.setGmtRelease(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtRelease"));
		data.setSerialNumber(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.intranetRx"));
		data.setImageProductCode(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.ecsBusinessStatus"));
		data.setDescription(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.description"));
		data.setInternetIp(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.internetIp"));
		data.setImageNo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageNo"));
		data.setInternetRx(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.internetRx"));
		data.setStatus(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.status"));
		data.setImageName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageName"));
		data.setOsType(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.osType"));
		data.setHostname(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.hostname"));
		data.setEipBandwidth(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.eipBandwidth"));
		data.setNetWorkType(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.netWorkType"));
		data.setNatIp(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.natIp"));
		data.setInstanceType(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceType"));
		data.setRecoverPolicy(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.recoverPolicy"));
		data.setIoOptimized(_ctx.booleanValue("InnerEcsQueryByInstanceIdResponse.data.ioOptimized"));
		data.setOsName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.osName"));
		data.setIntranetIp(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.intranetIp"));
		data.setEip(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.eip"));
		data.setGmtModified(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtModified"));
		data.setIopsSize(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.iopsSize"));
		data.setSystemDiskCategory(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.systemDiskCategory"));
		data.setIntranetTx(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.intranetTx"));
		data.setGmtStarted(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtStarted"));
		data.setGmtSync(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtSync"));
		data.setCores(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.cores"));
		data.setAliUid(_ctx.longValue("InnerEcsQueryByInstanceIdResponse.data.aliUid"));
		data.setImageId(_ctx.longValue("InnerEcsQueryByInstanceIdResponse.data.imageId"));
		data.setGmtCreated(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtCreated"));
		data.setGroupNo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.groupNo"));
		data.setVpcInstanceId(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.vpcInstanceId"));
		data.setBid(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.bid"));
		data.setAgentId(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.agentId"));
		data.setRealHostname(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.realHostname"));
		data.setInstanceId(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceId"));
		data.setInstanceTypeFamily(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(_ctx.booleanValue("InnerEcsQueryByInstanceIdResponse.data.networkValidation"));
		data.setZoneId(_ctx.longValue("InnerEcsQueryByInstanceIdResponse.data.zoneId"));
		data.setMemory(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.memory"));
		data.setInternetTx(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.internetTx"));
		data.setVswitchInstanceId(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.vswitchInstanceId"));
		data.setImageType(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageType"));
		data.setIzId(_ctx.longValue("InnerEcsQueryByInstanceIdResponse.data.izId"));
		data.setDiskSize(_ctx.integerValue("InnerEcsQueryByInstanceIdResponse.data.diskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerEcsQueryByInstanceIdResponse.data.region.id"));
		region.setIsActive(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.isActive"));
		region.setRegionEnName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionName"));
		region.setRegionMemo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.regionNo"));
		iz.setStatus(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.status"));
		iz.setNo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.no"));
		iz.setEnName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.enName"));
		iz.setCnName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(_ctx.booleanValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerEcsQueryByInstanceIdResponse.data.zone.isWritable"));
		zone.setZoneName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.isActive"));
		zone.setId(_ctx.longValue("InnerEcsQueryByInstanceIdResponse.data.zone.id"));
		zone.setZoneEnName(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.routeIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerEcsQueryByInstanceIdResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInstanceIdResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryByInstanceIdResponse.setData(data);
	 
	 	return innerEcsQueryByInstanceIdResponse;
	}
}
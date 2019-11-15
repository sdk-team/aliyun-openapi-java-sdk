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

import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Region;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Zone;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryBySerialNumberResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryBySerialNumberResponseUnmarshaller {

	public static InnerEcsQueryBySerialNumberResponse unmarshall(InnerEcsQueryBySerialNumberResponse innerEcsQueryBySerialNumberResponse, UnmarshallerContext _ctx) {
		
		innerEcsQueryBySerialNumberResponse.setRequestId(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsQueryBySerialNumberResponse.errorCode.isSuccess"));
		innerEcsQueryBySerialNumberResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(_ctx.booleanValue("InnerEcsQueryBySerialNumberResponse.data.recoverable"));
		data.setEipInstanceId(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.eipInstanceId"));
		data.setIsWin(_ctx.booleanValue("InnerEcsQueryBySerialNumberResponse.data.isWin"));
		data.setGmtRelease(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtRelease"));
		data.setSerialNumber(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.intranetRx"));
		data.setImageProductCode(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.ecsBusinessStatus"));
		data.setDescription(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.description"));
		data.setInternetIp(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.internetIp"));
		data.setImageNo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageNo"));
		data.setInternetRx(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.internetRx"));
		data.setStatus(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.status"));
		data.setImageName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageName"));
		data.setOsType(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.osType"));
		data.setHostname(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.hostname"));
		data.setEipBandwidth(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.eipBandwidth"));
		data.setNetWorkType(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.netWorkType"));
		data.setNatIp(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.natIp"));
		data.setInstanceType(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceType"));
		data.setRecoverPolicy(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.recoverPolicy"));
		data.setIoOptimized(_ctx.booleanValue("InnerEcsQueryBySerialNumberResponse.data.ioOptimized"));
		data.setOsName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.osName"));
		data.setIntranetIp(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.intranetIp"));
		data.setEip(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.eip"));
		data.setGmtModified(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtModified"));
		data.setIopsSize(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.iopsSize"));
		data.setSystemDiskCategory(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.systemDiskCategory"));
		data.setIntranetTx(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.intranetTx"));
		data.setGmtStarted(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtStarted"));
		data.setGmtSync(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtSync"));
		data.setCores(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.cores"));
		data.setAliUid(_ctx.longValue("InnerEcsQueryBySerialNumberResponse.data.aliUid"));
		data.setImageId(_ctx.longValue("InnerEcsQueryBySerialNumberResponse.data.imageId"));
		data.setGmtCreated(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtCreated"));
		data.setGroupNo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.groupNo"));
		data.setVpcInstanceId(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.vpcInstanceId"));
		data.setBid(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.bid"));
		data.setAgentId(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.agentId"));
		data.setRealHostname(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.realHostname"));
		data.setInstanceId(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceId"));
		data.setInstanceTypeFamily(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(_ctx.booleanValue("InnerEcsQueryBySerialNumberResponse.data.networkValidation"));
		data.setZoneId(_ctx.longValue("InnerEcsQueryBySerialNumberResponse.data.zoneId"));
		data.setMemory(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.memory"));
		data.setInternetTx(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.internetTx"));
		data.setVswitchInstanceId(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.vswitchInstanceId"));
		data.setImageType(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageType"));
		data.setIzId(_ctx.longValue("InnerEcsQueryBySerialNumberResponse.data.izId"));
		data.setDiskSize(_ctx.integerValue("InnerEcsQueryBySerialNumberResponse.data.diskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerEcsQueryBySerialNumberResponse.data.region.id"));
		region.setIsActive(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.isActive"));
		region.setRegionEnName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionName"));
		region.setRegionMemo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.regionNo"));
		iz.setStatus(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.status"));
		iz.setNo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.no"));
		iz.setEnName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.enName"));
		iz.setCnName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(_ctx.booleanValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerEcsQueryBySerialNumberResponse.data.zone.isWritable"));
		zone.setZoneName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.isActive"));
		zone.setId(_ctx.longValue("InnerEcsQueryBySerialNumberResponse.data.zone.id"));
		zone.setZoneEnName(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.routeIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerEcsQueryBySerialNumberResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryBySerialNumberResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryBySerialNumberResponse.setData(data);
	 
	 	return innerEcsQueryBySerialNumberResponse;
	}
}
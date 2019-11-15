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

import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Iz;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Region;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Region.Attributes;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Zone;
import com.aliyuncs.ecs.model.v20160314.InnerEcsQueryByInternetIpResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByInternetIpResponseUnmarshaller {

	public static InnerEcsQueryByInternetIpResponse unmarshall(InnerEcsQueryByInternetIpResponse innerEcsQueryByInternetIpResponse, UnmarshallerContext _ctx) {
		
		innerEcsQueryByInternetIpResponse.setRequestId(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsQueryByInternetIpResponse.errorCode.isSuccess"));
		innerEcsQueryByInternetIpResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(_ctx.booleanValue("InnerEcsQueryByInternetIpResponse.data.recoverable"));
		data.setEipInstanceId(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.eipInstanceId"));
		data.setIsWin(_ctx.booleanValue("InnerEcsQueryByInternetIpResponse.data.isWin"));
		data.setGmtRelease(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtRelease"));
		data.setSerialNumber(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.intranetRx"));
		data.setImageProductCode(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.ecsBusinessStatus"));
		data.setDescription(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.description"));
		data.setInternetIp(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.internetIp"));
		data.setImageNo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.imageNo"));
		data.setInternetRx(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.internetRx"));
		data.setStatus(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.status"));
		data.setImageName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.imageName"));
		data.setOsType(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.osType"));
		data.setHostname(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.hostname"));
		data.setEipBandwidth(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.eipBandwidth"));
		data.setNetWorkType(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.netWorkType"));
		data.setNatIp(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.natIp"));
		data.setInstanceType(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceType"));
		data.setRecoverPolicy(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.recoverPolicy"));
		data.setIoOptimized(_ctx.booleanValue("InnerEcsQueryByInternetIpResponse.data.ioOptimized"));
		data.setOsName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.osName"));
		data.setIntranetIp(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.intranetIp"));
		data.setEip(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.eip"));
		data.setGmtModified(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtModified"));
		data.setIopsSize(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.iopsSize"));
		data.setSystemDiskCategory(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.systemDiskCategory"));
		data.setIntranetTx(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.intranetTx"));
		data.setGmtStarted(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtStarted"));
		data.setGmtSync(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtSync"));
		data.setCores(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.cores"));
		data.setAliUid(_ctx.longValue("InnerEcsQueryByInternetIpResponse.data.aliUid"));
		data.setImageId(_ctx.longValue("InnerEcsQueryByInternetIpResponse.data.imageId"));
		data.setGmtCreated(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtCreated"));
		data.setGroupNo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.groupNo"));
		data.setVpcInstanceId(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.vpcInstanceId"));
		data.setBid(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.bid"));
		data.setAgentId(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.agentId"));
		data.setRealHostname(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.realHostname"));
		data.setInstanceId(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceId"));
		data.setInstanceTypeFamily(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(_ctx.booleanValue("InnerEcsQueryByInternetIpResponse.data.networkValidation"));
		data.setZoneId(_ctx.longValue("InnerEcsQueryByInternetIpResponse.data.zoneId"));
		data.setMemory(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.memory"));
		data.setInternetTx(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.internetTx"));
		data.setVswitchInstanceId(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.vswitchInstanceId"));
		data.setImageType(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.imageType"));
		data.setIzId(_ctx.longValue("InnerEcsQueryByInternetIpResponse.data.izId"));
		data.setDiskSize(_ctx.integerValue("InnerEcsQueryByInternetIpResponse.data.diskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerEcsQueryByInternetIpResponse.data.region.id"));
		region.setIsActive(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.isActive"));
		region.setRegionEnName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionName"));
		region.setRegionMemo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.regionNo"));
		iz.setStatus(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.status"));
		iz.setNo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.no"));
		iz.setEnName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.enName"));
		iz.setCnName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(_ctx.booleanValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerEcsQueryByInternetIpResponse.data.zone.isWritable"));
		zone.setZoneName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.isActive"));
		zone.setId(_ctx.longValue("InnerEcsQueryByInternetIpResponse.data.zone.id"));
		zone.setZoneEnName(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.routeIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerEcsQueryByInternetIpResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByInternetIpResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryByInternetIpResponse.setData(data);
	 
	 	return innerEcsQueryByInternetIpResponse;
	}
}
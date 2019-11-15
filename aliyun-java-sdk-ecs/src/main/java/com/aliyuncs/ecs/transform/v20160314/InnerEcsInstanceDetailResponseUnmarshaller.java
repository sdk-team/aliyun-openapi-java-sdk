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

import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceDetailResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceDetailResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceDetailResponse.Data.Group;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceDetailResponse.Data.Img;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceDetailResponse.Data.PublicIp;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceDetailResponse.Data.Tag;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsInstanceDetailResponseUnmarshaller {

	public static InnerEcsInstanceDetailResponse unmarshall(InnerEcsInstanceDetailResponse innerEcsInstanceDetailResponse, UnmarshallerContext _ctx) {
		
		innerEcsInstanceDetailResponse.setRequestId(_ctx.stringValue("InnerEcsInstanceDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsInstanceDetailResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsInstanceDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsInstanceDetailResponse.errorCode.isSuccess"));
		innerEcsInstanceDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setInternetTx(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.internetTx"));
		data.setVswitchInstanceId(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.vswitchInstanceId"));
		data.setInstanceTypeFamily(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(_ctx.booleanValue("InnerEcsInstanceDetailResponse.data.networkValidation"));
		data.setRegionNo(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.regionNo"));
		data.setInstanceName(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.instanceName"));
		data.setBusinessStatus(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.businessStatus"));
		data.setEip(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.eip"));
		data.setAliUid(_ctx.longValue("InnerEcsInstanceDetailResponse.data.aliUid"));
		data.setHouyiStatus(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.houyiStatus"));
		data.setIntranetTx(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.intranetTx"));
		data.setCores(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.cores"));
		data.setInnerIp(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.innerIp"));
		data.setEcsName(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.ecsName"));
		data.setBps(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.bps"));
		data.setVpcInstanceId(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.vpcInstanceId"));
		data.setId(_ctx.longValue("InnerEcsInstanceDetailResponse.data.id"));
		data.setBid(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.bid"));
		data.setMem(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.mem"));
		data.setStatus(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.status"));
		data.setInternetRx(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.internetRx"));
		data.setHostname(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.hostname"));
		data.setEipBandwidth(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.eipBandwidth"));
		data.setZoneNo(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.zoneNo"));
		data.setNatIp(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.natIp"));
		data.setInstanceType(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.instanceType"));
		data.setNetWorkType(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.netWorkType"));
		data.setDeviceAvailable(_ctx.booleanValue("InnerEcsInstanceDetailResponse.data.deviceAvailable"));
		data.setIoOptimized(_ctx.booleanValue("InnerEcsInstanceDetailResponse.data.ioOptimized"));
		data.setSystemDeviceCategory(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.systemDeviceCategory"));
		data.setDisk(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.disk"));
		data.setSecurityControl(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.securityControl"));
		data.setEipInstanceId(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.eipInstanceId"));
		data.setIntranetRx(_ctx.integerValue("InnerEcsInstanceDetailResponse.data.intranetRx"));
		data.setIzNo(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.izNo"));
		data.setSerialNumber(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.serialNumber"));
		data.setRealZoneNo(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.realZoneNo"));
		data.setDescription(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.description"));
		data.setCreationTime(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.creationTime"));

		PublicIp publicIp = new PublicIp();
		publicIp.setAssignIp(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.publicIp.assignIp"));
		publicIp.setBindIp(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.publicIp.bindIp"));
		publicIp.setAssignNatIp(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.publicIp.assignNatIp"));
		data.setPublicIp(publicIp);

		Img img = new Img();
		img.setName(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.img.name"));
		img.setImageNo(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.img.imageNo"));
		data.setImg(img);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsInstanceDetailResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.tags["+ i +"].key"));
			tag.setValue(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsInstanceDetailResponse.data.groups.Length"); i++) {
			Group group = new Group();
			group.setGroupDesc(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.groups["+ i +"].groupDesc"));
			group.setGroupNo(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.groups["+ i +"].groupNo"));
			group.setGroupName(_ctx.stringValue("InnerEcsInstanceDetailResponse.data.groups["+ i +"].groupName"));

			groups.add(group);
		}
		data.setGroups(groups);
		innerEcsInstanceDetailResponse.setData(data);
	 
	 	return innerEcsInstanceDetailResponse;
	}
}
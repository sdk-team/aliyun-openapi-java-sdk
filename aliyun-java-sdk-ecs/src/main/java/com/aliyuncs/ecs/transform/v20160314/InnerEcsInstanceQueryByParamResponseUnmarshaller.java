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

import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceQueryByParamResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.Group;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.Img;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.PublicIp;
import com.aliyuncs.ecs.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsInstanceQueryByParamResponseUnmarshaller {

	public static InnerEcsInstanceQueryByParamResponse unmarshall(InnerEcsInstanceQueryByParamResponse innerEcsInstanceQueryByParamResponse, UnmarshallerContext _ctx) {
		
		innerEcsInstanceQueryByParamResponse.setRequestId(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.RequestId"));
		innerEcsInstanceQueryByParamResponse.setCount(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.count"));
		innerEcsInstanceQueryByParamResponse.setPageNo(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.pageNo"));
		innerEcsInstanceQueryByParamResponse.setPageSize(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsInstanceQueryByParamResponse.errorCode.isSuccess"));
		innerEcsInstanceQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsInstanceQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setInternetTx(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].internetTx"));
			item.setVswitchInstanceId(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].vswitchInstanceId"));
			item.setInstanceTypeFamily(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].instanceTypeFamily"));
			item.setNetworkValidation(_ctx.booleanValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].networkValidation"));
			item.setRegionNo(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].regionNo"));
			item.setInstanceName(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].instanceName"));
			item.setBusinessStatus(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].businessStatus"));
			item.setEip(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].eip"));
			item.setAliUid(_ctx.longValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].aliUid"));
			item.setHouyiStatus(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].houyiStatus"));
			item.setIntranetTx(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].intranetTx"));
			item.setCores(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].cores"));
			item.setInnerIp(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].innerIp"));
			item.setEcsName(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].ecsName"));
			item.setBps(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].bps"));
			item.setVpcInstanceId(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].vpcInstanceId"));
			item.setId(_ctx.longValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].id"));
			item.setBid(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].bid"));
			item.setMem(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].mem"));
			item.setStatus(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].status"));
			item.setInternetRx(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].internetRx"));
			item.setHostname(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].hostname"));
			item.setEipBandwidth(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].eipBandwidth"));
			item.setZoneNo(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].zoneNo"));
			item.setNatIp(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].natIp"));
			item.setInstanceType(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].instanceType"));
			item.setNetWorkType(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].netWorkType"));
			item.setDeviceAvailable(_ctx.booleanValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].deviceAvailable"));
			item.setIoOptimized(_ctx.booleanValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].ioOptimized"));
			item.setSystemDeviceCategory(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].systemDeviceCategory"));
			item.setDisk(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].disk"));
			item.setSecurityControl(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].securityControl"));
			item.setEipInstanceId(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].eipInstanceId"));
			item.setIntranetRx(_ctx.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].intranetRx"));
			item.setIzNo(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].izNo"));
			item.setSerialNumber(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].serialNumber"));
			item.setRealZoneNo(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].realZoneNo"));
			item.setDescription(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].description"));
			item.setCreationTime(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].creationTime"));

			PublicIp publicIp = new PublicIp();
			publicIp.setAssignIp(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].publicIp.assignIp"));
			publicIp.setBindIp(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].publicIp.bindIp"));
			publicIp.setAssignNatIp(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].publicIp.assignNatIp"));
			item.setPublicIp(publicIp);

			Img img = new Img();
			img.setName(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].img.name"));
			img.setImageNo(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].img.imageNo"));
			item.setImg(img);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			List<Group> groups = new ArrayList<Group>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups.Length"); j++) {
				Group group = new Group();
				group.setGroupDesc(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups["+ j +"].groupDesc"));
				group.setGroupNo(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups["+ j +"].groupNo"));
				group.setGroupName(_ctx.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups["+ j +"].groupName"));

				groups.add(group);
			}
			item.setGroups(groups);

			data.add(item);
		}
		innerEcsInstanceQueryByParamResponse.setData(data);
	 
	 	return innerEcsInstanceQueryByParamResponse;
	}
}
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

import com.aliyuncs.ecs.model.v20160314.InnerGroupDetailResponse;
import com.aliyuncs.ecs.model.v20160314.InnerGroupDetailResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerGroupDetailResponse.Data.Permission;
import com.aliyuncs.ecs.model.v20160314.InnerGroupDetailResponse.Data.Tag;
import com.aliyuncs.ecs.model.v20160314.InnerGroupDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupDetailResponseUnmarshaller {

	public static InnerGroupDetailResponse unmarshall(InnerGroupDetailResponse innerGroupDetailResponse, UnmarshallerContext _ctx) {
		
		innerGroupDetailResponse.setRequestId(_ctx.stringValue("InnerGroupDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerGroupDetailResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerGroupDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerGroupDetailResponse.errorCode.isSuccess"));
		innerGroupDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setEcsCount(_ctx.integerValue("InnerGroupDetailResponse.data.ecsCount"));
		data.setVpcInstanceId(_ctx.stringValue("InnerGroupDetailResponse.data.vpcInstanceId"));
		data.setGroupDesc(_ctx.stringValue("InnerGroupDetailResponse.data.groupDesc"));
		data.setRegionNo(_ctx.stringValue("InnerGroupDetailResponse.data.regionNo"));
		data.setGroupName(_ctx.stringValue("InnerGroupDetailResponse.data.groupName"));
		data.setGmtCreated(_ctx.stringValue("InnerGroupDetailResponse.data.gmtCreated"));
		data.setGroupNo(_ctx.stringValue("InnerGroupDetailResponse.data.groupNo"));
		data.setGmtModified(_ctx.stringValue("InnerGroupDetailResponse.data.gmtModified"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("InnerGroupDetailResponse.data.permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setPortRange(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].portRange"));
			permission.setDestCidrIp(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].destCidrIp"));
			permission.setDirection(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].direction"));
			permission.setNic(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].nic"));
			permission.setSourceGroupOwnerUserAccount(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].sourceGroupOwnerUserAccount"));
			permission.setPolicy(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].policy"));
			permission.setIpProtocal(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].ipProtocal"));
			permission.setDestGroupNo(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].destGroupNo"));
			permission.setDestGroupOwnerUserAccount(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].destGroupOwnerUserAccount"));
			permission.setSourceGroupNo(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].sourceGroupNo"));
			permission.setLevel(_ctx.integerValue("InnerGroupDetailResponse.data.permissions["+ i +"].level"));
			permission.setSourceCidrIp(_ctx.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].sourceCidrIp"));

			permissions.add(permission);
		}
		data.setPermissions(permissions);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("InnerGroupDetailResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("InnerGroupDetailResponse.data.tags["+ i +"].key"));
			tag.setValue(_ctx.stringValue("InnerGroupDetailResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);
		innerGroupDetailResponse.setData(data);
	 
	 	return innerGroupDetailResponse;
	}
}
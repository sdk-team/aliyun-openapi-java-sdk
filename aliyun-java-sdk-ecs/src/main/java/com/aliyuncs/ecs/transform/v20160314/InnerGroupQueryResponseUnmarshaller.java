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

import com.aliyuncs.ecs.model.v20160314.InnerGroupQueryResponse;
import com.aliyuncs.ecs.model.v20160314.InnerGroupQueryResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerGroupQueryResponse.Data.Group;
import com.aliyuncs.ecs.model.v20160314.InnerGroupQueryResponse.Data.Group.Tag;
import com.aliyuncs.ecs.model.v20160314.InnerGroupQueryResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupQueryResponseUnmarshaller {

	public static InnerGroupQueryResponse unmarshall(InnerGroupQueryResponse innerGroupQueryResponse, UnmarshallerContext _ctx) {
		
		innerGroupQueryResponse.setRequestId(_ctx.stringValue("InnerGroupQueryResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerGroupQueryResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerGroupQueryResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerGroupQueryResponse.errorCode.isSuccess"));
		innerGroupQueryResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setTotal(_ctx.integerValue("InnerGroupQueryResponse.data.total"));
		data.setVpcInstanceId(_ctx.stringValue("InnerGroupQueryResponse.data.vpcInstanceId"));
		data.setPageNo(_ctx.integerValue("InnerGroupQueryResponse.data.pageNo"));
		data.setPageSize(_ctx.integerValue("InnerGroupQueryResponse.data.pageSize"));
		data.setRegionNo(_ctx.stringValue("InnerGroupQueryResponse.data.regionNo"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("InnerGroupQueryResponse.data.groups.Length"); i++) {
			Group group = new Group();
			group.setEcsCount(_ctx.integerValue("InnerGroupQueryResponse.data.groups["+ i +"].ecsCount"));
			group.setVpcInstanceId(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].vpcInstanceId"));
			group.setGroupDesc(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].groupDesc"));
			group.setGmtCreated(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].gmtCreated"));
			group.setGroupName(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].groupName"));
			group.setGmtModified(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].gmtModified"));
			group.setGroupNo(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].groupNo"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("InnerGroupQueryResponse.data.groups["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].tags["+ j +"].key"));
				tag.setValue(_ctx.stringValue("InnerGroupQueryResponse.data.groups["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			group.setTags(tags);

			groups.add(group);
		}
		data.setGroups(groups);
		innerGroupQueryResponse.setData(data);
	 
	 	return innerGroupQueryResponse;
	}
}
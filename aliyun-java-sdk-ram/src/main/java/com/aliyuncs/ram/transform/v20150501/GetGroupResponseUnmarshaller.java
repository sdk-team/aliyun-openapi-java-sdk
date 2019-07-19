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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.GetGroupResponse;
import com.aliyuncs.ram.model.v20150501.GetGroupResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupResponseUnmarshaller {

	public static GetGroupResponse unmarshall(GetGroupResponse getGroupResponse, UnmarshallerContext _ctx) {
		
		getGroupResponse.setRequestId(_ctx.stringValue("GetGroupResponse.RequestId"));

		Group group = new Group();
		group.setGroupName(_ctx.stringValue("GetGroupResponse.Group.GroupName"));
		group.setComments(_ctx.stringValue("GetGroupResponse.Group.Comments"));
		group.setCreateDate(_ctx.stringValue("GetGroupResponse.Group.CreateDate"));
		group.setUpdateDate(_ctx.stringValue("GetGroupResponse.Group.UpdateDate"));
		getGroupResponse.setGroup(group);
	 
	 	return getGroupResponse;
	}
}
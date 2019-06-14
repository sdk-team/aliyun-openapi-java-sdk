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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.InnerOpsDescribeAccessControlListsResponse;
import com.aliyuncs.slb.model.v20140515.InnerOpsDescribeAccessControlListsResponse.Acl;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerOpsDescribeAccessControlListsResponseUnmarshaller {

	public static InnerOpsDescribeAccessControlListsResponse unmarshall(InnerOpsDescribeAccessControlListsResponse innerOpsDescribeAccessControlListsResponse, UnmarshallerContext context) {
		
		innerOpsDescribeAccessControlListsResponse.setRequestId(context.stringValue("InnerOpsDescribeAccessControlListsResponse.RequestId"));
		innerOpsDescribeAccessControlListsResponse.setResourceOwnerId(context.longValue("InnerOpsDescribeAccessControlListsResponse.ResourceOwnerId"));

		List<Acl> acls = new ArrayList<Acl>();
		for (int i = 0; i < context.lengthValue("InnerOpsDescribeAccessControlListsResponse.Acls.Length"); i++) {
			Acl acl = new Acl();
			acl.setAclId(context.stringValue("InnerOpsDescribeAccessControlListsResponse.Acls["+ i +"].AclId"));
			acl.setAclName(context.stringValue("InnerOpsDescribeAccessControlListsResponse.Acls["+ i +"].AclName"));

			acls.add(acl);
		}
		innerOpsDescribeAccessControlListsResponse.setAcls(acls);
	 
	 	return innerOpsDescribeAccessControlListsResponse;
	}
}
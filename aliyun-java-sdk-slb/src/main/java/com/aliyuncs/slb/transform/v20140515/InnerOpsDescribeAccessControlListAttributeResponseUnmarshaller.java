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

import com.aliyuncs.slb.model.v20140515.InnerOpsDescribeAccessControlListAttributeResponse;
import com.aliyuncs.slb.model.v20140515.InnerOpsDescribeAccessControlListAttributeResponse.AclEntry;
import com.aliyuncs.slb.model.v20140515.InnerOpsDescribeAccessControlListAttributeResponse.RelatedListener;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerOpsDescribeAccessControlListAttributeResponseUnmarshaller {

	public static InnerOpsDescribeAccessControlListAttributeResponse unmarshall(InnerOpsDescribeAccessControlListAttributeResponse innerOpsDescribeAccessControlListAttributeResponse, UnmarshallerContext context) {
		
		innerOpsDescribeAccessControlListAttributeResponse.setRequestId(context.stringValue("InnerOpsDescribeAccessControlListAttributeResponse.RequestId"));
		innerOpsDescribeAccessControlListAttributeResponse.setResourceOwnerId(context.longValue("InnerOpsDescribeAccessControlListAttributeResponse.ResourceOwnerId"));
		innerOpsDescribeAccessControlListAttributeResponse.setAclId(context.stringValue("InnerOpsDescribeAccessControlListAttributeResponse.AclId"));
		innerOpsDescribeAccessControlListAttributeResponse.setAclName(context.stringValue("InnerOpsDescribeAccessControlListAttributeResponse.AclName"));

		List<AclEntry> aclEntrys = new ArrayList<AclEntry>();
		for (int i = 0; i < context.lengthValue("InnerOpsDescribeAccessControlListAttributeResponse.AclEntrys.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setAclEntryIP(context.stringValue("InnerOpsDescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryIP"));
			aclEntry.setAclEntryComment(context.integerValue("InnerOpsDescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryComment"));

			aclEntrys.add(aclEntry);
		}
		innerOpsDescribeAccessControlListAttributeResponse.setAclEntrys(aclEntrys);

		List<RelatedListener> relatedListeners = new ArrayList<RelatedListener>();
		for (int i = 0; i < context.lengthValue("InnerOpsDescribeAccessControlListAttributeResponse.RelatedListeners.Length"); i++) {
			RelatedListener relatedListener = new RelatedListener();
			relatedListener.setLoadBalancerId(context.stringValue("InnerOpsDescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].LoadBalancerId"));
			relatedListener.setListenerPort(context.integerValue("InnerOpsDescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].ListenerPort"));
			relatedListener.setAclType(context.stringValue("InnerOpsDescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].AclType"));
			relatedListener.setProtocol(context.stringValue("InnerOpsDescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].Protocol"));

			relatedListeners.add(relatedListener);
		}
		innerOpsDescribeAccessControlListAttributeResponse.setRelatedListeners(relatedListeners);
	 
	 	return innerOpsDescribeAccessControlListAttributeResponse;
	}
}
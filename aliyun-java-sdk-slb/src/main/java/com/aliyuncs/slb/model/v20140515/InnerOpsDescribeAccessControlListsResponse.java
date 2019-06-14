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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.InnerOpsDescribeAccessControlListsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerOpsDescribeAccessControlListsResponse extends AcsResponse {

	private Long resourceOwnerId;

	private String requestId;

	private List<Acl> acls;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Acl> getAcls() {
		return this.acls;
	}

	public void setAcls(List<Acl> acls) {
		this.acls = acls;
	}

	public static class Acl {

		private String aclId;

		private String aclName;

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public String getAclName() {
			return this.aclName;
		}

		public void setAclName(String aclName) {
			this.aclName = aclName;
		}
	}

	@Override
	public InnerOpsDescribeAccessControlListsResponse getInstance(UnmarshallerContext context) {
		return	InnerOpsDescribeAccessControlListsResponseUnmarshaller.unmarshall(this, context);
	}
}

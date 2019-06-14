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
import com.aliyuncs.slb.transform.v20140515.InnerOpsDescribeAccessControlListAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerOpsDescribeAccessControlListAttributeResponse extends AcsResponse {

	private Long resourceOwnerId;

	private String requestId;

	private String aclId;

	private String aclName;

	private List<AclEntry> aclEntrys;

	private List<RelatedListener> relatedListeners;

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

	public List<AclEntry> getAclEntrys() {
		return this.aclEntrys;
	}

	public void setAclEntrys(List<AclEntry> aclEntrys) {
		this.aclEntrys = aclEntrys;
	}

	public List<RelatedListener> getRelatedListeners() {
		return this.relatedListeners;
	}

	public void setRelatedListeners(List<RelatedListener> relatedListeners) {
		this.relatedListeners = relatedListeners;
	}

	public static class AclEntry {

		private String aclEntryIP;

		private Integer aclEntryComment;

		public String getAclEntryIP() {
			return this.aclEntryIP;
		}

		public void setAclEntryIP(String aclEntryIP) {
			this.aclEntryIP = aclEntryIP;
		}

		public Integer getAclEntryComment() {
			return this.aclEntryComment;
		}

		public void setAclEntryComment(Integer aclEntryComment) {
			this.aclEntryComment = aclEntryComment;
		}
	}

	public static class RelatedListener {

		private String loadBalancerId;

		private Integer listenerPort;

		private String aclType;

		private String protocol;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getAclType() {
			return this.aclType;
		}

		public void setAclType(String aclType) {
			this.aclType = aclType;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		/**
		 * @deprecated use getBizProtocol instead of this.
		 */
		@Deprecated
		public String getProtocol() {
			return this.protocol;
		}

		/**
		 * @deprecated use setBizProtocol instead of this.
		 */
		@Deprecated
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}
	}

	@Override
	public InnerOpsDescribeAccessControlListAttributeResponse getInstance(UnmarshallerContext context) {
		return	InnerOpsDescribeAccessControlListAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}

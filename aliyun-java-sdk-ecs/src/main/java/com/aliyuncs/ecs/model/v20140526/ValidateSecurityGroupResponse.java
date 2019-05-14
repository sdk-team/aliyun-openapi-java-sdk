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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.ValidateSecurityGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateSecurityGroupResponse extends AcsResponse {

	private String requestId;

	private String policy;

	private TriggeredGroupRule triggeredGroupRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public TriggeredGroupRule getTriggeredGroupRule() {
		return this.triggeredGroupRule;
	}

	public void setTriggeredGroupRule(TriggeredGroupRule triggeredGroupRule) {
		this.triggeredGroupRule = triggeredGroupRule;
	}

	public static class TriggeredGroupRule {

		private String ipProtocol;

		private String portRange;

		private String sourceGroupId;

		private String sourceGroupName;

		private String sourceCidrIp;

		private String policy;

		private String nicType;

		private String sourceGroupOwnerAccount;

		private String destGroupId;

		private String destGroupName;

		private String destCidrIp;

		private String destGroupOwnerAccount;

		private String priority;

		private String direction;

		private String description;

		private String createTime;

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getSourceGroupId() {
			return this.sourceGroupId;
		}

		public void setSourceGroupId(String sourceGroupId) {
			this.sourceGroupId = sourceGroupId;
		}

		public String getSourceGroupName() {
			return this.sourceGroupName;
		}

		public void setSourceGroupName(String sourceGroupName) {
			this.sourceGroupName = sourceGroupName;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getNicType() {
			return this.nicType;
		}

		public void setNicType(String nicType) {
			this.nicType = nicType;
		}

		public String getSourceGroupOwnerAccount() {
			return this.sourceGroupOwnerAccount;
		}

		public void setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
			this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
		}

		public String getDestGroupId() {
			return this.destGroupId;
		}

		public void setDestGroupId(String destGroupId) {
			this.destGroupId = destGroupId;
		}

		public String getDestGroupName() {
			return this.destGroupName;
		}

		public void setDestGroupName(String destGroupName) {
			this.destGroupName = destGroupName;
		}

		public String getDestCidrIp() {
			return this.destCidrIp;
		}

		public void setDestCidrIp(String destCidrIp) {
			this.destCidrIp = destCidrIp;
		}

		public String getDestGroupOwnerAccount() {
			return this.destGroupOwnerAccount;
		}

		public void setDestGroupOwnerAccount(String destGroupOwnerAccount) {
			this.destGroupOwnerAccount = destGroupOwnerAccount;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ValidateSecurityGroupResponse getInstance(UnmarshallerContext context) {
		return	ValidateSecurityGroupResponseUnmarshaller.unmarshall(this, context);
	}
}

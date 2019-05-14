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

package com.aliyuncs.acs.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.acs.transform.v20150101.GetControlPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetControlPolicyResponse extends AcsResponse {

	private String product;

	private String policyName;

	private String type;

	private String description;

	private List<Policy> policys;

	public String getBizProduct() {
		return this.product;
	}

	public void setBizProduct(String product) {
		this.product = product;
	}

	/**
	 * @deprecated use getBizProduct instead of this.
	 */
	@Deprecated
	public String getProduct() {
		return this.product;
	}

	/**
	 * @deprecated use setBizProduct instead of this.
	 */
	@Deprecated
	public void setProduct(String product) {
		this.product = product;
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Policy> getPolicys() {
		return this.policys;
	}

	public void setPolicys(List<Policy> policys) {
		this.policys = policys;
	}

	public static class Policy {

		private String cidrBlocks;

		private String regionIds;

		private String userId;

		public String getCidrBlocks() {
			return this.cidrBlocks;
		}

		public void setCidrBlocks(String cidrBlocks) {
			this.cidrBlocks = cidrBlocks;
		}

		public String getRegionIds() {
			return this.regionIds;
		}

		public void setRegionIds(String regionIds) {
			this.regionIds = regionIds;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public GetControlPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetControlPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}

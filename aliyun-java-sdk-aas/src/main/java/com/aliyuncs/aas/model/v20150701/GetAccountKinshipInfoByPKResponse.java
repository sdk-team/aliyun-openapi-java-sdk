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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aas.transform.v20150701.GetAccountKinshipInfoByPKResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountKinshipInfoByPKResponse extends AcsResponse {

	private String requestId;

	private String pK;

	private String parentPk;

	private String partnerPk;

	private String accountStructure;

	private String accountName;

	private Boolean isSubAccount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
	}

	public String getParentPk() {
		return this.parentPk;
	}

	public void setParentPk(String parentPk) {
		this.parentPk = parentPk;
	}

	public String getPartnerPk() {
		return this.partnerPk;
	}

	public void setPartnerPk(String partnerPk) {
		this.partnerPk = partnerPk;
	}

	public String getAccountStructure() {
		return this.accountStructure;
	}

	public void setAccountStructure(String accountStructure) {
		this.accountStructure = accountStructure;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Boolean getIsSubAccount() {
		return this.isSubAccount;
	}

	public void setIsSubAccount(Boolean isSubAccount) {
		this.isSubAccount = isSubAccount;
	}

	@Override
	public GetAccountKinshipInfoByPKResponse getInstance(UnmarshallerContext context) {
		return	GetAccountKinshipInfoByPKResponseUnmarshaller.unmarshall(this, context);
	}
}

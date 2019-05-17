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
import com.aliyuncs.aas.transform.v20150701.GetBasicAccountInfoByPkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBasicAccountInfoByPkResponse extends AcsResponse {

	private String requestId;

	private String pK;

	private String havanaId;

	private String parentPk;

	private String partnerPk;

	private String accountStructure;

	private Integer symmetricAkLimit;

	private Integer rSAAkLimit;

	private Integer virtualMFALimit;

	private Boolean mulitiBidUser;

	private String lastLoginTime;

	private String createTime;

	private String accountStatus;

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

	public String getHavanaId() {
		return this.havanaId;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
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

	public Integer getSymmetricAkLimit() {
		return this.symmetricAkLimit;
	}

	public void setSymmetricAkLimit(Integer symmetricAkLimit) {
		this.symmetricAkLimit = symmetricAkLimit;
	}

	public Integer getRSAAkLimit() {
		return this.rSAAkLimit;
	}

	public void setRSAAkLimit(Integer rSAAkLimit) {
		this.rSAAkLimit = rSAAkLimit;
	}

	public Integer getVirtualMFALimit() {
		return this.virtualMFALimit;
	}

	public void setVirtualMFALimit(Integer virtualMFALimit) {
		this.virtualMFALimit = virtualMFALimit;
	}

	public Boolean getMulitiBidUser() {
		return this.mulitiBidUser;
	}

	public void setMulitiBidUser(Boolean mulitiBidUser) {
		this.mulitiBidUser = mulitiBidUser;
	}

	public String getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	@Override
	public GetBasicAccountInfoByPkResponse getInstance(UnmarshallerContext context) {
		return	GetBasicAccountInfoByPkResponseUnmarshaller.unmarshall(this, context);
	}
}

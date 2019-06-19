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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetShortTermAccessKeyForAccountRequest extends RpcAcsRequest<GetShortTermAccessKeyForAccountResponse> {
	
	public GetShortTermAccessKeyForAccountRequest() {
		super("Aas", "2015-07-01", "GetShortTermAccessKeyForAccount", "aas");
	}

	private String expireTime;

	private Boolean isMfaPresent;

	private String pK;

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime);
		}
	}

	public Boolean getIsMfaPresent() {
		return this.isMfaPresent;
	}

	public void setIsMfaPresent(Boolean isMfaPresent) {
		this.isMfaPresent = isMfaPresent;
		if(isMfaPresent != null){
			putQueryParameter("IsMfaPresent", isMfaPresent.toString());
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	@Override
	public Class<GetShortTermAccessKeyForAccountResponse> getResponseClass() {
		return GetShortTermAccessKeyForAccountResponse.class;
	}

}

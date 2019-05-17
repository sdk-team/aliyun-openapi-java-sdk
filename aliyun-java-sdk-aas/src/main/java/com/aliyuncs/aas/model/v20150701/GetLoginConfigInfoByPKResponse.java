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
import com.aliyuncs.aas.transform.v20150701.GetLoginConfigInfoByPKResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoginConfigInfoByPKResponse extends AcsResponse {

	private String requestId;

	private String pK;

	private String mFADeviceId;

	private Boolean mFAChecked;

	private Boolean forceLoginCheckMFA;

	private Boolean skipMFANotAllowed;

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

	public String getMFADeviceId() {
		return this.mFADeviceId;
	}

	public void setMFADeviceId(String mFADeviceId) {
		this.mFADeviceId = mFADeviceId;
	}

	public Boolean getMFAChecked() {
		return this.mFAChecked;
	}

	public void setMFAChecked(Boolean mFAChecked) {
		this.mFAChecked = mFAChecked;
	}

	public Boolean getForceLoginCheckMFA() {
		return this.forceLoginCheckMFA;
	}

	public void setForceLoginCheckMFA(Boolean forceLoginCheckMFA) {
		this.forceLoginCheckMFA = forceLoginCheckMFA;
	}

	public Boolean getSkipMFANotAllowed() {
		return this.skipMFANotAllowed;
	}

	public void setSkipMFANotAllowed(Boolean skipMFANotAllowed) {
		this.skipMFANotAllowed = skipMFANotAllowed;
	}

	@Override
	public GetLoginConfigInfoByPKResponse getInstance(UnmarshallerContext context) {
		return	GetLoginConfigInfoByPKResponseUnmarshaller.unmarshall(this, context);
	}
}

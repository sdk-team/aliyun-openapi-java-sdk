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
import com.aliyuncs.aas.transform.v20150701.IsBindMfaByPkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class IsBindMfaByPkResponse extends AcsResponse {

	private String requestId;

	private Boolean isBindMfa;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsBindMfa() {
		return this.isBindMfa;
	}

	public void setIsBindMfa(Boolean isBindMfa) {
		this.isBindMfa = isBindMfa;
	}

	@Override
	public IsBindMfaByPkResponse getInstance(UnmarshallerContext context) {
		return	IsBindMfaByPkResponseUnmarshaller.unmarshall(this, context);
	}
}

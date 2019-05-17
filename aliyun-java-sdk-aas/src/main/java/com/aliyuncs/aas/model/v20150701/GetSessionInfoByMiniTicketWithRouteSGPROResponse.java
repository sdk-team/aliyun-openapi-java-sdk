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
import com.aliyuncs.aas.transform.v20150701.GetSessionInfoByMiniTicketWithRouteSGPROResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSessionInfoByMiniTicketWithRouteSGPROResponse extends AcsResponse {

	private String requestId;

	private String sessionInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSessionInfo() {
		return this.sessionInfo;
	}

	public void setSessionInfo(String sessionInfo) {
		this.sessionInfo = sessionInfo;
	}

	@Override
	public GetSessionInfoByMiniTicketWithRouteSGPROResponse getInstance(UnmarshallerContext context) {
		return	GetSessionInfoByMiniTicketWithRouteSGPROResponseUnmarshaller.unmarshall(this, context);
	}
}

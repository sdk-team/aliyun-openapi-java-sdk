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

package com.aliyuncs.iot.model.v20190730;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20190730.QueryProductProjectForTmallGenieResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProductProjectForTmallGenieResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private String projectId;

	private String isolateId;

	private String devIsolateId;

	private String iSVTaobaoId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getIsolateId() {
		return this.isolateId;
	}

	public void setIsolateId(String isolateId) {
		this.isolateId = isolateId;
	}

	public String getDevIsolateId() {
		return this.devIsolateId;
	}

	public void setDevIsolateId(String devIsolateId) {
		this.devIsolateId = devIsolateId;
	}

	public String getISVTaobaoId() {
		return this.iSVTaobaoId;
	}

	public void setISVTaobaoId(String iSVTaobaoId) {
		this.iSVTaobaoId = iSVTaobaoId;
	}

	@Override
	public QueryProductProjectForTmallGenieResponse getInstance(UnmarshallerContext context) {
		return	QueryProductProjectForTmallGenieResponseUnmarshaller.unmarshall(this, context);
	}
}

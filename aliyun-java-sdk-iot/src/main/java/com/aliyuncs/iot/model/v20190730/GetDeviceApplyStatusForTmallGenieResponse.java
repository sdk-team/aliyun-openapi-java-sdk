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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20190730.GetDeviceApplyStatusForTmallGenieResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceApplyStatusForTmallGenieResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<ApplyStatus> data;

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

	public List<ApplyStatus> getData() {
		return this.data;
	}

	public void setData(List<ApplyStatus> data) {
		this.data = data;
	}

	public static class ApplyStatus {

		private String status;

		private Integer successCount;

		private Integer totalCount;

		private String downloadHref;

		private String applyId;

		private Boolean exist;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Integer successCount) {
			this.successCount = successCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getDownloadHref() {
			return this.downloadHref;
		}

		public void setDownloadHref(String downloadHref) {
			this.downloadHref = downloadHref;
		}

		public String getApplyId() {
			return this.applyId;
		}

		public void setApplyId(String applyId) {
			this.applyId = applyId;
		}

		public Boolean getExist() {
			return this.exist;
		}

		public void setExist(Boolean exist) {
			this.exist = exist;
		}
	}

	@Override
	public GetDeviceApplyStatusForTmallGenieResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceApplyStatusForTmallGenieResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.acs.transform.v20150101.GetVersionDocNewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVersionDocNewResponse extends AcsResponse {

	private String product;

	private String version;

	private String language;

	private String index;

	private String description;

	private List<ErrorCode> errorCodeList;

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

	public String getBizVersion() {
		return this.version;
	}

	public void setBizVersion(String version) {
		this.version = version;
	}

	/**
	 * @deprecated use getBizVersion instead of this.
	 */
	@Deprecated
	public String getVersion() {
		return this.version;
	}

	/**
	 * @deprecated use setBizVersion instead of this.
	 */
	@Deprecated
	public void setVersion(String version) {
		this.version = version;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getIndex() {
		return this.index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ErrorCode> getErrorCodeList() {
		return this.errorCodeList;
	}

	public void setErrorCodeList(List<ErrorCode> errorCodeList) {
		this.errorCodeList = errorCodeList;
	}

	public static class ErrorCode {

		private Integer httpStatusCode;

		private String errorCode;

		private Integer index;

		private String errorMessage;

		private Boolean defaultError;

		public Integer getHttpStatusCode() {
			return this.httpStatusCode;
		}

		public void setHttpStatusCode(Integer httpStatusCode) {
			this.httpStatusCode = httpStatusCode;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Boolean getDefaultError() {
			return this.defaultError;
		}

		public void setDefaultError(Boolean defaultError) {
			this.defaultError = defaultError;
		}
	}

	@Override
	public GetVersionDocNewResponse getInstance(UnmarshallerContext context) {
		return	GetVersionDocNewResponseUnmarshaller.unmarshall(this, context);
	}
}

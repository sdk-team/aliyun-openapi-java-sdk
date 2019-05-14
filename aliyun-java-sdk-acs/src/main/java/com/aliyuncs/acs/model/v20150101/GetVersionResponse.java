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
import com.aliyuncs.acs.transform.v20150101.GetVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVersionResponse extends AcsResponse {

	private String product;

	private String name;

	private String apiStyle;

	private String isolationType;

	private List<Api> apis;

	private ErrorMapping errorMapping;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApiStyle() {
		return this.apiStyle;
	}

	public void setApiStyle(String apiStyle) {
		this.apiStyle = apiStyle;
	}

	public String getIsolationType() {
		return this.isolationType;
	}

	public void setIsolationType(String isolationType) {
		this.isolationType = isolationType;
	}

	public List<Api> getApis() {
		return this.apis;
	}

	public void setApis(List<Api> apis) {
		this.apis = apis;
	}

	public ErrorMapping getErrorMapping() {
		return this.errorMapping;
	}

	public void setErrorMapping(ErrorMapping errorMapping) {
		this.errorMapping = errorMapping;
	}

	public static class Api {

		private String name;

		private String status;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class ErrorMapping {

		private String exceptionExpress;

		private List<ErrorCode> errorCodes;

		private UnknownError unknownError;

		public String getExceptionExpress() {
			return this.exceptionExpress;
		}

		public void setExceptionExpress(String exceptionExpress) {
			this.exceptionExpress = exceptionExpress;
		}

		public List<ErrorCode> getErrorCodes() {
			return this.errorCodes;
		}

		public void setErrorCodes(List<ErrorCode> errorCodes) {
			this.errorCodes = errorCodes;
		}

		public UnknownError getUnknownError() {
			return this.unknownError;
		}

		public void setUnknownError(UnknownError unknownError) {
			this.unknownError = unknownError;
		}

		public static class ErrorCode {

			private String code;

			private String errorCode;

			private String httpCode;

			private String errorMessage;

			private String type;

			private String extendedErrorCode;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getHttpCode() {
				return this.httpCode;
			}

			public void setHttpCode(String httpCode) {
				this.httpCode = httpCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getExtendedErrorCode() {
				return this.extendedErrorCode;
			}

			public void setExtendedErrorCode(String extendedErrorCode) {
				this.extendedErrorCode = extendedErrorCode;
			}
		}

		public static class UnknownError {

			private String code;

			private String errorCode;

			private String httpCode;

			private String errorMessage;

			private String type;

			private String extendedErrorCode;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getHttpCode() {
				return this.httpCode;
			}

			public void setHttpCode(String httpCode) {
				this.httpCode = httpCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getExtendedErrorCode() {
				return this.extendedErrorCode;
			}

			public void setExtendedErrorCode(String extendedErrorCode) {
				this.extendedErrorCode = extendedErrorCode;
			}
		}
	}

	@Override
	public GetVersionResponse getInstance(UnmarshallerContext context) {
		return	GetVersionResponseUnmarshaller.unmarshall(this, context);
	}
}

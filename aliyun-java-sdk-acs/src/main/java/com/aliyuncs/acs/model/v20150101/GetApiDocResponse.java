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
import com.aliyuncs.acs.transform.v20150101.GetApiDocResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApiDocResponse extends AcsResponse {

	private String product;

	private String version;

	private String name;

	private String title;

	private String tagId;

	private String index;

	private String language;

	private String abcDocumentId;

	private String resultMapping;

	private String parameters;

	private String requestDemo;

	private String responseDemo;

	private String errorResponseDemo;

	private String xmlResponseDemo;

	private String xmlErrorResponseDemo;

	private String description;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getIndex() {
		return this.index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAbcDocumentId() {
		return this.abcDocumentId;
	}

	public void setAbcDocumentId(String abcDocumentId) {
		this.abcDocumentId = abcDocumentId;
	}

	public String getResultMapping() {
		return this.resultMapping;
	}

	public void setResultMapping(String resultMapping) {
		this.resultMapping = resultMapping;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getRequestDemo() {
		return this.requestDemo;
	}

	public void setRequestDemo(String requestDemo) {
		this.requestDemo = requestDemo;
	}

	public String getResponseDemo() {
		return this.responseDemo;
	}

	public void setResponseDemo(String responseDemo) {
		this.responseDemo = responseDemo;
	}

	public String getErrorResponseDemo() {
		return this.errorResponseDemo;
	}

	public void setErrorResponseDemo(String errorResponseDemo) {
		this.errorResponseDemo = errorResponseDemo;
	}

	public String getXmlResponseDemo() {
		return this.xmlResponseDemo;
	}

	public void setXmlResponseDemo(String xmlResponseDemo) {
		this.xmlResponseDemo = xmlResponseDemo;
	}

	public String getXmlErrorResponseDemo() {
		return this.xmlErrorResponseDemo;
	}

	public void setXmlErrorResponseDemo(String xmlErrorResponseDemo) {
		this.xmlErrorResponseDemo = xmlErrorResponseDemo;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ErrorMapping getErrorMapping() {
		return this.errorMapping;
	}

	public void setErrorMapping(ErrorMapping errorMapping) {
		this.errorMapping = errorMapping;
	}

	public static class ErrorMapping {

		private List<ErrorCode> errorCodes;

		private UnknownError unknownError;

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

			private String httpCode;

			private String errorCode;

			private String errorMessage;

			private String tagId;

			private String index;

			private String description;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getHttpCode() {
				return this.httpCode;
			}

			public void setHttpCode(String httpCode) {
				this.httpCode = httpCode;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getTagId() {
				return this.tagId;
			}

			public void setTagId(String tagId) {
				this.tagId = tagId;
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
		}

		public static class UnknownError {

			private String httpCode;

			private String errorCode;

			private String errorMessage;

			private String tagId;

			private String description;

			public String getHttpCode() {
				return this.httpCode;
			}

			public void setHttpCode(String httpCode) {
				this.httpCode = httpCode;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getTagId() {
				return this.tagId;
			}

			public void setTagId(String tagId) {
				this.tagId = tagId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public GetApiDocResponse getInstance(UnmarshallerContext context) {
		return	GetApiDocResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.acs.transform.v20150101.GetApiDocNewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApiDocNewResponse extends AcsResponse {

	private String language;

	private String description;

	private String product;

	private String version;

	private String name;

	private String title;

	private String tagId;

	private String index;

	private String visibility;

	private String abcDocumentId;

	private String tagName;

	private Integer tagIndex;

	private String apiSnapshotId;

	private String resultMapping;

	private String requestDemo;

	private List<ParameterDoc> parameterList;

	private List<ErrorCode> errorCodeList;

	private List<ResponseDemo> responseDemoList;

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getAbcDocumentId() {
		return this.abcDocumentId;
	}

	public void setAbcDocumentId(String abcDocumentId) {
		this.abcDocumentId = abcDocumentId;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Integer getTagIndex() {
		return this.tagIndex;
	}

	public void setTagIndex(Integer tagIndex) {
		this.tagIndex = tagIndex;
	}

	public String getApiSnapshotId() {
		return this.apiSnapshotId;
	}

	public void setApiSnapshotId(String apiSnapshotId) {
		this.apiSnapshotId = apiSnapshotId;
	}

	public String getResultMapping() {
		return this.resultMapping;
	}

	public void setResultMapping(String resultMapping) {
		this.resultMapping = resultMapping;
	}

	public String getRequestDemo() {
		return this.requestDemo;
	}

	public void setRequestDemo(String requestDemo) {
		this.requestDemo = requestDemo;
	}

	public List<ParameterDoc> getParameterList() {
		return this.parameterList;
	}

	public void setParameterList(List<ParameterDoc> parameterList) {
		this.parameterList = parameterList;
	}

	public List<ErrorCode> getErrorCodeList() {
		return this.errorCodeList;
	}

	public void setErrorCodeList(List<ErrorCode> errorCodeList) {
		this.errorCodeList = errorCodeList;
	}

	public List<ResponseDemo> getResponseDemoList() {
		return this.responseDemoList;
	}

	public void setResponseDemoList(List<ResponseDemo> responseDemoList) {
		this.responseDemoList = responseDemoList;
	}

	public static class ParameterDoc {

		private String tagName;

		private Boolean required;

		private String index;

		private String example;

		private String description;

		private String type;

		private String visibility;

		private String tagPosition;

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public String getIndex() {
			return this.index;
		}

		public void setIndex(String index) {
			this.index = index;
		}

		public String getExample() {
			return this.example;
		}

		public void setExample(String example) {
			this.example = example;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVisibility() {
			return this.visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

		public String getTagPosition() {
			return this.tagPosition;
		}

		public void setTagPosition(String tagPosition) {
			this.tagPosition = tagPosition;
		}
	}

	public static class ErrorCode {

		private Integer httpStatusCode;

		private String errorCode;

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

	public static class ResponseDemo {

		private String type;

		private String example;

		private String errorExample;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getExample() {
			return this.example;
		}

		public void setExample(String example) {
			this.example = example;
		}

		public String getErrorExample() {
			return this.errorExample;
		}

		public void setErrorExample(String errorExample) {
			this.errorExample = errorExample;
		}
	}

	@Override
	public GetApiDocNewResponse getInstance(UnmarshallerContext context) {
		return	GetApiDocNewResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.acs.transform.v20150101.GetApiNewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApiNewResponse extends AcsResponse {

	private String name;

	private String status;

	private String product;

	private String version;

	private String visibility;

	private String controlPolicy;

	private String resultMapping;

	private List<Parameter> parameters;

	private ErrorMapping errorMapping;

	private IsvProtocol isvProtocol;

	private IspProtocol ispProtocol;

	private FlowControl flowControl;

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

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getControlPolicy() {
		return this.controlPolicy;
	}

	public void setControlPolicy(String controlPolicy) {
		this.controlPolicy = controlPolicy;
	}

	public String getResultMapping() {
		return this.resultMapping;
	}

	public void setResultMapping(String resultMapping) {
		this.resultMapping = resultMapping;
	}

	public List<Parameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public ErrorMapping getErrorMapping() {
		return this.errorMapping;
	}

	public void setErrorMapping(ErrorMapping errorMapping) {
		this.errorMapping = errorMapping;
	}

	public IsvProtocol getIsvProtocol() {
		return this.isvProtocol;
	}

	public void setIsvProtocol(IsvProtocol isvProtocol) {
		this.isvProtocol = isvProtocol;
	}

	public IspProtocol getIspProtocol() {
		return this.ispProtocol;
	}

	public void setIspProtocol(IspProtocol ispProtocol) {
		this.ispProtocol = ispProtocol;
	}

	public FlowControl getFlowControl() {
		return this.flowControl;
	}

	public void setFlowControl(FlowControl flowControl) {
		this.flowControl = flowControl;
	}

	public static class Parameter {

		private String name;

		private String tagName;

		private String tagPosition;

		private String type;

		private String required;

		private String _default;

		private String value;

		private String minValue;

		private String maxValue;

		private _Switch _switch;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTagName() {
			return this.tagName;
		}

		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		public String getTagPosition() {
			return this.tagPosition;
		}

		public void setTagPosition(String tagPosition) {
			this.tagPosition = tagPosition;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRequired() {
			return this.required;
		}

		public void setRequired(String required) {
			this.required = required;
		}

		public String get_Default() {
			return this._default;
		}

		public void set_Default(String _default) {
			this._default = _default;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getMinValue() {
			return this.minValue;
		}

		public void setMinValue(String minValue) {
			this.minValue = minValue;
		}

		public String getMaxValue() {
			return this.maxValue;
		}

		public void setMaxValue(String maxValue) {
			this.maxValue = maxValue;
		}

		public _Switch get_Switch() {
			return this._switch;
		}

		public void set_Switch(_Switch _switch) {
			this._switch = _switch;
		}

		public static class _Switch {

			private String _default;

			private List<_Case> cases;

			public String get_Default() {
				return this._default;
			}

			public void set_Default(String _default) {
				this._default = _default;
			}

			public List<_Case> getCases() {
				return this.cases;
			}

			public void setCases(List<_Case> cases) {
				this.cases = cases;
			}

			public static class _Case {

				private String value;

				private String tagValue;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getTagValue() {
					return this.tagValue;
				}

				public void setTagValue(String tagValue) {
					this.tagValue = tagValue;
				}
			}
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
		}

		public static class UnknownError {

			private String errorCode;

			private String httpCode;

			private String errorMessage;

			private String type;

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
		}
	}

	public static class IsvProtocol {

		private String protocol;

		private String method;

		private String pattern;

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		/**
		 * @deprecated use getBizProtocol instead of this.
		 */
		@Deprecated
		public String getProtocol() {
			return this.protocol;
		}

		/**
		 * @deprecated use setBizProtocol instead of this.
		 */
		@Deprecated
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		/**
		 * @deprecated use getBizMethod instead of this.
		 */
		@Deprecated
		public String getMethod() {
			return this.method;
		}

		/**
		 * @deprecated use setBizMethod instead of this.
		 */
		@Deprecated
		public void setMethod(String method) {
			this.method = method;
		}

		public String getPattern() {
			return this.pattern;
		}

		public void setPattern(String pattern) {
			this.pattern = pattern;
		}
	}

	public static class IspProtocol {

		private String protocol;

		private String _interface;

		private String version;

		private String group;

		private String method;

		private String timeout;

		private String httpHost;

		private String invokeType;

		private String resultType;

		private String httpsValidation;

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		/**
		 * @deprecated use getBizProtocol instead of this.
		 */
		@Deprecated
		public String getProtocol() {
			return this.protocol;
		}

		/**
		 * @deprecated use setBizProtocol instead of this.
		 */
		@Deprecated
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String get_Interface() {
			return this._interface;
		}

		public void set_Interface(String _interface) {
			this._interface = _interface;
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

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		/**
		 * @deprecated use getBizMethod instead of this.
		 */
		@Deprecated
		public String getMethod() {
			return this.method;
		}

		/**
		 * @deprecated use setBizMethod instead of this.
		 */
		@Deprecated
		public void setMethod(String method) {
			this.method = method;
		}

		public String getTimeout() {
			return this.timeout;
		}

		public void setTimeout(String timeout) {
			this.timeout = timeout;
		}

		public String getHttpHost() {
			return this.httpHost;
		}

		public void setHttpHost(String httpHost) {
			this.httpHost = httpHost;
		}

		public String getInvokeType() {
			return this.invokeType;
		}

		public void setInvokeType(String invokeType) {
			this.invokeType = invokeType;
		}

		public String getResultType() {
			return this.resultType;
		}

		public void setResultType(String resultType) {
			this.resultType = resultType;
		}

		public String getHttpsValidation() {
			return this.httpsValidation;
		}

		public void setHttpsValidation(String httpsValidation) {
			this.httpsValidation = httpsValidation;
		}
	}

	public static class FlowControl {

		private String controlUnit;

		private Long apiDefault;

		private Long userDefault;

		public String getControlUnit() {
			return this.controlUnit;
		}

		public void setControlUnit(String controlUnit) {
			this.controlUnit = controlUnit;
		}

		public Long getApiDefault() {
			return this.apiDefault;
		}

		public void setApiDefault(Long apiDefault) {
			this.apiDefault = apiDefault;
		}

		public Long getUserDefault() {
			return this.userDefault;
		}

		public void setUserDefault(Long userDefault) {
			this.userDefault = userDefault;
		}
	}

	@Override
	public GetApiNewResponse getInstance(UnmarshallerContext context) {
		return	GetApiNewResponseUnmarshaller.unmarshall(this, context);
	}
}

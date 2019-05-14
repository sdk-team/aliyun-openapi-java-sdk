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
import com.aliyuncs.acs.transform.v20150101.GetApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApiResponse extends AcsResponse {

	private String name;

	private String aliasName;

	private String status;

	private String product;

	private String version;

	private String visibility;

	private String controlPolicy;

	private String authType;

	private String gatedLaunch;

	private String gatedLaunchPolicy;

	private String showJsonItemName;

	private String parameterType;

	private String keepClientResourceOwnerId;

	private String responseLog;

	private String roaRequestBodyLog;

	private String isolationType;

	private String resultMapping;

	private String parameters;

	private IsvProtocol isvProtocol;

	private IspProtocol ispProtocol;

	private ErrorMapping errorMapping;

	private FlowControl flowControl;

	private ApiSpec apiSpec;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
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

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getGatedLaunch() {
		return this.gatedLaunch;
	}

	public void setGatedLaunch(String gatedLaunch) {
		this.gatedLaunch = gatedLaunch;
	}

	public String getGatedLaunchPolicy() {
		return this.gatedLaunchPolicy;
	}

	public void setGatedLaunchPolicy(String gatedLaunchPolicy) {
		this.gatedLaunchPolicy = gatedLaunchPolicy;
	}

	public String getShowJsonItemName() {
		return this.showJsonItemName;
	}

	public void setShowJsonItemName(String showJsonItemName) {
		this.showJsonItemName = showJsonItemName;
	}

	public String getParameterType() {
		return this.parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}

	public String getKeepClientResourceOwnerId() {
		return this.keepClientResourceOwnerId;
	}

	public void setKeepClientResourceOwnerId(String keepClientResourceOwnerId) {
		this.keepClientResourceOwnerId = keepClientResourceOwnerId;
	}

	public String getResponseLog() {
		return this.responseLog;
	}

	public void setResponseLog(String responseLog) {
		this.responseLog = responseLog;
	}

	public String getRoaRequestBodyLog() {
		return this.roaRequestBodyLog;
	}

	public void setRoaRequestBodyLog(String roaRequestBodyLog) {
		this.roaRequestBodyLog = roaRequestBodyLog;
	}

	public String getIsolationType() {
		return this.isolationType;
	}

	public void setIsolationType(String isolationType) {
		this.isolationType = isolationType;
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

	public ErrorMapping getErrorMapping() {
		return this.errorMapping;
	}

	public void setErrorMapping(ErrorMapping errorMapping) {
		this.errorMapping = errorMapping;
	}

	public FlowControl getFlowControl() {
		return this.flowControl;
	}

	public void setFlowControl(FlowControl flowControl) {
		this.flowControl = flowControl;
	}

	public ApiSpec getApiSpec() {
		return this.apiSpec;
	}

	public void setApiSpec(ApiSpec apiSpec) {
		this.apiSpec = apiSpec;
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

		private String sign;

		private String signPolicy;

		private String signKeyName;

		private String retries;

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

		public String getSign() {
			return this.sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public String getSignPolicy() {
			return this.signPolicy;
		}

		public void setSignPolicy(String signPolicy) {
			this.signPolicy = signPolicy;
		}

		public String getSignKeyName() {
			return this.signKeyName;
		}

		public void setSignKeyName(String signKeyName) {
			this.signKeyName = signKeyName;
		}

		public String getRetries() {
			return this.retries;
		}

		public void setRetries(String retries) {
			this.retries = retries;
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

	public static class FlowControl {

		private String controlUnit;

		private Long apiDefault;

		private Long userDefault;

		private Long special;

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

		public Long getSpecial() {
			return this.special;
		}

		public void setSpecial(Long special) {
			this.special = special;
		}
	}

	public static class ApiSpec {

		private String apiSpecVisibility;

		private String apiSpecNamespace;

		private String resourceType;

		private Boolean apiDeprecated;

		private String apiReplacement;

		private List<SecondaryResourceTypeAssociation> secondaryResourceTypeAssociations;

		private List<Tag> tags;

		private PrimaryResourceTypeAssociation primaryResourceTypeAssociation;

		private DynamicProperties dynamicProperties;

		public String getApiSpecVisibility() {
			return this.apiSpecVisibility;
		}

		public void setApiSpecVisibility(String apiSpecVisibility) {
			this.apiSpecVisibility = apiSpecVisibility;
		}

		public String getApiSpecNamespace() {
			return this.apiSpecNamespace;
		}

		public void setApiSpecNamespace(String apiSpecNamespace) {
			this.apiSpecNamespace = apiSpecNamespace;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Boolean getApiDeprecated() {
			return this.apiDeprecated;
		}

		public void setApiDeprecated(Boolean apiDeprecated) {
			this.apiDeprecated = apiDeprecated;
		}

		public String getApiReplacement() {
			return this.apiReplacement;
		}

		public void setApiReplacement(String apiReplacement) {
			this.apiReplacement = apiReplacement;
		}

		public List<SecondaryResourceTypeAssociation> getSecondaryResourceTypeAssociations() {
			return this.secondaryResourceTypeAssociations;
		}

		public void setSecondaryResourceTypeAssociations(List<SecondaryResourceTypeAssociation> secondaryResourceTypeAssociations) {
			this.secondaryResourceTypeAssociations = secondaryResourceTypeAssociations;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public PrimaryResourceTypeAssociation getPrimaryResourceTypeAssociation() {
			return this.primaryResourceTypeAssociation;
		}

		public void setPrimaryResourceTypeAssociation(PrimaryResourceTypeAssociation primaryResourceTypeAssociation) {
			this.primaryResourceTypeAssociation = primaryResourceTypeAssociation;
		}

		public DynamicProperties getDynamicProperties() {
			return this.dynamicProperties;
		}

		public void setDynamicProperties(DynamicProperties dynamicProperties) {
			this.dynamicProperties = dynamicProperties;
		}

		public static class SecondaryResourceTypeAssociation {

			private String operation;

			private List<ResourceTypeCode> resourceTypeCodes;

			public String getOperation() {
				return this.operation;
			}

			public void setOperation(String operation) {
				this.operation = operation;
			}

			public List<ResourceTypeCode> getResourceTypeCodes() {
				return this.resourceTypeCodes;
			}

			public void setResourceTypeCodes(List<ResourceTypeCode> resourceTypeCodes) {
				this.resourceTypeCodes = resourceTypeCodes;
			}

			public static class ResourceTypeCode {

				private String code;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}
			}
		}

		public static class Tag {

			private String tag;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}
		}

		public static class PrimaryResourceTypeAssociation {

			private String associationType;

			private String operation;

			private List<ResourceTypeCode2> resourceTypeCodes1;

			public String getAssociationType() {
				return this.associationType;
			}

			public void setAssociationType(String associationType) {
				this.associationType = associationType;
			}

			public String getOperation() {
				return this.operation;
			}

			public void setOperation(String operation) {
				this.operation = operation;
			}

			public List<ResourceTypeCode2> getResourceTypeCodes1() {
				return this.resourceTypeCodes1;
			}

			public void setResourceTypeCodes1(List<ResourceTypeCode2> resourceTypeCodes1) {
				this.resourceTypeCodes1 = resourceTypeCodes1;
			}

			public static class ResourceTypeCode2 {

				private String code;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}
			}
		}

		public static class DynamicProperties {

			private Integer apiTimeout;

			private Integer clientTimeout;

			private String availability;

			private AsyncPolicy asyncPolicy;

			private RetryPolicy retryPolicy;

			private IdempotentPolicy idempotentPolicy;

			public Integer getApiTimeout() {
				return this.apiTimeout;
			}

			public void setApiTimeout(Integer apiTimeout) {
				this.apiTimeout = apiTimeout;
			}

			public Integer getClientTimeout() {
				return this.clientTimeout;
			}

			public void setClientTimeout(Integer clientTimeout) {
				this.clientTimeout = clientTimeout;
			}

			public String getAvailability() {
				return this.availability;
			}

			public void setAvailability(String availability) {
				this.availability = availability;
			}

			public AsyncPolicy getAsyncPolicy() {
				return this.asyncPolicy;
			}

			public void setAsyncPolicy(AsyncPolicy asyncPolicy) {
				this.asyncPolicy = asyncPolicy;
			}

			public RetryPolicy getRetryPolicy() {
				return this.retryPolicy;
			}

			public void setRetryPolicy(RetryPolicy retryPolicy) {
				this.retryPolicy = retryPolicy;
			}

			public IdempotentPolicy getIdempotentPolicy() {
				return this.idempotentPolicy;
			}

			public void setIdempotentPolicy(IdempotentPolicy idempotentPolicy) {
				this.idempotentPolicy = idempotentPolicy;
			}

			public static class AsyncPolicy {

				private Boolean async;

				private String responseTaskIdField;

				private String pollingApi;

				private String pollingTaskIdField;

				public Boolean getAsync() {
					return this.async;
				}

				public void setAsync(Boolean async) {
					this.async = async;
				}

				public String getResponseTaskIdField() {
					return this.responseTaskIdField;
				}

				public void setResponseTaskIdField(String responseTaskIdField) {
					this.responseTaskIdField = responseTaskIdField;
				}

				public String getPollingApi() {
					return this.pollingApi;
				}

				public void setPollingApi(String pollingApi) {
					this.pollingApi = pollingApi;
				}

				public String getPollingTaskIdField() {
					return this.pollingTaskIdField;
				}

				public void setPollingTaskIdField(String pollingTaskIdField) {
					this.pollingTaskIdField = pollingTaskIdField;
				}
			}

			public static class RetryPolicy {

				private Boolean retryable;

				public Boolean getRetryable() {
					return this.retryable;
				}

				public void setRetryable(Boolean retryable) {
					this.retryable = retryable;
				}
			}

			public static class IdempotentPolicy {

				private Boolean idempotent;

				private String idempotentField;

				public Boolean getIdempotent() {
					return this.idempotent;
				}

				public void setIdempotent(Boolean idempotent) {
					this.idempotent = idempotent;
				}

				public String getIdempotentField() {
					return this.idempotentField;
				}

				public void setIdempotentField(String idempotentField) {
					this.idempotentField = idempotentField;
				}
			}
		}
	}

	@Override
	public GetApiResponse getInstance(UnmarshallerContext context) {
		return	GetApiResponseUnmarshaller.unmarshall(this, context);
	}
}

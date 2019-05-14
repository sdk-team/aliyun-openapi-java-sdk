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

package com.aliyuncs.acs.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.acs.model.v20150101.GetApiResponse;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.DynamicProperties;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.DynamicProperties.AsyncPolicy;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.DynamicProperties.IdempotentPolicy;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.DynamicProperties.RetryPolicy;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.PrimaryResourceTypeAssociation;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.PrimaryResourceTypeAssociation.ResourceTypeCode2;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.SecondaryResourceTypeAssociation;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.SecondaryResourceTypeAssociation.ResourceTypeCode;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ApiSpec.Tag;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.ErrorMapping.UnknownError;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.FlowControl;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.IspProtocol;
import com.aliyuncs.acs.model.v20150101.GetApiResponse.IsvProtocol;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiResponseUnmarshaller {

	public static GetApiResponse unmarshall(GetApiResponse getApiResponse, UnmarshallerContext context) {
		
		getApiResponse.setName(context.stringValue("GetApiResponse.name"));
		getApiResponse.setAliasName(context.stringValue("GetApiResponse.aliasName"));
		getApiResponse.setStatus(context.stringValue("GetApiResponse.status"));
		getApiResponse.setProduct(context.stringValue("GetApiResponse.product"));
		getApiResponse.setVersion(context.stringValue("GetApiResponse.version"));
		getApiResponse.setVisibility(context.stringValue("GetApiResponse.visibility"));
		getApiResponse.setControlPolicy(context.stringValue("GetApiResponse.controlPolicy"));
		getApiResponse.setAuthType(context.stringValue("GetApiResponse.authType"));
		getApiResponse.setGatedLaunch(context.stringValue("GetApiResponse.gatedLaunch"));
		getApiResponse.setGatedLaunchPolicy(context.stringValue("GetApiResponse.gatedLaunchPolicy"));
		getApiResponse.setShowJsonItemName(context.stringValue("GetApiResponse.showJsonItemName"));
		getApiResponse.setParameterType(context.stringValue("GetApiResponse.parameterType"));
		getApiResponse.setKeepClientResourceOwnerId(context.stringValue("GetApiResponse.keepClientResourceOwnerId"));
		getApiResponse.setResponseLog(context.stringValue("GetApiResponse.responseLog"));
		getApiResponse.setRoaRequestBodyLog(context.stringValue("GetApiResponse.roaRequestBodyLog"));
		getApiResponse.setIsolationType(context.stringValue("GetApiResponse.isolationType"));
		getApiResponse.setResultMapping(context.stringValue("GetApiResponse.ResultMapping"));
		getApiResponse.setParameters(context.stringValue("GetApiResponse.Parameters"));

		IsvProtocol isvProtocol = new IsvProtocol();
		isvProtocol.setProtocol(context.stringValue("GetApiResponse.IsvProtocol.protocol"));
		isvProtocol.setMethod(context.stringValue("GetApiResponse.IsvProtocol.method"));
		isvProtocol.setPattern(context.stringValue("GetApiResponse.IsvProtocol.pattern"));
		getApiResponse.setIsvProtocol(isvProtocol);

		IspProtocol ispProtocol = new IspProtocol();
		ispProtocol.setProtocol(context.stringValue("GetApiResponse.IspProtocol.protocol"));
		ispProtocol.set_Interface(context.stringValue("GetApiResponse.IspProtocol.interface"));
		ispProtocol.setVersion(context.stringValue("GetApiResponse.IspProtocol.version"));
		ispProtocol.setGroup(context.stringValue("GetApiResponse.IspProtocol.group"));
		ispProtocol.setMethod(context.stringValue("GetApiResponse.IspProtocol.method"));
		ispProtocol.setTimeout(context.stringValue("GetApiResponse.IspProtocol.timeout"));
		ispProtocol.setHttpHost(context.stringValue("GetApiResponse.IspProtocol.httpHost"));
		ispProtocol.setInvokeType(context.stringValue("GetApiResponse.IspProtocol.invokeType"));
		ispProtocol.setResultType(context.stringValue("GetApiResponse.IspProtocol.resultType"));
		ispProtocol.setHttpsValidation(context.stringValue("GetApiResponse.IspProtocol.httpsValidation"));
		ispProtocol.setSign(context.stringValue("GetApiResponse.IspProtocol.sign"));
		ispProtocol.setSignPolicy(context.stringValue("GetApiResponse.IspProtocol.signPolicy"));
		ispProtocol.setSignKeyName(context.stringValue("GetApiResponse.IspProtocol.signKeyName"));
		ispProtocol.setRetries(context.stringValue("GetApiResponse.IspProtocol.retries"));
		getApiResponse.setIspProtocol(ispProtocol);

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetApiResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setCode(context.stringValue("GetApiResponse.ErrorMapping.UnknownError.code"));
		unknownError.setErrorCode(context.stringValue("GetApiResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetApiResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetApiResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetApiResponse.ErrorMapping.UnknownError.type"));
		unknownError.setExtendedErrorCode(context.stringValue("GetApiResponse.ErrorMapping.UnknownError.extendedErrorCode"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetApiResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetApiResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetApiResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetApiResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetApiResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetApiResponse.ErrorMapping.ErrorCodes["+ i +"].type"));
			errorCode.setExtendedErrorCode(context.stringValue("GetApiResponse.ErrorMapping.ErrorCodes["+ i +"].extendedErrorCode"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getApiResponse.setErrorMapping(errorMapping);

		FlowControl flowControl = new FlowControl();
		flowControl.setControlUnit(context.stringValue("GetApiResponse.FlowControl.controlUnit"));
		flowControl.setApiDefault(context.longValue("GetApiResponse.FlowControl.apiDefault"));
		flowControl.setUserDefault(context.longValue("GetApiResponse.FlowControl.userDefault"));
		flowControl.setSpecial(context.longValue("GetApiResponse.FlowControl.special"));
		getApiResponse.setFlowControl(flowControl);

		ApiSpec apiSpec = new ApiSpec();
		apiSpec.setApiSpecVisibility(context.stringValue("GetApiResponse.ApiSpec.apiSpecVisibility"));
		apiSpec.setApiSpecNamespace(context.stringValue("GetApiResponse.ApiSpec.apiSpecNamespace"));
		apiSpec.setResourceType(context.stringValue("GetApiResponse.ApiSpec.resourceType"));
		apiSpec.setApiDeprecated(context.booleanValue("GetApiResponse.ApiSpec.apiDeprecated"));
		apiSpec.setApiReplacement(context.stringValue("GetApiResponse.ApiSpec.apiReplacement"));

		PrimaryResourceTypeAssociation primaryResourceTypeAssociation = new PrimaryResourceTypeAssociation();
		primaryResourceTypeAssociation.setAssociationType(context.stringValue("GetApiResponse.ApiSpec.PrimaryResourceTypeAssociation.associationType"));
		primaryResourceTypeAssociation.setOperation(context.stringValue("GetApiResponse.ApiSpec.PrimaryResourceTypeAssociation.operation"));

		List<ResourceTypeCode2> resourceTypeCodes1 = new ArrayList<ResourceTypeCode2>();
		for (int i = 0; i < context.lengthValue("GetApiResponse.ApiSpec.PrimaryResourceTypeAssociation.ResourceTypeCodes.Length"); i++) {
			ResourceTypeCode2 resourceTypeCode2 = new ResourceTypeCode2();
			resourceTypeCode2.setCode(context.stringValue("GetApiResponse.ApiSpec.PrimaryResourceTypeAssociation.ResourceTypeCodes["+ i +"].code"));

			resourceTypeCodes1.add(resourceTypeCode2);
		}
		primaryResourceTypeAssociation.setResourceTypeCodes1(resourceTypeCodes1);
		apiSpec.setPrimaryResourceTypeAssociation(primaryResourceTypeAssociation);

		DynamicProperties dynamicProperties = new DynamicProperties();
		dynamicProperties.setApiTimeout(context.integerValue("GetApiResponse.ApiSpec.DynamicProperties.apiTimeout"));
		dynamicProperties.setClientTimeout(context.integerValue("GetApiResponse.ApiSpec.DynamicProperties.clientTimeout"));
		dynamicProperties.setAvailability(context.stringValue("GetApiResponse.ApiSpec.DynamicProperties.availability"));

		AsyncPolicy asyncPolicy = new AsyncPolicy();
		asyncPolicy.setAsync(context.booleanValue("GetApiResponse.ApiSpec.DynamicProperties.AsyncPolicy.async"));
		asyncPolicy.setResponseTaskIdField(context.stringValue("GetApiResponse.ApiSpec.DynamicProperties.AsyncPolicy.responseTaskIdField"));
		asyncPolicy.setPollingApi(context.stringValue("GetApiResponse.ApiSpec.DynamicProperties.AsyncPolicy.pollingApi"));
		asyncPolicy.setPollingTaskIdField(context.stringValue("GetApiResponse.ApiSpec.DynamicProperties.AsyncPolicy.pollingTaskIdField"));
		dynamicProperties.setAsyncPolicy(asyncPolicy);

		RetryPolicy retryPolicy = new RetryPolicy();
		retryPolicy.setRetryable(context.booleanValue("GetApiResponse.ApiSpec.DynamicProperties.RetryPolicy.retryable"));
		dynamicProperties.setRetryPolicy(retryPolicy);

		IdempotentPolicy idempotentPolicy = new IdempotentPolicy();
		idempotentPolicy.setIdempotent(context.booleanValue("GetApiResponse.ApiSpec.DynamicProperties.IdempotentPolicy.idempotent"));
		idempotentPolicy.setIdempotentField(context.stringValue("GetApiResponse.ApiSpec.DynamicProperties.IdempotentPolicy.idempotentField"));
		dynamicProperties.setIdempotentPolicy(idempotentPolicy);
		apiSpec.setDynamicProperties(dynamicProperties);

		List<SecondaryResourceTypeAssociation> secondaryResourceTypeAssociations = new ArrayList<SecondaryResourceTypeAssociation>();
		for (int i = 0; i < context.lengthValue("GetApiResponse.ApiSpec.SecondaryResourceTypeAssociations.Length"); i++) {
			SecondaryResourceTypeAssociation secondaryResourceTypeAssociation = new SecondaryResourceTypeAssociation();
			secondaryResourceTypeAssociation.setOperation(context.stringValue("GetApiResponse.ApiSpec.SecondaryResourceTypeAssociations["+ i +"].operation"));

			List<ResourceTypeCode> resourceTypeCodes = new ArrayList<ResourceTypeCode>();
			for (int j = 0; j < context.lengthValue("GetApiResponse.ApiSpec.SecondaryResourceTypeAssociations["+ i +"].ResourceTypeCodes.Length"); j++) {
				ResourceTypeCode resourceTypeCode = new ResourceTypeCode();
				resourceTypeCode.setCode(context.stringValue("GetApiResponse.ApiSpec.SecondaryResourceTypeAssociations["+ i +"].ResourceTypeCodes["+ j +"].code"));

				resourceTypeCodes.add(resourceTypeCode);
			}
			secondaryResourceTypeAssociation.setResourceTypeCodes(resourceTypeCodes);

			secondaryResourceTypeAssociations.add(secondaryResourceTypeAssociation);
		}
		apiSpec.setSecondaryResourceTypeAssociations(secondaryResourceTypeAssociations);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("GetApiResponse.ApiSpec.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTag(context.stringValue("GetApiResponse.ApiSpec.Tags["+ i +"].tag"));

			tags.add(tag);
		}
		apiSpec.setTags(tags);
		getApiResponse.setApiSpec(apiSpec);
	 
	 	return getApiResponse;
	}
}
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

import com.aliyuncs.acs.model.v20150101.GetApiWithOfflineResponse;
import com.aliyuncs.acs.model.v20150101.GetApiWithOfflineResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetApiWithOfflineResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetApiWithOfflineResponse.ErrorMapping.UnknownError;
import com.aliyuncs.acs.model.v20150101.GetApiWithOfflineResponse.FlowControl;
import com.aliyuncs.acs.model.v20150101.GetApiWithOfflineResponse.IspProtocol;
import com.aliyuncs.acs.model.v20150101.GetApiWithOfflineResponse.IsvProtocol;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiWithOfflineResponseUnmarshaller {

	public static GetApiWithOfflineResponse unmarshall(GetApiWithOfflineResponse getApiWithOfflineResponse, UnmarshallerContext context) {
		
		getApiWithOfflineResponse.setName(context.stringValue("GetApiWithOfflineResponse.name"));
		getApiWithOfflineResponse.setAliasName(context.stringValue("GetApiWithOfflineResponse.aliasName"));
		getApiWithOfflineResponse.setStatus(context.stringValue("GetApiWithOfflineResponse.status"));
		getApiWithOfflineResponse.setProduct(context.stringValue("GetApiWithOfflineResponse.product"));
		getApiWithOfflineResponse.setVersion(context.stringValue("GetApiWithOfflineResponse.version"));
		getApiWithOfflineResponse.setVisibility(context.stringValue("GetApiWithOfflineResponse.visibility"));
		getApiWithOfflineResponse.setControlPolicy(context.stringValue("GetApiWithOfflineResponse.controlPolicy"));
		getApiWithOfflineResponse.setAuthType(context.stringValue("GetApiWithOfflineResponse.authType"));
		getApiWithOfflineResponse.setGatedLaunch(context.stringValue("GetApiWithOfflineResponse.gatedLaunch"));
		getApiWithOfflineResponse.setGatedLaunchPolicy(context.stringValue("GetApiWithOfflineResponse.gatedLaunchPolicy"));
		getApiWithOfflineResponse.setShowJsonItemName(context.stringValue("GetApiWithOfflineResponse.showJsonItemName"));
		getApiWithOfflineResponse.setParameterType(context.stringValue("GetApiWithOfflineResponse.parameterType"));
		getApiWithOfflineResponse.setKeepClientResourceOwnerId(context.stringValue("GetApiWithOfflineResponse.keepClientResourceOwnerId"));
		getApiWithOfflineResponse.setResponseLog(context.stringValue("GetApiWithOfflineResponse.responseLog"));
		getApiWithOfflineResponse.setRoaRequestBodyLog(context.stringValue("GetApiWithOfflineResponse.roaRequestBodyLog"));
		getApiWithOfflineResponse.setResultMapping(context.stringValue("GetApiWithOfflineResponse.ResultMapping"));
		getApiWithOfflineResponse.setParameters(context.stringValue("GetApiWithOfflineResponse.Parameters"));

		IsvProtocol isvProtocol = new IsvProtocol();
		isvProtocol.setProtocol(context.stringValue("GetApiWithOfflineResponse.IsvProtocol.protocol"));
		isvProtocol.setMethod(context.stringValue("GetApiWithOfflineResponse.IsvProtocol.method"));
		isvProtocol.setPattern(context.stringValue("GetApiWithOfflineResponse.IsvProtocol.pattern"));
		getApiWithOfflineResponse.setIsvProtocol(isvProtocol);

		IspProtocol ispProtocol = new IspProtocol();
		ispProtocol.setProtocol(context.stringValue("GetApiWithOfflineResponse.IspProtocol.protocol"));
		ispProtocol.set_Interface(context.stringValue("GetApiWithOfflineResponse.IspProtocol.interface"));
		ispProtocol.setVersion(context.stringValue("GetApiWithOfflineResponse.IspProtocol.version"));
		ispProtocol.setGroup(context.stringValue("GetApiWithOfflineResponse.IspProtocol.group"));
		ispProtocol.setMethod(context.stringValue("GetApiWithOfflineResponse.IspProtocol.method"));
		ispProtocol.setTimeout(context.stringValue("GetApiWithOfflineResponse.IspProtocol.timeout"));
		ispProtocol.setHttpHost(context.stringValue("GetApiWithOfflineResponse.IspProtocol.httpHost"));
		ispProtocol.setInvokeType(context.stringValue("GetApiWithOfflineResponse.IspProtocol.invokeType"));
		ispProtocol.setResultType(context.stringValue("GetApiWithOfflineResponse.IspProtocol.resultType"));
		ispProtocol.setHttpsValidation(context.stringValue("GetApiWithOfflineResponse.IspProtocol.httpsValidation"));
		ispProtocol.setSign(context.stringValue("GetApiWithOfflineResponse.IspProtocol.sign"));
		ispProtocol.setSignPolicy(context.stringValue("GetApiWithOfflineResponse.IspProtocol.signPolicy"));
		ispProtocol.setSignKeyName(context.stringValue("GetApiWithOfflineResponse.IspProtocol.signKeyName"));
		ispProtocol.setRetries(context.stringValue("GetApiWithOfflineResponse.IspProtocol.retries"));
		getApiWithOfflineResponse.setIspProtocol(ispProtocol);

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setCode(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.UnknownError.code"));
		unknownError.setErrorCode(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.UnknownError.type"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetApiWithOfflineResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetApiWithOfflineResponse.ErrorMapping.ErrorCodes["+ i +"].type"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getApiWithOfflineResponse.setErrorMapping(errorMapping);

		FlowControl flowControl = new FlowControl();
		flowControl.setControlUnit(context.stringValue("GetApiWithOfflineResponse.FlowControl.controlUnit"));
		flowControl.setApiDefault(context.longValue("GetApiWithOfflineResponse.FlowControl.apiDefault"));
		flowControl.setUserDefault(context.longValue("GetApiWithOfflineResponse.FlowControl.userDefault"));
		flowControl.setSpecial(context.longValue("GetApiWithOfflineResponse.FlowControl.special"));
		getApiWithOfflineResponse.setFlowControl(flowControl);
	 
	 	return getApiWithOfflineResponse;
	}
}
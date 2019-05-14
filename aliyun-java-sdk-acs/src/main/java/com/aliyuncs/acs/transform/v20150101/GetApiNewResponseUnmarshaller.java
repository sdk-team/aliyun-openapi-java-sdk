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

import com.aliyuncs.acs.model.v20150101.GetApiNewResponse;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.ErrorMapping.UnknownError;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.FlowControl;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.IspProtocol;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.IsvProtocol;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.Parameter;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.Parameter._Switch;
import com.aliyuncs.acs.model.v20150101.GetApiNewResponse.Parameter._Switch._Case;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiNewResponseUnmarshaller {

	public static GetApiNewResponse unmarshall(GetApiNewResponse getApiNewResponse, UnmarshallerContext context) {
		
		getApiNewResponse.setName(context.stringValue("GetApiNewResponse.name"));
		getApiNewResponse.setStatus(context.stringValue("GetApiNewResponse.status"));
		getApiNewResponse.setProduct(context.stringValue("GetApiNewResponse.product"));
		getApiNewResponse.setVersion(context.stringValue("GetApiNewResponse.version"));
		getApiNewResponse.setVisibility(context.stringValue("GetApiNewResponse.visibility"));
		getApiNewResponse.setControlPolicy(context.stringValue("GetApiNewResponse.controlPolicy"));
		getApiNewResponse.setResultMapping(context.stringValue("GetApiNewResponse.ResultMapping"));

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetApiNewResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setErrorCode(context.stringValue("GetApiNewResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetApiNewResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetApiNewResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetApiNewResponse.ErrorMapping.UnknownError.type"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetApiNewResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetApiNewResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetApiNewResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetApiNewResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetApiNewResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetApiNewResponse.ErrorMapping.ErrorCodes["+ i +"].type"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getApiNewResponse.setErrorMapping(errorMapping);

		IsvProtocol isvProtocol = new IsvProtocol();
		isvProtocol.setProtocol(context.stringValue("GetApiNewResponse.IsvProtocol.protocol"));
		isvProtocol.setMethod(context.stringValue("GetApiNewResponse.IsvProtocol.method"));
		isvProtocol.setPattern(context.stringValue("GetApiNewResponse.IsvProtocol.pattern"));
		getApiNewResponse.setIsvProtocol(isvProtocol);

		IspProtocol ispProtocol = new IspProtocol();
		ispProtocol.setProtocol(context.stringValue("GetApiNewResponse.IspProtocol.protocol"));
		ispProtocol.set_Interface(context.stringValue("GetApiNewResponse.IspProtocol.interface"));
		ispProtocol.setVersion(context.stringValue("GetApiNewResponse.IspProtocol.version"));
		ispProtocol.setGroup(context.stringValue("GetApiNewResponse.IspProtocol.group"));
		ispProtocol.setMethod(context.stringValue("GetApiNewResponse.IspProtocol.method"));
		ispProtocol.setTimeout(context.stringValue("GetApiNewResponse.IspProtocol.timeout"));
		ispProtocol.setHttpHost(context.stringValue("GetApiNewResponse.IspProtocol.httpHost"));
		ispProtocol.setInvokeType(context.stringValue("GetApiNewResponse.IspProtocol.invokeType"));
		ispProtocol.setResultType(context.stringValue("GetApiNewResponse.IspProtocol.resultType"));
		ispProtocol.setHttpsValidation(context.stringValue("GetApiNewResponse.IspProtocol.httpsValidation"));
		getApiNewResponse.setIspProtocol(ispProtocol);

		FlowControl flowControl = new FlowControl();
		flowControl.setControlUnit(context.stringValue("GetApiNewResponse.FlowControl.controlUnit"));
		flowControl.setApiDefault(context.longValue("GetApiNewResponse.FlowControl.apiDefault"));
		flowControl.setUserDefault(context.longValue("GetApiNewResponse.FlowControl.userDefault"));
		getApiNewResponse.setFlowControl(flowControl);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < context.lengthValue("GetApiNewResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setName(context.stringValue("GetApiNewResponse.Parameters["+ i +"].name"));
			parameter.setTagName(context.stringValue("GetApiNewResponse.Parameters["+ i +"].tagName"));
			parameter.setTagPosition(context.stringValue("GetApiNewResponse.Parameters["+ i +"].tagPosition"));
			parameter.setType(context.stringValue("GetApiNewResponse.Parameters["+ i +"].type"));
			parameter.setRequired(context.stringValue("GetApiNewResponse.Parameters["+ i +"].required"));
			parameter.set_Default(context.stringValue("GetApiNewResponse.Parameters["+ i +"].default"));
			parameter.setValue(context.stringValue("GetApiNewResponse.Parameters["+ i +"].value"));
			parameter.setMinValue(context.stringValue("GetApiNewResponse.Parameters["+ i +"].minValue"));
			parameter.setMaxValue(context.stringValue("GetApiNewResponse.Parameters["+ i +"].maxValue"));

			_Switch _switch = new _Switch();
			_switch.set_Default(context.stringValue("GetApiNewResponse.Parameters["+ i +"].Switch.Default"));

			List<_Case> cases = new ArrayList<_Case>();
			for (int j = 0; j < context.lengthValue("GetApiNewResponse.Parameters["+ i +"].Switch.Cases.Length"); j++) {
				_Case _case = new _Case();
				_case.setValue(context.stringValue("GetApiNewResponse.Parameters["+ i +"].Switch.Cases["+ j +"].value"));
				_case.setTagValue(context.stringValue("GetApiNewResponse.Parameters["+ i +"].Switch.Cases["+ j +"].tagValue"));

				cases.add(_case);
			}
			_switch.setCases(cases);
			parameter.set_Switch(_switch);

			parameters.add(parameter);
		}
		getApiNewResponse.setParameters(parameters);
	 
	 	return getApiNewResponse;
	}
}
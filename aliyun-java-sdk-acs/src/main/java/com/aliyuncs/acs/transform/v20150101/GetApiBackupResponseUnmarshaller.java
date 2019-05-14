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

import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.ErrorMapping.UnknownError;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.FlowControl;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.IspProtocol;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.IsvProtocol;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.Parameter;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.Parameter._Switch;
import com.aliyuncs.acs.model.v20150101.GetApiBackupResponse.Parameter._Switch._Case;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiBackupResponseUnmarshaller {

	public static GetApiBackupResponse unmarshall(GetApiBackupResponse getApiBackupResponse, UnmarshallerContext context) {
		
		getApiBackupResponse.setName(context.stringValue("GetApiBackupResponse.name"));
		getApiBackupResponse.setStatus(context.stringValue("GetApiBackupResponse.status"));
		getApiBackupResponse.setProduct(context.stringValue("GetApiBackupResponse.product"));
		getApiBackupResponse.setVersion(context.stringValue("GetApiBackupResponse.version"));
		getApiBackupResponse.setVisibility(context.stringValue("GetApiBackupResponse.visibility"));
		getApiBackupResponse.setControlPolicy(context.stringValue("GetApiBackupResponse.controlPolicy"));
		getApiBackupResponse.setResultMapping(context.stringValue("GetApiBackupResponse.ResultMapping"));

		IsvProtocol isvProtocol = new IsvProtocol();
		isvProtocol.setProtocol(context.stringValue("GetApiBackupResponse.IsvProtocol.protocol"));
		isvProtocol.setMethod(context.stringValue("GetApiBackupResponse.IsvProtocol.method"));
		isvProtocol.setPattern(context.stringValue("GetApiBackupResponse.IsvProtocol.pattern"));
		getApiBackupResponse.setIsvProtocol(isvProtocol);

		IspProtocol ispProtocol = new IspProtocol();
		ispProtocol.setProtocol(context.stringValue("GetApiBackupResponse.IspProtocol.protocol"));
		ispProtocol.set_Interface(context.stringValue("GetApiBackupResponse.IspProtocol.interface"));
		ispProtocol.setVersion(context.stringValue("GetApiBackupResponse.IspProtocol.version"));
		ispProtocol.setGroup(context.stringValue("GetApiBackupResponse.IspProtocol.group"));
		ispProtocol.setMethod(context.stringValue("GetApiBackupResponse.IspProtocol.method"));
		ispProtocol.setTimeout(context.stringValue("GetApiBackupResponse.IspProtocol.timeout"));
		ispProtocol.setHttpHost(context.stringValue("GetApiBackupResponse.IspProtocol.httpHost"));
		ispProtocol.setInvokeType(context.stringValue("GetApiBackupResponse.IspProtocol.invokeType"));
		ispProtocol.setResultType(context.stringValue("GetApiBackupResponse.IspProtocol.resultType"));
		ispProtocol.setHttpsValidation(context.stringValue("GetApiBackupResponse.IspProtocol.httpsValidation"));
		getApiBackupResponse.setIspProtocol(ispProtocol);

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetApiBackupResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setCode(context.stringValue("GetApiBackupResponse.ErrorMapping.UnknownError.code"));
		unknownError.setErrorCode(context.stringValue("GetApiBackupResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetApiBackupResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetApiBackupResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetApiBackupResponse.ErrorMapping.UnknownError.type"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetApiBackupResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetApiBackupResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetApiBackupResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetApiBackupResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetApiBackupResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetApiBackupResponse.ErrorMapping.ErrorCodes["+ i +"].type"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getApiBackupResponse.setErrorMapping(errorMapping);

		FlowControl flowControl = new FlowControl();
		flowControl.setControlUnit(context.stringValue("GetApiBackupResponse.FlowControl.controlUnit"));
		flowControl.setApiDefault(context.longValue("GetApiBackupResponse.FlowControl.apiDefault"));
		flowControl.setUserDefault(context.longValue("GetApiBackupResponse.FlowControl.userDefault"));
		getApiBackupResponse.setFlowControl(flowControl);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < context.lengthValue("GetApiBackupResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setName(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].name"));
			parameter.setTagName(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].tagName"));
			parameter.setTagPosition(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].tagPosition"));
			parameter.setType(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].type"));
			parameter.setRequired(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].required"));
			parameter.set_Default(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].default"));
			parameter.setValue(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].value"));
			parameter.setMinValue(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].minValue"));
			parameter.setMaxValue(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].maxValue"));

			_Switch _switch = new _Switch();
			_switch.set_Default(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].Switch.Default"));

			List<_Case> cases = new ArrayList<_Case>();
			for (int j = 0; j < context.lengthValue("GetApiBackupResponse.Parameters["+ i +"].Switch.Cases.Length"); j++) {
				_Case _case = new _Case();
				_case.setValue(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].Switch.Cases["+ j +"].value"));
				_case.setTagValue(context.stringValue("GetApiBackupResponse.Parameters["+ i +"].Switch.Cases["+ j +"].tagValue"));

				cases.add(_case);
			}
			_switch.setCases(cases);
			parameter.set_Switch(_switch);

			parameters.add(parameter);
		}
		getApiBackupResponse.setParameters(parameters);
	 
	 	return getApiBackupResponse;
	}
}
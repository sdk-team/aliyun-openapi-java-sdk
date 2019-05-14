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

import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.ErrorMapping.UnknownError;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.FlowControl;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.IspProtocol;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.IsvProtocol;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.Parameter;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.Parameter.Parameter2;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchApiResponse.Parameter.Parameter2.Parameter4;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatedLaunchApiResponseUnmarshaller {

	public static GetGatedLaunchApiResponse unmarshall(GetGatedLaunchApiResponse getGatedLaunchApiResponse, UnmarshallerContext context) {
		
		getGatedLaunchApiResponse.setName(context.stringValue("GetGatedLaunchApiResponse.name"));
		getGatedLaunchApiResponse.setStatus(context.stringValue("GetGatedLaunchApiResponse.status"));
		getGatedLaunchApiResponse.setProduct(context.stringValue("GetGatedLaunchApiResponse.product"));
		getGatedLaunchApiResponse.setVersion(context.stringValue("GetGatedLaunchApiResponse.version"));
		getGatedLaunchApiResponse.setVisibility(context.stringValue("GetGatedLaunchApiResponse.visibility"));
		getGatedLaunchApiResponse.setControlPolicy(context.stringValue("GetGatedLaunchApiResponse.controlPolicy"));
		getGatedLaunchApiResponse.setAuthType(context.stringValue("GetGatedLaunchApiResponse.authType"));
		getGatedLaunchApiResponse.setResultMapping(context.stringValue("GetGatedLaunchApiResponse.ResultMapping"));
		getGatedLaunchApiResponse.setGatedLaunch(context.stringValue("GetGatedLaunchApiResponse.gatedLaunch"));
		getGatedLaunchApiResponse.setGatedLaunchPolicy(context.stringValue("GetGatedLaunchApiResponse.gatedLaunchPolicy"));

		IsvProtocol isvProtocol = new IsvProtocol();
		isvProtocol.setProtocol(context.stringValue("GetGatedLaunchApiResponse.IsvProtocol.protocol"));
		isvProtocol.setMethod(context.stringValue("GetGatedLaunchApiResponse.IsvProtocol.method"));
		isvProtocol.setPattern(context.stringValue("GetGatedLaunchApiResponse.IsvProtocol.pattern"));
		getGatedLaunchApiResponse.setIsvProtocol(isvProtocol);

		IspProtocol ispProtocol = new IspProtocol();
		ispProtocol.setProtocol(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.protocol"));
		ispProtocol.set_Interface(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.interface"));
		ispProtocol.setVersion(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.version"));
		ispProtocol.setGroup(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.group"));
		ispProtocol.setMethod(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.method"));
		ispProtocol.setTimeout(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.timeout"));
		ispProtocol.setHttpHost(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.httpHost"));
		ispProtocol.setInvokeType(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.invokeType"));
		ispProtocol.setResultType(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.resultType"));
		ispProtocol.setHttpsValidation(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.httpsValidation"));
		ispProtocol.setSign(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.sign"));
		ispProtocol.setSignPolicy(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.signPolicy"));
		ispProtocol.setSignKeyName(context.stringValue("GetGatedLaunchApiResponse.IspProtocol.signKeyName"));
		getGatedLaunchApiResponse.setIspProtocol(ispProtocol);

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setCode(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.UnknownError.code"));
		unknownError.setErrorCode(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.UnknownError.type"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetGatedLaunchApiResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetGatedLaunchApiResponse.ErrorMapping.ErrorCodes["+ i +"].type"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getGatedLaunchApiResponse.setErrorMapping(errorMapping);

		FlowControl flowControl = new FlowControl();
		flowControl.setControlUnit(context.stringValue("GetGatedLaunchApiResponse.FlowControl.controlUnit"));
		flowControl.setApiDefault(context.longValue("GetGatedLaunchApiResponse.FlowControl.apiDefault"));
		flowControl.setUserDefault(context.longValue("GetGatedLaunchApiResponse.FlowControl.userDefault"));
		flowControl.setSpecial(context.longValue("GetGatedLaunchApiResponse.FlowControl.special"));
		getGatedLaunchApiResponse.setFlowControl(flowControl);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < context.lengthValue("GetGatedLaunchApiResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].name"));
			parameter.setTagName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].tagName"));
			parameter.setTagPosition(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].tagPosition"));
			parameter.setType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].type"));
			parameter.setRequired(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].required"));
			parameter.set_Default(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].default"));
			parameter.setValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].value"));
			parameter.setMinValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].minValue"));
			parameter.setMaxValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].maxValue"));
			parameter.setMaxNumber(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].maxNumber"));
			parameter.setSequence(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].sequence"));
			parameter.setInvokeDataType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].invokeDataType"));
			parameter.setIndexName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].indexName"));
			parameter.setSubType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].subType"));
			parameter.setSubName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].subName"));

			List<Parameter2> parameters1 = new ArrayList<Parameter2>();
			for (int j = 0; j < context.lengthValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters.Length"); j++) {
				Parameter2 parameter2 = new Parameter2();
				parameter2.setName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].name"));
				parameter2.setTagName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].tagName"));
				parameter2.setTagPosition(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].tagPosition"));
				parameter2.setType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].type"));
				parameter2.setRequired(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].required"));
				parameter2.set_Default(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].default"));
				parameter2.setValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].value"));
				parameter2.setMinValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].minValue"));
				parameter2.setMaxValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].maxValue"));
				parameter2.setMaxNumber(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].maxNumber"));
				parameter2.setSequence(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].sequence"));
				parameter2.setInvokeDataType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].invokeDataType"));
				parameter2.setIndexName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].indexName"));
				parameter2.setSubType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].subType"));
				parameter2.setSubName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].subName"));

				List<Parameter4> parameters3 = new ArrayList<Parameter4>();
				for (int k = 0; k < context.lengthValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters.Length"); k++) {
					Parameter4 parameter4 = new Parameter4();
					parameter4.setName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].name"));
					parameter4.setTagName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].tagName"));
					parameter4.setTagPosition(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].tagPosition"));
					parameter4.setType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].type"));
					parameter4.setRequired(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].required"));
					parameter4.set_Default(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].default"));
					parameter4.setValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].value"));
					parameter4.setMinValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].minValue"));
					parameter4.setMaxValue(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].maxValue"));
					parameter4.setMaxNumber(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].maxNumber"));
					parameter4.setSequence(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].sequence"));
					parameter4.setInvokeDataType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].invokeDataType"));
					parameter4.setIndexName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].indexName"));
					parameter4.setSubType(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].subType"));
					parameter4.setSubName(context.stringValue("GetGatedLaunchApiResponse.Parameters["+ i +"].Parameters["+ j +"].Parameters["+ k +"].subName"));

					parameters3.add(parameter4);
				}
				parameter2.setParameters3(parameters3);

				parameters1.add(parameter2);
			}
			parameter.setParameters1(parameters1);

			parameters.add(parameter);
		}
		getGatedLaunchApiResponse.setParameters(parameters);
	 
	 	return getGatedLaunchApiResponse;
	}
}
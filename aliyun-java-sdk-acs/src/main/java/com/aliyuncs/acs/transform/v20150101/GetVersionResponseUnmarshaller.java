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

import com.aliyuncs.acs.model.v20150101.GetVersionResponse;
import com.aliyuncs.acs.model.v20150101.GetVersionResponse.Api;
import com.aliyuncs.acs.model.v20150101.GetVersionResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetVersionResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetVersionResponse.ErrorMapping.UnknownError;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVersionResponseUnmarshaller {

	public static GetVersionResponse unmarshall(GetVersionResponse getVersionResponse, UnmarshallerContext context) {
		
		getVersionResponse.setProduct(context.stringValue("GetVersionResponse.product"));
		getVersionResponse.setName(context.stringValue("GetVersionResponse.name"));
		getVersionResponse.setApiStyle(context.stringValue("GetVersionResponse.apiStyle"));
		getVersionResponse.setIsolationType(context.stringValue("GetVersionResponse.isolationType"));

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetVersionResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setCode(context.stringValue("GetVersionResponse.ErrorMapping.UnknownError.code"));
		unknownError.setErrorCode(context.stringValue("GetVersionResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetVersionResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetVersionResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetVersionResponse.ErrorMapping.UnknownError.type"));
		unknownError.setExtendedErrorCode(context.stringValue("GetVersionResponse.ErrorMapping.UnknownError.extendedErrorCode"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetVersionResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetVersionResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetVersionResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetVersionResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetVersionResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetVersionResponse.ErrorMapping.ErrorCodes["+ i +"].type"));
			errorCode.setExtendedErrorCode(context.stringValue("GetVersionResponse.ErrorMapping.ErrorCodes["+ i +"].extendedErrorCode"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getVersionResponse.setErrorMapping(errorMapping);

		List<Api> apis = new ArrayList<Api>();
		for (int i = 0; i < context.lengthValue("GetVersionResponse.Apis.Length"); i++) {
			Api api = new Api();
			api.setName(context.stringValue("GetVersionResponse.Apis["+ i +"].name"));
			api.setStatus(context.stringValue("GetVersionResponse.Apis["+ i +"].status"));

			apis.add(api);
		}
		getVersionResponse.setApis(apis);
	 
	 	return getVersionResponse;
	}
}
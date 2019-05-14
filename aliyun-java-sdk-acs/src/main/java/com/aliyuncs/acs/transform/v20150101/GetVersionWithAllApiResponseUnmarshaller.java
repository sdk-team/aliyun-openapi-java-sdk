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

import com.aliyuncs.acs.model.v20150101.GetVersionWithAllApiResponse;
import com.aliyuncs.acs.model.v20150101.GetVersionWithAllApiResponse.Api;
import com.aliyuncs.acs.model.v20150101.GetVersionWithAllApiResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetVersionWithAllApiResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetVersionWithAllApiResponse.ErrorMapping.UnknownError;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVersionWithAllApiResponseUnmarshaller {

	public static GetVersionWithAllApiResponse unmarshall(GetVersionWithAllApiResponse getVersionWithAllApiResponse, UnmarshallerContext context) {
		
		getVersionWithAllApiResponse.setProduct(context.stringValue("GetVersionWithAllApiResponse.product"));
		getVersionWithAllApiResponse.setName(context.stringValue("GetVersionWithAllApiResponse.name"));
		getVersionWithAllApiResponse.setApiStyle(context.stringValue("GetVersionWithAllApiResponse.apiStyle"));

		ErrorMapping errorMapping = new ErrorMapping();
		errorMapping.setExceptionExpress(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.exceptionExpress"));

		UnknownError unknownError = new UnknownError();
		unknownError.setCode(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.UnknownError.code"));
		unknownError.setErrorCode(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setHttpCode(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorMessage(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setType(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.UnknownError.type"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetVersionWithAllApiResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setHttpCode(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorMessage(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setType(context.stringValue("GetVersionWithAllApiResponse.ErrorMapping.ErrorCodes["+ i +"].type"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getVersionWithAllApiResponse.setErrorMapping(errorMapping);

		List<Api> apis = new ArrayList<Api>();
		for (int i = 0; i < context.lengthValue("GetVersionWithAllApiResponse.Apis.Length"); i++) {
			Api api = new Api();
			api.setName(context.stringValue("GetVersionWithAllApiResponse.Apis["+ i +"].name"));
			api.setStatus(context.stringValue("GetVersionWithAllApiResponse.Apis["+ i +"].status"));

			apis.add(api);
		}
		getVersionWithAllApiResponse.setApis(apis);
	 
	 	return getVersionWithAllApiResponse;
	}
}
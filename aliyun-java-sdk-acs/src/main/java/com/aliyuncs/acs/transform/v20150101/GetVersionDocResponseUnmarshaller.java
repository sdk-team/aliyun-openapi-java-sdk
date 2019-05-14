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

import com.aliyuncs.acs.model.v20150101.GetVersionDocResponse;
import com.aliyuncs.acs.model.v20150101.GetVersionDocResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetVersionDocResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetVersionDocResponse.ErrorMapping.UnknownError;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVersionDocResponseUnmarshaller {

	public static GetVersionDocResponse unmarshall(GetVersionDocResponse getVersionDocResponse, UnmarshallerContext context) {
		
		getVersionDocResponse.setProduct(context.stringValue("GetVersionDocResponse.product"));
		getVersionDocResponse.setName(context.stringValue("GetVersionDocResponse.name"));
		getVersionDocResponse.setLanguage(context.stringValue("GetVersionDocResponse.language"));
		getVersionDocResponse.setDescription(context.stringValue("GetVersionDocResponse.Description"));

		ErrorMapping errorMapping = new ErrorMapping();

		UnknownError unknownError = new UnknownError();
		unknownError.setHttpCode(context.stringValue("GetVersionDocResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorCode(context.stringValue("GetVersionDocResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setErrorMessage(context.stringValue("GetVersionDocResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setTagId(context.stringValue("GetVersionDocResponse.ErrorMapping.UnknownError.tagId"));
		unknownError.setDescription(context.stringValue("GetVersionDocResponse.ErrorMapping.UnknownError.Description"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetVersionDocResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setHttpCode(context.stringValue("GetVersionDocResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setCode(context.stringValue("GetVersionDocResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setErrorCode(context.stringValue("GetVersionDocResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setErrorMessage(context.stringValue("GetVersionDocResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setTagId(context.stringValue("GetVersionDocResponse.ErrorMapping.ErrorCodes["+ i +"].tagId"));
			errorCode.setIndex(context.stringValue("GetVersionDocResponse.ErrorMapping.ErrorCodes["+ i +"].index"));
			errorCode.setDescription(context.stringValue("GetVersionDocResponse.ErrorMapping.ErrorCodes["+ i +"].Description"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getVersionDocResponse.setErrorMapping(errorMapping);
	 
	 	return getVersionDocResponse;
	}
}
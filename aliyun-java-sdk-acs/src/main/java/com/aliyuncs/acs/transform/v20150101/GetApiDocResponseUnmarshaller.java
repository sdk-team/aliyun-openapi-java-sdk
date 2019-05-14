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

import com.aliyuncs.acs.model.v20150101.GetApiDocResponse;
import com.aliyuncs.acs.model.v20150101.GetApiDocResponse.ErrorMapping;
import com.aliyuncs.acs.model.v20150101.GetApiDocResponse.ErrorMapping.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetApiDocResponse.ErrorMapping.UnknownError;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiDocResponseUnmarshaller {

	public static GetApiDocResponse unmarshall(GetApiDocResponse getApiDocResponse, UnmarshallerContext context) {
		
		getApiDocResponse.setProduct(context.stringValue("GetApiDocResponse.product"));
		getApiDocResponse.setVersion(context.stringValue("GetApiDocResponse.version"));
		getApiDocResponse.setName(context.stringValue("GetApiDocResponse.name"));
		getApiDocResponse.setTitle(context.stringValue("GetApiDocResponse.title"));
		getApiDocResponse.setTagId(context.stringValue("GetApiDocResponse.tagId"));
		getApiDocResponse.setIndex(context.stringValue("GetApiDocResponse.index"));
		getApiDocResponse.setLanguage(context.stringValue("GetApiDocResponse.language"));
		getApiDocResponse.setAbcDocumentId(context.stringValue("GetApiDocResponse.abcDocumentId"));
		getApiDocResponse.setResultMapping(context.stringValue("GetApiDocResponse.ResultMapping"));
		getApiDocResponse.setParameters(context.stringValue("GetApiDocResponse.Parameters"));
		getApiDocResponse.setRequestDemo(context.stringValue("GetApiDocResponse.RequestDemo"));
		getApiDocResponse.setResponseDemo(context.stringValue("GetApiDocResponse.ResponseDemo"));
		getApiDocResponse.setErrorResponseDemo(context.stringValue("GetApiDocResponse.ErrorResponseDemo"));
		getApiDocResponse.setXmlResponseDemo(context.stringValue("GetApiDocResponse.XmlResponseDemo"));
		getApiDocResponse.setXmlErrorResponseDemo(context.stringValue("GetApiDocResponse.XmlErrorResponseDemo"));
		getApiDocResponse.setDescription(context.stringValue("GetApiDocResponse.Description"));

		ErrorMapping errorMapping = new ErrorMapping();

		UnknownError unknownError = new UnknownError();
		unknownError.setHttpCode(context.stringValue("GetApiDocResponse.ErrorMapping.UnknownError.httpCode"));
		unknownError.setErrorCode(context.stringValue("GetApiDocResponse.ErrorMapping.UnknownError.errorCode"));
		unknownError.setErrorMessage(context.stringValue("GetApiDocResponse.ErrorMapping.UnknownError.errorMessage"));
		unknownError.setTagId(context.stringValue("GetApiDocResponse.ErrorMapping.UnknownError.tagId"));
		unknownError.setDescription(context.stringValue("GetApiDocResponse.ErrorMapping.UnknownError.Description"));
		errorMapping.setUnknownError(unknownError);

		List<ErrorCode> errorCodes = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetApiDocResponse.ErrorMapping.ErrorCodes.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setCode(context.stringValue("GetApiDocResponse.ErrorMapping.ErrorCodes["+ i +"].code"));
			errorCode.setHttpCode(context.stringValue("GetApiDocResponse.ErrorMapping.ErrorCodes["+ i +"].httpCode"));
			errorCode.setErrorCode(context.stringValue("GetApiDocResponse.ErrorMapping.ErrorCodes["+ i +"].errorCode"));
			errorCode.setErrorMessage(context.stringValue("GetApiDocResponse.ErrorMapping.ErrorCodes["+ i +"].errorMessage"));
			errorCode.setTagId(context.stringValue("GetApiDocResponse.ErrorMapping.ErrorCodes["+ i +"].tagId"));
			errorCode.setIndex(context.stringValue("GetApiDocResponse.ErrorMapping.ErrorCodes["+ i +"].index"));
			errorCode.setDescription(context.stringValue("GetApiDocResponse.ErrorMapping.ErrorCodes["+ i +"].Description"));

			errorCodes.add(errorCode);
		}
		errorMapping.setErrorCodes(errorCodes);
		getApiDocResponse.setErrorMapping(errorMapping);
	 
	 	return getApiDocResponse;
	}
}
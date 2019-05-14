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

import com.aliyuncs.acs.model.v20150101.GetVersionDocumentResponse;
import com.aliyuncs.acs.model.v20150101.GetVersionDocumentResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVersionDocumentResponseUnmarshaller {

	public static GetVersionDocumentResponse unmarshall(GetVersionDocumentResponse getVersionDocumentResponse, UnmarshallerContext context) {
		
		getVersionDocumentResponse.setProduct(context.stringValue("GetVersionDocumentResponse.product"));
		getVersionDocumentResponse.setVersion(context.stringValue("GetVersionDocumentResponse.version"));
		getVersionDocumentResponse.setLanguage(context.stringValue("GetVersionDocumentResponse.language"));
		getVersionDocumentResponse.setSite(context.stringValue("GetVersionDocumentResponse.site"));
		getVersionDocumentResponse.setIndex(context.stringValue("GetVersionDocumentResponse.index"));
		getVersionDocumentResponse.setDescription(context.stringValue("GetVersionDocumentResponse.Description"));

		List<ErrorCode> errorCodeList = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetVersionDocumentResponse.ErrorCodeList.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setHttpStatusCode(context.integerValue("GetVersionDocumentResponse.ErrorCodeList["+ i +"].httpStatusCode"));
			errorCode.setErrorCode(context.stringValue("GetVersionDocumentResponse.ErrorCodeList["+ i +"].errorCode"));
			errorCode.setErrorMessage(context.stringValue("GetVersionDocumentResponse.ErrorCodeList["+ i +"].errorMessage"));
			errorCode.setDefaultError(context.booleanValue("GetVersionDocumentResponse.ErrorCodeList["+ i +"].defaultError"));

			errorCodeList.add(errorCode);
		}
		getVersionDocumentResponse.setErrorCodeList(errorCodeList);
	 
	 	return getVersionDocumentResponse;
	}
}
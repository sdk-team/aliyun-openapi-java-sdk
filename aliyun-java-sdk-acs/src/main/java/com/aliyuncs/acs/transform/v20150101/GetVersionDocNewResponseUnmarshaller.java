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

import com.aliyuncs.acs.model.v20150101.GetVersionDocNewResponse;
import com.aliyuncs.acs.model.v20150101.GetVersionDocNewResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVersionDocNewResponseUnmarshaller {

	public static GetVersionDocNewResponse unmarshall(GetVersionDocNewResponse getVersionDocNewResponse, UnmarshallerContext context) {
		
		getVersionDocNewResponse.setProduct(context.stringValue("GetVersionDocNewResponse.product"));
		getVersionDocNewResponse.setVersion(context.stringValue("GetVersionDocNewResponse.version"));
		getVersionDocNewResponse.setLanguage(context.stringValue("GetVersionDocNewResponse.language"));
		getVersionDocNewResponse.setIndex(context.stringValue("GetVersionDocNewResponse.index"));
		getVersionDocNewResponse.setDescription(context.stringValue("GetVersionDocNewResponse.Description"));

		List<ErrorCode> errorCodeList = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetVersionDocNewResponse.ErrorCodeList.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setHttpStatusCode(context.integerValue("GetVersionDocNewResponse.ErrorCodeList["+ i +"].httpStatusCode"));
			errorCode.setErrorCode(context.stringValue("GetVersionDocNewResponse.ErrorCodeList["+ i +"].errorCode"));
			errorCode.setIndex(context.integerValue("GetVersionDocNewResponse.ErrorCodeList["+ i +"].index"));
			errorCode.setErrorMessage(context.stringValue("GetVersionDocNewResponse.ErrorCodeList["+ i +"].errorMessage"));
			errorCode.setDefaultError(context.booleanValue("GetVersionDocNewResponse.ErrorCodeList["+ i +"].defaultError"));

			errorCodeList.add(errorCode);
		}
		getVersionDocNewResponse.setErrorCodeList(errorCodeList);
	 
	 	return getVersionDocNewResponse;
	}
}
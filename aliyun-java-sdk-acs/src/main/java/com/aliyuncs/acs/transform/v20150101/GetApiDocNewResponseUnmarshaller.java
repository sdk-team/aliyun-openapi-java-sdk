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

import com.aliyuncs.acs.model.v20150101.GetApiDocNewResponse;
import com.aliyuncs.acs.model.v20150101.GetApiDocNewResponse.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetApiDocNewResponse.ParameterDoc;
import com.aliyuncs.acs.model.v20150101.GetApiDocNewResponse.ResponseDemo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiDocNewResponseUnmarshaller {

	public static GetApiDocNewResponse unmarshall(GetApiDocNewResponse getApiDocNewResponse, UnmarshallerContext context) {
		
		getApiDocNewResponse.setLanguage(context.stringValue("GetApiDocNewResponse.language"));
		getApiDocNewResponse.setDescription(context.stringValue("GetApiDocNewResponse.Description"));
		getApiDocNewResponse.setProduct(context.stringValue("GetApiDocNewResponse.product"));
		getApiDocNewResponse.setVersion(context.stringValue("GetApiDocNewResponse.version"));
		getApiDocNewResponse.setName(context.stringValue("GetApiDocNewResponse.name"));
		getApiDocNewResponse.setTitle(context.stringValue("GetApiDocNewResponse.title"));
		getApiDocNewResponse.setTagId(context.stringValue("GetApiDocNewResponse.tagId"));
		getApiDocNewResponse.setIndex(context.stringValue("GetApiDocNewResponse.index"));
		getApiDocNewResponse.setVisibility(context.stringValue("GetApiDocNewResponse.visibility"));
		getApiDocNewResponse.setAbcDocumentId(context.stringValue("GetApiDocNewResponse.abcDocumentId"));
		getApiDocNewResponse.setTagName(context.stringValue("GetApiDocNewResponse.tagName"));
		getApiDocNewResponse.setTagIndex(context.integerValue("GetApiDocNewResponse.tagIndex"));
		getApiDocNewResponse.setApiSnapshotId(context.stringValue("GetApiDocNewResponse.apiSnapshotId"));
		getApiDocNewResponse.setResultMapping(context.stringValue("GetApiDocNewResponse.ResultMapping"));
		getApiDocNewResponse.setRequestDemo(context.stringValue("GetApiDocNewResponse.RequestDemo"));

		List<ParameterDoc> parameterList = new ArrayList<ParameterDoc>();
		for (int i = 0; i < context.lengthValue("GetApiDocNewResponse.ParameterList.Length"); i++) {
			ParameterDoc parameterDoc = new ParameterDoc();
			parameterDoc.setTagName(context.stringValue("GetApiDocNewResponse.ParameterList["+ i +"].tagName"));
			parameterDoc.setRequired(context.booleanValue("GetApiDocNewResponse.ParameterList["+ i +"].required"));
			parameterDoc.setIndex(context.stringValue("GetApiDocNewResponse.ParameterList["+ i +"].index"));
			parameterDoc.setExample(context.stringValue("GetApiDocNewResponse.ParameterList["+ i +"].Example"));
			parameterDoc.setDescription(context.stringValue("GetApiDocNewResponse.ParameterList["+ i +"].Description"));
			parameterDoc.setType(context.stringValue("GetApiDocNewResponse.ParameterList["+ i +"].type"));
			parameterDoc.setVisibility(context.stringValue("GetApiDocNewResponse.ParameterList["+ i +"].visibility"));
			parameterDoc.setTagPosition(context.stringValue("GetApiDocNewResponse.ParameterList["+ i +"].tagPosition"));

			parameterList.add(parameterDoc);
		}
		getApiDocNewResponse.setParameterList(parameterList);

		List<ErrorCode> errorCodeList = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetApiDocNewResponse.ErrorCodeList.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setHttpStatusCode(context.integerValue("GetApiDocNewResponse.ErrorCodeList["+ i +"].httpStatusCode"));
			errorCode.setErrorCode(context.stringValue("GetApiDocNewResponse.ErrorCodeList["+ i +"].errorCode"));
			errorCode.setErrorMessage(context.stringValue("GetApiDocNewResponse.ErrorCodeList["+ i +"].errorMessage"));
			errorCode.setDefaultError(context.booleanValue("GetApiDocNewResponse.ErrorCodeList["+ i +"].defaultError"));

			errorCodeList.add(errorCode);
		}
		getApiDocNewResponse.setErrorCodeList(errorCodeList);

		List<ResponseDemo> responseDemoList = new ArrayList<ResponseDemo>();
		for (int i = 0; i < context.lengthValue("GetApiDocNewResponse.ResponseDemoList.Length"); i++) {
			ResponseDemo responseDemo = new ResponseDemo();
			responseDemo.setType(context.stringValue("GetApiDocNewResponse.ResponseDemoList["+ i +"].type"));
			responseDemo.setExample(context.stringValue("GetApiDocNewResponse.ResponseDemoList["+ i +"].example"));
			responseDemo.setErrorExample(context.stringValue("GetApiDocNewResponse.ResponseDemoList["+ i +"].errorExample"));

			responseDemoList.add(responseDemo);
		}
		getApiDocNewResponse.setResponseDemoList(responseDemoList);
	 
	 	return getApiDocNewResponse;
	}
}
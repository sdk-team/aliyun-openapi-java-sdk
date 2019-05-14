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

import com.aliyuncs.acs.model.v20150101.GetApiDocumentResponse;
import com.aliyuncs.acs.model.v20150101.GetApiDocumentResponse.ErrorCode;
import com.aliyuncs.acs.model.v20150101.GetApiDocumentResponse.ParameterDoc;
import com.aliyuncs.acs.model.v20150101.GetApiDocumentResponse.ResponseDemo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiDocumentResponseUnmarshaller {

	public static GetApiDocumentResponse unmarshall(GetApiDocumentResponse getApiDocumentResponse, UnmarshallerContext context) {
		
		getApiDocumentResponse.setLanguage(context.stringValue("GetApiDocumentResponse.language"));
		getApiDocumentResponse.setSite(context.stringValue("GetApiDocumentResponse.site"));
		getApiDocumentResponse.setDescription(context.stringValue("GetApiDocumentResponse.Description"));
		getApiDocumentResponse.setProduct(context.stringValue("GetApiDocumentResponse.product"));
		getApiDocumentResponse.setVersion(context.stringValue("GetApiDocumentResponse.version"));
		getApiDocumentResponse.setName(context.stringValue("GetApiDocumentResponse.name"));
		getApiDocumentResponse.setTitle(context.stringValue("GetApiDocumentResponse.title"));
		getApiDocumentResponse.setTagId(context.stringValue("GetApiDocumentResponse.tagId"));
		getApiDocumentResponse.setIndex(context.stringValue("GetApiDocumentResponse.index"));
		getApiDocumentResponse.setVisibility(context.stringValue("GetApiDocumentResponse.visibility"));
		getApiDocumentResponse.setAbcDocumentId(context.stringValue("GetApiDocumentResponse.abcDocumentId"));
		getApiDocumentResponse.setTagName(context.stringValue("GetApiDocumentResponse.tagName"));
		getApiDocumentResponse.setTagIndex(context.integerValue("GetApiDocumentResponse.tagIndex"));
		getApiDocumentResponse.setApiSnapshotId(context.stringValue("GetApiDocumentResponse.apiSnapshotId"));
		getApiDocumentResponse.setResultMapping(context.stringValue("GetApiDocumentResponse.ResultMapping"));
		getApiDocumentResponse.setRequestDemo(context.stringValue("GetApiDocumentResponse.RequestDemo"));

		List<ParameterDoc> parameterList = new ArrayList<ParameterDoc>();
		for (int i = 0; i < context.lengthValue("GetApiDocumentResponse.ParameterList.Length"); i++) {
			ParameterDoc parameterDoc = new ParameterDoc();
			parameterDoc.setTagName(context.stringValue("GetApiDocumentResponse.ParameterList["+ i +"].tagName"));
			parameterDoc.setRequired(context.booleanValue("GetApiDocumentResponse.ParameterList["+ i +"].required"));
			parameterDoc.setIndex(context.stringValue("GetApiDocumentResponse.ParameterList["+ i +"].index"));
			parameterDoc.setExample(context.stringValue("GetApiDocumentResponse.ParameterList["+ i +"].Example"));
			parameterDoc.setDescription(context.stringValue("GetApiDocumentResponse.ParameterList["+ i +"].Description"));
			parameterDoc.setType(context.stringValue("GetApiDocumentResponse.ParameterList["+ i +"].type"));
			parameterDoc.setVisibility(context.stringValue("GetApiDocumentResponse.ParameterList["+ i +"].visibility"));
			parameterDoc.setTagPosition(context.stringValue("GetApiDocumentResponse.ParameterList["+ i +"].tagPosition"));

			parameterList.add(parameterDoc);
		}
		getApiDocumentResponse.setParameterList(parameterList);

		List<ErrorCode> errorCodeList = new ArrayList<ErrorCode>();
		for (int i = 0; i < context.lengthValue("GetApiDocumentResponse.ErrorCodeList.Length"); i++) {
			ErrorCode errorCode = new ErrorCode();
			errorCode.setHttpStatusCode(context.integerValue("GetApiDocumentResponse.ErrorCodeList["+ i +"].httpStatusCode"));
			errorCode.setErrorCode(context.stringValue("GetApiDocumentResponse.ErrorCodeList["+ i +"].errorCode"));
			errorCode.setErrorMessage(context.stringValue("GetApiDocumentResponse.ErrorCodeList["+ i +"].errorMessage"));
			errorCode.setDefaultError(context.booleanValue("GetApiDocumentResponse.ErrorCodeList["+ i +"].defaultError"));

			errorCodeList.add(errorCode);
		}
		getApiDocumentResponse.setErrorCodeList(errorCodeList);

		List<ResponseDemo> responseDemoList = new ArrayList<ResponseDemo>();
		for (int i = 0; i < context.lengthValue("GetApiDocumentResponse.ResponseDemoList.Length"); i++) {
			ResponseDemo responseDemo = new ResponseDemo();
			responseDemo.setType(context.stringValue("GetApiDocumentResponse.ResponseDemoList["+ i +"].type"));
			responseDemo.setExample(context.stringValue("GetApiDocumentResponse.ResponseDemoList["+ i +"].example"));
			responseDemo.setErrorExample(context.stringValue("GetApiDocumentResponse.ResponseDemoList["+ i +"].errorExample"));

			responseDemoList.add(responseDemo);
		}
		getApiDocumentResponse.setResponseDemoList(responseDemoList);
	 
	 	return getApiDocumentResponse;
	}
}
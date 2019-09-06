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

package com.aliyuncs.iot.transform.v20190730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20190730.AddProductIdentifierForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddProductIdentifierForTmallGenieResponseUnmarshaller {

	public static AddProductIdentifierForTmallGenieResponse unmarshall(AddProductIdentifierForTmallGenieResponse addProductIdentifierForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		addProductIdentifierForTmallGenieResponse.setRequestId(_ctx.stringValue("AddProductIdentifierForTmallGenieResponse.RequestId"));
		addProductIdentifierForTmallGenieResponse.setSuccess(_ctx.booleanValue("AddProductIdentifierForTmallGenieResponse.Success"));
		addProductIdentifierForTmallGenieResponse.setErrorMessage(_ctx.stringValue("AddProductIdentifierForTmallGenieResponse.ErrorMessage"));
		addProductIdentifierForTmallGenieResponse.setCode(_ctx.stringValue("AddProductIdentifierForTmallGenieResponse.Code"));

		List<String> successList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddProductIdentifierForTmallGenieResponse.SuccessList.Length"); i++) {
			successList.add(_ctx.stringValue("AddProductIdentifierForTmallGenieResponse.SuccessList["+ i +"]"));
		}
		addProductIdentifierForTmallGenieResponse.setSuccessList(successList);
	 
	 	return addProductIdentifierForTmallGenieResponse;
	}
}
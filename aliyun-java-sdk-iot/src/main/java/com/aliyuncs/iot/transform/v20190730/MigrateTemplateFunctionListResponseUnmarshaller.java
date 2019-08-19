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

import com.aliyuncs.iot.model.v20190730.MigrateTemplateFunctionListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MigrateTemplateFunctionListResponseUnmarshaller {

	public static MigrateTemplateFunctionListResponse unmarshall(MigrateTemplateFunctionListResponse migrateTemplateFunctionListResponse, UnmarshallerContext _ctx) {
		
		migrateTemplateFunctionListResponse.setRequestId(_ctx.stringValue("MigrateTemplateFunctionListResponse.RequestId"));
		migrateTemplateFunctionListResponse.setSuccess(_ctx.booleanValue("MigrateTemplateFunctionListResponse.Success"));
		migrateTemplateFunctionListResponse.setCode(_ctx.stringValue("MigrateTemplateFunctionListResponse.Code"));
		migrateTemplateFunctionListResponse.setErrorMessage(_ctx.stringValue("MigrateTemplateFunctionListResponse.ErrorMessage"));
	 
	 	return migrateTemplateFunctionListResponse;
	}
}
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

package com.aliyuncs.ecsdemo.transform.v20190620;

import com.aliyuncs.ecsdemo.model.v20190620.GetInstance01Response;
import com.aliyuncs.ecsdemo.model.v20190620.GetInstance01Response.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstance01ResponseUnmarshaller {

	public static GetInstance01Response unmarshall(GetInstance01Response getInstance01Response, UnmarshallerContext _ctx) {
		
		getInstance01Response.setTraceId(_ctx.stringValue("GetInstance01Response.TraceId"));
		getInstance01Response.setErrorDetailMessage(_ctx.stringValue("GetInstance01Response.ErrorDetailMessage"));
		getInstance01Response.setSuccess(_ctx.booleanValue("GetInstance01Response.Success"));
		getInstance01Response.setErrorMessage(_ctx.stringValue("GetInstance01Response.ErrorMessage"));
		getInstance01Response.setErrorCode(_ctx.stringValue("GetInstance01Response.ErrorCode"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetInstance01Response.Result.Id"));
		result.setProjectName(_ctx.stringValue("GetInstance01Response.Result.ProjectName"));
		getInstance01Response.setResult(result);
	 
	 	return getInstance01Response;
	}
}
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

import com.aliyuncs.ecsdemo.model.v20190620.GetInstance002Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstance002ResponseUnmarshaller {

	public static GetInstance002Response unmarshall(GetInstance002Response getInstance002Response, UnmarshallerContext _ctx) {
		
		getInstance002Response.setTraceId(_ctx.stringValue("GetInstance002Response.TraceId"));
		getInstance002Response.setErrorDetailMessage(_ctx.stringValue("GetInstance002Response.ErrorDetailMessage"));
		getInstance002Response.setSuccess(_ctx.booleanValue("GetInstance002Response.Success"));
		getInstance002Response.setErrorMessage(_ctx.stringValue("GetInstance002Response.ErrorMessage"));
		getInstance002Response.setErrorCode(_ctx.stringValue("GetInstance002Response.ErrorCode"));
	 
	 	return getInstance002Response;
	}
}
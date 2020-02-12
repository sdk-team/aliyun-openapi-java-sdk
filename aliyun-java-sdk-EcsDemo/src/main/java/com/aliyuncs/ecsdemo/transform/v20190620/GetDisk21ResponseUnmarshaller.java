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

import com.aliyuncs.ecsdemo.model.v20190620.GetDisk21Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDisk21ResponseUnmarshaller {

	public static GetDisk21Response unmarshall(GetDisk21Response getDisk21Response, UnmarshallerContext _ctx) {
		
		getDisk21Response.setTraceId(_ctx.stringValue("GetDisk21Response.TraceId"));
		getDisk21Response.setErrorDetailMessage(_ctx.stringValue("GetDisk21Response.ErrorDetailMessage"));
		getDisk21Response.setSuccess(_ctx.booleanValue("GetDisk21Response.Success"));
		getDisk21Response.setErrorMessage(_ctx.stringValue("GetDisk21Response.ErrorMessage"));
		getDisk21Response.setErrorCode(_ctx.stringValue("GetDisk21Response.ErrorCode"));
	 
	 	return getDisk21Response;
	}
}
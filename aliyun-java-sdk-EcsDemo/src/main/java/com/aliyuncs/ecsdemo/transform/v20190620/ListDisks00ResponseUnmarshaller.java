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

import com.aliyuncs.ecsdemo.model.v20190620.ListDisks00Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDisks00ResponseUnmarshaller {

	public static ListDisks00Response unmarshall(ListDisks00Response listDisks00Response, UnmarshallerContext _ctx) {
		
		listDisks00Response.setTraceId(_ctx.stringValue("ListDisks00Response.TraceId"));
		listDisks00Response.setErrorDetailMessage(_ctx.stringValue("ListDisks00Response.ErrorDetailMessage"));
		listDisks00Response.setSuccess(_ctx.booleanValue("ListDisks00Response.Success"));
		listDisks00Response.setErrorMessage(_ctx.stringValue("ListDisks00Response.ErrorMessage"));
		listDisks00Response.setErrorCode(_ctx.stringValue("ListDisks00Response.ErrorCode"));
	 
	 	return listDisks00Response;
	}
}
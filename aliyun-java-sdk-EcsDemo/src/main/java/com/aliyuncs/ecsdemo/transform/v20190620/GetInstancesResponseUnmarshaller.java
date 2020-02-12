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

import com.aliyuncs.ecsdemo.model.v20190620.GetInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstancesResponseUnmarshaller {

	public static GetInstancesResponse unmarshall(GetInstancesResponse getInstancesResponse, UnmarshallerContext _ctx) {
		
		getInstancesResponse.setTraceId(_ctx.stringValue("GetInstancesResponse.TraceId"));
		getInstancesResponse.setErrorDetailMessage(_ctx.stringValue("GetInstancesResponse.ErrorDetailMessage"));
		getInstancesResponse.setSuccess(_ctx.booleanValue("GetInstancesResponse.Success"));
		getInstancesResponse.setErrorMessage(_ctx.stringValue("GetInstancesResponse.ErrorMessage"));
		getInstancesResponse.setErrorCode(_ctx.stringValue("GetInstancesResponse.ErrorCode"));
	 
	 	return getInstancesResponse;
	}
}
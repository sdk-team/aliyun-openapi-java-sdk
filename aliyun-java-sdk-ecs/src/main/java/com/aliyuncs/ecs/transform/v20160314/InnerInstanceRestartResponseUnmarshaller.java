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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.InnerInstanceRestartResponse;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceRestartResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceRestartResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceRestartResponseUnmarshaller {

	public static InnerInstanceRestartResponse unmarshall(InnerInstanceRestartResponse innerInstanceRestartResponse, UnmarshallerContext _ctx) {
		
		innerInstanceRestartResponse.setRequestId(_ctx.stringValue("InnerInstanceRestartResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerInstanceRestartResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerInstanceRestartResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerInstanceRestartResponse.errorCode.isSuccess"));
		innerInstanceRestartResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setEcsName(_ctx.stringValue("InnerInstanceRestartResponse.data.ecsName"));
		data.setStatus(_ctx.stringValue("InnerInstanceRestartResponse.data.status"));
		innerInstanceRestartResponse.setData(data);
	 
	 	return innerInstanceRestartResponse;
	}
}
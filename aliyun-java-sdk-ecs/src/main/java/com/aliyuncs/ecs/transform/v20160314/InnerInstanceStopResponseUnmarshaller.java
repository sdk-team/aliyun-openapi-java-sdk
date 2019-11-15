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

import com.aliyuncs.ecs.model.v20160314.InnerInstanceStopResponse;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceStopResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceStopResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceStopResponseUnmarshaller {

	public static InnerInstanceStopResponse unmarshall(InnerInstanceStopResponse innerInstanceStopResponse, UnmarshallerContext _ctx) {
		
		innerInstanceStopResponse.setRequestId(_ctx.stringValue("InnerInstanceStopResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerInstanceStopResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerInstanceStopResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerInstanceStopResponse.errorCode.isSuccess"));
		innerInstanceStopResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setEcsName(_ctx.stringValue("InnerInstanceStopResponse.data.ecsName"));
		data.setStatus(_ctx.stringValue("InnerInstanceStopResponse.data.status"));
		innerInstanceStopResponse.setData(data);
	 
	 	return innerInstanceStopResponse;
	}
}
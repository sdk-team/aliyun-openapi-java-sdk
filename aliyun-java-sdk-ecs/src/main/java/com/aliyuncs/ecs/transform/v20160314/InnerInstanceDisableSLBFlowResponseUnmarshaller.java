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

import com.aliyuncs.ecs.model.v20160314.InnerInstanceDisableSLBFlowResponse;
import com.aliyuncs.ecs.model.v20160314.InnerInstanceDisableSLBFlowResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceDisableSLBFlowResponseUnmarshaller {

	public static InnerInstanceDisableSLBFlowResponse unmarshall(InnerInstanceDisableSLBFlowResponse innerInstanceDisableSLBFlowResponse, UnmarshallerContext _ctx) {
		
		innerInstanceDisableSLBFlowResponse.setRequestId(_ctx.stringValue("InnerInstanceDisableSLBFlowResponse.RequestId"));
		innerInstanceDisableSLBFlowResponse.setData(_ctx.stringValue("InnerInstanceDisableSLBFlowResponse.data"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerInstanceDisableSLBFlowResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerInstanceDisableSLBFlowResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerInstanceDisableSLBFlowResponse.errorCode.isSuccess"));
		innerInstanceDisableSLBFlowResponse.setErrorCode(errorCode);
	 
	 	return innerInstanceDisableSLBFlowResponse;
	}
}
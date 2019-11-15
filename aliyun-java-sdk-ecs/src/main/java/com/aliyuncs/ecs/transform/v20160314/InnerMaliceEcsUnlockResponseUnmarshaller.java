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

import com.aliyuncs.ecs.model.v20160314.InnerMaliceEcsUnlockResponse;
import com.aliyuncs.ecs.model.v20160314.InnerMaliceEcsUnlockResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerMaliceEcsUnlockResponseUnmarshaller {

	public static InnerMaliceEcsUnlockResponse unmarshall(InnerMaliceEcsUnlockResponse innerMaliceEcsUnlockResponse, UnmarshallerContext _ctx) {
		
		innerMaliceEcsUnlockResponse.setRequestId(_ctx.stringValue("InnerMaliceEcsUnlockResponse.RequestId"));
		innerMaliceEcsUnlockResponse.setData(_ctx.stringValue("InnerMaliceEcsUnlockResponse.data"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerMaliceEcsUnlockResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerMaliceEcsUnlockResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerMaliceEcsUnlockResponse.errorCode.isSuccess"));
		innerMaliceEcsUnlockResponse.setErrorCode(errorCode);
	 
	 	return innerMaliceEcsUnlockResponse;
	}
}
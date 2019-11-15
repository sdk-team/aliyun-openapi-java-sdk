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

import com.aliyuncs.ecs.model.v20160314.InnerGroupJoinResponse;
import com.aliyuncs.ecs.model.v20160314.InnerGroupJoinResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupJoinResponseUnmarshaller {

	public static InnerGroupJoinResponse unmarshall(InnerGroupJoinResponse innerGroupJoinResponse, UnmarshallerContext _ctx) {
		
		innerGroupJoinResponse.setRequestId(_ctx.stringValue("InnerGroupJoinResponse.RequestId"));
		innerGroupJoinResponse.setData(_ctx.stringValue("InnerGroupJoinResponse.data"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerGroupJoinResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerGroupJoinResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerGroupJoinResponse.errorCode.isSuccess"));
		innerGroupJoinResponse.setErrorCode(errorCode);
	 
	 	return innerGroupJoinResponse;
	}
}
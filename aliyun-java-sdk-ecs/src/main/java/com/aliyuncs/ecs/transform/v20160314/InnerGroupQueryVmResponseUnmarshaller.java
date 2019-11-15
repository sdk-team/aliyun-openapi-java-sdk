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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.InnerGroupQueryVmResponse;
import com.aliyuncs.ecs.model.v20160314.InnerGroupQueryVmResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupQueryVmResponseUnmarshaller {

	public static InnerGroupQueryVmResponse unmarshall(InnerGroupQueryVmResponse innerGroupQueryVmResponse, UnmarshallerContext _ctx) {
		
		innerGroupQueryVmResponse.setRequestId(_ctx.stringValue("InnerGroupQueryVmResponse.RequestId"));
		innerGroupQueryVmResponse.setCount(_ctx.integerValue("InnerGroupQueryVmResponse.count"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerGroupQueryVmResponse.data.Length"); i++) {
			data.add(_ctx.stringValue("InnerGroupQueryVmResponse.data["+ i +"]"));
		}
		innerGroupQueryVmResponse.setData(data);

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerGroupQueryVmResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerGroupQueryVmResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerGroupQueryVmResponse.errorCode.isSuccess"));
		innerGroupQueryVmResponse.setErrorCode(errorCode);
	 
	 	return innerGroupQueryVmResponse;
	}
}
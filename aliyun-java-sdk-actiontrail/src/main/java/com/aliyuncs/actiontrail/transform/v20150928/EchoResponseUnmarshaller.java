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

package com.aliyuncs.actiontrail.transform.v20150928;

import com.aliyuncs.actiontrail.model.v20150928.EchoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EchoResponseUnmarshaller {

	public static EchoResponse unmarshall(EchoResponse echoResponse, UnmarshallerContext context) {
		
		echoResponse.setRequestId(context.stringValue("EchoResponse.requestId"));
		echoResponse.setParam(context.stringValue("EchoResponse.param"));
		echoResponse.setResult(context.stringValue("EchoResponse.result"));
		echoResponse.setParam1(context.stringValue("EchoResponse.Param"));
		echoResponse.setResult2(context.stringValue("EchoResponse.Result"));
	 
	 	return echoResponse;
	}
}
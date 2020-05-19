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

package com.aliyuncs.bss.transform.v20140714;

import com.aliyuncs.bss.model.v20140714.VnoPayCallBackNotifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VnoPayCallBackNotifyResponseUnmarshaller {

	public static VnoPayCallBackNotifyResponse unmarshall(VnoPayCallBackNotifyResponse vnoPayCallBackNotifyResponse, UnmarshallerContext _ctx) {
		
		vnoPayCallBackNotifyResponse.setRequestId(_ctx.stringValue("VnoPayCallBackNotifyResponse.RequestId"));
		vnoPayCallBackNotifyResponse.setSuccess(_ctx.booleanValue("VnoPayCallBackNotifyResponse.Success"));
		vnoPayCallBackNotifyResponse.setCode(_ctx.stringValue("VnoPayCallBackNotifyResponse.Code"));
		vnoPayCallBackNotifyResponse.setMessage(_ctx.stringValue("VnoPayCallBackNotifyResponse.Message"));
		vnoPayCallBackNotifyResponse.setData(_ctx.stringValue("VnoPayCallBackNotifyResponse.Data"));
	 
	 	return vnoPayCallBackNotifyResponse;
	}
}
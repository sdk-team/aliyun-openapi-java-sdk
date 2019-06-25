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

package com.aliyuncs.iot.transform.v20190730;

import com.aliyuncs.iot.model.v20190730.ToggleVirtualDeviceSwitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ToggleVirtualDeviceSwitchResponseUnmarshaller {

	public static ToggleVirtualDeviceSwitchResponse unmarshall(ToggleVirtualDeviceSwitchResponse toggleVirtualDeviceSwitchResponse, UnmarshallerContext context) {
		
		toggleVirtualDeviceSwitchResponse.setRequestId(context.stringValue("ToggleVirtualDeviceSwitchResponse.RequestId"));
		toggleVirtualDeviceSwitchResponse.setSuccess(context.booleanValue("ToggleVirtualDeviceSwitchResponse.Success"));
		toggleVirtualDeviceSwitchResponse.setCode(context.stringValue("ToggleVirtualDeviceSwitchResponse.Code"));
		toggleVirtualDeviceSwitchResponse.setErrorMessage(context.stringValue("ToggleVirtualDeviceSwitchResponse.ErrorMessage"));
		toggleVirtualDeviceSwitchResponse.setStatus(context.stringValue("ToggleVirtualDeviceSwitchResponse.Status"));
	 
	 	return toggleVirtualDeviceSwitchResponse;
	}
}
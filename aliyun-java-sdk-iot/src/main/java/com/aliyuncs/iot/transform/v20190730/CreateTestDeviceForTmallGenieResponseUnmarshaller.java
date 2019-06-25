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

import com.aliyuncs.iot.model.v20190730.CreateTestDeviceForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTestDeviceForTmallGenieResponseUnmarshaller {

	public static CreateTestDeviceForTmallGenieResponse unmarshall(CreateTestDeviceForTmallGenieResponse createTestDeviceForTmallGenieResponse, UnmarshallerContext context) {
		
		createTestDeviceForTmallGenieResponse.setRequestId(context.stringValue("CreateTestDeviceForTmallGenieResponse.RequestId"));
		createTestDeviceForTmallGenieResponse.setSuccess(context.booleanValue("CreateTestDeviceForTmallGenieResponse.Success"));
		createTestDeviceForTmallGenieResponse.setErrorMessage(context.stringValue("CreateTestDeviceForTmallGenieResponse.ErrorMessage"));
		createTestDeviceForTmallGenieResponse.setCode(context.stringValue("CreateTestDeviceForTmallGenieResponse.Code"));
	 
	 	return createTestDeviceForTmallGenieResponse;
	}
}
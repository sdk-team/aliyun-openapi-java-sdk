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

import com.aliyuncs.iot.model.v20190730.DataCleanSyncDeviceUnbindResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DataCleanSyncDeviceUnbindResponseUnmarshaller {

	public static DataCleanSyncDeviceUnbindResponse unmarshall(DataCleanSyncDeviceUnbindResponse dataCleanSyncDeviceUnbindResponse, UnmarshallerContext _ctx) {
		
		dataCleanSyncDeviceUnbindResponse.setRequestId(_ctx.stringValue("DataCleanSyncDeviceUnbindResponse.RequestId"));
		dataCleanSyncDeviceUnbindResponse.setSuccess(_ctx.booleanValue("DataCleanSyncDeviceUnbindResponse.Success"));
		dataCleanSyncDeviceUnbindResponse.setErrorMessage(_ctx.stringValue("DataCleanSyncDeviceUnbindResponse.ErrorMessage"));
		dataCleanSyncDeviceUnbindResponse.setCode(_ctx.stringValue("DataCleanSyncDeviceUnbindResponse.Code"));
	 
	 	return dataCleanSyncDeviceUnbindResponse;
	}
}
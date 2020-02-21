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

import com.aliyuncs.iot.model.v20190730.ImportDeviceForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportDeviceForTmallGenieResponseUnmarshaller {

	public static ImportDeviceForTmallGenieResponse unmarshall(ImportDeviceForTmallGenieResponse importDeviceForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		importDeviceForTmallGenieResponse.setRequestId(_ctx.stringValue("ImportDeviceForTmallGenieResponse.RequestId"));
		importDeviceForTmallGenieResponse.setSuccess(_ctx.booleanValue("ImportDeviceForTmallGenieResponse.Success"));
		importDeviceForTmallGenieResponse.setCode(_ctx.stringValue("ImportDeviceForTmallGenieResponse.Code"));
		importDeviceForTmallGenieResponse.setErrorMessage(_ctx.stringValue("ImportDeviceForTmallGenieResponse.ErrorMessage"));
	 
	 	return importDeviceForTmallGenieResponse;
	}
}
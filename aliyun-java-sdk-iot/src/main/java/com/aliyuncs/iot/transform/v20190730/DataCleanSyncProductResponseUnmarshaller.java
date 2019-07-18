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

import com.aliyuncs.iot.model.v20190730.DataCleanSyncProductResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DataCleanSyncProductResponseUnmarshaller {

	public static DataCleanSyncProductResponse unmarshall(DataCleanSyncProductResponse dataCleanSyncProductResponse, UnmarshallerContext _ctx) {
		
		dataCleanSyncProductResponse.setRequestId(_ctx.stringValue("DataCleanSyncProductResponse.RequestId"));
		dataCleanSyncProductResponse.setSuccess(_ctx.booleanValue("DataCleanSyncProductResponse.Success"));
		dataCleanSyncProductResponse.setErrorMessage(_ctx.stringValue("DataCleanSyncProductResponse.ErrorMessage"));
		dataCleanSyncProductResponse.setCode(_ctx.stringValue("DataCleanSyncProductResponse.Code"));
	 
	 	return dataCleanSyncProductResponse;
	}
}
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

import com.aliyuncs.iot.model.v20190730.DataCleanCreateApplyInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DataCleanCreateApplyInfoResponseUnmarshaller {

	public static DataCleanCreateApplyInfoResponse unmarshall(DataCleanCreateApplyInfoResponse dataCleanCreateApplyInfoResponse, UnmarshallerContext _ctx) {
		
		dataCleanCreateApplyInfoResponse.setRequestId(_ctx.stringValue("DataCleanCreateApplyInfoResponse.RequestId"));
		dataCleanCreateApplyInfoResponse.setSuccess(_ctx.booleanValue("DataCleanCreateApplyInfoResponse.Success"));
		dataCleanCreateApplyInfoResponse.setErrorMessage(_ctx.stringValue("DataCleanCreateApplyInfoResponse.ErrorMessage"));
		dataCleanCreateApplyInfoResponse.setCode(_ctx.stringValue("DataCleanCreateApplyInfoResponse.Code"));
		dataCleanCreateApplyInfoResponse.setApplyId(_ctx.longValue("DataCleanCreateApplyInfoResponse.ApplyId"));
	 
	 	return dataCleanCreateApplyInfoResponse;
	}
}
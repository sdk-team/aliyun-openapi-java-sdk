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

import com.aliyuncs.iot.model.v20190730.ImportProductForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportProductForTmallGenieResponseUnmarshaller {

	public static ImportProductForTmallGenieResponse unmarshall(ImportProductForTmallGenieResponse importProductForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		importProductForTmallGenieResponse.setRequestId(_ctx.stringValue("ImportProductForTmallGenieResponse.RequestId"));
		importProductForTmallGenieResponse.setSuccess(_ctx.booleanValue("ImportProductForTmallGenieResponse.Success"));
		importProductForTmallGenieResponse.setCode(_ctx.stringValue("ImportProductForTmallGenieResponse.Code"));
		importProductForTmallGenieResponse.setErrorMessage(_ctx.stringValue("ImportProductForTmallGenieResponse.ErrorMessage"));
	 
	 	return importProductForTmallGenieResponse;
	}
}
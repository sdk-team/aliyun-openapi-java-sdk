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

import com.aliyuncs.iot.model.v20190730.UpdateProductForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProductForTmallGenieResponseUnmarshaller {

	public static UpdateProductForTmallGenieResponse unmarshall(UpdateProductForTmallGenieResponse updateProductForTmallGenieResponse, UnmarshallerContext context) {
		
		updateProductForTmallGenieResponse.setRequestId(context.stringValue("UpdateProductForTmallGenieResponse.RequestId"));
		updateProductForTmallGenieResponse.setSuccess(context.booleanValue("UpdateProductForTmallGenieResponse.Success"));
		updateProductForTmallGenieResponse.setCode(context.stringValue("UpdateProductForTmallGenieResponse.Code"));
		updateProductForTmallGenieResponse.setErrorMessage(context.stringValue("UpdateProductForTmallGenieResponse.ErrorMessage"));
	 
	 	return updateProductForTmallGenieResponse;
	}
}
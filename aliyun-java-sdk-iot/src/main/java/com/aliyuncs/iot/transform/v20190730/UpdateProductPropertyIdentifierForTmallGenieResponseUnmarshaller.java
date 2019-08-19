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

import com.aliyuncs.iot.model.v20190730.UpdateProductPropertyIdentifierForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProductPropertyIdentifierForTmallGenieResponseUnmarshaller {

	public static UpdateProductPropertyIdentifierForTmallGenieResponse unmarshall(UpdateProductPropertyIdentifierForTmallGenieResponse updateProductPropertyIdentifierForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		updateProductPropertyIdentifierForTmallGenieResponse.setRequestId(_ctx.stringValue("UpdateProductPropertyIdentifierForTmallGenieResponse.RequestId"));
		updateProductPropertyIdentifierForTmallGenieResponse.setSuccess(_ctx.booleanValue("UpdateProductPropertyIdentifierForTmallGenieResponse.Success"));
		updateProductPropertyIdentifierForTmallGenieResponse.setCode(_ctx.stringValue("UpdateProductPropertyIdentifierForTmallGenieResponse.Code"));
		updateProductPropertyIdentifierForTmallGenieResponse.setErrorMessage(_ctx.stringValue("UpdateProductPropertyIdentifierForTmallGenieResponse.ErrorMessage"));
	 
	 	return updateProductPropertyIdentifierForTmallGenieResponse;
	}
}
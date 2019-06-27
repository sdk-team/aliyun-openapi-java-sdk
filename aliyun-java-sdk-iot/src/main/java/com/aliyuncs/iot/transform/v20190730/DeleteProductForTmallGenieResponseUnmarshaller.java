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

import com.aliyuncs.iot.model.v20190730.DeleteProductForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProductForTmallGenieResponseUnmarshaller {

	public static DeleteProductForTmallGenieResponse unmarshall(DeleteProductForTmallGenieResponse deleteProductForTmallGenieResponse, UnmarshallerContext context) {
		
		deleteProductForTmallGenieResponse.setRequestId(context.stringValue("DeleteProductForTmallGenieResponse.RequestId"));
		deleteProductForTmallGenieResponse.setSuccess(context.booleanValue("DeleteProductForTmallGenieResponse.Success"));
		deleteProductForTmallGenieResponse.setCode(context.stringValue("DeleteProductForTmallGenieResponse.Code"));
		deleteProductForTmallGenieResponse.setErrorMessage(context.stringValue("DeleteProductForTmallGenieResponse.ErrorMessage"));
	 
	 	return deleteProductForTmallGenieResponse;
	}
}
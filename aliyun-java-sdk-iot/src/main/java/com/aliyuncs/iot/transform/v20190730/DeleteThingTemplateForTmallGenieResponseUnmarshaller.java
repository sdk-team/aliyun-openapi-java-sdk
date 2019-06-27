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

import com.aliyuncs.iot.model.v20190730.DeleteThingTemplateForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteThingTemplateForTmallGenieResponseUnmarshaller {

	public static DeleteThingTemplateForTmallGenieResponse unmarshall(DeleteThingTemplateForTmallGenieResponse deleteThingTemplateForTmallGenieResponse, UnmarshallerContext context) {
		
		deleteThingTemplateForTmallGenieResponse.setRequestId(context.stringValue("DeleteThingTemplateForTmallGenieResponse.RequestId"));
		deleteThingTemplateForTmallGenieResponse.setSuccess(context.booleanValue("DeleteThingTemplateForTmallGenieResponse.Success"));
		deleteThingTemplateForTmallGenieResponse.setCode(context.stringValue("DeleteThingTemplateForTmallGenieResponse.Code"));
		deleteThingTemplateForTmallGenieResponse.setErrorMessage(context.stringValue("DeleteThingTemplateForTmallGenieResponse.ErrorMessage"));
	 
	 	return deleteThingTemplateForTmallGenieResponse;
	}
}
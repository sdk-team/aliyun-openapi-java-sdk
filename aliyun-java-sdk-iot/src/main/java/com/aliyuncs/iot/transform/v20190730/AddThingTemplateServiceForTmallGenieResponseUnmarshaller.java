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

import com.aliyuncs.iot.model.v20190730.AddThingTemplateServiceForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddThingTemplateServiceForTmallGenieResponseUnmarshaller {

	public static AddThingTemplateServiceForTmallGenieResponse unmarshall(AddThingTemplateServiceForTmallGenieResponse addThingTemplateServiceForTmallGenieResponse, UnmarshallerContext context) {
		
		addThingTemplateServiceForTmallGenieResponse.setRequestId(context.stringValue("AddThingTemplateServiceForTmallGenieResponse.RequestId"));
		addThingTemplateServiceForTmallGenieResponse.setSuccess(context.booleanValue("AddThingTemplateServiceForTmallGenieResponse.Success"));
		addThingTemplateServiceForTmallGenieResponse.setCode(context.stringValue("AddThingTemplateServiceForTmallGenieResponse.Code"));
		addThingTemplateServiceForTmallGenieResponse.setErrorMessage(context.stringValue("AddThingTemplateServiceForTmallGenieResponse.ErrorMessage"));
	 
	 	return addThingTemplateServiceForTmallGenieResponse;
	}
}
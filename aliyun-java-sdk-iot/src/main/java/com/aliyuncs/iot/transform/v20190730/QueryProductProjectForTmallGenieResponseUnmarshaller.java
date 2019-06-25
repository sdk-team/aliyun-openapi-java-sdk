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

import com.aliyuncs.iot.model.v20190730.QueryProductProjectForTmallGenieResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductProjectForTmallGenieResponseUnmarshaller {

	public static QueryProductProjectForTmallGenieResponse unmarshall(QueryProductProjectForTmallGenieResponse queryProductProjectForTmallGenieResponse, UnmarshallerContext context) {
		
		queryProductProjectForTmallGenieResponse.setRequestId(context.stringValue("QueryProductProjectForTmallGenieResponse.RequestId"));
		queryProductProjectForTmallGenieResponse.setSuccess(context.booleanValue("QueryProductProjectForTmallGenieResponse.Success"));
		queryProductProjectForTmallGenieResponse.setCode(context.stringValue("QueryProductProjectForTmallGenieResponse.Code"));
		queryProductProjectForTmallGenieResponse.setErrorMessage(context.stringValue("QueryProductProjectForTmallGenieResponse.ErrorMessage"));
		queryProductProjectForTmallGenieResponse.setProjectId(context.stringValue("QueryProductProjectForTmallGenieResponse.ProjectId"));
		queryProductProjectForTmallGenieResponse.setIsolateId(context.stringValue("QueryProductProjectForTmallGenieResponse.IsolateId"));
		queryProductProjectForTmallGenieResponse.setDevIsolateId(context.stringValue("QueryProductProjectForTmallGenieResponse.DevIsolateId"));
		queryProductProjectForTmallGenieResponse.setISVTaobaoId(context.stringValue("QueryProductProjectForTmallGenieResponse.ISVTaobaoId"));
	 
	 	return queryProductProjectForTmallGenieResponse;
	}
}
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

	public static QueryProductProjectForTmallGenieResponse unmarshall(QueryProductProjectForTmallGenieResponse queryProductProjectForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		queryProductProjectForTmallGenieResponse.setRequestId(_ctx.stringValue("QueryProductProjectForTmallGenieResponse.RequestId"));
		queryProductProjectForTmallGenieResponse.setSuccess(_ctx.booleanValue("QueryProductProjectForTmallGenieResponse.Success"));
		queryProductProjectForTmallGenieResponse.setCode(_ctx.stringValue("QueryProductProjectForTmallGenieResponse.Code"));
		queryProductProjectForTmallGenieResponse.setErrorMessage(_ctx.stringValue("QueryProductProjectForTmallGenieResponse.ErrorMessage"));
		queryProductProjectForTmallGenieResponse.setProjectId(_ctx.stringValue("QueryProductProjectForTmallGenieResponse.ProjectId"));
		queryProductProjectForTmallGenieResponse.setIsolateId(_ctx.stringValue("QueryProductProjectForTmallGenieResponse.IsolateId"));
		queryProductProjectForTmallGenieResponse.setDevIsolateId(_ctx.stringValue("QueryProductProjectForTmallGenieResponse.DevIsolateId"));
		queryProductProjectForTmallGenieResponse.setISVTaobaoId(_ctx.stringValue("QueryProductProjectForTmallGenieResponse.ISVTaobaoId"));
	 
	 	return queryProductProjectForTmallGenieResponse;
	}
}
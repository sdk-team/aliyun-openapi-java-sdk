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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20190730.QueryDeviceOnlineLogContentForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.QueryDeviceOnlineLogContentForTmallGenieResponse.Data;
import com.aliyuncs.iot.model.v20190730.QueryDeviceOnlineLogContentForTmallGenieResponse.Data.DebugLogContentInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceOnlineLogContentForTmallGenieResponseUnmarshaller {

	public static QueryDeviceOnlineLogContentForTmallGenieResponse unmarshall(QueryDeviceOnlineLogContentForTmallGenieResponse queryDeviceOnlineLogContentForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		queryDeviceOnlineLogContentForTmallGenieResponse.setRequestId(_ctx.stringValue("QueryDeviceOnlineLogContentForTmallGenieResponse.RequestId"));
		queryDeviceOnlineLogContentForTmallGenieResponse.setSuccess(_ctx.booleanValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Success"));
		queryDeviceOnlineLogContentForTmallGenieResponse.setCode(_ctx.stringValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Code"));
		queryDeviceOnlineLogContentForTmallGenieResponse.setErrorMessage(_ctx.stringValue("QueryDeviceOnlineLogContentForTmallGenieResponse.ErrorMessage"));

		Data data = new Data();
		data.setCount(_ctx.longValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Data.Count"));
		data.setTotalPage(_ctx.integerValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Data.TotalPage"));
		data.setCurrentPage(_ctx.integerValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Data.PageSize"));

		List<DebugLogContentInfo> logs = new ArrayList<DebugLogContentInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Data.Logs.Length"); i++) {
			DebugLogContentInfo debugLogContentInfo = new DebugLogContentInfo();
			debugLogContentInfo.setLogTime(_ctx.stringValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Data.Logs["+ i +"].LogTime"));
			debugLogContentInfo.setContent(_ctx.stringValue("QueryDeviceOnlineLogContentForTmallGenieResponse.Data.Logs["+ i +"].Content"));

			logs.add(debugLogContentInfo);
		}
		data.setLogs(logs);
		queryDeviceOnlineLogContentForTmallGenieResponse.setData(data);
	 
	 	return queryDeviceOnlineLogContentForTmallGenieResponse;
	}
}
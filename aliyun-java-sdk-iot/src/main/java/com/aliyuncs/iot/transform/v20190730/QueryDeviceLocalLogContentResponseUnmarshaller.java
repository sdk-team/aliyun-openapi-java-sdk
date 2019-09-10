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

import com.aliyuncs.iot.model.v20190730.QueryDeviceLocalLogContentResponse;
import com.aliyuncs.iot.model.v20190730.QueryDeviceLocalLogContentResponse.Data;
import com.aliyuncs.iot.model.v20190730.QueryDeviceLocalLogContentResponse.Data.DeviceLocalLogContentInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceLocalLogContentResponseUnmarshaller {

	public static QueryDeviceLocalLogContentResponse unmarshall(QueryDeviceLocalLogContentResponse queryDeviceLocalLogContentResponse, UnmarshallerContext _ctx) {
		
		queryDeviceLocalLogContentResponse.setRequestId(_ctx.stringValue("QueryDeviceLocalLogContentResponse.RequestId"));
		queryDeviceLocalLogContentResponse.setSuccess(_ctx.booleanValue("QueryDeviceLocalLogContentResponse.Success"));
		queryDeviceLocalLogContentResponse.setCode(_ctx.stringValue("QueryDeviceLocalLogContentResponse.Code"));
		queryDeviceLocalLogContentResponse.setErrorMessage(_ctx.stringValue("QueryDeviceLocalLogContentResponse.ErrorMessage"));

		Data data = new Data();
		data.setCount(_ctx.longValue("QueryDeviceLocalLogContentResponse.Data.Count"));
		data.setTotalPage(_ctx.integerValue("QueryDeviceLocalLogContentResponse.Data.TotalPage"));
		data.setCurrentPage(_ctx.integerValue("QueryDeviceLocalLogContentResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryDeviceLocalLogContentResponse.Data.PageSize"));

		List<DeviceLocalLogContentInfo> logs = new ArrayList<DeviceLocalLogContentInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceLocalLogContentResponse.Data.Logs.Length"); i++) {
			DeviceLocalLogContentInfo deviceLocalLogContentInfo = new DeviceLocalLogContentInfo();
			deviceLocalLogContentInfo.setLogTime(_ctx.stringValue("QueryDeviceLocalLogContentResponse.Data.Logs["+ i +"].LogTime"));
			deviceLocalLogContentInfo.setContent(_ctx.stringValue("QueryDeviceLocalLogContentResponse.Data.Logs["+ i +"].Content"));

			logs.add(deviceLocalLogContentInfo);
		}
		data.setLogs(logs);
		queryDeviceLocalLogContentResponse.setData(data);
	 
	 	return queryDeviceLocalLogContentResponse;
	}
}
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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListExecutionLogsResponse;
import com.aliyuncs.oos.model.v20190601.ListExecutionLogsResponse.ExecutionLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionLogsResponseUnmarshaller {

	public static ListExecutionLogsResponse unmarshall(ListExecutionLogsResponse listExecutionLogsResponse, UnmarshallerContext context) {
		
		listExecutionLogsResponse.setRequestId(context.stringValue("ListExecutionLogsResponse.RequestId"));
		listExecutionLogsResponse.setMaxResults(context.integerValue("ListExecutionLogsResponse.MaxResults"));
		listExecutionLogsResponse.setNextToken(context.stringValue("ListExecutionLogsResponse.NextToken"));

		List<ExecutionLog> executionLogs = new ArrayList<ExecutionLog>();
		for (int i = 0; i < context.lengthValue("ListExecutionLogsResponse.ExecutionLogs.Length"); i++) {
			ExecutionLog executionLog = new ExecutionLog();
			executionLog.setTimestamp(context.stringValue("ListExecutionLogsResponse.ExecutionLogs["+ i +"].Timestamp"));
			executionLog.setMessage(context.stringValue("ListExecutionLogsResponse.ExecutionLogs["+ i +"].Message"));

			executionLogs.add(executionLog);
		}
		listExecutionLogsResponse.setExecutionLogs(executionLogs);
	 
	 	return listExecutionLogsResponse;
	}
}
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

package com.aliyuncs.rds.transform.v20130528;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20130528.DescribeSlowLogRecordsResponse;
import com.aliyuncs.rds.model.v20130528.DescribeSlowLogRecordsResponse.SQLLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext context) {
		
		describeSlowLogRecordsResponse.setRequestId(context.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setEngine(context.stringValue("DescribeSlowLogRecordsResponse.Engine"));
		describeSlowLogRecordsResponse.setTotalRecordCounts(context.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCounts"));
		describeSlowLogRecordsResponse.setPageNumber(context.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setSQLItemsCounts(context.integerValue("DescribeSlowLogRecordsResponse.SQLItemsCounts"));

		List<SQLLog> sQLLogs = new ArrayList<SQLLog>();
		for (int i = 0; i < context.lengthValue("DescribeSlowLogRecordsResponse.SQLLogs.Length"); i++) {
			SQLLog sQLLog = new SQLLog();
			sQLLog.setHostAddress(context.stringValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].HostAddress"));
			sQLLog.setDBName(context.stringValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].DBName"));
			sQLLog.setSQLText(context.stringValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].SQLText"));
			sQLLog.setQueryTimes(context.longValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].QueryTimes"));
			sQLLog.setLockTimes(context.longValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].LockTimes"));
			sQLLog.setParseRowCounts(context.longValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].ParseRowCounts"));
			sQLLog.setReturnRowCounts(context.longValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].ReturnRowCounts"));
			sQLLog.setExecutionStartTime(context.stringValue("DescribeSlowLogRecordsResponse.SQLLogs["+ i +"].ExecutionStartTime"));

			sQLLogs.add(sQLLog);
		}
		describeSlowLogRecordsResponse.setSQLLogs(sQLLogs);
	 
	 	return describeSlowLogRecordsResponse;
	}
}
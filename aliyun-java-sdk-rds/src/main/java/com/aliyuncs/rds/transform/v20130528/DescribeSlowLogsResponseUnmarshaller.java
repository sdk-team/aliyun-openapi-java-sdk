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

import com.aliyuncs.rds.model.v20130528.DescribeSlowLogsResponse;
import com.aliyuncs.rds.model.v20130528.DescribeSlowLogsResponse.SQLLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogsResponseUnmarshaller {

	public static DescribeSlowLogsResponse unmarshall(DescribeSlowLogsResponse describeSlowLogsResponse, UnmarshallerContext context) {
		
		describeSlowLogsResponse.setRequestId(context.stringValue("DescribeSlowLogsResponse.RequestId"));
		describeSlowLogsResponse.setEngine(context.stringValue("DescribeSlowLogsResponse.Engine"));
		describeSlowLogsResponse.setStartTime(context.stringValue("DescribeSlowLogsResponse.StartTime"));
		describeSlowLogsResponse.setEndTime(context.stringValue("DescribeSlowLogsResponse.EndTime"));
		describeSlowLogsResponse.setTotalRecordCounts(context.integerValue("DescribeSlowLogsResponse.TotalRecordCounts"));
		describeSlowLogsResponse.setPageNumber(context.integerValue("DescribeSlowLogsResponse.PageNumber"));
		describeSlowLogsResponse.setSQLItemsCounts(context.integerValue("DescribeSlowLogsResponse.SQLItemsCounts"));

		List<SQLLog> sQLLogs = new ArrayList<SQLLog>();
		for (int i = 0; i < context.lengthValue("DescribeSlowLogsResponse.SQLLogs.Length"); i++) {
			SQLLog sQLLog = new SQLLog();
			sQLLog.setDBName(context.stringValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].DBName"));
			sQLLog.setSQLText(context.stringValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].SQLText"));
			sQLLog.setMySQLTotalExecutionCounts(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].MySQLTotalExecutionCounts"));
			sQLLog.setMySQLTotalExecutionTimes(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].MySQLTotalExecutionTimes"));
			sQLLog.setMaxExecutionTime(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].MaxExecutionTime"));
			sQLLog.setTotalLockTimes(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].TotalLockTimes"));
			sQLLog.setMaxlockTime(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].MaxlockTime"));
			sQLLog.setParseTotalRowCounts(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].ParseTotalRowCounts"));
			sQLLog.setParseMaxRowCount(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].ParseMaxRowCount"));
			sQLLog.setReturnTotalRowCounts(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].ReturnTotalRowCounts"));
			sQLLog.setCreateTime(context.stringValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].CreateTime"));
			sQLLog.setSQLServerTotalExecutionCounts(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].SQLServerTotalExecutionCounts"));
			sQLLog.setSQLServerTotalExecutionTimes(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].SQLServerTotalExecutionTimes"));
			sQLLog.setTotalLogicalReadCounts(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].TotalLogicalReadCounts"));
			sQLLog.setTotalPhysicalReadCounts(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].TotalPhysicalReadCounts"));
			sQLLog.setReportTime(context.stringValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].ReportTime"));
			sQLLog.setReturnMaxRowCount(context.longValue("DescribeSlowLogsResponse.SQLLogs["+ i +"].ReturnMaxRowCount"));

			sQLLogs.add(sQLLog);
		}
		describeSlowLogsResponse.setSQLLogs(sQLLogs);
	 
	 	return describeSlowLogsResponse;
	}
}
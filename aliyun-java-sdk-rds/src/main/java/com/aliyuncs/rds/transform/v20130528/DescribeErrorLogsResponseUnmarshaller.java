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

import com.aliyuncs.rds.model.v20130528.DescribeErrorLogsResponse;
import com.aliyuncs.rds.model.v20130528.DescribeErrorLogsResponse.ErrorLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeErrorLogsResponseUnmarshaller {

	public static DescribeErrorLogsResponse unmarshall(DescribeErrorLogsResponse describeErrorLogsResponse, UnmarshallerContext context) {
		
		describeErrorLogsResponse.setRequestId(context.stringValue("DescribeErrorLogsResponse.RequestId"));
		describeErrorLogsResponse.setTotalRecordCounts(context.integerValue("DescribeErrorLogsResponse.TotalRecordCounts"));
		describeErrorLogsResponse.setPageNumber(context.integerValue("DescribeErrorLogsResponse.PageNumber"));
		describeErrorLogsResponse.setLogItemsCounts(context.integerValue("DescribeErrorLogsResponse.LogItemsCounts"));

		List<ErrorLog> errorLogs = new ArrayList<ErrorLog>();
		for (int i = 0; i < context.lengthValue("DescribeErrorLogsResponse.ErrorLogs.Length"); i++) {
			ErrorLog errorLog = new ErrorLog();
			errorLog.setErrorInfo(context.stringValue("DescribeErrorLogsResponse.ErrorLogs["+ i +"].ErrorInfo"));
			errorLog.setCreateTime(context.stringValue("DescribeErrorLogsResponse.ErrorLogs["+ i +"].CreateTime"));

			errorLogs.add(errorLog);
		}
		describeErrorLogsResponse.setErrorLogs(errorLogs);
	 
	 	return describeErrorLogsResponse;
	}
}
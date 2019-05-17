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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSqlLogDumpStatusResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSqlLogDumpStatusResponse.SqlLogDumpStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlLogDumpStatusResponseUnmarshaller {

	public static DescribeSqlLogDumpStatusResponse unmarshall(DescribeSqlLogDumpStatusResponse describeSqlLogDumpStatusResponse, UnmarshallerContext context) {
		
		describeSqlLogDumpStatusResponse.setRequestId(context.stringValue("DescribeSqlLogDumpStatusResponse.RequestId"));
		describeSqlLogDumpStatusResponse.setDBInstanceID(context.integerValue("DescribeSqlLogDumpStatusResponse.DBInstanceID"));
		describeSqlLogDumpStatusResponse.setDBInstanceName(context.stringValue("DescribeSqlLogDumpStatusResponse.DBInstanceName"));
		describeSqlLogDumpStatusResponse.setIsEnableSqlLogDump(context.stringValue("DescribeSqlLogDumpStatusResponse.IsEnableSqlLogDump"));
		describeSqlLogDumpStatusResponse.setBucket(context.stringValue("DescribeSqlLogDumpStatusResponse.Bucket"));
		describeSqlLogDumpStatusResponse.setEndpoint(context.stringValue("DescribeSqlLogDumpStatusResponse.Endpoint"));

		List<SqlLogDumpStatus> items = new ArrayList<SqlLogDumpStatus>();
		for (int i = 0; i < context.lengthValue("DescribeSqlLogDumpStatusResponse.Items.Length"); i++) {
			SqlLogDumpStatus sqlLogDumpStatus = new SqlLogDumpStatus();
			sqlLogDumpStatus.setDumpStartTime(context.stringValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].DumpStartTime"));
			sqlLogDumpStatus.setJobName(context.stringValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].JobName"));
			sqlLogDumpStatus.setCreateTime(context.stringValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].CreateTime"));
			sqlLogDumpStatus.setUpdateTime(context.stringValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].UpdateTime"));
			sqlLogDumpStatus.setProcessRows(context.longValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].ProcessRows"));
			sqlLogDumpStatus.setTotalRows(context.longValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].TotalRows"));
			sqlLogDumpStatus.setJobStatus(context.stringValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].JobStatus"));
			sqlLogDumpStatus.setFailMsg(context.stringValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].FailMsg"));
			sqlLogDumpStatus.setStatus(context.integerValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].Status"));
			sqlLogDumpStatus.setErrorCode(context.stringValue("DescribeSqlLogDumpStatusResponse.Items["+ i +"].ErrorCode"));

			items.add(sqlLogDumpStatus);
		}
		describeSqlLogDumpStatusResponse.setItems(items);
	 
	 	return describeSqlLogDumpStatusResponse;
	}
}
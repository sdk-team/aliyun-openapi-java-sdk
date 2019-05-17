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

import com.aliyuncs.rds.model.v20140815.DescribeOperationLogsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOperationLogsResponse.Operationlog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOperationLogsResponseUnmarshaller {

	public static DescribeOperationLogsResponse unmarshall(DescribeOperationLogsResponse describeOperationLogsResponse, UnmarshallerContext context) {
		
		describeOperationLogsResponse.setRequestId(context.stringValue("DescribeOperationLogsResponse.RequestId"));
		describeOperationLogsResponse.setEngine(context.stringValue("DescribeOperationLogsResponse.Engine"));
		describeOperationLogsResponse.setTotalRecordCount(context.integerValue("DescribeOperationLogsResponse.TotalRecordCount"));
		describeOperationLogsResponse.setPageNumber(context.integerValue("DescribeOperationLogsResponse.PageNumber"));
		describeOperationLogsResponse.setPageRecordCount(context.integerValue("DescribeOperationLogsResponse.PageRecordCount"));

		List<Operationlog> items = new ArrayList<Operationlog>();
		for (int i = 0; i < context.lengthValue("DescribeOperationLogsResponse.Items.Length"); i++) {
			Operationlog operationlog = new Operationlog();
			operationlog.setDBInstanceDescription(context.stringValue("DescribeOperationLogsResponse.Items["+ i +"].DBInstanceDescription"));
			operationlog.setDBInstanceId(context.stringValue("DescribeOperationLogsResponse.Items["+ i +"].DBInstanceId"));
			operationlog.setOperationSource(context.stringValue("DescribeOperationLogsResponse.Items["+ i +"].OperationSource"));
			operationlog.setOperationItem(context.stringValue("DescribeOperationLogsResponse.Items["+ i +"].OperationItem"));
			operationlog.setExecutionTime(context.stringValue("DescribeOperationLogsResponse.Items["+ i +"].executionTime"));

			items.add(operationlog);
		}
		describeOperationLogsResponse.setItems(items);
	 
	 	return describeOperationLogsResponse;
	}
}
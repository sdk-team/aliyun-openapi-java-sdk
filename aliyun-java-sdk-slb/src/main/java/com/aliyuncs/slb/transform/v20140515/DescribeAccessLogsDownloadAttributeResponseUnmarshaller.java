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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeAccessLogsDownloadAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessLogsDownloadAttributeResponseUnmarshaller {

	public static DescribeAccessLogsDownloadAttributeResponse unmarshall(DescribeAccessLogsDownloadAttributeResponse describeAccessLogsDownloadAttributeResponse, UnmarshallerContext context) {
		
		describeAccessLogsDownloadAttributeResponse.setRequestId(context.stringValue("DescribeAccessLogsDownloadAttributeResponse.RequestId"));
		describeAccessLogsDownloadAttributeResponse.setPageNumber(context.integerValue("DescribeAccessLogsDownloadAttributeResponse.PageNumber"));
		describeAccessLogsDownloadAttributeResponse.setPageSize(context.integerValue("DescribeAccessLogsDownloadAttributeResponse.PageSize"));
		describeAccessLogsDownloadAttributeResponse.setTotalCount(context.integerValue("DescribeAccessLogsDownloadAttributeResponse.TotalCount"));
		describeAccessLogsDownloadAttributeResponse.setCount(context.integerValue("DescribeAccessLogsDownloadAttributeResponse.Count"));

		List<LogsDownloadAttribute> logsDownloadAttributes = new ArrayList<LogsDownloadAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes.Length"); i++) {
			LogsDownloadAttribute logsDownloadAttribute = new LogsDownloadAttribute();
			logsDownloadAttribute.setLogProject(context.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LogProject"));
			logsDownloadAttribute.setLogStore(context.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LogStore"));
			logsDownloadAttribute.setLoadBalancerId(context.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LoadBalancerId"));
			logsDownloadAttribute.setLogType(context.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].LogType"));
			logsDownloadAttribute.setRoleArn(context.stringValue("DescribeAccessLogsDownloadAttributeResponse.LogsDownloadAttributes["+ i +"].RoleArn"));

			logsDownloadAttributes.add(logsDownloadAttribute);
		}
		describeAccessLogsDownloadAttributeResponse.setLogsDownloadAttributes(logsDownloadAttributes);
	 
	 	return describeAccessLogsDownloadAttributeResponse;
	}
}
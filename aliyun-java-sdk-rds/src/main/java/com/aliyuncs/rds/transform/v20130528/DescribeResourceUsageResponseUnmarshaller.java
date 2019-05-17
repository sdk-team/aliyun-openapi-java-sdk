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

import com.aliyuncs.rds.model.v20130528.DescribeResourceUsageResponse;
import com.aliyuncs.rds.model.v20130528.DescribeResourceUsageResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceUsageResponseUnmarshaller {

	public static DescribeResourceUsageResponse unmarshall(DescribeResourceUsageResponse describeResourceUsageResponse, UnmarshallerContext context) {
		
		describeResourceUsageResponse.setRequestId(context.stringValue("DescribeResourceUsageResponse.RequestId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeResourceUsageResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setDiskUsed(context.longValue("DescribeResourceUsageResponse.Resources["+ i +"].DiskUsed"));
			resource.setDBInstanceId(context.stringValue("DescribeResourceUsageResponse.Resources["+ i +"].DBInstanceId"));
			resource.setEngine(context.stringValue("DescribeResourceUsageResponse.Resources["+ i +"].Engine"));
			resource.setDataSize(context.longValue("DescribeResourceUsageResponse.Resources["+ i +"].DataSize"));
			resource.setNetworkOut(context.longValue("DescribeResourceUsageResponse.Resources["+ i +"].NetworkOut"));
			resource.setLogSize(context.longValue("DescribeResourceUsageResponse.Resources["+ i +"].LogSize"));
			resource.setBackupSize(context.longValue("DescribeResourceUsageResponse.Resources["+ i +"].BackupSize"));
			resource.setNetworkIn(context.longValue("DescribeResourceUsageResponse.Resources["+ i +"].NetworkIn"));

			resources.add(resource);
		}
		describeResourceUsageResponse.setResources(resources);
	 
	 	return describeResourceUsageResponse;
	}
}
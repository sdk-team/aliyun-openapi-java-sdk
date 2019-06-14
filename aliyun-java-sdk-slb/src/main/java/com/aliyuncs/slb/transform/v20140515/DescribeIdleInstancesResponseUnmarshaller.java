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

import com.aliyuncs.slb.model.v20140515.DescribeIdleInstancesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeIdleInstancesResponse.IdleInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIdleInstancesResponseUnmarshaller {

	public static DescribeIdleInstancesResponse unmarshall(DescribeIdleInstancesResponse describeIdleInstancesResponse, UnmarshallerContext context) {
		
		describeIdleInstancesResponse.setRequestId(context.stringValue("DescribeIdleInstancesResponse.RequestId"));

		List<IdleInstance> idleInstances = new ArrayList<IdleInstance>();
		for (int i = 0; i < context.lengthValue("DescribeIdleInstancesResponse.IdleInstances.Length"); i++) {
			IdleInstance idleInstance = new IdleInstance();
			idleInstance.setInstanceId(context.stringValue("DescribeIdleInstancesResponse.IdleInstances["+ i +"].InstanceId"));
			idleInstance.setInstanceName(context.stringValue("DescribeIdleInstancesResponse.IdleInstances["+ i +"].InstanceName"));
			idleInstance.setIp(context.stringValue("DescribeIdleInstancesResponse.IdleInstances["+ i +"].Ip"));
			idleInstance.setIdleType(context.stringValue("DescribeIdleInstancesResponse.IdleInstances["+ i +"].IdleType"));

			idleInstances.add(idleInstance);
		}
		describeIdleInstancesResponse.setIdleInstances(idleInstances);
	 
	 	return describeIdleInstancesResponse;
	}
}
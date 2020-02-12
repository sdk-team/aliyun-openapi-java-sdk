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

package com.aliyuncs.ecsdemo.transform.v20190620;

import com.aliyuncs.ecsdemo.model.v20190620.DescribeInstancesResponse;
import com.aliyuncs.ecsdemo.model.v20190620.DescribeInstancesResponse.Instances;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setTotalCount(_ctx.stringValue("DescribeInstancesResponse.TotalCount"));
		describeInstancesResponse.setPageNumber(_ctx.stringValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(_ctx.stringValue("DescribeInstancesResponse.PageSize"));

		Instances instances = new Instances();
		instances.setClusterId(_ctx.stringValue("DescribeInstancesResponse.Instances.ClusterId"));
		instances.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances.InstanceId"));
		instances.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances.InstanceName"));
		instances.setInstanceNetworkType(_ctx.stringValue("DescribeInstancesResponse.Instances.InstanceNetworkType"));
		instances.setInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances.InstanceType"));
		instances.setCpu(_ctx.stringValue("DescribeInstancesResponse.Instances.Cpu"));
		instances.setCreationTime(_ctx.stringValue("DescribeInstancesResponse.Instances.CreationTime"));
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}
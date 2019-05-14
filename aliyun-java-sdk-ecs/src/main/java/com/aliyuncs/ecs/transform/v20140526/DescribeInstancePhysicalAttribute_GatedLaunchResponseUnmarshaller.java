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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.DescribeInstancePhysicalAttribute_GatedLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancePhysicalAttribute_GatedLaunchResponseUnmarshaller {

	public static DescribeInstancePhysicalAttribute_GatedLaunchResponse unmarshall(DescribeInstancePhysicalAttribute_GatedLaunchResponse describeInstancePhysicalAttribute_GatedLaunchResponse, UnmarshallerContext context) {
		
		describeInstancePhysicalAttribute_GatedLaunchResponse.setRequestId(context.stringValue("DescribeInstancePhysicalAttribute_GatedLaunchResponse.RequestId"));
		describeInstancePhysicalAttribute_GatedLaunchResponse.setInstanceId(context.stringValue("DescribeInstancePhysicalAttribute_GatedLaunchResponse.InstanceId"));
		describeInstancePhysicalAttribute_GatedLaunchResponse.setVlanId(context.stringValue("DescribeInstancePhysicalAttribute_GatedLaunchResponse.VlanId"));
		describeInstancePhysicalAttribute_GatedLaunchResponse.setNodeControllerId(context.stringValue("DescribeInstancePhysicalAttribute_GatedLaunchResponse.NodeControllerId"));
		describeInstancePhysicalAttribute_GatedLaunchResponse.setRackId(context.stringValue("DescribeInstancePhysicalAttribute_GatedLaunchResponse.RackId"));
	 
	 	return describeInstancePhysicalAttribute_GatedLaunchResponse;
	}
}
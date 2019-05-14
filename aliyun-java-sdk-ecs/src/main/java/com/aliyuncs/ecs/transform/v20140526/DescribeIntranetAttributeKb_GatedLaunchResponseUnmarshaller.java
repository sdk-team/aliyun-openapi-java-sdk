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

import com.aliyuncs.ecs.model.v20140526.DescribeIntranetAttributeKb_GatedLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIntranetAttributeKb_GatedLaunchResponseUnmarshaller {

	public static DescribeIntranetAttributeKb_GatedLaunchResponse unmarshall(DescribeIntranetAttributeKb_GatedLaunchResponse describeIntranetAttributeKb_GatedLaunchResponse, UnmarshallerContext context) {
		
		describeIntranetAttributeKb_GatedLaunchResponse.setRequestId(context.stringValue("DescribeIntranetAttributeKb_GatedLaunchResponse.RequestId"));
		describeIntranetAttributeKb_GatedLaunchResponse.setInstanceId(context.stringValue("DescribeIntranetAttributeKb_GatedLaunchResponse.InstanceId"));
		describeIntranetAttributeKb_GatedLaunchResponse.setVlanId(context.stringValue("DescribeIntranetAttributeKb_GatedLaunchResponse.VlanId"));
		describeIntranetAttributeKb_GatedLaunchResponse.setIntranetIpAddress(context.stringValue("DescribeIntranetAttributeKb_GatedLaunchResponse.IntranetIpAddress"));
		describeIntranetAttributeKb_GatedLaunchResponse.setIntranetMaxBandwidthIn(context.integerValue("DescribeIntranetAttributeKb_GatedLaunchResponse.IntranetMaxBandwidthIn"));
		describeIntranetAttributeKb_GatedLaunchResponse.setIntranetMaxBandwidthOut(context.integerValue("DescribeIntranetAttributeKb_GatedLaunchResponse.IntranetMaxBandwidthOut"));
	 
	 	return describeIntranetAttributeKb_GatedLaunchResponse;
	}
}
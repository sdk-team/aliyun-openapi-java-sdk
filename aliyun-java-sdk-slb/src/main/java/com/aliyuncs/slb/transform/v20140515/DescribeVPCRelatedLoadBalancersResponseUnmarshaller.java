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

import com.aliyuncs.slb.model.v20140515.DescribeVPCRelatedLoadBalancersResponse;
import com.aliyuncs.slb.model.v20140515.DescribeVPCRelatedLoadBalancersResponse.LoadBalancer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVPCRelatedLoadBalancersResponseUnmarshaller {

	public static DescribeVPCRelatedLoadBalancersResponse unmarshall(DescribeVPCRelatedLoadBalancersResponse describeVPCRelatedLoadBalancersResponse, UnmarshallerContext context) {
		
		describeVPCRelatedLoadBalancersResponse.setRequestId(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.RequestId"));
		describeVPCRelatedLoadBalancersResponse.setSuccess(context.booleanValue("DescribeVPCRelatedLoadBalancersResponse.Success"));
		describeVPCRelatedLoadBalancersResponse.setCode(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.Code"));
		describeVPCRelatedLoadBalancersResponse.setMessage(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.Message"));

		List<LoadBalancer> loadBalancers = new ArrayList<LoadBalancer>();
		for (int i = 0; i < context.lengthValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers.Length"); i++) {
			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setLoadBalancerId(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancer.setLoadBalancerName(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadBalancer.setLoadBalancerStatus(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadBalancer.setRegionId(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].RegionId"));
			loadBalancer.setRegionIdAlias(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].RegionIdAlias"));
			loadBalancer.setAddress(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].Address"));
			loadBalancer.setAddressType(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].AddressType"));
			loadBalancer.setVpcId(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].VpcId"));
			loadBalancer.setVSwitchId(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].VSwitchId"));
			loadBalancer.setNetworkType(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].NetworkType"));
			loadBalancer.setBandwidth(context.integerValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].Bandwidth"));
			loadBalancer.setCreateTime(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].CreateTime"));
			loadBalancer.setMasterZoneId(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].MasterZoneId"));
			loadBalancer.setSlaveZoneId(context.stringValue("DescribeVPCRelatedLoadBalancersResponse.LoadBalancers["+ i +"].SlaveZoneId"));

			loadBalancers.add(loadBalancer);
		}
		describeVPCRelatedLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return describeVPCRelatedLoadBalancersResponse;
	}
}
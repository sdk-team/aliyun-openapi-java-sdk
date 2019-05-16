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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeResourcesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourcesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourcesResponseUnmarshaller {

	public static DescribeResourcesResponse unmarshall(DescribeResourcesResponse describeResourcesResponse, UnmarshallerContext context) {
		
		describeResourcesResponse.setRequestId(context.stringValue("DescribeResourcesResponse.RequestId"));
		describeResourcesResponse.setMarker(context.stringValue("DescribeResourcesResponse.Marker"));
		describeResourcesResponse.setTruncated(context.booleanValue("DescribeResourcesResponse.Truncated"));
		describeResourcesResponse.setEstimatedTotal(context.integerValue("DescribeResourcesResponse.EstimatedTotal"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("DescribeResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setProduct(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].Product"));
			resource.setResourceType(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setResourceId(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setResourceName(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].ResourceName"));
			resource.setCreateTime(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].CreateTime"));
			resource.setUpdateTime(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].UpdateTime"));
			resource.setRegionId(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].RegionId"));
			resource.setMatchedAttributes(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].MatchedAttributes"));
			resource.setArn(context.stringValue("DescribeResourcesResponse.Resources["+ i +"].Arn"));

			resources.add(resource);
		}
		describeResourcesResponse.setResources(resources);
	 
	 	return describeResourcesResponse;
	}
}
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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeTagKeys_GatedLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagKeys_GatedLaunchResponseUnmarshaller {

	public static DescribeTagKeys_GatedLaunchResponse unmarshall(DescribeTagKeys_GatedLaunchResponse describeTagKeys_GatedLaunchResponse, UnmarshallerContext context) {
		
		describeTagKeys_GatedLaunchResponse.setRequestId(context.stringValue("DescribeTagKeys_GatedLaunchResponse.RequestId"));
		describeTagKeys_GatedLaunchResponse.setPageSize(context.integerValue("DescribeTagKeys_GatedLaunchResponse.PageSize"));
		describeTagKeys_GatedLaunchResponse.setPageNumber(context.integerValue("DescribeTagKeys_GatedLaunchResponse.PageNumber"));
		describeTagKeys_GatedLaunchResponse.setTotalCount(context.integerValue("DescribeTagKeys_GatedLaunchResponse.TotalCount"));

		List<String> tagKeys = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeTagKeys_GatedLaunchResponse.TagKeys.Length"); i++) {
			tagKeys.add(context.stringValue("DescribeTagKeys_GatedLaunchResponse.TagKeys["+ i +"]"));
		}
		describeTagKeys_GatedLaunchResponse.setTagKeys(tagKeys);
	 
	 	return describeTagKeys_GatedLaunchResponse;
	}
}
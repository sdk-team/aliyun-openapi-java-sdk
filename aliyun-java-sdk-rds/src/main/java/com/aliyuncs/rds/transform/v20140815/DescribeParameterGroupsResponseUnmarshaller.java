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

import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupsResponse.ParameterGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupsResponseUnmarshaller {

	public static DescribeParameterGroupsResponse unmarshall(DescribeParameterGroupsResponse describeParameterGroupsResponse, UnmarshallerContext context) {
		
		describeParameterGroupsResponse.setRequestId(context.stringValue("DescribeParameterGroupsResponse.RequestId"));

		List<ParameterGroup> parameterGroups = new ArrayList<ParameterGroup>();
		for (int i = 0; i < context.lengthValue("DescribeParameterGroupsResponse.ParameterGroups.Length"); i++) {
			ParameterGroup parameterGroup = new ParameterGroup();
			parameterGroup.setParameterGroupType(context.integerValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupType"));
			parameterGroup.setCreated(context.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Created"));
			parameterGroup.setModified(context.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Modified"));
			parameterGroup.setParameterGroupName(context.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupName"));
			parameterGroup.setParamCounts(context.integerValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParamCounts"));
			parameterGroup.setParameterDescription(context.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterDescription"));
			parameterGroup.setForceRestart(context.integerValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ForceRestart"));
			parameterGroup.setEngine(context.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].Engine"));
			parameterGroup.setEngineVersion(context.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].EngineVersion"));
			parameterGroup.setParamGroupId(context.stringValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParamGroupId"));
			parameterGroup.setParameterGroupId(context.integerValue("DescribeParameterGroupsResponse.ParameterGroups["+ i +"].ParameterGroupId"));

			parameterGroups.add(parameterGroup);
		}
		describeParameterGroupsResponse.setParameterGroups(parameterGroups);
	 
	 	return describeParameterGroupsResponse;
	}
}
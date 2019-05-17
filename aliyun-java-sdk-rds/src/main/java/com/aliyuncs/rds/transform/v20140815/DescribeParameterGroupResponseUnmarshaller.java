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

import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupResponse;
import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupResponse.ParameterGroup;
import com.aliyuncs.rds.model.v20140815.DescribeParameterGroupResponse.ParameterGroup.ParameterDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupResponseUnmarshaller {

	public static DescribeParameterGroupResponse unmarshall(DescribeParameterGroupResponse describeParameterGroupResponse, UnmarshallerContext context) {
		
		describeParameterGroupResponse.setRequestId(context.stringValue("DescribeParameterGroupResponse.RequestId"));

		List<ParameterGroup> paramGroup = new ArrayList<ParameterGroup>();
		for (int i = 0; i < context.lengthValue("DescribeParameterGroupResponse.ParamGroup.Length"); i++) {
			ParameterGroup parameterGroup = new ParameterGroup();
			parameterGroup.setParameterGroupType(context.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterGroupType"));
			parameterGroup.setCreated(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].Created"));
			parameterGroup.setModified(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].Modified"));
			parameterGroup.setParameterGroupName(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterGroupName"));
			parameterGroup.setParamCounts(context.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamCounts"));
			parameterGroup.setParameterDescription(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterDescription"));
			parameterGroup.setForceRestart(context.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ForceRestart"));
			parameterGroup.setEngine(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].Engine"));
			parameterGroup.setEngineVersion(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].EngineVersion"));
			parameterGroup.setParamGroupId(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamGroupId"));
			parameterGroup.setParameterGroupId(context.integerValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParameterGroupId"));

			List<ParameterDetail> paramDetail = new ArrayList<ParameterDetail>();
			for (int j = 0; j < context.lengthValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamDetail.Length"); j++) {
				ParameterDetail parameterDetail = new ParameterDetail();
				parameterDetail.setParamName(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamDetail["+ j +"].ParamName"));
				parameterDetail.setParamValue(context.stringValue("DescribeParameterGroupResponse.ParamGroup["+ i +"].ParamDetail["+ j +"].ParamValue"));

				paramDetail.add(parameterDetail);
			}
			parameterGroup.setParamDetail(paramDetail);

			paramGroup.add(parameterGroup);
		}
		describeParameterGroupResponse.setParamGroup(paramGroup);
	 
	 	return describeParameterGroupResponse;
	}
}
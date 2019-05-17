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

import com.aliyuncs.rds.model.v20130528.DescribeParametersResponse;
import com.aliyuncs.rds.model.v20130528.DescribeParametersResponse.ConfigParameter;
import com.aliyuncs.rds.model.v20130528.DescribeParametersResponse.RunningParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext context) {
		
		describeParametersResponse.setRequestId(context.stringValue("DescribeParametersResponse.RequestId"));
		describeParametersResponse.setDBInstanceId(context.stringValue("DescribeParametersResponse.DBInstanceId"));
		describeParametersResponse.setEngine(context.stringValue("DescribeParametersResponse.Engine"));
		describeParametersResponse.setEngineVersion(context.stringValue("DescribeParametersResponse.EngineVersion"));

		List<RunningParameter> runningParameters = new ArrayList<RunningParameter>();
		for (int i = 0; i < context.lengthValue("DescribeParametersResponse.RunningParameters.Length"); i++) {
			RunningParameter runningParameter = new RunningParameter();
			runningParameter.setParameterName(context.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterName"));
			runningParameter.setParameterValue(context.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			runningParameter.setParameterDescription(context.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterDescription"));

			runningParameters.add(runningParameter);
		}
		describeParametersResponse.setRunningParameters(runningParameters);

		List<ConfigParameter> configParameters = new ArrayList<ConfigParameter>();
		for (int i = 0; i < context.lengthValue("DescribeParametersResponse.ConfigParameters.Length"); i++) {
			ConfigParameter configParameter = new ConfigParameter();
			configParameter.setParameterName(context.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterName"));
			configParameter.setParameterValue(context.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterValue"));
			configParameter.setParameterDescription(context.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterDescription"));

			configParameters.add(configParameter);
		}
		describeParametersResponse.setConfigParameters(configParameters);
	 
	 	return describeParametersResponse;
	}
}
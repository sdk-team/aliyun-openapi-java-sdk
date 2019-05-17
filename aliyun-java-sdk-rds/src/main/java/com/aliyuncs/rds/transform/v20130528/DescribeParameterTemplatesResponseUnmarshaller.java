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

import com.aliyuncs.rds.model.v20130528.DescribeParameterTemplatesResponse;
import com.aliyuncs.rds.model.v20130528.DescribeParameterTemplatesResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterTemplatesResponseUnmarshaller {

	public static DescribeParameterTemplatesResponse unmarshall(DescribeParameterTemplatesResponse describeParameterTemplatesResponse, UnmarshallerContext context) {
		
		describeParameterTemplatesResponse.setRequestId(context.stringValue("DescribeParameterTemplatesResponse.RequestId"));
		describeParameterTemplatesResponse.setEngine(context.stringValue("DescribeParameterTemplatesResponse.Engine"));
		describeParameterTemplatesResponse.setEngineVersion(context.stringValue("DescribeParameterTemplatesResponse.EngineVersion"));
		describeParameterTemplatesResponse.setParameterCounts(context.integerValue("DescribeParameterTemplatesResponse.ParameterCounts"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < context.lengthValue("DescribeParameterTemplatesResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setParameterName(context.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ParameterName"));
			parameter.setParameterValue(context.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ParameterValue"));
			parameter.setForceModify(context.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ForceModify"));
			parameter.setForceRestart(context.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ForceRestart"));
			parameter.setCheckingCode(context.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].CheckingCode"));
			parameter.setUnit(context.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].Unit"));
			parameter.setFactor(context.integerValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].Factor"));
			parameter.setParameterDescription(context.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ParameterDescription"));

			parameters.add(parameter);
		}
		describeParameterTemplatesResponse.setParameters(parameters);
	 
	 	return describeParameterTemplatesResponse;
	}
}
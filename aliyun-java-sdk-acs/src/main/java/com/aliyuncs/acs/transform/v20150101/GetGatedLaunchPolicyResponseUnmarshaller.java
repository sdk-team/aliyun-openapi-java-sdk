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

package com.aliyuncs.acs.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.acs.model.v20150101.GetGatedLaunchPolicyResponse;
import com.aliyuncs.acs.model.v20150101.GetGatedLaunchPolicyResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatedLaunchPolicyResponseUnmarshaller {

	public static GetGatedLaunchPolicyResponse unmarshall(GetGatedLaunchPolicyResponse getGatedLaunchPolicyResponse, UnmarshallerContext context) {
		
		getGatedLaunchPolicyResponse.setProductName(context.stringValue("GetGatedLaunchPolicyResponse.productName"));
		getGatedLaunchPolicyResponse.setPolicyName(context.stringValue("GetGatedLaunchPolicyResponse.policyName"));
		getGatedLaunchPolicyResponse.setPercentage(context.integerValue("GetGatedLaunchPolicyResponse.percentage"));
		getGatedLaunchPolicyResponse.setDescription(context.stringValue("GetGatedLaunchPolicyResponse.description"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < context.lengthValue("GetGatedLaunchPolicyResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setKey(context.stringValue("GetGatedLaunchPolicyResponse.Parameters["+ i +"].key"));
			parameter.setValue(context.stringValue("GetGatedLaunchPolicyResponse.Parameters["+ i +"].value"));

			parameters.add(parameter);
		}
		getGatedLaunchPolicyResponse.setParameters(parameters);
	 
	 	return getGatedLaunchPolicyResponse;
	}
}
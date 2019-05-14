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

import com.aliyuncs.acs.model.v20150101.GetControlPolicyResponse;
import com.aliyuncs.acs.model.v20150101.GetControlPolicyResponse.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetControlPolicyResponseUnmarshaller {

	public static GetControlPolicyResponse unmarshall(GetControlPolicyResponse getControlPolicyResponse, UnmarshallerContext context) {
		
		getControlPolicyResponse.setProduct(context.stringValue("GetControlPolicyResponse.product"));
		getControlPolicyResponse.setPolicyName(context.stringValue("GetControlPolicyResponse.policyName"));
		getControlPolicyResponse.setType(context.stringValue("GetControlPolicyResponse.type"));
		getControlPolicyResponse.setDescription(context.stringValue("GetControlPolicyResponse.description"));

		List<Policy> policys = new ArrayList<Policy>();
		for (int i = 0; i < context.lengthValue("GetControlPolicyResponse.Policys.Length"); i++) {
			Policy policy = new Policy();
			policy.setCidrBlocks(context.stringValue("GetControlPolicyResponse.Policys["+ i +"].cidrBlocks"));
			policy.setRegionIds(context.stringValue("GetControlPolicyResponse.Policys["+ i +"].regionIds"));
			policy.setUserId(context.stringValue("GetControlPolicyResponse.Policys["+ i +"].userId"));

			policys.add(policy);
		}
		getControlPolicyResponse.setPolicys(policys);
	 
	 	return getControlPolicyResponse;
	}
}
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

import com.aliyuncs.acs.model.v20150101.GetFlowSpecialByUserIdResponse;
import com.aliyuncs.acs.model.v20150101.GetFlowSpecialByUserIdResponse.FlowSpecial;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowSpecialByUserIdResponseUnmarshaller {

	public static GetFlowSpecialByUserIdResponse unmarshall(GetFlowSpecialByUserIdResponse getFlowSpecialByUserIdResponse, UnmarshallerContext context) {
		

		List<FlowSpecial> flowSpecials = new ArrayList<FlowSpecial>();
		for (int i = 0; i < context.lengthValue("GetFlowSpecialByUserIdResponse.FlowSpecials.Length"); i++) {
			FlowSpecial flowSpecial = new FlowSpecial();
			flowSpecial.setName(context.stringValue("GetFlowSpecialByUserIdResponse.FlowSpecials["+ i +"].name"));
			flowSpecial.setProduct(context.stringValue("GetFlowSpecialByUserIdResponse.FlowSpecials["+ i +"].product"));

			flowSpecials.add(flowSpecial);
		}
		getFlowSpecialByUserIdResponse.setFlowSpecials(flowSpecials);
	 
	 	return getFlowSpecialByUserIdResponse;
	}
}
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

import com.aliyuncs.acs.model.v20150101.GetFlowSpecialAPIResponse;
import com.aliyuncs.acs.model.v20150101.GetFlowSpecialAPIResponse.Api;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowSpecialAPIResponseUnmarshaller {

	public static GetFlowSpecialAPIResponse unmarshall(GetFlowSpecialAPIResponse getFlowSpecialAPIResponse, UnmarshallerContext context) {
		
		getFlowSpecialAPIResponse.setProduct(context.stringValue("GetFlowSpecialAPIResponse.product"));
		getFlowSpecialAPIResponse.setName(context.stringValue("GetFlowSpecialAPIResponse.name"));

		List<Api> apis = new ArrayList<Api>();
		for (int i = 0; i < context.lengthValue("GetFlowSpecialAPIResponse.Apis.Length"); i++) {
			Api api = new Api();
			api.setName(context.stringValue("GetFlowSpecialAPIResponse.Apis["+ i +"].name"));
			api.setProduct(context.stringValue("GetFlowSpecialAPIResponse.Apis["+ i +"].product"));
			api.setVersion(context.stringValue("GetFlowSpecialAPIResponse.Apis["+ i +"].version"));

			apis.add(api);
		}
		getFlowSpecialAPIResponse.setApis(apis);
	 
	 	return getFlowSpecialAPIResponse;
	}
}
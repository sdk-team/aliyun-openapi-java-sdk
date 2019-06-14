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

package com.aliyuncs.slb.transform.v20140515;

import com.aliyuncs.slb.model.v20140515.ProduceSlbInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProduceSlbInstanceResponseUnmarshaller {

	public static ProduceSlbInstanceResponse unmarshall(ProduceSlbInstanceResponse produceSlbInstanceResponse, UnmarshallerContext context) {
		
		produceSlbInstanceResponse.setRequestId(context.stringValue("ProduceSlbInstanceResponse.requestId"));
		produceSlbInstanceResponse.setData(context.stringValue("ProduceSlbInstanceResponse.data"));
		produceSlbInstanceResponse.setCode(context.stringValue("ProduceSlbInstanceResponse.code"));
		produceSlbInstanceResponse.setSuccess(context.booleanValue("ProduceSlbInstanceResponse.success"));
		produceSlbInstanceResponse.setMessage(context.stringValue("ProduceSlbInstanceResponse.message"));
	 
	 	return produceSlbInstanceResponse;
	}
}
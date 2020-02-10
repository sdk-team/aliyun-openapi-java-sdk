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

package com.aliyuncs.ecsdemo.transform.v20190626;

import com.aliyuncs.ecsdemo.model.v20190626.CancelInstanceResponse;
import com.aliyuncs.ecsdemo.model.v20190626.CancelInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelInstanceResponseUnmarshaller {

	public static CancelInstanceResponse unmarshall(CancelInstanceResponse cancelInstanceResponse, UnmarshallerContext _ctx) {
		
		cancelInstanceResponse.setRequestId(_ctx.stringValue("CancelInstanceResponse.RequestId"));

		Instance instance = new Instance();
		instance.setId(_ctx.stringValue("CancelInstanceResponse.Instance.Id"));
		instance.setName(_ctx.stringValue("CancelInstanceResponse.Instance.Name"));
		instance.setHost(_ctx.stringValue("CancelInstanceResponse.Instance.Host"));
		cancelInstanceResponse.setInstance(instance);
	 
	 	return cancelInstanceResponse;
	}
}
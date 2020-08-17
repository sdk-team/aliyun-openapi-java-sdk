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

package com.aliyuncs.sdk.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sdk.model.v20180101.DemoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DemoResponseUnmarshaller {

	public static DemoResponse unmarshall(DemoResponse demoResponse, UnmarshallerContext _ctx) {
		
		demoResponse.setRequestId(_ctx.stringValue("DemoResponse.RequestId"));
		demoResponse.setTetMap(_ctx.mapValue("DemoResponse.TetMap"));

		List<Map<Object, Object>> listMap = _ctx.listMapValue("DemoResponse.ListMap");
		demoResponse.setListMap(listMap);
	 
	 	return demoResponse;
	}
}
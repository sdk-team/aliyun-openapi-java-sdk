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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.InnerEcsCountInRegionResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsCountInRegionResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerEcsCountInRegionResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsCountInRegionResponseUnmarshaller {

	public static InnerEcsCountInRegionResponse unmarshall(InnerEcsCountInRegionResponse innerEcsCountInRegionResponse, UnmarshallerContext _ctx) {
		
		innerEcsCountInRegionResponse.setRequestId(_ctx.stringValue("InnerEcsCountInRegionResponse.RequestId"));
		innerEcsCountInRegionResponse.setCount(_ctx.integerValue("InnerEcsCountInRegionResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsCountInRegionResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsCountInRegionResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsCountInRegionResponse.errorCode.isSuccess"));
		innerEcsCountInRegionResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsCountInRegionResponse.data.Length"); i++) {
			Item item = new Item();
			item.setAliUid(_ctx.longValue("InnerEcsCountInRegionResponse.data["+ i +"].aliUid"));
			item.setRegionNo(_ctx.stringValue("InnerEcsCountInRegionResponse.data["+ i +"].regionNo"));
			item.setEcsNum(_ctx.integerValue("InnerEcsCountInRegionResponse.data["+ i +"].ecsNum"));

			data.add(item);
		}
		innerEcsCountInRegionResponse.setData(data);
	 
	 	return innerEcsCountInRegionResponse;
	}
}
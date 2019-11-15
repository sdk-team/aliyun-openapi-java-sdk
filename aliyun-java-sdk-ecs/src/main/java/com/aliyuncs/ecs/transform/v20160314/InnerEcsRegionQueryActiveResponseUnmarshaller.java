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

import com.aliyuncs.ecs.model.v20160314.InnerEcsRegionQueryActiveResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsRegionQueryActiveResponse.ErrorCode;
import com.aliyuncs.ecs.model.v20160314.InnerEcsRegionQueryActiveResponse.Item;
import com.aliyuncs.ecs.model.v20160314.InnerEcsRegionQueryActiveResponse.Item.Attributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsRegionQueryActiveResponseUnmarshaller {

	public static InnerEcsRegionQueryActiveResponse unmarshall(InnerEcsRegionQueryActiveResponse innerEcsRegionQueryActiveResponse, UnmarshallerContext _ctx) {
		
		innerEcsRegionQueryActiveResponse.setRequestId(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.RequestId"));
		innerEcsRegionQueryActiveResponse.setCount(_ctx.integerValue("InnerEcsRegionQueryActiveResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsRegionQueryActiveResponse.errorCode.isSuccess"));
		innerEcsRegionQueryActiveResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsRegionQueryActiveResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRegionNoAlias(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionNoAlias"));
			item.setRegionMemo(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionMemo"));
			item.setRegionName(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionName"));
			item.setRegionNo(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionNo"));
			item.setRegionEnName(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].regionEnName"));
			item.setIsActive(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].isActive"));
			item.setId(_ctx.longValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].id"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].attributes.support_image_copy"));
			attributes.setInternal_use(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].attributes.internal_use"));
			attributes.setAk_name(_ctx.stringValue("InnerEcsRegionQueryActiveResponse.data["+ i +"].attributes.ak_name"));
			item.setAttributes(attributes);

			data.add(item);
		}
		innerEcsRegionQueryActiveResponse.setData(data);
	 
	 	return innerEcsRegionQueryActiveResponse;
	}
}
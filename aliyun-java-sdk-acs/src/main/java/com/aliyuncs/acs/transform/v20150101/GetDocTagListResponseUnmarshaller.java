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

import com.aliyuncs.acs.model.v20150101.GetDocTagListResponse;
import com.aliyuncs.acs.model.v20150101.GetDocTagListResponse.DoctTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDocTagListResponseUnmarshaller {

	public static GetDocTagListResponse unmarshall(GetDocTagListResponse getDocTagListResponse, UnmarshallerContext context) {
		

		List<DoctTag> doctTagList = new ArrayList<DoctTag>();
		for (int i = 0; i < context.lengthValue("GetDocTagListResponse.DoctTagList.Length"); i++) {
			DoctTag doctTag = new DoctTag();
			doctTag.setProduct(context.stringValue("GetDocTagListResponse.DoctTagList["+ i +"].product"));
			doctTag.setTagId(context.stringValue("GetDocTagListResponse.DoctTagList["+ i +"].tagId"));
			doctTag.setName(context.stringValue("GetDocTagListResponse.DoctTagList["+ i +"].name"));
			doctTag.setType(context.stringValue("GetDocTagListResponse.DoctTagList["+ i +"].type"));
			doctTag.setLanguage(context.stringValue("GetDocTagListResponse.DoctTagList["+ i +"].language"));
			doctTag.setIndex(context.stringValue("GetDocTagListResponse.DoctTagList["+ i +"].index"));

			doctTagList.add(doctTag);
		}
		getDocTagListResponse.setDoctTagList(doctTagList);
	 
	 	return getDocTagListResponse;
	}
}
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

import com.aliyuncs.acs.model.v20150101.GetDocTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDocTagResponseUnmarshaller {

	public static GetDocTagResponse unmarshall(GetDocTagResponse getDocTagResponse, UnmarshallerContext context) {
		
		getDocTagResponse.setProduct(context.stringValue("GetDocTagResponse.product"));
		getDocTagResponse.setTagId(context.stringValue("GetDocTagResponse.tagId"));
		getDocTagResponse.setName(context.stringValue("GetDocTagResponse.name"));
		getDocTagResponse.setType(context.stringValue("GetDocTagResponse.type"));
		getDocTagResponse.setLanguage(context.stringValue("GetDocTagResponse.language"));
		getDocTagResponse.setIndex(context.stringValue("GetDocTagResponse.index"));
	 
	 	return getDocTagResponse;
	}
}
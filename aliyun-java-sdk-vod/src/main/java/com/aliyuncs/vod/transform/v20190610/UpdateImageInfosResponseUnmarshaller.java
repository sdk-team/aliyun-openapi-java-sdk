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

package com.aliyuncs.vod.transform.v20190610;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20190610.UpdateImageInfosResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateImageInfosResponseUnmarshaller {

	public static UpdateImageInfosResponse unmarshall(UpdateImageInfosResponse updateImageInfosResponse, UnmarshallerContext _ctx) {
		
		updateImageInfosResponse.setRequestId(_ctx.stringValue("UpdateImageInfosResponse.RequestId"));

		List<String> nonExistImageIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateImageInfosResponse.NonExistImageIds.Length"); i++) {
			nonExistImageIds.add(_ctx.stringValue("UpdateImageInfosResponse.NonExistImageIds["+ i +"]"));
		}
		updateImageInfosResponse.setNonExistImageIds(nonExistImageIds);
	 
	 	return updateImageInfosResponse;
	}
}
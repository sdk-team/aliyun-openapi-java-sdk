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

package com.aliyuncs.iot.transform.v20190730;

import com.aliyuncs.iot.model.v20190730.CategoryMigrateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CategoryMigrateResponseUnmarshaller {

	public static CategoryMigrateResponse unmarshall(CategoryMigrateResponse categoryMigrateResponse, UnmarshallerContext _ctx) {
		
		categoryMigrateResponse.setRequestId(_ctx.stringValue("CategoryMigrateResponse.RequestId"));
		categoryMigrateResponse.setSuccess(_ctx.booleanValue("CategoryMigrateResponse.Success"));
		categoryMigrateResponse.setCode(_ctx.stringValue("CategoryMigrateResponse.Code"));
		categoryMigrateResponse.setErrorMessage(_ctx.stringValue("CategoryMigrateResponse.ErrorMessage"));
	 
	 	return categoryMigrateResponse;
	}
}
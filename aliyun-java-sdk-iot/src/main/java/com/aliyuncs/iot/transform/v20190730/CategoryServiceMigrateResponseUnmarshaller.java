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

import com.aliyuncs.iot.model.v20190730.CategoryServiceMigrateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CategoryServiceMigrateResponseUnmarshaller {

	public static CategoryServiceMigrateResponse unmarshall(CategoryServiceMigrateResponse categoryServiceMigrateResponse, UnmarshallerContext _ctx) {
		
		categoryServiceMigrateResponse.setRequestId(_ctx.stringValue("CategoryServiceMigrateResponse.RequestId"));
		categoryServiceMigrateResponse.setSuccess(_ctx.booleanValue("CategoryServiceMigrateResponse.Success"));
		categoryServiceMigrateResponse.setCode(_ctx.stringValue("CategoryServiceMigrateResponse.Code"));
		categoryServiceMigrateResponse.setErrorMessage(_ctx.stringValue("CategoryServiceMigrateResponse.ErrorMessage"));
	 
	 	return categoryServiceMigrateResponse;
	}
}
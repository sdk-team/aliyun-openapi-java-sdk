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

import com.aliyuncs.iot.model.v20190730.CategoryPropertyMigrateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CategoryPropertyMigrateResponseUnmarshaller {

	public static CategoryPropertyMigrateResponse unmarshall(CategoryPropertyMigrateResponse categoryPropertyMigrateResponse, UnmarshallerContext _ctx) {
		
		categoryPropertyMigrateResponse.setRequestId(_ctx.stringValue("CategoryPropertyMigrateResponse.RequestId"));
		categoryPropertyMigrateResponse.setSuccess(_ctx.booleanValue("CategoryPropertyMigrateResponse.Success"));
		categoryPropertyMigrateResponse.setCode(_ctx.stringValue("CategoryPropertyMigrateResponse.Code"));
		categoryPropertyMigrateResponse.setErrorMessage(_ctx.stringValue("CategoryPropertyMigrateResponse.ErrorMessage"));
	 
	 	return categoryPropertyMigrateResponse;
	}
}
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

import com.aliyuncs.iot.model.v20190730.PropertyMigrateToProdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PropertyMigrateToProdResponseUnmarshaller {

	public static PropertyMigrateToProdResponse unmarshall(PropertyMigrateToProdResponse propertyMigrateToProdResponse, UnmarshallerContext _ctx) {
		
		propertyMigrateToProdResponse.setRequestId(_ctx.stringValue("PropertyMigrateToProdResponse.RequestId"));
		propertyMigrateToProdResponse.setSuccess(_ctx.booleanValue("PropertyMigrateToProdResponse.Success"));
		propertyMigrateToProdResponse.setCode(_ctx.stringValue("PropertyMigrateToProdResponse.Code"));
		propertyMigrateToProdResponse.setErrorMessage(_ctx.stringValue("PropertyMigrateToProdResponse.ErrorMessage"));
	 
	 	return propertyMigrateToProdResponse;
	}
}
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

package com.aliyuncs.actiontrail.transform.v20150928;

import com.aliyuncs.actiontrail.model.v20150928.CreateTrailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrailResponseUnmarshaller {

	public static CreateTrailResponse unmarshall(CreateTrailResponse createTrailResponse, UnmarshallerContext context) {
		
		createTrailResponse.setName(context.stringValue("CreateTrailResponse.Name"));
		createTrailResponse.setOssBucketName(context.stringValue("CreateTrailResponse.OssBucketName"));
		createTrailResponse.setOssKeyPrefix(context.stringValue("CreateTrailResponse.OssKeyPrefix"));
		createTrailResponse.setRoleName(context.stringValue("CreateTrailResponse.RoleName"));
		createTrailResponse.setParam(context.stringValue("CreateTrailResponse.Param"));
		createTrailResponse.setResult(context.stringValue("CreateTrailResponse.Result"));
	 
	 	return createTrailResponse;
	}
}
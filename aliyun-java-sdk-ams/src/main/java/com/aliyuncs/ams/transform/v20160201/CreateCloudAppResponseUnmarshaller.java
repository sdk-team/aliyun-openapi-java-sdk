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

package com.aliyuncs.ams.transform.v20160201;

import com.aliyuncs.ams.model.v20160201.CreateCloudAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCloudAppResponseUnmarshaller {

	public static CreateCloudAppResponse unmarshall(CreateCloudAppResponse createCloudAppResponse, UnmarshallerContext context) {
		
		createCloudAppResponse.setRequestId(context.stringValue("CreateCloudAppResponse.RequestId"));
		createCloudAppResponse.setAppId(context.longValue("CreateCloudAppResponse.AppId"));
		createCloudAppResponse.setAppName(context.stringValue("CreateCloudAppResponse.AppName"));
		createCloudAppResponse.setDescription(context.stringValue("CreateCloudAppResponse.Description"));
	 
	 	return createCloudAppResponse;
	}
}
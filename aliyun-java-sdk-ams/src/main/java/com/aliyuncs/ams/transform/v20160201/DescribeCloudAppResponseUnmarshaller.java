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

import com.aliyuncs.ams.model.v20160201.DescribeCloudAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudAppResponseUnmarshaller {

	public static DescribeCloudAppResponse unmarshall(DescribeCloudAppResponse describeCloudAppResponse, UnmarshallerContext context) {
		
		describeCloudAppResponse.setRequestId(context.stringValue("DescribeCloudAppResponse.RequestId"));
		describeCloudAppResponse.setAppId(context.longValue("DescribeCloudAppResponse.AppId"));
		describeCloudAppResponse.setAppName(context.stringValue("DescribeCloudAppResponse.AppName"));
		describeCloudAppResponse.setDescription(context.stringValue("DescribeCloudAppResponse.Description"));
	 
	 	return describeCloudAppResponse;
	}
}
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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.CreatePostpaidDBInstanceForChannelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePostpaidDBInstanceForChannelResponseUnmarshaller {

	public static CreatePostpaidDBInstanceForChannelResponse unmarshall(CreatePostpaidDBInstanceForChannelResponse createPostpaidDBInstanceForChannelResponse, UnmarshallerContext context) {
		
		createPostpaidDBInstanceForChannelResponse.setRequestId(context.stringValue("CreatePostpaidDBInstanceForChannelResponse.RequestId"));
		createPostpaidDBInstanceForChannelResponse.setDBInstanceId(context.stringValue("CreatePostpaidDBInstanceForChannelResponse.DBInstanceId"));
		createPostpaidDBInstanceForChannelResponse.setOrderId(context.stringValue("CreatePostpaidDBInstanceForChannelResponse.OrderId"));
		createPostpaidDBInstanceForChannelResponse.setConnectionString(context.stringValue("CreatePostpaidDBInstanceForChannelResponse.ConnectionString"));
		createPostpaidDBInstanceForChannelResponse.setPort(context.stringValue("CreatePostpaidDBInstanceForChannelResponse.Port"));
	 
	 	return createPostpaidDBInstanceForChannelResponse;
	}
}
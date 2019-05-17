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

package com.aliyuncs.aas.transform.v20150701;

import com.aliyuncs.aas.model.v20150701.GetShortTermAccessKeyForAccountResponse;
import com.aliyuncs.aas.model.v20150701.GetShortTermAccessKeyForAccountResponse.AccessKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetShortTermAccessKeyForAccountResponseUnmarshaller {

	public static GetShortTermAccessKeyForAccountResponse unmarshall(GetShortTermAccessKeyForAccountResponse getShortTermAccessKeyForAccountResponse, UnmarshallerContext context) {
		
		getShortTermAccessKeyForAccountResponse.setRequestId(context.stringValue("GetShortTermAccessKeyForAccountResponse.RequestId"));
		getShortTermAccessKeyForAccountResponse.setPK(context.stringValue("GetShortTermAccessKeyForAccountResponse.PK"));

		AccessKey accessKey = new AccessKey();
		accessKey.setCreateTime(context.stringValue("GetShortTermAccessKeyForAccountResponse.AccessKey.CreateTime"));
		accessKey.setAccessKeyId(context.stringValue("GetShortTermAccessKeyForAccountResponse.AccessKey.AccessKeyId"));
		accessKey.setAccessKeySecret(context.stringValue("GetShortTermAccessKeyForAccountResponse.AccessKey.AccessKeySecret"));
		accessKey.setAccessKeyStatus(context.stringValue("GetShortTermAccessKeyForAccountResponse.AccessKey.AccessKeyStatus"));
		accessKey.setAccessKeyType(context.stringValue("GetShortTermAccessKeyForAccountResponse.AccessKey.AccessKeyType"));
		accessKey.setExpireTime(context.stringValue("GetShortTermAccessKeyForAccountResponse.AccessKey.ExpireTime"));
		getShortTermAccessKeyForAccountResponse.setAccessKey(accessKey);
	 
	 	return getShortTermAccessKeyForAccountResponse;
	}
}
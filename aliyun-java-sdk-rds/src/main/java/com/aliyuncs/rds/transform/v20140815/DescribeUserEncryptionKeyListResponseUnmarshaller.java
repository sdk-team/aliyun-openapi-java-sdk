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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeUserEncryptionKeyListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserEncryptionKeyListResponseUnmarshaller {

	public static DescribeUserEncryptionKeyListResponse unmarshall(DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListResponse, UnmarshallerContext context) {
		
		describeUserEncryptionKeyListResponse.setRequestId(context.stringValue("DescribeUserEncryptionKeyListResponse.RequestId"));

		List<String> keyIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeUserEncryptionKeyListResponse.KeyIds.Length"); i++) {
			keyIds.add(context.stringValue("DescribeUserEncryptionKeyListResponse.KeyIds["+ i +"]"));
		}
		describeUserEncryptionKeyListResponse.setKeyIds(keyIds);
	 
	 	return describeUserEncryptionKeyListResponse;
	}
}
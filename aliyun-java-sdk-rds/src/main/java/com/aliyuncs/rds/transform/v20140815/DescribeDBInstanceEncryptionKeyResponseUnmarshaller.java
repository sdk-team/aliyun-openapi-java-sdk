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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEncryptionKeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceEncryptionKeyResponseUnmarshaller {

	public static DescribeDBInstanceEncryptionKeyResponse unmarshall(DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKeyResponse, UnmarshallerContext context) {
		
		describeDBInstanceEncryptionKeyResponse.setRequestId(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.RequestId"));
		describeDBInstanceEncryptionKeyResponse.setEncryptionKey(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKey"));
		describeDBInstanceEncryptionKeyResponse.setDescription(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.Description"));
		describeDBInstanceEncryptionKeyResponse.setKeyUsage(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.KeyUsage"));
		describeDBInstanceEncryptionKeyResponse.setDeleteDate(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.DeleteDate"));
		describeDBInstanceEncryptionKeyResponse.setCreator(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.Creator"));
		describeDBInstanceEncryptionKeyResponse.setOrigin(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.Origin"));
		describeDBInstanceEncryptionKeyResponse.setMaterialExpireTime(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.MaterialExpireTime"));
		describeDBInstanceEncryptionKeyResponse.setEncryptionKeyStatus(context.stringValue("DescribeDBInstanceEncryptionKeyResponse.EncryptionKeyStatus"));
	 
	 	return describeDBInstanceEncryptionKeyResponse;
	}
}
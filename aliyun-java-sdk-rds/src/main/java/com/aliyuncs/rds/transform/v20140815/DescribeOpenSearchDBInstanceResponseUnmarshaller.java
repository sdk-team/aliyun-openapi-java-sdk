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

import com.aliyuncs.rds.model.v20140815.DescribeOpenSearchDBInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOpenSearchDBInstanceResponseUnmarshaller {

	public static DescribeOpenSearchDBInstanceResponse unmarshall(DescribeOpenSearchDBInstanceResponse describeOpenSearchDBInstanceResponse, UnmarshallerContext context) {
		
		describeOpenSearchDBInstanceResponse.setRequestId(context.stringValue("DescribeOpenSearchDBInstanceResponse.RequestId"));
		describeOpenSearchDBInstanceResponse.setDBInstanceName(context.stringValue("DescribeOpenSearchDBInstanceResponse.DBInstanceName"));
		describeOpenSearchDBInstanceResponse.setStorageQuota(context.stringValue("DescribeOpenSearchDBInstanceResponse.StorageQuota"));
		describeOpenSearchDBInstanceResponse.setLcuQuota(context.stringValue("DescribeOpenSearchDBInstanceResponse.LcuQuota"));
		describeOpenSearchDBInstanceResponse.setSpecQuota(context.stringValue("DescribeOpenSearchDBInstanceResponse.SpecQuota"));
		describeOpenSearchDBInstanceResponse.setSearchType(context.stringValue("DescribeOpenSearchDBInstanceResponse.SearchType"));
	 
	 	return describeOpenSearchDBInstanceResponse;
	}
}
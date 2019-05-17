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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesWithCloudResourceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesWithCloudResourceResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesWithCloudResourceResponseUnmarshaller {

	public static DescribeDBInstancesWithCloudResourceResponse unmarshall(DescribeDBInstancesWithCloudResourceResponse describeDBInstancesWithCloudResourceResponse, UnmarshallerContext context) {
		
		describeDBInstancesWithCloudResourceResponse.setRequestId(context.stringValue("DescribeDBInstancesWithCloudResourceResponse.RequestId"));

		List<DBInstance> dBInstanceNameList = new ArrayList<DBInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesWithCloudResourceResponse.DBInstanceNameList.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceName(context.stringValue("DescribeDBInstancesWithCloudResourceResponse.DBInstanceNameList["+ i +"].DBInstanceName"));

			dBInstanceNameList.add(dBInstance);
		}
		describeDBInstancesWithCloudResourceResponse.setDBInstanceNameList(dBInstanceNameList);
	 
	 	return describeDBInstancesWithCloudResourceResponse;
	}
}
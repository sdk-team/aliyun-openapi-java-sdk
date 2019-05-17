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

package com.aliyuncs.rds.transform.v20130528;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20130528.DescribeDBInstanceClassesResponse;
import com.aliyuncs.rds.model.v20130528.DescribeDBInstanceClassesResponse.DBInstanceClassItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceClassesResponseUnmarshaller {

	public static DescribeDBInstanceClassesResponse unmarshall(DescribeDBInstanceClassesResponse describeDBInstanceClassesResponse, UnmarshallerContext context) {
		
		describeDBInstanceClassesResponse.setRequestId(context.stringValue("DescribeDBInstanceClassesResponse.RequestId"));

		List<DBInstanceClassItem> dBInstanceClasses = new ArrayList<DBInstanceClassItem>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceClassesResponse.DBInstanceClasses.Length"); i++) {
			DBInstanceClassItem dBInstanceClassItem = new DBInstanceClassItem();
			dBInstanceClassItem.setDBInstanceMemory(context.longValue("DescribeDBInstanceClassesResponse.DBInstanceClasses["+ i +"].DBInstanceMemory"));
			dBInstanceClassItem.setDBInstanceConnections(context.longValue("DescribeDBInstanceClassesResponse.DBInstanceClasses["+ i +"].DBInstanceConnections"));
			dBInstanceClassItem.setEngine(context.stringValue("DescribeDBInstanceClassesResponse.DBInstanceClasses["+ i +"].Engine"));
			dBInstanceClassItem.setDBInstanceClass(context.stringValue("DescribeDBInstanceClassesResponse.DBInstanceClasses["+ i +"].DBInstanceClass"));
			dBInstanceClassItem.setDBInstanceStorage(context.longValue("DescribeDBInstanceClassesResponse.DBInstanceClasses["+ i +"].DBInstanceStorage"));
			dBInstanceClassItem.setIORequestTimes(context.longValue("DescribeDBInstanceClassesResponse.DBInstanceClasses["+ i +"].IORequestTimes"));

			dBInstanceClasses.add(dBInstanceClassItem);
		}
		describeDBInstanceClassesResponse.setDBInstanceClasses(dBInstanceClasses);
	 
	 	return describeDBInstanceClassesResponse;
	}
}
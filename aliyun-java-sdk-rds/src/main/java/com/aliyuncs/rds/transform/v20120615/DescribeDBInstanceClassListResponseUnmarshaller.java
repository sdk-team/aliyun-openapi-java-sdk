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

package com.aliyuncs.rds.transform.v20120615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20120615.DescribeDBInstanceClassListResponse;
import com.aliyuncs.rds.model.v20120615.DescribeDBInstanceClassListResponse.DBInstanceClassItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceClassListResponseUnmarshaller {

	public static DescribeDBInstanceClassListResponse unmarshall(DescribeDBInstanceClassListResponse describeDBInstanceClassListResponse, UnmarshallerContext context) {
		
		describeDBInstanceClassListResponse.setRequestId(context.stringValue("DescribeDBInstanceClassListResponse.RequestId"));

		List<DBInstanceClassItem> dBInstanceClasses = new ArrayList<DBInstanceClassItem>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceClassListResponse.DBInstanceClasses.Length"); i++) {
			DBInstanceClassItem dBInstanceClassItem = new DBInstanceClassItem();
			dBInstanceClassItem.setDBInstanceMemory(context.longValue("DescribeDBInstanceClassListResponse.DBInstanceClasses["+ i +"].DBInstanceMemory"));
			dBInstanceClassItem.setDBInstanceConnections(context.longValue("DescribeDBInstanceClassListResponse.DBInstanceClasses["+ i +"].DBInstanceConnections"));
			dBInstanceClassItem.setEngine(context.stringValue("DescribeDBInstanceClassListResponse.DBInstanceClasses["+ i +"].Engine"));
			dBInstanceClassItem.setDBInstanceClass(context.stringValue("DescribeDBInstanceClassListResponse.DBInstanceClasses["+ i +"].DBInstanceClass"));
			dBInstanceClassItem.setDBInstanceStorage(context.longValue("DescribeDBInstanceClassListResponse.DBInstanceClasses["+ i +"].DBInstanceStorage"));
			dBInstanceClassItem.setIORequestTimes(context.longValue("DescribeDBInstanceClassListResponse.DBInstanceClasses["+ i +"].IORequestTimes"));

			dBInstanceClasses.add(dBInstanceClassItem);
		}
		describeDBInstanceClassListResponse.setDBInstanceClasses(dBInstanceClasses);
	 
	 	return describeDBInstanceClassListResponse;
	}
}
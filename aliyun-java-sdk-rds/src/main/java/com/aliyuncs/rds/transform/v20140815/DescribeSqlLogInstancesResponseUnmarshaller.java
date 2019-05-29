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

import com.aliyuncs.rds.model.v20140815.DescribeSqlLogInstancesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSqlLogInstancesResponse.SqlLogInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlLogInstancesResponseUnmarshaller {

	public static DescribeSqlLogInstancesResponse unmarshall(DescribeSqlLogInstancesResponse describeSqlLogInstancesResponse, UnmarshallerContext context) {
		
		describeSqlLogInstancesResponse.setRequestId(context.stringValue("DescribeSqlLogInstancesResponse.RequestId"));
		describeSqlLogInstancesResponse.setUid(context.longValue("DescribeSqlLogInstancesResponse.Uid"));

		List<SqlLogInstance> items = new ArrayList<SqlLogInstance>();
		for (int i = 0; i < context.lengthValue("DescribeSqlLogInstancesResponse.Items.Length"); i++) {
			SqlLogInstance sqlLogInstance = new SqlLogInstance();
			sqlLogInstance.setDBInstanceID(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].DBInstanceID"));
			sqlLogInstance.setDBInstanceName(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].DBInstanceName"));
			sqlLogInstance.setRdsRegion(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].RdsRegion"));
			sqlLogInstance.setRdsDbType(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].RdsDbType"));
			sqlLogInstance.setRdsDbVersion(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].RdsDbVersion"));
			sqlLogInstance.setEnableSqlLog(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].EnableSqlLog"));
			sqlLogInstance.setEnableSqlLogDistribution(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].EnableSqlLogDistribution"));
			sqlLogInstance.setLoghubRegion(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].LoghubRegion"));
			sqlLogInstance.setLoghubProject(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].LoghubProject"));
			sqlLogInstance.setLoghubLogstore(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].LoghubLogstore"));
			sqlLogInstance.setSqlExplorerTrial(context.stringValue("DescribeSqlLogInstancesResponse.Items["+ i +"].SqlExplorerTrial"));

			items.add(sqlLogInstance);
		}
		describeSqlLogInstancesResponse.setItems(items);
	 
	 	return describeSqlLogInstancesResponse;
	}
}
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

import com.aliyuncs.rds.model.v20130528.DescribeDBInstancesResponse;
import com.aliyuncs.rds.model.v20130528.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.rds.model.v20130528.DescribeDBInstancesResponse.DBInstance.ReadOnlyDBInstanceId;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext context) {
		
		describeDBInstancesResponse.setRequestId(context.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setPageNumber(context.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setTotalRecordCount(context.integerValue("DescribeDBInstancesResponse.TotalRecordCount"));
		describeDBInstancesResponse.setPageRecordCount(context.integerValue("DescribeDBInstancesResponse.PageRecordCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setInsId(context.integerValue("DescribeDBInstancesResponse.Items["+ i +"].InsId"));
			dBInstance.setDBInstanceId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setPayType(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].PayType"));
			dBInstance.setDBInstanceType(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setRegionId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setExpireTime(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setDBInstanceStatus(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setEngine(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Engine"));
			dBInstance.setDBInstanceNetType(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstance.setConnectionMode(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ConnectionMode"));
			dBInstance.setLockMode(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setInstanceNetworkType(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstance.setLockReason(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setZoneId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setMutriORsignle(context.booleanValue("DescribeDBInstancesResponse.Items["+ i +"].MutriORsignle"));
			dBInstance.setCreateTime(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].CreateTime"));
			dBInstance.setEngineVersion(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setGuardDBInstanceId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstance.setTempDBInstanceId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstance.setMasterInstanceId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MasterInstanceId"));
			dBInstance.setVpcId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(context.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			items.add(dBInstance);
		}
		describeDBInstancesResponse.setItems(items);
	 
	 	return describeDBInstancesResponse;
	}
}
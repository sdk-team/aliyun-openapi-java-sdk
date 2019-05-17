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

import com.aliyuncs.rds.model.v20140815.DescribeMigrateCountInfoResponse;
import com.aliyuncs.rds.model.v20140815.DescribeMigrateCountInfoResponse.MigrateTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrateCountInfoResponseUnmarshaller {

	public static DescribeMigrateCountInfoResponse unmarshall(DescribeMigrateCountInfoResponse describeMigrateCountInfoResponse, UnmarshallerContext context) {
		
		describeMigrateCountInfoResponse.setRequestId(context.stringValue("DescribeMigrateCountInfoResponse.RequestId"));
		describeMigrateCountInfoResponse.setDBInstanceId(context.stringValue("DescribeMigrateCountInfoResponse.DBInstanceId"));
		describeMigrateCountInfoResponse.setRegionId(context.stringValue("DescribeMigrateCountInfoResponse.RegionId"));
		describeMigrateCountInfoResponse.setZoneId(context.stringValue("DescribeMigrateCountInfoResponse.zoneId"));
		describeMigrateCountInfoResponse.setMigrationTimes(context.integerValue("DescribeMigrateCountInfoResponse.MigrationTimes"));
		describeMigrateCountInfoResponse.setMigrationMaxTimes(context.integerValue("DescribeMigrateCountInfoResponse.MigrationMaxTimes"));
		describeMigrateCountInfoResponse.setOpActionType(context.stringValue("DescribeMigrateCountInfoResponse.OpActionType"));

		List<MigrateTask> items = new ArrayList<MigrateTask>();
		for (int i = 0; i < context.lengthValue("DescribeMigrateCountInfoResponse.Items.Length"); i++) {
			MigrateTask migrateTask = new MigrateTask();
			migrateTask.setSourceRegionId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].SourceRegionId"));
			migrateTask.setSourceZoneId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].SourceZoneId"));
			migrateTask.setTargetRegionId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].TargetRegionId"));
			migrateTask.setTargetZoneId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].TargetZoneId"));
			migrateTask.setSourceVpcId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].SourceVpcId"));
			migrateTask.setSourceVSwitchId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].SourceVSwitchId"));
			migrateTask.setTargetVpcId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].TargetVpcId"));
			migrateTask.setTargetVSwitchId(context.stringValue("DescribeMigrateCountInfoResponse.Items["+ i +"].TargetVSwitchId"));

			items.add(migrateTask);
		}
		describeMigrateCountInfoResponse.setItems(items);
	 
	 	return describeMigrateCountInfoResponse;
	}
}
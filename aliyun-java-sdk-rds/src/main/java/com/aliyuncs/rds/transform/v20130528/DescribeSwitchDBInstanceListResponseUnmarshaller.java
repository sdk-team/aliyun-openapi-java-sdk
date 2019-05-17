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

import com.aliyuncs.rds.model.v20130528.DescribeSwitchDBInstanceListResponse;
import com.aliyuncs.rds.model.v20130528.DescribeSwitchDBInstanceListResponse.SwitchDBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSwitchDBInstanceListResponseUnmarshaller {

	public static DescribeSwitchDBInstanceListResponse unmarshall(DescribeSwitchDBInstanceListResponse describeSwitchDBInstanceListResponse, UnmarshallerContext context) {
		
		describeSwitchDBInstanceListResponse.setRequestId(context.stringValue("DescribeSwitchDBInstanceListResponse.RequestId"));

		List<SwitchDBInstance> switchDBInstances = new ArrayList<SwitchDBInstance>();
		for (int i = 0; i < context.lengthValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances.Length"); i++) {
			SwitchDBInstance switchDBInstance = new SwitchDBInstance();
			switchDBInstance.setDBInstanceId(context.stringValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances["+ i +"].DBInstanceId"));
			switchDBInstance.setGuardDBInstanceId(context.stringValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances["+ i +"].GuardDBInstanceId"));
			switchDBInstance.setSwitchStatus(context.stringValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances["+ i +"].SwitchStatus"));
			switchDBInstance.setForceSwitch(context.stringValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances["+ i +"].ForceSwitch"));
			switchDBInstance.setDescription(context.stringValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances["+ i +"].Description"));
			switchDBInstance.setSwitchTime(context.stringValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances["+ i +"].SwitchTime"));
			switchDBInstance.setSwitchSuccessTime(context.stringValue("DescribeSwitchDBInstanceListResponse.SwitchDBInstances["+ i +"].SwitchSuccessTime"));

			switchDBInstances.add(switchDBInstance);
		}
		describeSwitchDBInstanceListResponse.setSwitchDBInstances(switchDBInstances);
	 
	 	return describeSwitchDBInstanceListResponse;
	}
}
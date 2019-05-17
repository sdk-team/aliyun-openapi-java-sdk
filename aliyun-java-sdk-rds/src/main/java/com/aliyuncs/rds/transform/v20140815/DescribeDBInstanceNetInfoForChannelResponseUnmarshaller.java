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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfo;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfo.DBInstanceWeight;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfo.SecurityIPGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetInfoForChannelResponseUnmarshaller {

	public static DescribeDBInstanceNetInfoForChannelResponse unmarshall(DescribeDBInstanceNetInfoForChannelResponse describeDBInstanceNetInfoForChannelResponse, UnmarshallerContext context) {
		
		describeDBInstanceNetInfoForChannelResponse.setRequestId(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.RequestId"));
		describeDBInstanceNetInfoForChannelResponse.setInstanceNetworkType(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.InstanceNetworkType"));

		List<DBInstanceNetInfo> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setUpgradeable(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].Upgradeable"));
			dBInstanceNetInfo.setExpiredTime(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].expiredTime"));
			dBInstanceNetInfo.setConnectionString(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setIPAddress(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].IPAddress"));
			dBInstanceNetInfo.setIPType(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setVPCId(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setVSwitchId(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));
			dBInstanceNetInfo.setConnectionStringType(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].ConnectionStringType"));
			dBInstanceNetInfo.setMaxDelayTime(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].MaxDelayTime"));
			dBInstanceNetInfo.setDistributionType(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DistributionType"));
			dBInstanceNetInfo.setAvailability(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].Availability"));

			List<SecurityIPGroup> securityIPGroups = new ArrayList<SecurityIPGroup>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups.Length"); j++) {
				SecurityIPGroup securityIPGroup = new SecurityIPGroup();
				securityIPGroup.setSecurityIPGroupName(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPGroupName"));
				securityIPGroup.setSecurityIPs(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].SecurityIPGroups["+ j +"].SecurityIPs"));

				securityIPGroups.add(securityIPGroup);
			}
			dBInstanceNetInfo.setSecurityIPGroups(securityIPGroups);

			List<DBInstanceWeight> dBInstanceWeights = new ArrayList<DBInstanceWeight>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights.Length"); j++) {
				DBInstanceWeight dBInstanceWeight = new DBInstanceWeight();
				dBInstanceWeight.setDBInstanceId(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceId"));
				dBInstanceWeight.setDBInstanceType(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].DBInstanceType"));
				dBInstanceWeight.setAvailability(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Availability"));
				dBInstanceWeight.setWeight(context.stringValue("DescribeDBInstanceNetInfoForChannelResponse.DBInstanceNetInfos["+ i +"].DBInstanceWeights["+ j +"].Weight"));

				dBInstanceWeights.add(dBInstanceWeight);
			}
			dBInstanceNetInfo.setDBInstanceWeights(dBInstanceWeights);

			dBInstanceNetInfos.add(dBInstanceNetInfo);
		}
		describeDBInstanceNetInfoForChannelResponse.setDBInstanceNetInfos(dBInstanceNetInfos);
	 
	 	return describeDBInstanceNetInfoForChannelResponse;
	}
}
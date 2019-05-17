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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceInfoResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceInfoResponse.ConnectionIP;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceInfoResponseUnmarshaller {

	public static DescribeDBInstanceInfoResponse unmarshall(DescribeDBInstanceInfoResponse describeDBInstanceInfoResponse, UnmarshallerContext context) {
		
		describeDBInstanceInfoResponse.setRequestId(context.stringValue("DescribeDBInstanceInfoResponse.RequestId"));
		describeDBInstanceInfoResponse.setDBInstanceId(context.stringValue("DescribeDBInstanceInfoResponse.DBInstanceId"));
		describeDBInstanceInfoResponse.setRegionId(context.stringValue("DescribeDBInstanceInfoResponse.RegionId"));
		describeDBInstanceInfoResponse.setConnectionString(context.stringValue("DescribeDBInstanceInfoResponse.ConnectionString"));
		describeDBInstanceInfoResponse.setConnectionString1(context.stringValue("DescribeDBInstanceInfoResponse.ConnectionString"));
		describeDBInstanceInfoResponse.setPort(context.stringValue("DescribeDBInstanceInfoResponse.Port"));
		describeDBInstanceInfoResponse.setMasterHostIp(context.stringValue("DescribeDBInstanceInfoResponse.MasterHostIp"));
		describeDBInstanceInfoResponse.setMasterHostPort(context.stringValue("DescribeDBInstanceInfoResponse.MasterHostPort"));
		describeDBInstanceInfoResponse.setConnectionString2(context.stringValue("DescribeDBInstanceInfoResponse.ConnectionString"));
		describeDBInstanceInfoResponse.setSlaveHostIp(context.stringValue("DescribeDBInstanceInfoResponse.SlaveHostIp"));
		describeDBInstanceInfoResponse.setSlaveHostPort(context.stringValue("DescribeDBInstanceInfoResponse.SlaveHostPort"));
		describeDBInstanceInfoResponse.setMasterInstanceId(context.stringValue("DescribeDBInstanceInfoResponse.MasterInstanceId"));
		describeDBInstanceInfoResponse.setSlaveInstanceId(context.stringValue("DescribeDBInstanceInfoResponse.SlaveInstanceId"));
		describeDBInstanceInfoResponse.setReadWriteType(context.stringValue("DescribeDBInstanceInfoResponse.ReadWriteType"));

		List<ConnectionIP> connectionIPs = new ArrayList<ConnectionIP>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceInfoResponse.ConnectionIPs.Length"); i++) {
			ConnectionIP connectionIP = new ConnectionIP();
			connectionIP.setDBInstanceNetType(context.stringValue("DescribeDBInstanceInfoResponse.ConnectionIPs["+ i +"].DBInstanceNetType"));
			connectionIP.setConnectionString(context.stringValue("DescribeDBInstanceInfoResponse.ConnectionIPs["+ i +"].ConnectionString"));
			connectionIP.setIP(context.stringValue("DescribeDBInstanceInfoResponse.ConnectionIPs["+ i +"].IP"));
			connectionIP.setPort(context.stringValue("DescribeDBInstanceInfoResponse.ConnectionIPs["+ i +"].Port"));

			connectionIPs.add(connectionIP);
		}
		describeDBInstanceInfoResponse.setConnectionIPs(connectionIPs);
	 
	 	return describeDBInstanceInfoResponse;
	}
}
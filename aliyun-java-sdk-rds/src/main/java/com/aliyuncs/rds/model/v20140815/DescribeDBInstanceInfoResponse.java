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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceInfoResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String regionId;

	private String connectionString;

	private String connectionString1;

	private String port;

	private String masterHostIp;

	private String masterHostPort;

	private String connectionString2;

	private String slaveHostIp;

	private String slaveHostPort;

	private String masterInstanceId;

	private String slaveInstanceId;

	private String readWriteType;

	private List<ConnectionIP> connectionIPs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getConnectionString1() {
		return this.connectionString1;
	}

	public void setConnectionString1(String connectionString1) {
		this.connectionString1 = connectionString1;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getMasterHostIp() {
		return this.masterHostIp;
	}

	public void setMasterHostIp(String masterHostIp) {
		this.masterHostIp = masterHostIp;
	}

	public String getMasterHostPort() {
		return this.masterHostPort;
	}

	public void setMasterHostPort(String masterHostPort) {
		this.masterHostPort = masterHostPort;
	}

	public String getConnectionString2() {
		return this.connectionString2;
	}

	public void setConnectionString2(String connectionString2) {
		this.connectionString2 = connectionString2;
	}

	public String getSlaveHostIp() {
		return this.slaveHostIp;
	}

	public void setSlaveHostIp(String slaveHostIp) {
		this.slaveHostIp = slaveHostIp;
	}

	public String getSlaveHostPort() {
		return this.slaveHostPort;
	}

	public void setSlaveHostPort(String slaveHostPort) {
		this.slaveHostPort = slaveHostPort;
	}

	public String getMasterInstanceId() {
		return this.masterInstanceId;
	}

	public void setMasterInstanceId(String masterInstanceId) {
		this.masterInstanceId = masterInstanceId;
	}

	public String getSlaveInstanceId() {
		return this.slaveInstanceId;
	}

	public void setSlaveInstanceId(String slaveInstanceId) {
		this.slaveInstanceId = slaveInstanceId;
	}

	public String getReadWriteType() {
		return this.readWriteType;
	}

	public void setReadWriteType(String readWriteType) {
		this.readWriteType = readWriteType;
	}

	public List<ConnectionIP> getConnectionIPs() {
		return this.connectionIPs;
	}

	public void setConnectionIPs(List<ConnectionIP> connectionIPs) {
		this.connectionIPs = connectionIPs;
	}

	public static class ConnectionIP {

		private String dBInstanceNetType;

		private String connectionString;

		private String iP;

		private String port;

		public String getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(String dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}
	}

	@Override
	public DescribeDBInstanceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}

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

package com.aliyuncs.rds.model.v20130528;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20130528.CreateGuardDBInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateGuardDBInstanceResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String guardDBInstanceId;

	private String connectionString;

	private String port;

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

	public String getGuardDBInstanceId() {
		return this.guardDBInstanceId;
	}

	public void setGuardDBInstanceId(String guardDBInstanceId) {
		this.guardDBInstanceId = guardDBInstanceId;
	}

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public CreateGuardDBInstanceResponse getInstance(UnmarshallerContext context) {
		return	CreateGuardDBInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
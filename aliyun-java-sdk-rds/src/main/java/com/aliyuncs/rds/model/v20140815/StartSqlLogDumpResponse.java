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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.StartSqlLogDumpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartSqlLogDumpResponse extends AcsResponse {

	private String requestId;

	private Integer dBInstanceID;

	private String dBInstanceName;

	private String items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDBInstanceID() {
		return this.dBInstanceID;
	}

	public void setDBInstanceID(Integer dBInstanceID) {
		this.dBInstanceID = dBInstanceID;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public String getItems() {
		return this.items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public StartSqlLogDumpResponse getInstance(UnmarshallerContext context) {
		return	StartSqlLogDumpResponseUnmarshaller.unmarshall(this, context);
	}
}

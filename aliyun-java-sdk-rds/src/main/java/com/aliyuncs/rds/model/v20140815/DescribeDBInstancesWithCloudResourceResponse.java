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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstancesWithCloudResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesWithCloudResourceResponse extends AcsResponse {

	private String requestId;

	private List<DBInstance> dBInstanceNameList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstance> getDBInstanceNameList() {
		return this.dBInstanceNameList;
	}

	public void setDBInstanceNameList(List<DBInstance> dBInstanceNameList) {
		this.dBInstanceNameList = dBInstanceNameList;
	}

	public static class DBInstance {

		private String dBInstanceName;

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}
	}

	@Override
	public DescribeDBInstancesWithCloudResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesWithCloudResourceResponseUnmarshaller.unmarshall(this, context);
	}
}

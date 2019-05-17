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

package com.aliyuncs.rds.model.v20120615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20120615.DescribeDBInstanceClassListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceClassListResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceClassItem> dBInstanceClasses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceClassItem> getDBInstanceClasses() {
		return this.dBInstanceClasses;
	}

	public void setDBInstanceClasses(List<DBInstanceClassItem> dBInstanceClasses) {
		this.dBInstanceClasses = dBInstanceClasses;
	}

	public static class DBInstanceClassItem {

		private Long dBInstanceMemory;

		private Long dBInstanceConnections;

		private String engine;

		private String dBInstanceClass;

		private Long dBInstanceStorage;

		private Long iORequestTimes;

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public Long getDBInstanceConnections() {
			return this.dBInstanceConnections;
		}

		public void setDBInstanceConnections(Long dBInstanceConnections) {
			this.dBInstanceConnections = dBInstanceConnections;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public Long getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Long dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public Long getIORequestTimes() {
			return this.iORequestTimes;
		}

		public void setIORequestTimes(Long iORequestTimes) {
			this.iORequestTimes = iORequestTimes;
		}
	}

	@Override
	public DescribeDBInstanceClassListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceClassListResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.rds.transform.v20140815.DescribeSqlLogInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlLogInstancesResponse extends AcsResponse {

	private String requestId;

	private Long uid;

	private List<SqlLogInstance> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public List<SqlLogInstance> getItems() {
		return this.items;
	}

	public void setItems(List<SqlLogInstance> items) {
		this.items = items;
	}

	public static class SqlLogInstance {

		private String dBInstanceID;

		private String dBInstanceName;

		private String rdsRegion;

		private String rdsDbType;

		private String rdsDbVersion;

		private String enableSqlLog;

		private String enableSqlLogDistribution;

		private String loghubRegion;

		private String loghubProject;

		private String loghubLogstore;

		private String sqlExplorerTrial;

		public String getDBInstanceID() {
			return this.dBInstanceID;
		}

		public void setDBInstanceID(String dBInstanceID) {
			this.dBInstanceID = dBInstanceID;
		}

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public String getRdsRegion() {
			return this.rdsRegion;
		}

		public void setRdsRegion(String rdsRegion) {
			this.rdsRegion = rdsRegion;
		}

		public String getRdsDbType() {
			return this.rdsDbType;
		}

		public void setRdsDbType(String rdsDbType) {
			this.rdsDbType = rdsDbType;
		}

		public String getRdsDbVersion() {
			return this.rdsDbVersion;
		}

		public void setRdsDbVersion(String rdsDbVersion) {
			this.rdsDbVersion = rdsDbVersion;
		}

		public String getEnableSqlLog() {
			return this.enableSqlLog;
		}

		public void setEnableSqlLog(String enableSqlLog) {
			this.enableSqlLog = enableSqlLog;
		}

		public String getEnableSqlLogDistribution() {
			return this.enableSqlLogDistribution;
		}

		public void setEnableSqlLogDistribution(String enableSqlLogDistribution) {
			this.enableSqlLogDistribution = enableSqlLogDistribution;
		}

		public String getLoghubRegion() {
			return this.loghubRegion;
		}

		public void setLoghubRegion(String loghubRegion) {
			this.loghubRegion = loghubRegion;
		}

		public String getLoghubProject() {
			return this.loghubProject;
		}

		public void setLoghubProject(String loghubProject) {
			this.loghubProject = loghubProject;
		}

		public String getLoghubLogstore() {
			return this.loghubLogstore;
		}

		public void setLoghubLogstore(String loghubLogstore) {
			this.loghubLogstore = loghubLogstore;
		}

		public String getSqlExplorerTrial() {
			return this.sqlExplorerTrial;
		}

		public void setSqlExplorerTrial(String sqlExplorerTrial) {
			this.sqlExplorerTrial = sqlExplorerTrial;
		}
	}

	@Override
	public DescribeSqlLogInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlLogInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}

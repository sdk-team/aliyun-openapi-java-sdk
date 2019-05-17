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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20130528.DescribeResourceUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceUsageResponse extends AcsResponse {

	private String requestId;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private Long diskUsed;

		private String dBInstanceId;

		private String engine;

		private Long dataSize;

		private Long networkOut;

		private Long logSize;

		private Long backupSize;

		private Long networkIn;

		public Long getDiskUsed() {
			return this.diskUsed;
		}

		public void setDiskUsed(Long diskUsed) {
			this.diskUsed = diskUsed;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Long getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Long dataSize) {
			this.dataSize = dataSize;
		}

		public Long getNetworkOut() {
			return this.networkOut;
		}

		public void setNetworkOut(Long networkOut) {
			this.networkOut = networkOut;
		}

		public Long getLogSize() {
			return this.logSize;
		}

		public void setLogSize(Long logSize) {
			this.logSize = logSize;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}

		public Long getNetworkIn() {
			return this.networkIn;
		}

		public void setNetworkIn(Long networkIn) {
			this.networkIn = networkIn;
		}
	}

	@Override
	public DescribeResourceUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceUsageResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.rds.transform.v20140815.DescribeMigrateCountInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrateCountInfoResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String regionId;

	private String zoneId;

	private Integer migrationTimes;

	private Integer migrationMaxTimes;

	private String opActionType;

	private List<MigrateTask> items;

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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public Integer getMigrationTimes() {
		return this.migrationTimes;
	}

	public void setMigrationTimes(Integer migrationTimes) {
		this.migrationTimes = migrationTimes;
	}

	public Integer getMigrationMaxTimes() {
		return this.migrationMaxTimes;
	}

	public void setMigrationMaxTimes(Integer migrationMaxTimes) {
		this.migrationMaxTimes = migrationMaxTimes;
	}

	public String getOpActionType() {
		return this.opActionType;
	}

	public void setOpActionType(String opActionType) {
		this.opActionType = opActionType;
	}

	public List<MigrateTask> getItems() {
		return this.items;
	}

	public void setItems(List<MigrateTask> items) {
		this.items = items;
	}

	public static class MigrateTask {

		private String sourceRegionId;

		private String sourceZoneId;

		private String targetRegionId;

		private String targetZoneId;

		private String sourceVpcId;

		private String sourceVSwitchId;

		private String targetVpcId;

		private String targetVSwitchId;

		public String getSourceRegionId() {
			return this.sourceRegionId;
		}

		public void setSourceRegionId(String sourceRegionId) {
			this.sourceRegionId = sourceRegionId;
		}

		public String getSourceZoneId() {
			return this.sourceZoneId;
		}

		public void setSourceZoneId(String sourceZoneId) {
			this.sourceZoneId = sourceZoneId;
		}

		public String getTargetRegionId() {
			return this.targetRegionId;
		}

		public void setTargetRegionId(String targetRegionId) {
			this.targetRegionId = targetRegionId;
		}

		public String getTargetZoneId() {
			return this.targetZoneId;
		}

		public void setTargetZoneId(String targetZoneId) {
			this.targetZoneId = targetZoneId;
		}

		public String getSourceVpcId() {
			return this.sourceVpcId;
		}

		public void setSourceVpcId(String sourceVpcId) {
			this.sourceVpcId = sourceVpcId;
		}

		public String getSourceVSwitchId() {
			return this.sourceVSwitchId;
		}

		public void setSourceVSwitchId(String sourceVSwitchId) {
			this.sourceVSwitchId = sourceVSwitchId;
		}

		public String getTargetVpcId() {
			return this.targetVpcId;
		}

		public void setTargetVpcId(String targetVpcId) {
			this.targetVpcId = targetVpcId;
		}

		public String getTargetVSwitchId() {
			return this.targetVSwitchId;
		}

		public void setTargetVSwitchId(String targetVSwitchId) {
			this.targetVSwitchId = targetVSwitchId;
		}
	}

	@Override
	public DescribeMigrateCountInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrateCountInfoResponseUnmarshaller.unmarshall(this, context);
	}
}

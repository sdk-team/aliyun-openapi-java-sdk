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
import com.aliyuncs.rds.transform.v20130528.DescribeDBInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private List<DBInstance> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<DBInstance> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstance> items) {
		this.items = items;
	}

	public static class DBInstance {

		private Integer insId;

		private String dBInstanceId;

		private String dBInstanceDescription;

		private String payType;

		private String dBInstanceType;

		private String regionId;

		private String expireTime;

		private String dBInstanceStatus;

		private String engine;

		private String dBInstanceNetType;

		private String connectionMode;

		private String lockMode;

		private String instanceNetworkType;

		private String lockReason;

		private String zoneId;

		private Boolean mutriORsignle;

		private String createTime;

		private String engineVersion;

		private String guardDBInstanceId;

		private String tempDBInstanceId;

		private String masterInstanceId;

		private String vpcId;

		private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

		public Integer getInsId() {
			return this.insId;
		}

		public void setInsId(Integer insId) {
			this.insId = insId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
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

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(String dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public String getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(String connectionMode) {
			this.connectionMode = connectionMode;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Boolean getMutriORsignle() {
			return this.mutriORsignle;
		}

		public void setMutriORsignle(Boolean mutriORsignle) {
			this.mutriORsignle = mutriORsignle;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getGuardDBInstanceId() {
			return this.guardDBInstanceId;
		}

		public void setGuardDBInstanceId(String guardDBInstanceId) {
			this.guardDBInstanceId = guardDBInstanceId;
		}

		public String getTempDBInstanceId() {
			return this.tempDBInstanceId;
		}

		public void setTempDBInstanceId(String tempDBInstanceId) {
			this.tempDBInstanceId = tempDBInstanceId;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
			return this.readOnlyDBInstanceIds;
		}

		public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
			this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
		}

		public static class ReadOnlyDBInstanceId {

			private String dBInstanceId;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}
		}
	}

	@Override
	public DescribeDBInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceSwitchLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSwitchLogResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceName;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<Item> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String switchId;

		private String switchCauseCode;

		private String switchStartTime;

		private String switchFinishTime;

		private String totalSessions;

		private String affectedSessions;

		private String hAStatus;

		public String getSwitchId() {
			return this.switchId;
		}

		public void setSwitchId(String switchId) {
			this.switchId = switchId;
		}

		public String getSwitchCauseCode() {
			return this.switchCauseCode;
		}

		public void setSwitchCauseCode(String switchCauseCode) {
			this.switchCauseCode = switchCauseCode;
		}

		public String getSwitchStartTime() {
			return this.switchStartTime;
		}

		public void setSwitchStartTime(String switchStartTime) {
			this.switchStartTime = switchStartTime;
		}

		public String getSwitchFinishTime() {
			return this.switchFinishTime;
		}

		public void setSwitchFinishTime(String switchFinishTime) {
			this.switchFinishTime = switchFinishTime;
		}

		public String getTotalSessions() {
			return this.totalSessions;
		}

		public void setTotalSessions(String totalSessions) {
			this.totalSessions = totalSessions;
		}

		public String getAffectedSessions() {
			return this.affectedSessions;
		}

		public void setAffectedSessions(String affectedSessions) {
			this.affectedSessions = affectedSessions;
		}

		public String getHAStatus() {
			return this.hAStatus;
		}

		public void setHAStatus(String hAStatus) {
			this.hAStatus = hAStatus;
		}
	}

	@Override
	public DescribeDBInstanceSwitchLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSwitchLogResponseUnmarshaller.unmarshall(this, context);
	}
}

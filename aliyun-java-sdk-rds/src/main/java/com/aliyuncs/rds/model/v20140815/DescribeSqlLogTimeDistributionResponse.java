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
import com.aliyuncs.rds.transform.v20140815.DescribeSqlLogTimeDistributionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlLogTimeDistributionResponse extends AcsResponse {

	private String requestId;

	private Integer dBInstanceID;

	private String dBInstanceName;

	private String startTime;

	private String endTime;

	private Long templateHash;

	private String jobId;

	private String finish;

	private Integer itemsNumbers;

	private List<Distribution> items;

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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getTemplateHash() {
		return this.templateHash;
	}

	public void setTemplateHash(Long templateHash) {
		this.templateHash = templateHash;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getFinish() {
		return this.finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public List<Distribution> getItems() {
		return this.items;
	}

	public void setItems(List<Distribution> items) {
		this.items = items;
	}

	public static class Distribution {

		private String queryStartTime;

		private Long totalConsume;

		private Long totalCounts;

		private Long totalScanRows;

		private Long totalUpdateRows;

		private Long selectCounts;

		private Long updateCounts;

		private Long insertCounts;

		private Long deleteCounts;

		private Long loginCounts;

		public String getQueryStartTime() {
			return this.queryStartTime;
		}

		public void setQueryStartTime(String queryStartTime) {
			this.queryStartTime = queryStartTime;
		}

		public Long getTotalConsume() {
			return this.totalConsume;
		}

		public void setTotalConsume(Long totalConsume) {
			this.totalConsume = totalConsume;
		}

		public Long getTotalCounts() {
			return this.totalCounts;
		}

		public void setTotalCounts(Long totalCounts) {
			this.totalCounts = totalCounts;
		}

		public Long getTotalScanRows() {
			return this.totalScanRows;
		}

		public void setTotalScanRows(Long totalScanRows) {
			this.totalScanRows = totalScanRows;
		}

		public Long getTotalUpdateRows() {
			return this.totalUpdateRows;
		}

		public void setTotalUpdateRows(Long totalUpdateRows) {
			this.totalUpdateRows = totalUpdateRows;
		}

		public Long getSelectCounts() {
			return this.selectCounts;
		}

		public void setSelectCounts(Long selectCounts) {
			this.selectCounts = selectCounts;
		}

		public Long getUpdateCounts() {
			return this.updateCounts;
		}

		public void setUpdateCounts(Long updateCounts) {
			this.updateCounts = updateCounts;
		}

		public Long getInsertCounts() {
			return this.insertCounts;
		}

		public void setInsertCounts(Long insertCounts) {
			this.insertCounts = insertCounts;
		}

		public Long getDeleteCounts() {
			return this.deleteCounts;
		}

		public void setDeleteCounts(Long deleteCounts) {
			this.deleteCounts = deleteCounts;
		}

		public Long getLoginCounts() {
			return this.loginCounts;
		}

		public void setLoginCounts(Long loginCounts) {
			this.loginCounts = loginCounts;
		}
	}

	@Override
	public DescribeSqlLogTimeDistributionResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlLogTimeDistributionResponseUnmarshaller.unmarshall(this, context);
	}
}

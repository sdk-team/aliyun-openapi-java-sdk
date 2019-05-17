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
import com.aliyuncs.rds.transform.v20130528.DescribeSQLLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogRecordsResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCounts;

	private Integer pageNumber;

	private Integer itemsCounts;

	private List<SQLItem> sQLItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCounts() {
		return this.totalRecordCounts;
	}

	public void setTotalRecordCounts(Integer totalRecordCounts) {
		this.totalRecordCounts = totalRecordCounts;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getItemsCounts() {
		return this.itemsCounts;
	}

	public void setItemsCounts(Integer itemsCounts) {
		this.itemsCounts = itemsCounts;
	}

	public List<SQLItem> getSQLItems() {
		return this.sQLItems;
	}

	public void setSQLItems(List<SQLItem> sQLItems) {
		this.sQLItems = sQLItems;
	}

	public static class SQLItem {

		private String dBName;

		private String accountName;

		private String hostAddress;

		private String sQLText;

		private Integer totalExecutionTimes;

		private Integer returnRowCounts;

		private String executeTime;

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Integer getTotalExecutionTimes() {
			return this.totalExecutionTimes;
		}

		public void setTotalExecutionTimes(Integer totalExecutionTimes) {
			this.totalExecutionTimes = totalExecutionTimes;
		}

		public Integer getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Integer returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public String getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(String executeTime) {
			this.executeTime = executeTime;
		}
	}

	@Override
	public DescribeSQLLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}

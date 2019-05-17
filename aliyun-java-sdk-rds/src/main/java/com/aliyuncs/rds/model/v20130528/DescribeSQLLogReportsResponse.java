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
import com.aliyuncs.rds.transform.v20130528.DescribeSQLLogReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogReportsResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCounts;

	private Integer pageNumber;

	private Integer itemsNumberCounts;

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

	public Integer getItemsNumberCounts() {
		return this.itemsNumberCounts;
	}

	public void setItemsNumberCounts(Integer itemsNumberCounts) {
		this.itemsNumberCounts = itemsNumberCounts;
	}

	public List<SQLItem> getSQLItems() {
		return this.sQLItems;
	}

	public void setSQLItems(List<SQLItem> sQLItems) {
		this.sQLItems = sQLItems;
	}

	public static class SQLItem {

		private String sQLText;

		private String totalExecutionCounts;

		private String totalExecutionTimes;

		private String returnTotalRowCounts;

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public String getTotalExecutionCounts() {
			return this.totalExecutionCounts;
		}

		public void setTotalExecutionCounts(String totalExecutionCounts) {
			this.totalExecutionCounts = totalExecutionCounts;
		}

		public String getTotalExecutionTimes() {
			return this.totalExecutionTimes;
		}

		public void setTotalExecutionTimes(String totalExecutionTimes) {
			this.totalExecutionTimes = totalExecutionTimes;
		}

		public String getReturnTotalRowCounts() {
			return this.returnTotalRowCounts;
		}

		public void setReturnTotalRowCounts(String returnTotalRowCounts) {
			this.returnTotalRowCounts = returnTotalRowCounts;
		}
	}

	@Override
	public DescribeSQLLogReportsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogReportsResponseUnmarshaller.unmarshall(this, context);
	}
}

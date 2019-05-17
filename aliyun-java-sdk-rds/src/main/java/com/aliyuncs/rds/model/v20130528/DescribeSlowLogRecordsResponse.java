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
import com.aliyuncs.rds.transform.v20130528.DescribeSlowLogRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogRecordsResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private Integer totalRecordCounts;

	private Integer pageNumber;

	private Integer sQLItemsCounts;

	private List<SQLLog> sQLLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
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

	public Integer getSQLItemsCounts() {
		return this.sQLItemsCounts;
	}

	public void setSQLItemsCounts(Integer sQLItemsCounts) {
		this.sQLItemsCounts = sQLItemsCounts;
	}

	public List<SQLLog> getSQLLogs() {
		return this.sQLLogs;
	}

	public void setSQLLogs(List<SQLLog> sQLLogs) {
		this.sQLLogs = sQLLogs;
	}

	public static class SQLLog {

		private String hostAddress;

		private String dBName;

		private String sQLText;

		private Long queryTimes;

		private Long lockTimes;

		private Long parseRowCounts;

		private Long returnRowCounts;

		private String executionStartTime;

		public String getHostAddress() {
			return this.hostAddress;
		}

		public void setHostAddress(String hostAddress) {
			this.hostAddress = hostAddress;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Long getQueryTimes() {
			return this.queryTimes;
		}

		public void setQueryTimes(Long queryTimes) {
			this.queryTimes = queryTimes;
		}

		public Long getLockTimes() {
			return this.lockTimes;
		}

		public void setLockTimes(Long lockTimes) {
			this.lockTimes = lockTimes;
		}

		public Long getParseRowCounts() {
			return this.parseRowCounts;
		}

		public void setParseRowCounts(Long parseRowCounts) {
			this.parseRowCounts = parseRowCounts;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public String getExecutionStartTime() {
			return this.executionStartTime;
		}

		public void setExecutionStartTime(String executionStartTime) {
			this.executionStartTime = executionStartTime;
		}
	}

	@Override
	public DescribeSlowLogRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}

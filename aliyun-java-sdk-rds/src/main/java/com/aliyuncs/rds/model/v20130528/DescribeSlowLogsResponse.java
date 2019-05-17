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
import com.aliyuncs.rds.transform.v20130528.DescribeSlowLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowLogsResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String startTime;

	private String endTime;

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

		private String dBName;

		private String sQLText;

		private Long mySQLTotalExecutionCounts;

		private Long mySQLTotalExecutionTimes;

		private Long maxExecutionTime;

		private Long totalLockTimes;

		private Long maxlockTime;

		private Long parseTotalRowCounts;

		private Long parseMaxRowCount;

		private Long returnTotalRowCounts;

		private String createTime;

		private Long sQLServerTotalExecutionCounts;

		private Long sQLServerTotalExecutionTimes;

		private Long totalLogicalReadCounts;

		private Long totalPhysicalReadCounts;

		private String reportTime;

		private Long returnMaxRowCount;

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

		public Long getMySQLTotalExecutionCounts() {
			return this.mySQLTotalExecutionCounts;
		}

		public void setMySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
			this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
		}

		public Long getMySQLTotalExecutionTimes() {
			return this.mySQLTotalExecutionTimes;
		}

		public void setMySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
			this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
		}

		public Long getMaxExecutionTime() {
			return this.maxExecutionTime;
		}

		public void setMaxExecutionTime(Long maxExecutionTime) {
			this.maxExecutionTime = maxExecutionTime;
		}

		public Long getTotalLockTimes() {
			return this.totalLockTimes;
		}

		public void setTotalLockTimes(Long totalLockTimes) {
			this.totalLockTimes = totalLockTimes;
		}

		public Long getMaxlockTime() {
			return this.maxlockTime;
		}

		public void setMaxlockTime(Long maxlockTime) {
			this.maxlockTime = maxlockTime;
		}

		public Long getParseTotalRowCounts() {
			return this.parseTotalRowCounts;
		}

		public void setParseTotalRowCounts(Long parseTotalRowCounts) {
			this.parseTotalRowCounts = parseTotalRowCounts;
		}

		public Long getParseMaxRowCount() {
			return this.parseMaxRowCount;
		}

		public void setParseMaxRowCount(Long parseMaxRowCount) {
			this.parseMaxRowCount = parseMaxRowCount;
		}

		public Long getReturnTotalRowCounts() {
			return this.returnTotalRowCounts;
		}

		public void setReturnTotalRowCounts(Long returnTotalRowCounts) {
			this.returnTotalRowCounts = returnTotalRowCounts;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getSQLServerTotalExecutionCounts() {
			return this.sQLServerTotalExecutionCounts;
		}

		public void setSQLServerTotalExecutionCounts(Long sQLServerTotalExecutionCounts) {
			this.sQLServerTotalExecutionCounts = sQLServerTotalExecutionCounts;
		}

		public Long getSQLServerTotalExecutionTimes() {
			return this.sQLServerTotalExecutionTimes;
		}

		public void setSQLServerTotalExecutionTimes(Long sQLServerTotalExecutionTimes) {
			this.sQLServerTotalExecutionTimes = sQLServerTotalExecutionTimes;
		}

		public Long getTotalLogicalReadCounts() {
			return this.totalLogicalReadCounts;
		}

		public void setTotalLogicalReadCounts(Long totalLogicalReadCounts) {
			this.totalLogicalReadCounts = totalLogicalReadCounts;
		}

		public Long getTotalPhysicalReadCounts() {
			return this.totalPhysicalReadCounts;
		}

		public void setTotalPhysicalReadCounts(Long totalPhysicalReadCounts) {
			this.totalPhysicalReadCounts = totalPhysicalReadCounts;
		}

		public String getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(String reportTime) {
			this.reportTime = reportTime;
		}

		public Long getReturnMaxRowCount() {
			return this.returnMaxRowCount;
		}

		public void setReturnMaxRowCount(Long returnMaxRowCount) {
			this.returnMaxRowCount = returnMaxRowCount;
		}
	}

	@Override
	public DescribeSlowLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowLogsResponseUnmarshaller.unmarshall(this, context);
	}
}

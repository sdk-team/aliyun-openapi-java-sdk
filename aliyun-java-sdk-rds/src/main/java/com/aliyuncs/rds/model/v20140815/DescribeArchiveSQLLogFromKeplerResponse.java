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
import com.aliyuncs.rds.transform.v20140815.DescribeArchiveSQLLogFromKeplerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeArchiveSQLLogFromKeplerResponse extends AcsResponse {

	private String requestId;

	private Integer dBInstanceID;

	private String dBInstanceName;

	private Integer itemsNumbers;

	private List<ItemsItem> items;

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

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String jOB_NAME;

		private String uPDATE_TIME;

		private String cREATE_TIME;

		private Long pROCESS_ROWS;

		private Long tOTAL_ROWS;

		private String fAIL_MSG;

		private String sTATUS;

		private String downloadLink;

		private String linkExpiredTime;

		public String getJOB_NAME() {
			return this.jOB_NAME;
		}

		public void setJOB_NAME(String jOB_NAME) {
			this.jOB_NAME = jOB_NAME;
		}

		public String getUPDATE_TIME() {
			return this.uPDATE_TIME;
		}

		public void setUPDATE_TIME(String uPDATE_TIME) {
			this.uPDATE_TIME = uPDATE_TIME;
		}

		public String getCREATE_TIME() {
			return this.cREATE_TIME;
		}

		public void setCREATE_TIME(String cREATE_TIME) {
			this.cREATE_TIME = cREATE_TIME;
		}

		public Long getPROCESS_ROWS() {
			return this.pROCESS_ROWS;
		}

		public void setPROCESS_ROWS(Long pROCESS_ROWS) {
			this.pROCESS_ROWS = pROCESS_ROWS;
		}

		public Long getTOTAL_ROWS() {
			return this.tOTAL_ROWS;
		}

		public void setTOTAL_ROWS(Long tOTAL_ROWS) {
			this.tOTAL_ROWS = tOTAL_ROWS;
		}

		public String getFAIL_MSG() {
			return this.fAIL_MSG;
		}

		public void setFAIL_MSG(String fAIL_MSG) {
			this.fAIL_MSG = fAIL_MSG;
		}

		public String getSTATUS() {
			return this.sTATUS;
		}

		public void setSTATUS(String sTATUS) {
			this.sTATUS = sTATUS;
		}

		public String getDownloadLink() {
			return this.downloadLink;
		}

		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}

		public String getLinkExpiredTime() {
			return this.linkExpiredTime;
		}

		public void setLinkExpiredTime(String linkExpiredTime) {
			this.linkExpiredTime = linkExpiredTime;
		}
	}

	@Override
	public DescribeArchiveSQLLogFromKeplerResponse getInstance(UnmarshallerContext context) {
		return	DescribeArchiveSQLLogFromKeplerResponseUnmarshaller.unmarshall(this, context);
	}
}

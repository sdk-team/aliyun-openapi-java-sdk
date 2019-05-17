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
import com.aliyuncs.rds.transform.v20140815.DescribeSyncAccountForInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncAccountForInnerResponse extends AcsResponse {

	private List<SyncAccountsForInner> syncAccountForInner;

	public List<SyncAccountsForInner> getSyncAccountForInner() {
		return this.syncAccountForInner;
	}

	public void setSyncAccountForInner(List<SyncAccountsForInner> syncAccountForInner) {
		this.syncAccountForInner = syncAccountForInner;
	}

	public static class SyncAccountsForInner {

		private Integer accountId;

		private Integer accountStatus;

		private Integer privExceeded;

		private String accountPrivilege;

		private String dBName;

		private String accountPrivilegeDetail;

		private Integer accountType;

		private String privilegeStatus;

		private String engine;

		private String accountName;

		private String dBInstanceName;

		public Integer getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Integer accountId) {
			this.accountId = accountId;
		}

		public Integer getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(Integer accountStatus) {
			this.accountStatus = accountStatus;
		}

		public Integer getPrivExceeded() {
			return this.privExceeded;
		}

		public void setPrivExceeded(Integer privExceeded) {
			this.privExceeded = privExceeded;
		}

		public String getAccountPrivilege() {
			return this.accountPrivilege;
		}

		public void setAccountPrivilege(String accountPrivilege) {
			this.accountPrivilege = accountPrivilege;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getAccountPrivilegeDetail() {
			return this.accountPrivilegeDetail;
		}

		public void setAccountPrivilegeDetail(String accountPrivilegeDetail) {
			this.accountPrivilegeDetail = accountPrivilegeDetail;
		}

		public Integer getAccountType() {
			return this.accountType;
		}

		public void setAccountType(Integer accountType) {
			this.accountType = accountType;
		}

		public String getPrivilegeStatus() {
			return this.privilegeStatus;
		}

		public void setPrivilegeStatus(String privilegeStatus) {
			this.privilegeStatus = privilegeStatus;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}
	}

	@Override
	public DescribeSyncAccountForInnerResponse getInstance(UnmarshallerContext context) {
		return	DescribeSyncAccountForInnerResponseUnmarshaller.unmarshall(this, context);
	}
}

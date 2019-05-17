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
import com.aliyuncs.rds.transform.v20140815.DescribeSyncAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncAccountsResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceSyncAccount> accounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceSyncAccount> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<DBInstanceSyncAccount> accounts) {
		this.accounts = accounts;
	}

	public static class DBInstanceSyncAccount {

		private String accountStatus;

		private String privExceeded;

		private String accountType;

		private String databasePrivileges;

		private String privilegeStatus;

		private String accountName;

		private String dBInstanceId;

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getPrivExceeded() {
			return this.privExceeded;
		}

		public void setPrivExceeded(String privExceeded) {
			this.privExceeded = privExceeded;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getDatabasePrivileges() {
			return this.databasePrivileges;
		}

		public void setDatabasePrivileges(String databasePrivileges) {
			this.databasePrivileges = databasePrivileges;
		}

		public String getPrivilegeStatus() {
			return this.privilegeStatus;
		}

		public void setPrivilegeStatus(String privilegeStatus) {
			this.privilegeStatus = privilegeStatus;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}
	}

	@Override
	public DescribeSyncAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSyncAccountsResponseUnmarshaller.unmarshall(this, context);
	}
}

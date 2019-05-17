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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSyncAccountsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSyncAccountsResponse.DBInstanceSyncAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSyncAccountsResponseUnmarshaller {

	public static DescribeSyncAccountsResponse unmarshall(DescribeSyncAccountsResponse describeSyncAccountsResponse, UnmarshallerContext context) {
		
		describeSyncAccountsResponse.setRequestId(context.stringValue("DescribeSyncAccountsResponse.RequestId"));

		List<DBInstanceSyncAccount> accounts = new ArrayList<DBInstanceSyncAccount>();
		for (int i = 0; i < context.lengthValue("DescribeSyncAccountsResponse.Accounts.Length"); i++) {
			DBInstanceSyncAccount dBInstanceSyncAccount = new DBInstanceSyncAccount();
			dBInstanceSyncAccount.setAccountStatus(context.stringValue("DescribeSyncAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBInstanceSyncAccount.setPrivExceeded(context.stringValue("DescribeSyncAccountsResponse.Accounts["+ i +"].PrivExceeded"));
			dBInstanceSyncAccount.setAccountType(context.stringValue("DescribeSyncAccountsResponse.Accounts["+ i +"].AccountType"));
			dBInstanceSyncAccount.setDatabasePrivileges(context.stringValue("DescribeSyncAccountsResponse.Accounts["+ i +"].DatabasePrivileges"));
			dBInstanceSyncAccount.setPrivilegeStatus(context.stringValue("DescribeSyncAccountsResponse.Accounts["+ i +"].PrivilegeStatus"));
			dBInstanceSyncAccount.setAccountName(context.stringValue("DescribeSyncAccountsResponse.Accounts["+ i +"].AccountName"));
			dBInstanceSyncAccount.setDBInstanceId(context.stringValue("DescribeSyncAccountsResponse.Accounts["+ i +"].DBInstanceId"));

			accounts.add(dBInstanceSyncAccount);
		}
		describeSyncAccountsResponse.setAccounts(accounts);
	 
	 	return describeSyncAccountsResponse;
	}
}
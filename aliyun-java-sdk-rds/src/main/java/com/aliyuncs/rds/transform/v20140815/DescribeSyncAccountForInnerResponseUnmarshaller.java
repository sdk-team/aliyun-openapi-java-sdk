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

import com.aliyuncs.rds.model.v20140815.DescribeSyncAccountForInnerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSyncAccountForInnerResponse.SyncAccountsForInner;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSyncAccountForInnerResponseUnmarshaller {

	public static DescribeSyncAccountForInnerResponse unmarshall(DescribeSyncAccountForInnerResponse describeSyncAccountForInnerResponse, UnmarshallerContext context) {
		

		List<SyncAccountsForInner> syncAccountForInner = new ArrayList<SyncAccountsForInner>();
		for (int i = 0; i < context.lengthValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner.Length"); i++) {
			SyncAccountsForInner syncAccountsForInner = new SyncAccountsForInner();
			syncAccountsForInner.setAccountId(context.integerValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].AccountId"));
			syncAccountsForInner.setAccountStatus(context.integerValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].AccountStatus"));
			syncAccountsForInner.setPrivExceeded(context.integerValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].PrivExceeded"));
			syncAccountsForInner.setAccountPrivilege(context.stringValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].AccountPrivilege"));
			syncAccountsForInner.setDBName(context.stringValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].DBName"));
			syncAccountsForInner.setAccountPrivilegeDetail(context.stringValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].AccountPrivilegeDetail"));
			syncAccountsForInner.setAccountType(context.integerValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].AccountType"));
			syncAccountsForInner.setPrivilegeStatus(context.stringValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].PrivilegeStatus"));
			syncAccountsForInner.setEngine(context.stringValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].Engine"));
			syncAccountsForInner.setAccountName(context.stringValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].AccountName"));
			syncAccountsForInner.setDBInstanceName(context.stringValue("DescribeSyncAccountForInnerResponse.SyncAccountForInner["+ i +"].DBInstanceName"));

			syncAccountForInner.add(syncAccountsForInner);
		}
		describeSyncAccountForInnerResponse.setSyncAccountForInner(syncAccountForInner);
	 
	 	return describeSyncAccountForInnerResponse;
	}
}
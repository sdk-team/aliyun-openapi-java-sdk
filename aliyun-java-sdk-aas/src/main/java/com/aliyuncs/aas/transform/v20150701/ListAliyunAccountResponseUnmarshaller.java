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

package com.aliyuncs.aas.transform.v20150701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aas.model.v20150701.ListAliyunAccountResponse;
import com.aliyuncs.aas.model.v20150701.ListAliyunAccountResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAliyunAccountResponseUnmarshaller {

	public static ListAliyunAccountResponse unmarshall(ListAliyunAccountResponse listAliyunAccountResponse, UnmarshallerContext context) {
		
		listAliyunAccountResponse.setRequestId(context.stringValue("ListAliyunAccountResponse.RequestId"));
		listAliyunAccountResponse.setIsTruncated(context.booleanValue("ListAliyunAccountResponse.IsTruncated"));
		listAliyunAccountResponse.setMarker(context.stringValue("ListAliyunAccountResponse.Marker"));
		listAliyunAccountResponse.setTotalAccount(context.integerValue("ListAliyunAccountResponse.TotalAccount"));
		listAliyunAccountResponse.setHasNext(context.booleanValue("ListAliyunAccountResponse.HasNext"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < context.lengthValue("ListAliyunAccountResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setPK(context.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].PK"));
			account.setLastLoginDate(context.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].LastLoginDate"));
			account.setAccountStatus(context.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].AccountStatus"));
			account.setAliyunId(context.stringValue("ListAliyunAccountResponse.Accounts["+ i +"].AliyunId"));

			accounts.add(account);
		}
		listAliyunAccountResponse.setAccounts(accounts);
	 
	 	return listAliyunAccountResponse;
	}
}
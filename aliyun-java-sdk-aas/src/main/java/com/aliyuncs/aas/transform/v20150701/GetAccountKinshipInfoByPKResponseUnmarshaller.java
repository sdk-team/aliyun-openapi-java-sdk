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

import com.aliyuncs.aas.model.v20150701.GetAccountKinshipInfoByPKResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountKinshipInfoByPKResponseUnmarshaller {

	public static GetAccountKinshipInfoByPKResponse unmarshall(GetAccountKinshipInfoByPKResponse getAccountKinshipInfoByPKResponse, UnmarshallerContext context) {
		
		getAccountKinshipInfoByPKResponse.setRequestId(context.stringValue("GetAccountKinshipInfoByPKResponse.RequestId"));
		getAccountKinshipInfoByPKResponse.setPK(context.stringValue("GetAccountKinshipInfoByPKResponse.PK"));
		getAccountKinshipInfoByPKResponse.setParentPk(context.stringValue("GetAccountKinshipInfoByPKResponse.ParentPk"));
		getAccountKinshipInfoByPKResponse.setPartnerPk(context.stringValue("GetAccountKinshipInfoByPKResponse.PartnerPk"));
		getAccountKinshipInfoByPKResponse.setAccountStructure(context.stringValue("GetAccountKinshipInfoByPKResponse.AccountStructure"));
		getAccountKinshipInfoByPKResponse.setAccountName(context.stringValue("GetAccountKinshipInfoByPKResponse.AccountName"));
		getAccountKinshipInfoByPKResponse.setIsSubAccount(context.booleanValue("GetAccountKinshipInfoByPKResponse.IsSubAccount"));
	 
	 	return getAccountKinshipInfoByPKResponse;
	}
}
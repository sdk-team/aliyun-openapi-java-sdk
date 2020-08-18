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

package com.aliyuncs.ft.transform.v20180713;

import com.aliyuncs.ft.model.v20180713.QueryDomainChangeRecordsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainChangeRecordsResponseUnmarshaller {

	public static QueryDomainChangeRecordsResponse unmarshall(QueryDomainChangeRecordsResponse queryDomainChangeRecordsResponse, UnmarshallerContext _ctx) {
		
		queryDomainChangeRecordsResponse.setRequestId(_ctx.stringValue("QueryDomainChangeRecordsResponse.RequestId"));
		queryDomainChangeRecordsResponse.setCode(_ctx.stringValue("QueryDomainChangeRecordsResponse.Code"));
		queryDomainChangeRecordsResponse.setData(_ctx.booleanValue("QueryDomainChangeRecordsResponse.Data"));
		queryDomainChangeRecordsResponse.setMessage(_ctx.stringValue("QueryDomainChangeRecordsResponse.Message"));
		queryDomainChangeRecordsResponse.setMessageCN(_ctx.stringValue("QueryDomainChangeRecordsResponse.MessageCN"));
		queryDomainChangeRecordsResponse.setSuccess(_ctx.booleanValue("QueryDomainChangeRecordsResponse.Success"));
	 
	 	return queryDomainChangeRecordsResponse;
	}
}
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

package com.aliyuncs.rds.transform.v20130528;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20130528.DescribeSQLLogRecordsResponse;
import com.aliyuncs.rds.model.v20130528.DescribeSQLLogRecordsResponse.SQLItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogRecordsResponseUnmarshaller {

	public static DescribeSQLLogRecordsResponse unmarshall(DescribeSQLLogRecordsResponse describeSQLLogRecordsResponse, UnmarshallerContext context) {
		
		describeSQLLogRecordsResponse.setRequestId(context.stringValue("DescribeSQLLogRecordsResponse.RequestId"));
		describeSQLLogRecordsResponse.setTotalRecordCounts(context.integerValue("DescribeSQLLogRecordsResponse.TotalRecordCounts"));
		describeSQLLogRecordsResponse.setPageNumber(context.integerValue("DescribeSQLLogRecordsResponse.PageNumber"));
		describeSQLLogRecordsResponse.setItemsCounts(context.integerValue("DescribeSQLLogRecordsResponse.ItemsCounts"));

		List<SQLItem> sQLItems = new ArrayList<SQLItem>();
		for (int i = 0; i < context.lengthValue("DescribeSQLLogRecordsResponse.SQLItems.Length"); i++) {
			SQLItem sQLItem = new SQLItem();
			sQLItem.setDBName(context.stringValue("DescribeSQLLogRecordsResponse.SQLItems["+ i +"].DBName"));
			sQLItem.setAccountName(context.stringValue("DescribeSQLLogRecordsResponse.SQLItems["+ i +"].AccountName"));
			sQLItem.setHostAddress(context.stringValue("DescribeSQLLogRecordsResponse.SQLItems["+ i +"].HostAddress"));
			sQLItem.setSQLText(context.stringValue("DescribeSQLLogRecordsResponse.SQLItems["+ i +"].SQLText"));
			sQLItem.setTotalExecutionTimes(context.integerValue("DescribeSQLLogRecordsResponse.SQLItems["+ i +"].TotalExecutionTimes"));
			sQLItem.setReturnRowCounts(context.integerValue("DescribeSQLLogRecordsResponse.SQLItems["+ i +"].ReturnRowCounts"));
			sQLItem.setExecuteTime(context.stringValue("DescribeSQLLogRecordsResponse.SQLItems["+ i +"].ExecuteTime"));

			sQLItems.add(sQLItem);
		}
		describeSQLLogRecordsResponse.setSQLItems(sQLItems);
	 
	 	return describeSQLLogRecordsResponse;
	}
}
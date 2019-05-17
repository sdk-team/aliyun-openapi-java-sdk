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

import com.aliyuncs.rds.model.v20130528.DescribeSQLLogReportsResponse;
import com.aliyuncs.rds.model.v20130528.DescribeSQLLogReportsResponse.SQLItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogReportsResponseUnmarshaller {

	public static DescribeSQLLogReportsResponse unmarshall(DescribeSQLLogReportsResponse describeSQLLogReportsResponse, UnmarshallerContext context) {
		
		describeSQLLogReportsResponse.setRequestId(context.stringValue("DescribeSQLLogReportsResponse.RequestId"));
		describeSQLLogReportsResponse.setTotalRecordCounts(context.integerValue("DescribeSQLLogReportsResponse.TotalRecordCounts"));
		describeSQLLogReportsResponse.setPageNumber(context.integerValue("DescribeSQLLogReportsResponse.PageNumber"));
		describeSQLLogReportsResponse.setItemsNumberCounts(context.integerValue("DescribeSQLLogReportsResponse.ItemsNumberCounts"));

		List<SQLItem> sQLItems = new ArrayList<SQLItem>();
		for (int i = 0; i < context.lengthValue("DescribeSQLLogReportsResponse.SQLItems.Length"); i++) {
			SQLItem sQLItem = new SQLItem();
			sQLItem.setSQLText(context.stringValue("DescribeSQLLogReportsResponse.SQLItems["+ i +"].SQLText"));
			sQLItem.setTotalExecutionCounts(context.stringValue("DescribeSQLLogReportsResponse.SQLItems["+ i +"].TotalExecutionCounts"));
			sQLItem.setTotalExecutionTimes(context.stringValue("DescribeSQLLogReportsResponse.SQLItems["+ i +"].TotalExecutionTimes"));
			sQLItem.setReturnTotalRowCounts(context.stringValue("DescribeSQLLogReportsResponse.SQLItems["+ i +"].ReturnTotalRowCounts"));

			sQLItems.add(sQLItem);
		}
		describeSQLLogReportsResponse.setSQLItems(sQLItems);
	 
	 	return describeSQLLogReportsResponse;
	}
}
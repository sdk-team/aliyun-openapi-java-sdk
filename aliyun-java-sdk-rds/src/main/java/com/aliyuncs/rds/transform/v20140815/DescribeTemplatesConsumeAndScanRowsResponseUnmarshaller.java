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

import com.aliyuncs.rds.model.v20140815.DescribeTemplatesConsumeAndScanRowsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeTemplatesConsumeAndScanRowsResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesConsumeAndScanRowsResponseUnmarshaller {

	public static DescribeTemplatesConsumeAndScanRowsResponse unmarshall(DescribeTemplatesConsumeAndScanRowsResponse describeTemplatesConsumeAndScanRowsResponse, UnmarshallerContext context) {
		
		describeTemplatesConsumeAndScanRowsResponse.setRequestId(context.stringValue("DescribeTemplatesConsumeAndScanRowsResponse.RequestId"));
		describeTemplatesConsumeAndScanRowsResponse.setDBInstanceID(context.integerValue("DescribeTemplatesConsumeAndScanRowsResponse.DBInstanceID"));
		describeTemplatesConsumeAndScanRowsResponse.setItemsNumbers(context.integerValue("DescribeTemplatesConsumeAndScanRowsResponse.ItemsNumbers"));
		describeTemplatesConsumeAndScanRowsResponse.setEndTime(context.stringValue("DescribeTemplatesConsumeAndScanRowsResponse.EndTime"));
		describeTemplatesConsumeAndScanRowsResponse.setStartTime(context.stringValue("DescribeTemplatesConsumeAndScanRowsResponse.StartTime"));
		describeTemplatesConsumeAndScanRowsResponse.setDBInstanceName(context.stringValue("DescribeTemplatesConsumeAndScanRowsResponse.DBInstanceName"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeTemplatesConsumeAndScanRowsResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setAvgConsume(context.floatValue("DescribeTemplatesConsumeAndScanRowsResponse.Items["+ i +"].AvgConsume"));
			itemsItem.setAvgScanRows(context.floatValue("DescribeTemplatesConsumeAndScanRowsResponse.Items["+ i +"].AvgScanRows"));
			itemsItem.setSqlType(context.stringValue("DescribeTemplatesConsumeAndScanRowsResponse.Items["+ i +"].SqlType"));

			items.add(itemsItem);
		}
		describeTemplatesConsumeAndScanRowsResponse.setItems(items);
	 
	 	return describeTemplatesConsumeAndScanRowsResponse;
	}
}
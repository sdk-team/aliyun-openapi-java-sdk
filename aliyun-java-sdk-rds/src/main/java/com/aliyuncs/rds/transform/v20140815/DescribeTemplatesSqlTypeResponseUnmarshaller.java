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

import com.aliyuncs.rds.model.v20140815.DescribeTemplatesSqlTypeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeTemplatesSqlTypeResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesSqlTypeResponseUnmarshaller {

	public static DescribeTemplatesSqlTypeResponse unmarshall(DescribeTemplatesSqlTypeResponse describeTemplatesSqlTypeResponse, UnmarshallerContext context) {
		
		describeTemplatesSqlTypeResponse.setRequestId(context.stringValue("DescribeTemplatesSqlTypeResponse.RequestId"));
		describeTemplatesSqlTypeResponse.setDBInstanceID(context.integerValue("DescribeTemplatesSqlTypeResponse.DBInstanceID"));
		describeTemplatesSqlTypeResponse.setDBInstanceName(context.stringValue("DescribeTemplatesSqlTypeResponse.DBInstanceName"));
		describeTemplatesSqlTypeResponse.setStartTime(context.stringValue("DescribeTemplatesSqlTypeResponse.StartTime"));
		describeTemplatesSqlTypeResponse.setEndTime(context.stringValue("DescribeTemplatesSqlTypeResponse.EndTime"));
		describeTemplatesSqlTypeResponse.setTotalRecords(context.integerValue("DescribeTemplatesSqlTypeResponse.TotalRecords"));
		describeTemplatesSqlTypeResponse.setPagingID(context.stringValue("DescribeTemplatesSqlTypeResponse.PagingID"));
		describeTemplatesSqlTypeResponse.setItemsNumbers(context.integerValue("DescribeTemplatesSqlTypeResponse.ItemsNumbers"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeTemplatesSqlTypeResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setSelect(context.stringValue("DescribeTemplatesSqlTypeResponse.Items["+ i +"].select"));
			itemsItem.setShow(context.longValue("DescribeTemplatesSqlTypeResponse.Items["+ i +"].show"));
			itemsItem.setUpdate(context.longValue("DescribeTemplatesSqlTypeResponse.Items["+ i +"].update"));
			itemsItem.setInsert(context.longValue("DescribeTemplatesSqlTypeResponse.Items["+ i +"].insert"));
			itemsItem.setDelete(context.longValue("DescribeTemplatesSqlTypeResponse.Items["+ i +"].delete"));

			items.add(itemsItem);
		}
		describeTemplatesSqlTypeResponse.setItems(items);
	 
	 	return describeTemplatesSqlTypeResponse;
	}
}
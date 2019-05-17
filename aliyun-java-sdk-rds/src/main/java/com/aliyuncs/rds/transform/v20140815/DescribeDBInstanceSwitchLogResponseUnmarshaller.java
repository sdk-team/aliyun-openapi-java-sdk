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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceSwitchLogResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceSwitchLogResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSwitchLogResponseUnmarshaller {

	public static DescribeDBInstanceSwitchLogResponse unmarshall(DescribeDBInstanceSwitchLogResponse describeDBInstanceSwitchLogResponse, UnmarshallerContext context) {
		
		describeDBInstanceSwitchLogResponse.setRequestId(context.stringValue("DescribeDBInstanceSwitchLogResponse.RequestId"));
		describeDBInstanceSwitchLogResponse.setDBInstanceName(context.stringValue("DescribeDBInstanceSwitchLogResponse.DBInstanceName"));
		describeDBInstanceSwitchLogResponse.setTotalRecordCount(context.integerValue("DescribeDBInstanceSwitchLogResponse.TotalRecordCount"));
		describeDBInstanceSwitchLogResponse.setPageNumber(context.integerValue("DescribeDBInstanceSwitchLogResponse.PageNumber"));
		describeDBInstanceSwitchLogResponse.setPageRecordCount(context.integerValue("DescribeDBInstanceSwitchLogResponse.PageRecordCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceSwitchLogResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setSwitchId(context.stringValue("DescribeDBInstanceSwitchLogResponse.Items["+ i +"].SwitchId"));
			item.setSwitchCauseCode(context.stringValue("DescribeDBInstanceSwitchLogResponse.Items["+ i +"].SwitchCauseCode"));
			item.setSwitchStartTime(context.stringValue("DescribeDBInstanceSwitchLogResponse.Items["+ i +"].SwitchStartTime"));
			item.setSwitchFinishTime(context.stringValue("DescribeDBInstanceSwitchLogResponse.Items["+ i +"].SwitchFinishTime"));
			item.setTotalSessions(context.stringValue("DescribeDBInstanceSwitchLogResponse.Items["+ i +"].TotalSessions"));
			item.setAffectedSessions(context.stringValue("DescribeDBInstanceSwitchLogResponse.Items["+ i +"].AffectedSessions"));
			item.setHAStatus(context.stringValue("DescribeDBInstanceSwitchLogResponse.Items["+ i +"].HAStatus"));

			items.add(item);
		}
		describeDBInstanceSwitchLogResponse.setItems(items);
	 
	 	return describeDBInstanceSwitchLogResponse;
	}
}
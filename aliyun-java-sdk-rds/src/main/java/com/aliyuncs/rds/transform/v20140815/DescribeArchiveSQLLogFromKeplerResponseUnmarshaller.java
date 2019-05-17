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

import com.aliyuncs.rds.model.v20140815.DescribeArchiveSQLLogFromKeplerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeArchiveSQLLogFromKeplerResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeArchiveSQLLogFromKeplerResponseUnmarshaller {

	public static DescribeArchiveSQLLogFromKeplerResponse unmarshall(DescribeArchiveSQLLogFromKeplerResponse describeArchiveSQLLogFromKeplerResponse, UnmarshallerContext context) {
		
		describeArchiveSQLLogFromKeplerResponse.setRequestId(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.RequestId"));
		describeArchiveSQLLogFromKeplerResponse.setDBInstanceID(context.integerValue("DescribeArchiveSQLLogFromKeplerResponse.DBInstanceID"));
		describeArchiveSQLLogFromKeplerResponse.setDBInstanceName(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.DBInstanceName"));
		describeArchiveSQLLogFromKeplerResponse.setItemsNumbers(context.integerValue("DescribeArchiveSQLLogFromKeplerResponse.ItemsNumbers"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeArchiveSQLLogFromKeplerResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setJOB_NAME(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].JOB_NAME"));
			itemsItem.setUPDATE_TIME(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].UPDATE_TIME"));
			itemsItem.setCREATE_TIME(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].CREATE_TIME"));
			itemsItem.setPROCESS_ROWS(context.longValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].PROCESS_ROWS"));
			itemsItem.setTOTAL_ROWS(context.longValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].TOTAL_ROWS"));
			itemsItem.setFAIL_MSG(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].FAIL_MSG"));
			itemsItem.setSTATUS(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].STATUS"));
			itemsItem.setDownloadLink(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].DownloadLink"));
			itemsItem.setLinkExpiredTime(context.stringValue("DescribeArchiveSQLLogFromKeplerResponse.Items["+ i +"].LinkExpiredTime"));

			items.add(itemsItem);
		}
		describeArchiveSQLLogFromKeplerResponse.setItems(items);
	 
	 	return describeArchiveSQLLogFromKeplerResponse;
	}
}
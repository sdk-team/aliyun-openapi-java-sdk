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

import com.aliyuncs.rds.model.v20130528.DescribeDataFilesResponse;
import com.aliyuncs.rds.model.v20130528.DescribeDataFilesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataFilesResponseUnmarshaller {

	public static DescribeDataFilesResponse unmarshall(DescribeDataFilesResponse describeDataFilesResponse, UnmarshallerContext context) {
		
		describeDataFilesResponse.setRequestId(context.stringValue("DescribeDataFilesResponse.RequestId"));
		describeDataFilesResponse.setDBInstanceId(context.stringValue("DescribeDataFilesResponse.DBInstanceId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeDataFilesResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setDBName(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].DBName"));
			item.setFileName(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].FileName"));
			item.setFileSize(context.longValue("DescribeDataFilesResponse.Items["+ i +"].FileSize"));
			item.setFtpServer(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].FtpServer"));
			item.setPort(context.integerValue("DescribeDataFilesResponse.Items["+ i +"].Port"));
			item.setUserName(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].UserName"));
			item.setPassword(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].Password"));
			item.setFileStatus(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].FileStatus"));
			item.setDescription(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].Description"));
			item.setCreationTime(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].CreationTime"));
			item.setImportStatus(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].ImportStatus"));
			item.setImportTime(context.stringValue("DescribeDataFilesResponse.Items["+ i +"].ImportTime"));

			items.add(item);
		}
		describeDataFilesResponse.setItems(items);
	 
	 	return describeDataFilesResponse;
	}
}
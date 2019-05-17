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

import com.aliyuncs.rds.model.v20130528.DescribeBinlogFilesResponse;
import com.aliyuncs.rds.model.v20130528.DescribeBinlogFilesResponse.BinLogItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBinlogFilesResponseUnmarshaller {

	public static DescribeBinlogFilesResponse unmarshall(DescribeBinlogFilesResponse describeBinlogFilesResponse, UnmarshallerContext context) {
		
		describeBinlogFilesResponse.setRequestId(context.stringValue("DescribeBinlogFilesResponse.RequestId"));
		describeBinlogFilesResponse.setTotalRecordCounts(context.integerValue("DescribeBinlogFilesResponse.TotalRecordCounts"));
		describeBinlogFilesResponse.setPageNumber(context.integerValue("DescribeBinlogFilesResponse.PageNumber"));
		describeBinlogFilesResponse.setItemsNumberCounts(context.integerValue("DescribeBinlogFilesResponse.ItemsNumberCounts"));

		List<BinLogItem> binLogItems = new ArrayList<BinLogItem>();
		for (int i = 0; i < context.lengthValue("DescribeBinlogFilesResponse.BinLogItems.Length"); i++) {
			BinLogItem binLogItem = new BinLogItem();
			binLogItem.setFileSize(context.longValue("DescribeBinlogFilesResponse.BinLogItems["+ i +"].FileSize"));
			binLogItem.setLogBeginTime(context.stringValue("DescribeBinlogFilesResponse.BinLogItems["+ i +"].LogBeginTime"));
			binLogItem.setLogEndTime(context.stringValue("DescribeBinlogFilesResponse.BinLogItems["+ i +"].LogEndTime"));
			binLogItem.setDownloadLink(context.stringValue("DescribeBinlogFilesResponse.BinLogItems["+ i +"].DownloadLink"));
			binLogItem.setLinkExpiredTime(context.stringValue("DescribeBinlogFilesResponse.BinLogItems["+ i +"].LinkExpiredTime"));

			binLogItems.add(binLogItem);
		}
		describeBinlogFilesResponse.setBinLogItems(binLogItems);
	 
	 	return describeBinlogFilesResponse;
	}
}
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

package com.aliyuncs.iot.transform.v20190730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20190730.BulkQueryProductInfoForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.BulkQueryProductInfoForTmallGenieResponse.Data;
import com.aliyuncs.iot.model.v20190730.BulkQueryProductInfoForTmallGenieResponse.Data.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class BulkQueryProductInfoForTmallGenieResponseUnmarshaller {

	public static BulkQueryProductInfoForTmallGenieResponse unmarshall(BulkQueryProductInfoForTmallGenieResponse bulkQueryProductInfoForTmallGenieResponse, UnmarshallerContext context) {
		
		bulkQueryProductInfoForTmallGenieResponse.setRequestId(context.stringValue("BulkQueryProductInfoForTmallGenieResponse.RequestId"));
		bulkQueryProductInfoForTmallGenieResponse.setSuccess(context.booleanValue("BulkQueryProductInfoForTmallGenieResponse.Success"));
		bulkQueryProductInfoForTmallGenieResponse.setErrorMessage(context.stringValue("BulkQueryProductInfoForTmallGenieResponse.ErrorMessage"));

		Data data = new Data();
		data.setPage(context.integerValue("BulkQueryProductInfoForTmallGenieResponse.Data.Page"));
		data.setPageCount(context.integerValue("BulkQueryProductInfoForTmallGenieResponse.Data.PageCount"));
		data.setPageSize(context.integerValue("BulkQueryProductInfoForTmallGenieResponse.Data.PageSize"));
		data.setTotal(context.integerValue("BulkQueryProductInfoForTmallGenieResponse.Data.Total"));

		List<ProductInfo> list = new ArrayList<ProductInfo>();
		for (int i = 0; i < context.lengthValue("BulkQueryProductInfoForTmallGenieResponse.Data.List.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setGmtCreate(context.stringValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].GmtCreate"));
			productInfo.setDataFormat(context.integerValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].DataFormat"));
			productInfo.setDescription(context.stringValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].Description"));
			productInfo.setDeviceCount(context.integerValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].DeviceCount"));
			productInfo.setNodeType(context.integerValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].NodeType"));
			productInfo.setProductKey(context.stringValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].ProductKey"));
			productInfo.setProductName(context.stringValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].ProductName"));
			productInfo.setScriptId(context.longValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].ScriptId"));
			productInfo.setScriptDraftCode(context.stringValue("BulkQueryProductInfoForTmallGenieResponse.Data.List["+ i +"].ScriptDraftCode"));

			list.add(productInfo);
		}
		data.setList(list);
		bulkQueryProductInfoForTmallGenieResponse.setData(data);
	 
	 	return bulkQueryProductInfoForTmallGenieResponse;
	}
}
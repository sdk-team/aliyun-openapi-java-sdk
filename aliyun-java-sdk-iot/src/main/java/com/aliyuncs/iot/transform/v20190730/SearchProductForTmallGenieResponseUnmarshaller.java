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

import com.aliyuncs.iot.model.v20190730.SearchProductForTmallGenieResponse;
import com.aliyuncs.iot.model.v20190730.SearchProductForTmallGenieResponse.Data;
import com.aliyuncs.iot.model.v20190730.SearchProductForTmallGenieResponse.Data.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchProductForTmallGenieResponseUnmarshaller {

	public static SearchProductForTmallGenieResponse unmarshall(SearchProductForTmallGenieResponse searchProductForTmallGenieResponse, UnmarshallerContext context) {
		
		searchProductForTmallGenieResponse.setRequestId(context.stringValue("SearchProductForTmallGenieResponse.RequestId"));
		searchProductForTmallGenieResponse.setSuccess(context.booleanValue("SearchProductForTmallGenieResponse.Success"));
		searchProductForTmallGenieResponse.setErrorMessage(context.stringValue("SearchProductForTmallGenieResponse.ErrorMessage"));

		Data data = new Data();
		data.setPage(context.integerValue("SearchProductForTmallGenieResponse.Data.Page"));
		data.setPageCount(context.integerValue("SearchProductForTmallGenieResponse.Data.PageCount"));
		data.setPageSize(context.integerValue("SearchProductForTmallGenieResponse.Data.PageSize"));
		data.setTotal(context.integerValue("SearchProductForTmallGenieResponse.Data.Total"));

		List<ProductInfo> list = new ArrayList<ProductInfo>();
		for (int i = 0; i < context.lengthValue("SearchProductForTmallGenieResponse.Data.List.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setGmtCreate(context.stringValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].GmtCreate"));
			productInfo.setDataFormat(context.integerValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].DataFormat"));
			productInfo.setDescription(context.stringValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].Description"));
			productInfo.setDeviceCount(context.integerValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].DeviceCount"));
			productInfo.setNodeType(context.integerValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].NodeType"));
			productInfo.setProductKey(context.stringValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].ProductKey"));
			productInfo.setProductName(context.stringValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].ProductName"));
			productInfo.setScriptId(context.longValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].ScriptId"));
			productInfo.setScriptDraftCode(context.stringValue("SearchProductForTmallGenieResponse.Data.List["+ i +"].ScriptDraftCode"));

			list.add(productInfo);
		}
		data.setList(list);
		searchProductForTmallGenieResponse.setData(data);
	 
	 	return searchProductForTmallGenieResponse;
	}
}
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
import com.aliyuncs.iot.model.v20190730.SearchProductForTmallGenieResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchProductForTmallGenieResponseUnmarshaller {

	public static SearchProductForTmallGenieResponse unmarshall(SearchProductForTmallGenieResponse searchProductForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		searchProductForTmallGenieResponse.setRequestId(_ctx.stringValue("SearchProductForTmallGenieResponse.RequestId"));
		searchProductForTmallGenieResponse.setSuccess(_ctx.booleanValue("SearchProductForTmallGenieResponse.Success"));
		searchProductForTmallGenieResponse.setErrorMessage(_ctx.stringValue("SearchProductForTmallGenieResponse.ErrorMessage"));
		searchProductForTmallGenieResponse.setPage(_ctx.integerValue("SearchProductForTmallGenieResponse.Page"));
		searchProductForTmallGenieResponse.setPageSize(_ctx.integerValue("SearchProductForTmallGenieResponse.PageSize"));
		searchProductForTmallGenieResponse.setTotal(_ctx.integerValue("SearchProductForTmallGenieResponse.Total"));

		List<ProductInfo> list = new ArrayList<ProductInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchProductForTmallGenieResponse.List.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setGmtCreate(_ctx.stringValue("SearchProductForTmallGenieResponse.List["+ i +"].GmtCreate"));
			productInfo.setDataFormat(_ctx.integerValue("SearchProductForTmallGenieResponse.List["+ i +"].DataFormat"));
			productInfo.setDescription(_ctx.stringValue("SearchProductForTmallGenieResponse.List["+ i +"].Description"));
			productInfo.setDeviceCount(_ctx.integerValue("SearchProductForTmallGenieResponse.List["+ i +"].DeviceCount"));
			productInfo.setNodeType(_ctx.integerValue("SearchProductForTmallGenieResponse.List["+ i +"].NodeType"));
			productInfo.setNetType(_ctx.integerValue("SearchProductForTmallGenieResponse.List["+ i +"].NetType"));
			productInfo.setProductKey(_ctx.stringValue("SearchProductForTmallGenieResponse.List["+ i +"].ProductKey"));
			productInfo.setProductName(_ctx.stringValue("SearchProductForTmallGenieResponse.List["+ i +"].ProductName"));
			productInfo.setScriptId(_ctx.longValue("SearchProductForTmallGenieResponse.List["+ i +"].ScriptId"));
			productInfo.setScriptDraftCode(_ctx.stringValue("SearchProductForTmallGenieResponse.List["+ i +"].ScriptDraftCode"));

			list.add(productInfo);
		}
		searchProductForTmallGenieResponse.setList(list);
	 
	 	return searchProductForTmallGenieResponse;
	}
}
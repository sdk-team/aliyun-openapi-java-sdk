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
import com.aliyuncs.iot.model.v20190730.BulkQueryProductInfoForTmallGenieResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class BulkQueryProductInfoForTmallGenieResponseUnmarshaller {

	public static BulkQueryProductInfoForTmallGenieResponse unmarshall(BulkQueryProductInfoForTmallGenieResponse bulkQueryProductInfoForTmallGenieResponse, UnmarshallerContext _ctx) {
		
		bulkQueryProductInfoForTmallGenieResponse.setRequestId(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.RequestId"));
		bulkQueryProductInfoForTmallGenieResponse.setSuccess(_ctx.booleanValue("BulkQueryProductInfoForTmallGenieResponse.Success"));
		bulkQueryProductInfoForTmallGenieResponse.setErrorMessage(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.ErrorMessage"));
		bulkQueryProductInfoForTmallGenieResponse.setCode(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.Code"));

		List<ProductInfo> list = new ArrayList<ProductInfo>();
		for (int i = 0; i < _ctx.lengthValue("BulkQueryProductInfoForTmallGenieResponse.List.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setGmtCreate(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].GmtCreate"));
			productInfo.setDataFormat(_ctx.integerValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].DataFormat"));
			productInfo.setDescription(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].Description"));
			productInfo.setDeviceCount(_ctx.integerValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].DeviceCount"));
			productInfo.setNetType(_ctx.integerValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].NetType"));
			productInfo.setNodeType(_ctx.integerValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].NodeType"));
			productInfo.setProductKey(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].ProductKey"));
			productInfo.setProductName(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].ProductName"));
			productInfo.setProductModel(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].ProductModel"));
			productInfo.setProductSecret(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].ProductSecret"));
			productInfo.setProductStatus(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].ProductStatus"));
			productInfo.setScriptId(_ctx.longValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].ScriptId"));
			productInfo.setScriptDraftCode(_ctx.stringValue("BulkQueryProductInfoForTmallGenieResponse.List["+ i +"].ScriptDraftCode"));

			list.add(productInfo);
		}
		bulkQueryProductInfoForTmallGenieResponse.setList(list);
	 
	 	return bulkQueryProductInfoForTmallGenieResponse;
	}
}
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

package com.aliyuncs.ams.transform.v20160201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ams.model.v20160201.ListProductsResponse;
import com.aliyuncs.ams.model.v20160201.ListProductsResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductsResponseUnmarshaller {

	public static ListProductsResponse unmarshall(ListProductsResponse listProductsResponse, UnmarshallerContext context) {
		
		listProductsResponse.setRequestId(context.stringValue("ListProductsResponse.RequestId"));
		listProductsResponse.setCode(context.stringValue("ListProductsResponse.Code"));

		List<ProductInfo> productInfos = new ArrayList<ProductInfo>();
		for (int i = 0; i < context.lengthValue("ListProductsResponse.ProductInfos.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setProductId(context.longValue("ListProductsResponse.ProductInfos["+ i +"].ProductId"));
			productInfo.setUserId(context.longValue("ListProductsResponse.ProductInfos["+ i +"].UserId"));
			productInfo.setTaobaoUserId(context.longValue("ListProductsResponse.ProductInfos["+ i +"].TaobaoUserId"));
			productInfo.setName(context.stringValue("ListProductsResponse.ProductInfos["+ i +"].Name"));
			productInfo.setDescription(context.stringValue("ListProductsResponse.ProductInfos["+ i +"].Description"));
			productInfo.setVisible(context.booleanValue("ListProductsResponse.ProductInfos["+ i +"].Visible"));
			productInfo.setIndustryId(context.integerValue("ListProductsResponse.ProductInfos["+ i +"].IndustryId"));
			productInfo.setStatus(context.integerValue("ListProductsResponse.ProductInfos["+ i +"].Status"));
			productInfo.setBizName(context.stringValue("ListProductsResponse.ProductInfos["+ i +"].BizName"));
			productInfo.setCreateTime(context.stringValue("ListProductsResponse.ProductInfos["+ i +"].CreateTime"));
			productInfo.setModifyTime(context.stringValue("ListProductsResponse.ProductInfos["+ i +"].ModifyTime"));

			productInfos.add(productInfo);
		}
		listProductsResponse.setProductInfos(productInfos);
	 
	 	return listProductsResponse;
	}
}
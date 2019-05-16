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

import com.aliyuncs.ams.model.v20160201.QueryProductInfoResponse;
import com.aliyuncs.ams.model.v20160201.QueryProductInfoResponse.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductInfoResponseUnmarshaller {

	public static QueryProductInfoResponse unmarshall(QueryProductInfoResponse queryProductInfoResponse, UnmarshallerContext context) {
		
		queryProductInfoResponse.setRequestId(context.stringValue("QueryProductInfoResponse.RequestId"));
		queryProductInfoResponse.setCode(context.stringValue("QueryProductInfoResponse.Code"));

		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId(context.longValue("QueryProductInfoResponse.ProductInfo.ProductId"));
		productInfo.setUserId(context.longValue("QueryProductInfoResponse.ProductInfo.UserId"));
		productInfo.setTaobaoUserId(context.longValue("QueryProductInfoResponse.ProductInfo.TaobaoUserId"));
		productInfo.setName(context.stringValue("QueryProductInfoResponse.ProductInfo.Name"));
		productInfo.setDescription(context.stringValue("QueryProductInfoResponse.ProductInfo.Description"));
		productInfo.setVisible(context.booleanValue("QueryProductInfoResponse.ProductInfo.Visible"));
		productInfo.setIndustryId(context.integerValue("QueryProductInfoResponse.ProductInfo.IndustryId"));
		productInfo.setStatus(context.integerValue("QueryProductInfoResponse.ProductInfo.Status"));
		productInfo.setBizName(context.stringValue("QueryProductInfoResponse.ProductInfo.BizName"));
		productInfo.setCreateTime(context.stringValue("QueryProductInfoResponse.ProductInfo.CreateTime"));
		productInfo.setModifyTime(context.stringValue("QueryProductInfoResponse.ProductInfo.ModifyTime"));
		queryProductInfoResponse.setProductInfo(productInfo);
	 
	 	return queryProductInfoResponse;
	}
}
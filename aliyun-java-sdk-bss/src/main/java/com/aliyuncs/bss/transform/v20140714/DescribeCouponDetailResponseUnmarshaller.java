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

package com.aliyuncs.bss.transform.v20140714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bss.model.v20140714.DescribeCouponDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCouponDetailResponseUnmarshaller {

	public static DescribeCouponDetailResponse unmarshall(DescribeCouponDetailResponse describeCouponDetailResponse, UnmarshallerContext _ctx) {
		
		describeCouponDetailResponse.setRequestId(_ctx.stringValue("DescribeCouponDetailResponse.RequestId"));
		describeCouponDetailResponse.setCouponTemplateId(_ctx.longValue("DescribeCouponDetailResponse.CouponTemplateId"));
		describeCouponDetailResponse.setTotalAmount(_ctx.stringValue("DescribeCouponDetailResponse.TotalAmount"));
		describeCouponDetailResponse.setBalanceAmount(_ctx.stringValue("DescribeCouponDetailResponse.BalanceAmount"));
		describeCouponDetailResponse.setFrozenAmount(_ctx.stringValue("DescribeCouponDetailResponse.FrozenAmount"));
		describeCouponDetailResponse.setExpiredAmount(_ctx.stringValue("DescribeCouponDetailResponse.ExpiredAmount"));
		describeCouponDetailResponse.setDeliveryTime(_ctx.stringValue("DescribeCouponDetailResponse.DeliveryTime"));
		describeCouponDetailResponse.setExpiredTime(_ctx.stringValue("DescribeCouponDetailResponse.ExpiredTime"));
		describeCouponDetailResponse.setCouponNumber(_ctx.stringValue("DescribeCouponDetailResponse.CouponNumber"));
		describeCouponDetailResponse.setStatus(_ctx.stringValue("DescribeCouponDetailResponse.Status"));
		describeCouponDetailResponse.setDescription(_ctx.stringValue("DescribeCouponDetailResponse.Description"));
		describeCouponDetailResponse.setCreationTime(_ctx.stringValue("DescribeCouponDetailResponse.CreationTime"));
		describeCouponDetailResponse.setModificationTime(_ctx.stringValue("DescribeCouponDetailResponse.ModificationTime"));
		describeCouponDetailResponse.setPriceLimit(_ctx.stringValue("DescribeCouponDetailResponse.PriceLimit"));
		describeCouponDetailResponse.setApplication(_ctx.stringValue("DescribeCouponDetailResponse.Application"));

		List<String> productCodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCouponDetailResponse.ProductCodes.Length"); i++) {
			productCodes.add(_ctx.stringValue("DescribeCouponDetailResponse.ProductCodes["+ i +"]"));
		}
		describeCouponDetailResponse.setProductCodes(productCodes);

		List<String> tradeTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCouponDetailResponse.TradeTypes.Length"); i++) {
			tradeTypes.add(_ctx.stringValue("DescribeCouponDetailResponse.TradeTypes["+ i +"]"));
		}
		describeCouponDetailResponse.setTradeTypes(tradeTypes);
	 
	 	return describeCouponDetailResponse;
	}
}
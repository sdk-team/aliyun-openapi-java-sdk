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

import com.aliyuncs.bss.model.v20140714.DescribeCouponListResponse;
import com.aliyuncs.bss.model.v20140714.DescribeCouponListResponse.Coupon;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCouponListResponseUnmarshaller {

	public static DescribeCouponListResponse unmarshall(DescribeCouponListResponse describeCouponListResponse, UnmarshallerContext _ctx) {
		
		describeCouponListResponse.setRequestId(_ctx.stringValue("DescribeCouponListResponse.RequestId"));

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCouponListResponse.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponTemplateId(_ctx.longValue("DescribeCouponListResponse.Coupons["+ i +"].CouponTemplateId"));
			coupon.setTotalAmount(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].TotalAmount"));
			coupon.setBalanceAmount(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].BalanceAmount"));
			coupon.setFrozenAmount(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].FrozenAmount"));
			coupon.setExpiredAmount(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ExpiredAmount"));
			coupon.setDeliveryTime(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].DeliveryTime"));
			coupon.setExpiredTime(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ExpiredTime"));
			coupon.setCouponNumber(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].CouponNumber"));
			coupon.setStatus(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].Status"));
			coupon.setDescription(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].Description"));
			coupon.setCreationTime(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].CreationTime"));
			coupon.setModificationTime(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ModificationTime"));
			coupon.setPriceLimit(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].PriceLimit"));
			coupon.setApplication(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].Application"));

			List<String> productCodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCouponListResponse.Coupons["+ i +"].ProductCodes.Length"); j++) {
				productCodes.add(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ProductCodes["+ j +"]"));
			}
			coupon.setProductCodes(productCodes);

			List<String> tradeTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCouponListResponse.Coupons["+ i +"].TradeTypes.Length"); j++) {
				tradeTypes.add(_ctx.stringValue("DescribeCouponListResponse.Coupons["+ i +"].TradeTypes["+ j +"]"));
			}
			coupon.setTradeTypes(tradeTypes);

			coupons.add(coupon);
		}
		describeCouponListResponse.setCoupons(coupons);
	 
	 	return describeCouponListResponse;
	}
}
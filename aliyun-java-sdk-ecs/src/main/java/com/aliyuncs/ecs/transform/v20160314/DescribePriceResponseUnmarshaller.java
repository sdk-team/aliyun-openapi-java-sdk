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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Order;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Order.Coupon;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecs.model.v20160314.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		List<String> orderParams = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.OrderParams.Length"); i++) {
			orderParams.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.OrderParams["+ i +"]"));
		}
		priceInfo.setOrderParams(orderParams);

		Order order = new Order();
		order.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.OriginalPrice"));
		order.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.DiscountPrice"));
		order.setSpotInstanceTypePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.SpotInstanceTypePrice"));
		order.setSpotInstanceTypeOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.SpotInstanceTypeOriginalPrice"));
		order.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.TradePrice"));
		order.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Currency"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.RuleIdSet["+ i +"]"));
		}
		order.setRuleIdSet(ruleIdSet);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Description"));
			coupon.setDiscountOff(_ctx.floatValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].DiscountOff"));
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].IsSelected"));

			List<String> ruleIdSet1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].RuleIdSet.Length"); j++) {
				ruleIdSet1.add(_ctx.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].RuleIdSet["+ j +"]"));
			}
			coupon.setRuleIdSet1(ruleIdSet1);

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		priceInfo.setOrder(order);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setCode(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Code"));
		priceWarning.setMsg(_ctx.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Msg"));
		priceInfo.setPriceWarning(priceWarning);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setTitle(_ctx.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describePriceResponse;
	}
}
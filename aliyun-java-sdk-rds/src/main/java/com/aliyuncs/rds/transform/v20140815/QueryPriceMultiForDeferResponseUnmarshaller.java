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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.QueryPriceMultiForDeferResponse;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiForDeferResponse.Order;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiForDeferResponse.Order.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiForDeferResponse.Order.Coupon;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiForDeferResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceMultiForDeferResponseUnmarshaller {

	public static QueryPriceMultiForDeferResponse unmarshall(QueryPriceMultiForDeferResponse queryPriceMultiForDeferResponse, UnmarshallerContext context) {
		
		queryPriceMultiForDeferResponse.setRequestId(context.stringValue("QueryPriceMultiForDeferResponse.RequestId"));

		Order order = new Order();
		order.setCurrency(context.stringValue("QueryPriceMultiForDeferResponse.Order.Currency"));
		order.setOriginalAmount(context.floatValue("QueryPriceMultiForDeferResponse.Order.OriginalAmount"));
		order.setTradeAmount(context.floatValue("QueryPriceMultiForDeferResponse.Order.TradeAmount"));
		order.setDiscountAmount(context.floatValue("QueryPriceMultiForDeferResponse.Order.DiscountAmount"));
		order.setDiscountAmount1(context.floatValue("QueryPriceMultiForDeferResponse.Order.DiscountAmount"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPriceMultiForDeferResponse.Order.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("QueryPriceMultiForDeferResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("QueryPriceMultiForDeferResponse.Order.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("QueryPriceMultiForDeferResponse.Order.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("QueryPriceMultiForDeferResponse.Order.ActivityInfo.Success"));
		order.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("QueryPriceMultiForDeferResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("QueryPriceMultiForDeferResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("QueryPriceMultiForDeferResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("QueryPriceMultiForDeferResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("QueryPriceMultiForDeferResponse.Order.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		queryPriceMultiForDeferResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("QueryPriceMultiForDeferResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(context.longValue("QueryPriceMultiForDeferResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(context.stringValue("QueryPriceMultiForDeferResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("QueryPriceMultiForDeferResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		queryPriceMultiForDeferResponse.setRules(rules);
	 
	 	return queryPriceMultiForDeferResponse;
	}
}
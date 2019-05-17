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

import com.aliyuncs.rds.model.v20140815.QueryPriceResponse;
import com.aliyuncs.rds.model.v20140815.QueryPriceResponse.Order;
import com.aliyuncs.rds.model.v20140815.QueryPriceResponse.Order.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.QueryPriceResponse.Order.Coupon;
import com.aliyuncs.rds.model.v20140815.QueryPriceResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceResponseUnmarshaller {

	public static QueryPriceResponse unmarshall(QueryPriceResponse queryPriceResponse, UnmarshallerContext context) {
		
		queryPriceResponse.setRequestId(context.stringValue("QueryPriceResponse.RequestId"));
		queryPriceResponse.setOrderParams(context.stringValue("QueryPriceResponse.OrderParams"));

		Order order = new Order();
		order.setCurrency(context.stringValue("QueryPriceResponse.Order.Currency"));
		order.setOriginalAmount(context.floatValue("QueryPriceResponse.Order.OriginalAmount"));
		order.setTradeAmount(context.floatValue("QueryPriceResponse.Order.TradeAmount"));
		order.setDiscountAmount(context.floatValue("QueryPriceResponse.Order.DiscountAmount"));
		order.setDiscountAmount1(context.floatValue("QueryPriceResponse.Order.DiscountAmount"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPriceResponse.Order.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("QueryPriceResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("QueryPriceResponse.Order.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("QueryPriceResponse.Order.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("QueryPriceResponse.Order.ActivityInfo.Success"));
		order.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("QueryPriceResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("QueryPriceResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("QueryPriceResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("QueryPriceResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("QueryPriceResponse.Order.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		queryPriceResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("QueryPriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(context.longValue("QueryPriceResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(context.stringValue("QueryPriceResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("QueryPriceResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		queryPriceResponse.setRules(rules);
	 
	 	return queryPriceResponse;
	}
}
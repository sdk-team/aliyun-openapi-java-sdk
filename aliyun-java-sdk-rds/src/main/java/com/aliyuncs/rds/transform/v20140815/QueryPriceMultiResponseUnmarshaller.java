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

import com.aliyuncs.rds.model.v20140815.QueryPriceMultiResponse;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiResponse.Order;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiResponse.Order.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiResponse.Order.Coupon;
import com.aliyuncs.rds.model.v20140815.QueryPriceMultiResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceMultiResponseUnmarshaller {

	public static QueryPriceMultiResponse unmarshall(QueryPriceMultiResponse queryPriceMultiResponse, UnmarshallerContext context) {
		
		queryPriceMultiResponse.setRequestId(context.stringValue("QueryPriceMultiResponse.RequestId"));

		Order order = new Order();
		order.setOriginalAmount(context.floatValue("QueryPriceMultiResponse.Order.OriginalAmount"));
		order.setCurrency(context.stringValue("QueryPriceMultiResponse.Order.Currency"));
		order.setTradeAmount(context.floatValue("QueryPriceMultiResponse.Order.TradeAmount"));
		order.setDiscountAmount(context.floatValue("QueryPriceMultiResponse.Order.DiscountAmount"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPriceMultiResponse.Order.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("QueryPriceMultiResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("QueryPriceMultiResponse.Order.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("QueryPriceMultiResponse.Order.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("QueryPriceMultiResponse.Order.ActivityInfo.Success"));
		order.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("QueryPriceMultiResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("QueryPriceMultiResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("QueryPriceMultiResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("QueryPriceMultiResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("QueryPriceMultiResponse.Order.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		queryPriceMultiResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("QueryPriceMultiResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(context.longValue("QueryPriceMultiResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(context.stringValue("QueryPriceMultiResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("QueryPriceMultiResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		queryPriceMultiResponse.setRules(rules);
	 
	 	return queryPriceMultiResponse;
	}
}
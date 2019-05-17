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

import com.aliyuncs.rds.model.v20140815.QueryPriceForRefundResponse;
import com.aliyuncs.rds.model.v20140815.QueryPriceForRefundResponse.Order;
import com.aliyuncs.rds.model.v20140815.QueryPriceForRefundResponse.Order.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.QueryPriceForRefundResponse.Order.Coupon;
import com.aliyuncs.rds.model.v20140815.QueryPriceForRefundResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceForRefundResponseUnmarshaller {

	public static QueryPriceForRefundResponse unmarshall(QueryPriceForRefundResponse queryPriceForRefundResponse, UnmarshallerContext context) {
		
		queryPriceForRefundResponse.setRequestId(context.stringValue("QueryPriceForRefundResponse.RequestId"));

		Order order = new Order();
		order.setCurrency(context.stringValue("QueryPriceForRefundResponse.Order.Currency"));
		order.setOriginalAmount(context.floatValue("QueryPriceForRefundResponse.Order.OriginalAmount"));
		order.setTradeAmount(context.floatValue("QueryPriceForRefundResponse.Order.TradeAmount"));
		order.setDiscountAmount(context.floatValue("QueryPriceForRefundResponse.Order.DiscountAmount"));
		order.setDiscountAmount1(context.floatValue("QueryPriceForRefundResponse.Order.DiscountAmount"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPriceForRefundResponse.Order.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("QueryPriceForRefundResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("QueryPriceForRefundResponse.Order.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("QueryPriceForRefundResponse.Order.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("QueryPriceForRefundResponse.Order.ActivityInfo.Success"));
		order.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("QueryPriceForRefundResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("QueryPriceForRefundResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("QueryPriceForRefundResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("QueryPriceForRefundResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("QueryPriceForRefundResponse.Order.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		queryPriceForRefundResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("QueryPriceForRefundResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(context.longValue("QueryPriceForRefundResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(context.stringValue("QueryPriceForRefundResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("QueryPriceForRefundResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		queryPriceForRefundResponse.setRules(rules);
	 
	 	return queryPriceForRefundResponse;
	}
}
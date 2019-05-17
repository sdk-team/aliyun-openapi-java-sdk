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

import com.aliyuncs.rds.model.v20140815.QueryPriceForTempUpgradeResponse;
import com.aliyuncs.rds.model.v20140815.QueryPriceForTempUpgradeResponse.Order;
import com.aliyuncs.rds.model.v20140815.QueryPriceForTempUpgradeResponse.Order.ActivityInfo;
import com.aliyuncs.rds.model.v20140815.QueryPriceForTempUpgradeResponse.Order.Coupon;
import com.aliyuncs.rds.model.v20140815.QueryPriceForTempUpgradeResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceForTempUpgradeResponseUnmarshaller {

	public static QueryPriceForTempUpgradeResponse unmarshall(QueryPriceForTempUpgradeResponse queryPriceForTempUpgradeResponse, UnmarshallerContext context) {
		
		queryPriceForTempUpgradeResponse.setRequestId(context.stringValue("QueryPriceForTempUpgradeResponse.RequestId"));

		Order order = new Order();
		order.setCurrency(context.stringValue("QueryPriceForTempUpgradeResponse.Order.Currency"));
		order.setOriginalAmount(context.floatValue("QueryPriceForTempUpgradeResponse.Order.OriginalAmount"));
		order.setTradeAmount(context.floatValue("QueryPriceForTempUpgradeResponse.Order.TradeAmount"));
		order.setDiscountAmount(context.floatValue("QueryPriceForTempUpgradeResponse.Order.DiscountAmount"));
		order.setDiscountAmount1(context.floatValue("QueryPriceForTempUpgradeResponse.Order.DiscountAmount"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPriceForTempUpgradeResponse.Order.RuleIds.Length"); i++) {
			ruleIds.add(context.stringValue("QueryPriceForTempUpgradeResponse.Order.RuleIds["+ i +"]"));
		}
		order.setRuleIds(ruleIds);

		ActivityInfo activityInfo = new ActivityInfo();
		activityInfo.setCheckErrMsg(context.stringValue("QueryPriceForTempUpgradeResponse.Order.ActivityInfo.CheckErrMsg"));
		activityInfo.setErrorCode(context.stringValue("QueryPriceForTempUpgradeResponse.Order.ActivityInfo.ErrorCode"));
		activityInfo.setSuccess(context.stringValue("QueryPriceForTempUpgradeResponse.Order.ActivityInfo.Success"));
		order.setActivityInfo(activityInfo);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("QueryPriceForTempUpgradeResponse.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("QueryPriceForTempUpgradeResponse.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("QueryPriceForTempUpgradeResponse.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("QueryPriceForTempUpgradeResponse.Order.Coupons["+ i +"].Description"));
			coupon.setIsSelected(context.stringValue("QueryPriceForTempUpgradeResponse.Order.Coupons["+ i +"].IsSelected"));

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		queryPriceForTempUpgradeResponse.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("QueryPriceForTempUpgradeResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleDescId(context.longValue("QueryPriceForTempUpgradeResponse.Rules["+ i +"].RuleDescId"));
			rule.setName(context.stringValue("QueryPriceForTempUpgradeResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("QueryPriceForTempUpgradeResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		queryPriceForTempUpgradeResponse.setRules(rules);
	 
	 	return queryPriceForTempUpgradeResponse;
	}
}
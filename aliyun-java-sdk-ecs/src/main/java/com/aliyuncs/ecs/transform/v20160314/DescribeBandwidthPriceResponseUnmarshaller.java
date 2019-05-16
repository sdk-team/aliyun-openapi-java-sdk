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

import com.aliyuncs.ecs.model.v20160314.DescribeBandwidthPriceResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeBandwidthPriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20160314.DescribeBandwidthPriceResponse.PriceInfo.Order;
import com.aliyuncs.ecs.model.v20160314.DescribeBandwidthPriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBandwidthPriceResponseUnmarshaller {

	public static DescribeBandwidthPriceResponse unmarshall(DescribeBandwidthPriceResponse describeBandwidthPriceResponse, UnmarshallerContext context) {
		
		describeBandwidthPriceResponse.setRequestId(context.stringValue("DescribeBandwidthPriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Order order = new Order();
		order.setOriginalPrice(context.floatValue("DescribeBandwidthPriceResponse.PriceInfo.Order.OriginalPrice"));
		order.setDiscountPrice(context.floatValue("DescribeBandwidthPriceResponse.PriceInfo.Order.DiscountPrice"));
		order.setTradePrice(context.floatValue("DescribeBandwidthPriceResponse.PriceInfo.Order.TradePrice"));
		order.setCurrency(context.stringValue("DescribeBandwidthPriceResponse.PriceInfo.Order.Currency"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeBandwidthPriceResponse.PriceInfo.Order.RuleIdSet.Length"); i++) {
			ruleIdSet.add(context.stringValue("DescribeBandwidthPriceResponse.PriceInfo.Order.RuleIdSet["+ i +"]"));
		}
		order.setRuleIdSet(ruleIdSet);
		priceInfo.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeBandwidthPriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("DescribeBandwidthPriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setTitle(context.stringValue("DescribeBandwidthPriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(context.stringValue("DescribeBandwidthPriceResponse.PriceInfo.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describeBandwidthPriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeBandwidthPriceResponse;
	}
}
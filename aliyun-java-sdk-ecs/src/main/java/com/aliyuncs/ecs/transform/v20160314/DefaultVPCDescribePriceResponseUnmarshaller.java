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

import com.aliyuncs.ecs.model.v20160314.DefaultVPCDescribePriceResponse;
import com.aliyuncs.ecs.model.v20160314.DefaultVPCDescribePriceResponse.PriceInfo;
import com.aliyuncs.ecs.model.v20160314.DefaultVPCDescribePriceResponse.PriceInfo.Order;
import com.aliyuncs.ecs.model.v20160314.DefaultVPCDescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DefaultVPCDescribePriceResponseUnmarshaller {

	public static DefaultVPCDescribePriceResponse unmarshall(DefaultVPCDescribePriceResponse defaultVPCDescribePriceResponse, UnmarshallerContext _ctx) {
		
		defaultVPCDescribePriceResponse.setRequestId(_ctx.stringValue("DefaultVPCDescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Order order = new Order();
		order.setOriginalPrice(_ctx.floatValue("DefaultVPCDescribePriceResponse.PriceInfo.Order.OriginalPrice"));
		order.setDiscountPrice(_ctx.floatValue("DefaultVPCDescribePriceResponse.PriceInfo.Order.DiscountPrice"));
		order.setTradePrice(_ctx.floatValue("DefaultVPCDescribePriceResponse.PriceInfo.Order.TradePrice"));
		order.setCurrency(_ctx.stringValue("DefaultVPCDescribePriceResponse.PriceInfo.Order.Currency"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DefaultVPCDescribePriceResponse.PriceInfo.Order.RuleIdSet.Length"); i++) {
			ruleIdSet.add(_ctx.stringValue("DefaultVPCDescribePriceResponse.PriceInfo.Order.RuleIdSet["+ i +"]"));
		}
		order.setRuleIdSet(ruleIdSet);
		priceInfo.setOrder(order);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DefaultVPCDescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DefaultVPCDescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setTitle(_ctx.stringValue("DefaultVPCDescribePriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(_ctx.stringValue("DefaultVPCDescribePriceResponse.PriceInfo.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		defaultVPCDescribePriceResponse.setPriceInfo(priceInfo);
	 
	 	return defaultVPCDescribePriceResponse;
	}
}
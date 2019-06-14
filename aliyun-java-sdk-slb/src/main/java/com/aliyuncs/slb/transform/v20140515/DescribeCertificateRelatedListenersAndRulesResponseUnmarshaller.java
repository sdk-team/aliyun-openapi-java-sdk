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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeCertificateRelatedListenersAndRulesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeCertificateRelatedListenersAndRulesResponse.Listener;
import com.aliyuncs.slb.model.v20140515.DescribeCertificateRelatedListenersAndRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateRelatedListenersAndRulesResponseUnmarshaller {

	public static DescribeCertificateRelatedListenersAndRulesResponse unmarshall(DescribeCertificateRelatedListenersAndRulesResponse describeCertificateRelatedListenersAndRulesResponse, UnmarshallerContext context) {
		
		describeCertificateRelatedListenersAndRulesResponse.setRequestId(context.stringValue("DescribeCertificateRelatedListenersAndRulesResponse.RequestId"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < context.lengthValue("DescribeCertificateRelatedListenersAndRulesResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setLoadBalancerId(context.stringValue("DescribeCertificateRelatedListenersAndRulesResponse.Listeners["+ i +"].LoadBalancerId"));
			listener.setListenerPort(context.integerValue("DescribeCertificateRelatedListenersAndRulesResponse.Listeners["+ i +"].ListenerPort"));

			listeners.add(listener);
		}
		describeCertificateRelatedListenersAndRulesResponse.setListeners(listeners);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeCertificateRelatedListenersAndRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setLoadBalancerId(context.stringValue("DescribeCertificateRelatedListenersAndRulesResponse.Rules["+ i +"].LoadBalancerId"));
			rule.setListenerPort(context.integerValue("DescribeCertificateRelatedListenersAndRulesResponse.Rules["+ i +"].ListenerPort"));
			rule.setRuleId(context.stringValue("DescribeCertificateRelatedListenersAndRulesResponse.Rules["+ i +"].RuleId"));

			rules.add(rule);
		}
		describeCertificateRelatedListenersAndRulesResponse.setRules(rules);
	 
	 	return describeCertificateRelatedListenersAndRulesResponse;
	}
}
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

import com.aliyuncs.ecs.model.v20160314.DescribeConfigLogSubscriptionResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeConfigLogSubscriptionResponse.Subscription;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigLogSubscriptionResponseUnmarshaller {

	public static DescribeConfigLogSubscriptionResponse unmarshall(DescribeConfigLogSubscriptionResponse describeConfigLogSubscriptionResponse, UnmarshallerContext context) {
		
		describeConfigLogSubscriptionResponse.setRequestId(context.stringValue("DescribeConfigLogSubscriptionResponse.RequestId"));
		describeConfigLogSubscriptionResponse.setTotalCount(context.integerValue("DescribeConfigLogSubscriptionResponse.TotalCount"));
		describeConfigLogSubscriptionResponse.setPageNumber(context.integerValue("DescribeConfigLogSubscriptionResponse.PageNumber"));
		describeConfigLogSubscriptionResponse.setPageSize(context.integerValue("DescribeConfigLogSubscriptionResponse.PageSize"));

		List<Subscription> subscriptionSet = new ArrayList<Subscription>();
		for (int i = 0; i < context.lengthValue("DescribeConfigLogSubscriptionResponse.SubscriptionSet.Length"); i++) {
			Subscription subscription = new Subscription();
			subscription.setName(context.stringValue("DescribeConfigLogSubscriptionResponse.SubscriptionSet["+ i +"].Name"));
			subscription.setResourceType(context.stringValue("DescribeConfigLogSubscriptionResponse.SubscriptionSet["+ i +"].ResourceType"));
			subscription.setMnsQueueArn(context.stringValue("DescribeConfigLogSubscriptionResponse.SubscriptionSet["+ i +"].MnsQueueArn"));

			subscriptionSet.add(subscription);
		}
		describeConfigLogSubscriptionResponse.setSubscriptionSet(subscriptionSet);
	 
	 	return describeConfigLogSubscriptionResponse;
	}
}
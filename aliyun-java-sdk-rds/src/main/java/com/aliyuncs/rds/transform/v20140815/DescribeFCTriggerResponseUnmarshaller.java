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

import com.aliyuncs.rds.model.v20140815.DescribeFCTriggerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeFCTriggerResponse.FCTrigger;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFCTriggerResponseUnmarshaller {

	public static DescribeFCTriggerResponse unmarshall(DescribeFCTriggerResponse describeFCTriggerResponse, UnmarshallerContext context) {
		
		describeFCTriggerResponse.setRequestId(context.stringValue("DescribeFCTriggerResponse.RequestId"));

		List<FCTrigger> items = new ArrayList<FCTrigger>();
		for (int i = 0; i < context.lengthValue("DescribeFCTriggerResponse.Items.Length"); i++) {
			FCTrigger fCTrigger = new FCTrigger();
			fCTrigger.setTriggerId(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].TriggerId"));
			fCTrigger.setTriggerArn(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].TriggerArn"));
			fCTrigger.setSourceArn(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].SourceArn"));
			fCTrigger.setInvocationRoleArn(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].InvocationRoleArn"));
			fCTrigger.setFunctionArn(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].FunctionArn"));
			fCTrigger.setInstanceId(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].InstanceId"));
			fCTrigger.setRetry(context.integerValue("DescribeFCTriggerResponse.Items["+ i +"].Retry"));
			fCTrigger.setConcurrency(context.integerValue("DescribeFCTriggerResponse.Items["+ i +"].Concurrency"));
			fCTrigger.setEventFormat(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].EventFormat"));
			fCTrigger.setRegion(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].Region"));

			List<String> subscriptionObjects = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeFCTriggerResponse.Items["+ i +"].SubscriptionObjects.Length"); j++) {
				subscriptionObjects.add(context.stringValue("DescribeFCTriggerResponse.Items["+ i +"].SubscriptionObjects["+ j +"]"));
			}
			fCTrigger.setSubscriptionObjects(subscriptionObjects);

			items.add(fCTrigger);
		}
		describeFCTriggerResponse.setItems(items);
	 
	 	return describeFCTriggerResponse;
	}
}
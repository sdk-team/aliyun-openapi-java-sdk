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

import com.aliyuncs.ecs.model.v20160314.DescribeDedicatedHostAutoRenewResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeDedicatedHostAutoRenewResponse.InstanceRenewAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostAutoRenewResponseUnmarshaller {

	public static DescribeDedicatedHostAutoRenewResponse unmarshall(DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenewResponse, UnmarshallerContext context) {
		
		describeDedicatedHostAutoRenewResponse.setRequestId(context.stringValue("DescribeDedicatedHostAutoRenewResponse.RequestId"));

		List<InstanceRenewAttribute> instanceRenewAttributes = new ArrayList<InstanceRenewAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeDedicatedHostAutoRenewResponse.InstanceRenewAttributes.Length"); i++) {
			InstanceRenewAttribute instanceRenewAttribute = new InstanceRenewAttribute();
			instanceRenewAttribute.setInstanceId(context.stringValue("DescribeDedicatedHostAutoRenewResponse.InstanceRenewAttributes["+ i +"].InstanceId"));
			instanceRenewAttribute.setAutoRenewEnabled(context.booleanValue("DescribeDedicatedHostAutoRenewResponse.InstanceRenewAttributes["+ i +"].AutoRenewEnabled"));
			instanceRenewAttribute.setDuration(context.integerValue("DescribeDedicatedHostAutoRenewResponse.InstanceRenewAttributes["+ i +"].Duration"));
			instanceRenewAttribute.setPeriodUnit(context.stringValue("DescribeDedicatedHostAutoRenewResponse.InstanceRenewAttributes["+ i +"].PeriodUnit"));
			instanceRenewAttribute.setRenewalStatus(context.stringValue("DescribeDedicatedHostAutoRenewResponse.InstanceRenewAttributes["+ i +"].RenewalStatus"));

			instanceRenewAttributes.add(instanceRenewAttribute);
		}
		describeDedicatedHostAutoRenewResponse.setInstanceRenewAttributes(instanceRenewAttributes);
	 
	 	return describeDedicatedHostAutoRenewResponse;
	}
}
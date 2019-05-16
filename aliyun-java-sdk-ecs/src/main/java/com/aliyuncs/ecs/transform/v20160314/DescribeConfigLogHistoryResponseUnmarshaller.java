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

import com.aliyuncs.ecs.model.v20160314.DescribeConfigLogHistoryResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeConfigLogHistoryResponse.ConfigurationItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigLogHistoryResponseUnmarshaller {

	public static DescribeConfigLogHistoryResponse unmarshall(DescribeConfigLogHistoryResponse describeConfigLogHistoryResponse, UnmarshallerContext context) {
		
		describeConfigLogHistoryResponse.setRequestId(context.stringValue("DescribeConfigLogHistoryResponse.RequestId"));
		describeConfigLogHistoryResponse.setTotalCount(context.integerValue("DescribeConfigLogHistoryResponse.TotalCount"));
		describeConfigLogHistoryResponse.setPageNumber(context.integerValue("DescribeConfigLogHistoryResponse.PageNumber"));
		describeConfigLogHistoryResponse.setPageSize(context.integerValue("DescribeConfigLogHistoryResponse.PageSize"));

		List<ConfigurationItem> configurationItemSet = new ArrayList<ConfigurationItem>();
		for (int i = 0; i < context.lengthValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet.Length"); i++) {
			ConfigurationItem configurationItem = new ConfigurationItem();
			configurationItem.setConfigurationItemVersion(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].ConfigurationItemVersion"));
			configurationItem.setConfigurationCaptureTime(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].ConfigurationCaptureTime"));
			configurationItem.setResourceId(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].ResourceId"));
			configurationItem.setResourceType(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].ResourceType"));
			configurationItem.setAliUid(context.longValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].AliUid"));
			configurationItem.setArn(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].Arn"));
			configurationItem.setResourceCreationTime(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].ResourceCreationTime"));
			configurationItem.setRegionId(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].RegionId"));
			configurationItem.setZoneId(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].ZoneId"));
			configurationItem.setConfiguration(context.stringValue("DescribeConfigLogHistoryResponse.ConfigurationItemSet["+ i +"].Configuration"));

			configurationItemSet.add(configurationItem);
		}
		describeConfigLogHistoryResponse.setConfigurationItemSet(configurationItemSet);
	 
	 	return describeConfigLogHistoryResponse;
	}
}
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

import com.aliyuncs.rds.model.v20140815.DescribeSqlLogTemplatesTimeDistributionResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSqlLogTemplatesTimeDistributionResponse.Distribution;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlLogTemplatesTimeDistributionResponseUnmarshaller {

	public static DescribeSqlLogTemplatesTimeDistributionResponse unmarshall(DescribeSqlLogTemplatesTimeDistributionResponse describeSqlLogTemplatesTimeDistributionResponse, UnmarshallerContext context) {
		
		describeSqlLogTemplatesTimeDistributionResponse.setRequestId(context.stringValue("DescribeSqlLogTemplatesTimeDistributionResponse.RequestId"));
		describeSqlLogTemplatesTimeDistributionResponse.setDBInstanceID(context.integerValue("DescribeSqlLogTemplatesTimeDistributionResponse.DBInstanceID"));
		describeSqlLogTemplatesTimeDistributionResponse.setDBInstanceName(context.stringValue("DescribeSqlLogTemplatesTimeDistributionResponse.DBInstanceName"));
		describeSqlLogTemplatesTimeDistributionResponse.setStartTime(context.stringValue("DescribeSqlLogTemplatesTimeDistributionResponse.StartTime"));
		describeSqlLogTemplatesTimeDistributionResponse.setEndTime(context.stringValue("DescribeSqlLogTemplatesTimeDistributionResponse.EndTime"));
		describeSqlLogTemplatesTimeDistributionResponse.setItemsNumbers(context.integerValue("DescribeSqlLogTemplatesTimeDistributionResponse.ItemsNumbers"));
		describeSqlLogTemplatesTimeDistributionResponse.setJobId(context.stringValue("DescribeSqlLogTemplatesTimeDistributionResponse.JobId"));
		describeSqlLogTemplatesTimeDistributionResponse.setFinish(context.stringValue("DescribeSqlLogTemplatesTimeDistributionResponse.Finish"));

		List<Distribution> items = new ArrayList<Distribution>();
		for (int i = 0; i < context.lengthValue("DescribeSqlLogTemplatesTimeDistributionResponse.Items.Length"); i++) {
			Distribution distribution = new Distribution();
			distribution.setTime(context.stringValue("DescribeSqlLogTemplatesTimeDistributionResponse.Items["+ i +"].Time"));
			distribution.setTemplateHash(context.longValue("DescribeSqlLogTemplatesTimeDistributionResponse.Items["+ i +"].TemplateHash"));
			distribution.setValue(context.floatValue("DescribeSqlLogTemplatesTimeDistributionResponse.Items["+ i +"].Value"));

			items.add(distribution);
		}
		describeSqlLogTemplatesTimeDistributionResponse.setItems(items);
	 
	 	return describeSqlLogTemplatesTimeDistributionResponse;
	}
}
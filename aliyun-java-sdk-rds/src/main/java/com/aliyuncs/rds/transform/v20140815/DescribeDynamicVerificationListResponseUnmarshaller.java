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

import com.aliyuncs.rds.model.v20140815.DescribeDynamicVerificationListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDynamicVerificationListResponse.ItemsItem;
import com.aliyuncs.rds.model.v20140815.DescribeDynamicVerificationListResponse.ItemsItem.InconsistentFiledsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDynamicVerificationListResponseUnmarshaller {

	public static DescribeDynamicVerificationListResponse unmarshall(DescribeDynamicVerificationListResponse describeDynamicVerificationListResponse, UnmarshallerContext context) {
		
		describeDynamicVerificationListResponse.setRequestId(context.stringValue("DescribeDynamicVerificationListResponse.RequestId"));
		describeDynamicVerificationListResponse.setReplicaId(context.stringValue("DescribeDynamicVerificationListResponse.ReplicaId"));
		describeDynamicVerificationListResponse.setPagNumber(context.integerValue("DescribeDynamicVerificationListResponse.PagNumber"));
		describeDynamicVerificationListResponse.setPageRecordCount(context.integerValue("DescribeDynamicVerificationListResponse.PageRecordCount"));
		describeDynamicVerificationListResponse.setTotalRecordCount(context.integerValue("DescribeDynamicVerificationListResponse.TotalRecordCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeDynamicVerificationListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setInstanceIdA(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].InstanceIdA"));
			itemsItem.setInstanceIdB(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].InstanceIdB"));
			itemsItem.setKey(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].Key"));
			itemsItem.setKeyType(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].KeyType"));
			itemsItem.setInconsistentType(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].InconsistentType"));
			itemsItem.setOccurTime(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].OccurTime"));
			itemsItem.setSchema(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].Schema"));

			List<InconsistentFiledsItem> inconsistentFileds = new ArrayList<InconsistentFiledsItem>();
			for (int j = 0; j < context.lengthValue("DescribeDynamicVerificationListResponse.Items["+ i +"].InconsistentFileds.Length"); j++) {
				InconsistentFiledsItem inconsistentFiledsItem = new InconsistentFiledsItem();
				inconsistentFiledsItem.setFiled(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].InconsistentFileds["+ j +"].Filed"));
				inconsistentFiledsItem.setFiledInconsistentType(context.stringValue("DescribeDynamicVerificationListResponse.Items["+ i +"].InconsistentFileds["+ j +"].FiledInconsistentType"));

				inconsistentFileds.add(inconsistentFiledsItem);
			}
			itemsItem.setInconsistentFileds(inconsistentFileds);

			items.add(itemsItem);
		}
		describeDynamicVerificationListResponse.setItems(items);
	 
	 	return describeDynamicVerificationListResponse;
	}
}
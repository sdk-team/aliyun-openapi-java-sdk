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

import com.aliyuncs.ecs.model.v20160314.CreateOrderResponse;
import com.aliyuncs.ecs.model.v20160314.CreateOrderResponse.RelatedOrderItemSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderResponseUnmarshaller {

	public static CreateOrderResponse unmarshall(CreateOrderResponse createOrderResponse, UnmarshallerContext context) {
		
		createOrderResponse.setRequestId(context.stringValue("CreateOrderResponse.RequestId"));
		createOrderResponse.setOrderId(context.stringValue("CreateOrderResponse.OrderId"));
		createOrderResponse.setTaskId(context.stringValue("CreateOrderResponse.TaskId"));

		List<String> orderParams = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateOrderResponse.OrderParams.Length"); i++) {
			orderParams.add(context.stringValue("CreateOrderResponse.OrderParams["+ i +"]"));
		}
		createOrderResponse.setOrderParams(orderParams);

		List<RelatedOrderItemSet> relatedOrderItemSets = new ArrayList<RelatedOrderItemSet>();
		for (int i = 0; i < context.lengthValue("CreateOrderResponse.RelatedOrderItemSets.Length"); i++) {
			RelatedOrderItemSet relatedOrderItemSet = new RelatedOrderItemSet();

			List<String> instanceIdSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("CreateOrderResponse.RelatedOrderItemSets["+ i +"].InstanceIdSet.Length"); j++) {
				instanceIdSet.add(context.stringValue("CreateOrderResponse.RelatedOrderItemSets["+ i +"].InstanceIdSet["+ j +"]"));
			}
			relatedOrderItemSet.setInstanceIdSet(instanceIdSet);

			List<String> relatedOrderIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("CreateOrderResponse.RelatedOrderItemSets["+ i +"].RelatedOrderIds.Length"); j++) {
				relatedOrderIds.add(context.stringValue("CreateOrderResponse.RelatedOrderItemSets["+ i +"].RelatedOrderIds["+ j +"]"));
			}
			relatedOrderItemSet.setRelatedOrderIds(relatedOrderIds);

			relatedOrderItemSets.add(relatedOrderItemSet);
		}
		createOrderResponse.setRelatedOrderItemSets(relatedOrderItemSets);
	 
	 	return createOrderResponse;
	}
}
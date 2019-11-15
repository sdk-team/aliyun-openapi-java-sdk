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

import com.aliyuncs.ecs.model.v20160314.InnerIsChannelMerchantResponse;
import com.aliyuncs.ecs.model.v20160314.InnerIsChannelMerchantResponse.EcsChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerIsChannelMerchantResponseUnmarshaller {

	public static InnerIsChannelMerchantResponse unmarshall(InnerIsChannelMerchantResponse innerIsChannelMerchantResponse, UnmarshallerContext _ctx) {
		
		innerIsChannelMerchantResponse.setRequestId(_ctx.stringValue("InnerIsChannelMerchantResponse.RequestId"));

		EcsChannel ecsChannel = new EcsChannel();
		ecsChannel.setIsChannelMerchant(_ctx.booleanValue("InnerIsChannelMerchantResponse.EcsChannel.IsChannelMerchant"));
		ecsChannel.setAliUid(_ctx.longValue("InnerIsChannelMerchantResponse.EcsChannel.AliUid"));
		ecsChannel.setBid(_ctx.stringValue("InnerIsChannelMerchantResponse.EcsChannel.Bid"));
		ecsChannel.setChannel(_ctx.stringValue("InnerIsChannelMerchantResponse.EcsChannel.Channel"));
		ecsChannel.setInstanceId(_ctx.stringValue("InnerIsChannelMerchantResponse.EcsChannel.InstanceId"));
		innerIsChannelMerchantResponse.setEcsChannel(ecsChannel);
	 
	 	return innerIsChannelMerchantResponse;
	}
}
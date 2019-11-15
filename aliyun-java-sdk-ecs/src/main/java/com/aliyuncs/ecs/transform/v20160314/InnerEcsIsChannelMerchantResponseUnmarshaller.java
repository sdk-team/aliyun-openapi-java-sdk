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

import com.aliyuncs.ecs.model.v20160314.InnerEcsIsChannelMerchantResponse;
import com.aliyuncs.ecs.model.v20160314.InnerEcsIsChannelMerchantResponse.Data;
import com.aliyuncs.ecs.model.v20160314.InnerEcsIsChannelMerchantResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsIsChannelMerchantResponseUnmarshaller {

	public static InnerEcsIsChannelMerchantResponse unmarshall(InnerEcsIsChannelMerchantResponse innerEcsIsChannelMerchantResponse, UnmarshallerContext _ctx) {
		
		innerEcsIsChannelMerchantResponse.setRequestId(_ctx.stringValue("InnerEcsIsChannelMerchantResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsIsChannelMerchantResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsIsChannelMerchantResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsIsChannelMerchantResponse.errorCode.isSuccess"));
		innerEcsIsChannelMerchantResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setAliUid(_ctx.longValue("InnerEcsIsChannelMerchantResponse.data.aliUid"));
		data.setBid(_ctx.stringValue("InnerEcsIsChannelMerchantResponse.data.bid"));
		data.setChannel(_ctx.stringValue("InnerEcsIsChannelMerchantResponse.data.channel"));
		data.setInstanceId(_ctx.stringValue("InnerEcsIsChannelMerchantResponse.data.instanceId"));
		data.setIsChannelMerchant(_ctx.booleanValue("InnerEcsIsChannelMerchantResponse.data.isChannelMerchant"));
		innerEcsIsChannelMerchantResponse.setData(data);
	 
	 	return innerEcsIsChannelMerchantResponse;
	}
}
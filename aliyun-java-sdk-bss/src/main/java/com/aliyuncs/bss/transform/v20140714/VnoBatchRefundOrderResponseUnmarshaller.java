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

package com.aliyuncs.bss.transform.v20140714;

import com.aliyuncs.bss.model.v20140714.VnoBatchRefundOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VnoBatchRefundOrderResponseUnmarshaller {

	public static VnoBatchRefundOrderResponse unmarshall(VnoBatchRefundOrderResponse vnoBatchRefundOrderResponse, UnmarshallerContext _ctx) {
		
		vnoBatchRefundOrderResponse.setRequestId(_ctx.stringValue("VnoBatchRefundOrderResponse.RequestId"));
		vnoBatchRefundOrderResponse.setSuccess(_ctx.booleanValue("VnoBatchRefundOrderResponse.Success"));
		vnoBatchRefundOrderResponse.setCode(_ctx.stringValue("VnoBatchRefundOrderResponse.Code"));
		vnoBatchRefundOrderResponse.setMessage(_ctx.stringValue("VnoBatchRefundOrderResponse.Message"));
		vnoBatchRefundOrderResponse.setData(_ctx.stringValue("VnoBatchRefundOrderResponse.Data"));
	 
	 	return vnoBatchRefundOrderResponse;
	}
}
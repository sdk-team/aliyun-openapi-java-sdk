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

package com.aliyuncs.acs.transform.v20150101;

import com.aliyuncs.acs.model.v20150101.PurchaseApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PurchaseApiResponseUnmarshaller {

	public static PurchaseApiResponse unmarshall(PurchaseApiResponse purchaseApiResponse, UnmarshallerContext _ctx) {
		
		purchaseApiResponse.setRequestId(_ctx.stringValue("PurchaseApiResponse.RequestId"));
		purchaseApiResponse.setInstanceId(_ctx.stringValue("PurchaseApiResponse.InstanceId"));
	 
	 	return purchaseApiResponse;
	}
}